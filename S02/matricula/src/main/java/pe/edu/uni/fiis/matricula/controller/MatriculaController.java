package pe.edu.uni.fiis.matricula.controller;

import pe.edu.uni.fiis.matricula.model.Alumno;
import pe.edu.uni.fiis.matricula.model.Cuota;
import pe.edu.uni.fiis.matricula.model.Matricula;
import pe.edu.uni.fiis.matricula.util.Reporte;

import java.util.ArrayList;
import java.util.List;

public class MatriculaController {
    public static void main(String[] args) {
        Matricula matricula = new Matricula();
        matricula.setPrecio(1200f);
        Alumno alumno = new Alumno();
        alumno.setApellidos("Segura");
        alumno.setNombres("Luis");
        alumno.setDni("75410013");
        matricula.setAlumno(alumno);
        List<Cuota> listaCuotas = new ArrayList<Cuota>();
        Cuota c1 = new Cuota();
        c1.setCosto(400f);
        Cuota c2 = new Cuota();
        c2.setCosto(500f);
        Cuota c3 = new Cuota();
        c3.setCosto(600f);
        listaCuotas.add(c1);
        listaCuotas.add(c2);
        listaCuotas.add(c3);
        matricula.setCuotas(listaCuotas);
        Reporte.generarPdf(matricula);
    }
}