package pe.edu.uni.fiis.matricula.util;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import pe.edu.uni.fiis.matricula.model.Matricula;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Reporte {
    public static void generarPdf(Matricula matricula){
        Document document=new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\pdf\\matricula.pdf"));
            document.open();
            document.add(new Paragraph("Nombre: "+ matricula.getAlumno().getNombres()));
            document.add(new Paragraph("Apellido: "+ matricula.getAlumno().getApellidos()));
            document.add(new Paragraph("Cuota 1: "+ matricula.getCuotas().get(0).getCosto()));
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
