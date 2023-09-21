package org.example.validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {
    public ValidacionAfiliado() {
    }

    public Boolean validarId(Integer id) throws Exception{
        if(id<0){
            throw new Exception("El id no puede ser negativo");
        }
        //PASE TODAS LAS VALIDACIONES
        return true;
    }

    public Boolean validarNombres(String nombre)throws Exception{
        //longitud sea menor 3 o mayor que 40
        if(nombre.length()<3 || nombre.length()>40){
            throw new Exception("el nombre debe tener entre 3 y 40 caracteres");
        }
        //el formato del nombre tiene numeros o caracteres especiales
        String expresionRegular="^[a-zA-Z]+$";

        //busco la coincidencia entre la expresionregular
        //y mi string
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(nombre);
        if(coincidencia.matches()){
            System.out.println("tenemos coincidencia, cumple");
            return true;

        }else{
            System.out.println("No tenemos coincidencia");
            return false;
        }

        //return true;

    }



}
