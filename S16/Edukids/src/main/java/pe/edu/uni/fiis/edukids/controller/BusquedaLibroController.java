package pe.edu.uni.fiis.edukids.controller;

import pe.edu.uni.fiis.edukids.dto.BusquedaRequest;
import pe.edu.uni.fiis.edukids.dto.BusquedaResponse;
import pe.edu.uni.fiis.edukids.model.Libro;
import pe.edu.uni.fiis.edukids.model.Usuario;
import pe.edu.uni.fiis.edukids.service.SingletonService;
import pe.edu.uni.fiis.edukids.util.Json;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BusquedaLibroController",urlPatterns = {"/buscar-libro"})
public class BusquedaLibroController extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String data = Json.getJson(req);

        BusquedaRequest busquedaRequest = Json.getInstance().readValue(data,BusquedaRequest.class);

        List<Libro> lista = SingletonService.getUsuarioService().getLibros(busquedaRequest.getCoGenero(),busquedaRequest.getTitulo());
        BusquedaResponse busquedaResponse = new BusquedaResponse();
        busquedaResponse.setLibros(lista);
        Json.envioJson(busquedaResponse,resp);
    }
}

  /*  create table usuario(
        codigo_usuario varchar(30) primary key,
    nombre varchar(30),
    credencial varchar(30),
    correo varchar(30)
);
        create table usuariof(
        nombres varchar(30),
        apellidos varchar(30),
        nacimiento varchar(30),
        genero varchar(30),
        profesion varchar(30)
        );
        select * from usuario;
        select * from usuariof;


        create table ejemplar(
        cod_ejemplar numeric(16,0) primary key ,
        isbn numeric(16,0),
        condicion char(1)
        );
        create table libro(
        isbn numeric(16,0)primary key ,
        titulo varchar(100),
        cod_autor numeric(9,0),
        cod_genero numeric(9,0)
        );
        insert into ejemplar(cod_ejemplar, isbn, condicion)
        values (123,159,'D');

        insert into libro(isbn, titulo, cod_autor, cod_genero)
        values (1,'matematica',1,1);
*/