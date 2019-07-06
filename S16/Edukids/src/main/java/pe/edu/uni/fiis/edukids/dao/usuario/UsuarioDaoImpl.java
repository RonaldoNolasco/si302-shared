package pe.edu.uni.fiis.edukids.dao.usuario;


import pe.edu.uni.fiis.edukids.model.Usuario;
import pe.edu.uni.fiis.edukids.model.UsuarioF;
import pe.edu.uni.fiis.edukids.service.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao{
    /**
     * Tabla
     * CREATE table clientef(
     *   nombres varchar(60),
     *   apellidos varchar(60),
     *   fecha_nacimiento varchar(10),
     *   genero varchar(1),
     *   profesion varchar(60)
     * );
     * @param a
     * @param b
     * @return
     */
    public UsuarioF agregarUsuarioF(UsuarioF a, Connection b) {
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("insert into usuariof(nombres,apellidos,nacimiento,genero,profesion) values (")
                    .append("?,?,?,?,?)");

            PreparedStatement sentencia = b.prepareStatement(sql.toString());
            sentencia.setString(1,a.getNombres());
            sentencia.setString(2,a.getApellidos());
            sentencia.setString(3,a.getNacimiento());
            sentencia.setString(4,a.getGenero());
            sentencia.setString(5,a.getProfesion());

            sentencia.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    public List<UsuarioF> obtenerUsuariosF(Connection b) {
        List<UsuarioF> lista = new ArrayList<UsuarioF>();
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("select nombres,apellidos,nacimiento,genero,profesion from usuariof");

            Statement sentencia = b.createStatement();
            ResultSet rs = sentencia.executeQuery(sql.toString());
            while (rs.next()){
                UsuarioF u = new UsuarioF();
                u.setApellidos(rs.getString("apellidos"));
                u.setGenero(rs.getString("genero"));
                u.setNacimiento(rs.getString("nacimiento"));
                u.setNombres(rs.getString("nombres"));
                u.setProfesion(rs.getString("profesion"));
                lista.add(u);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    /*
    create table usuario(
      codigo_usuario varchar(9) primary key,
      nombre varchar(100),
      credencial varchar(15),
      correo varchar(50)
    );
     */
    public Usuario agregarUsuario(Usuario a, Connection b) {
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("insert into usuario(codigo_usuario,nombre,credencial,correo) values (")
                    .append("?,?,?,?)");

            PreparedStatement sentencia = b.prepareStatement(sql.toString());
            sentencia.setString(1,a.getCodigo());
            sentencia.setString(2,a.getNombre());
            sentencia.setString(3,a.getCredencial());
            sentencia.setString(4,a.getCorreo());

            sentencia.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }
    public static void main(String[] args) {
        //Conexion con = new Conexion();
        Connection c = Conexion.getConnection();
        try {
            System.out.println(c.isValid(5000));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        UsuarioDaoImpl usuariodao = new UsuarioDaoImpl();
        Usuario usuario = new Usuario("20120125F","Juan","456","rnolascoc@uni.pe");
        usuariodao.agregarUsuario(usuario,c);
        try {
            //c.commit();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}