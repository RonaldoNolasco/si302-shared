package pe.edu.uni.fiis.edukids.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

public abstract class Json {
    private static ObjectMapper mapper = null;

    public static ObjectMapper getInstance(){
        if(mapper==null){
            mapper = new ObjectMapper();
        }
        return mapper;
    }

    public static String getJson(HttpServletRequest request) {

        StringBuffer sb = new StringBuffer();
        BufferedReader bufferedReader = null;
        String content = "";

        try {
            bufferedReader = request.getReader();
            char[] charBuffer = new char[128];
            int bytesRead;
            while ((bytesRead = bufferedReader.read(charBuffer)) != -1) {
                sb.append(charBuffer, 0, bytesRead);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
    public static void envioJson(Object obj,HttpServletResponse response){
        response.addHeader("Content-type","application/json;charset=utf-8");
        try {

            response.getWriter().write(mapper.writeValueAsString(obj));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
