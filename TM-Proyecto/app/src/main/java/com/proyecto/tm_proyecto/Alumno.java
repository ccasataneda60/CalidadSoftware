package com.proyecto.tm_proyecto;

public class Alumno {

    public static String nombre;
    public static String apellidos;
    public static String usuario;
    public static String password;

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Alumno.nombre = nombre;
    }

    public static String getApellidos() {
        return apellidos;
    }

    public static void setApellidos(String apellidos) {
        Alumno.apellidos = apellidos;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Alumno.usuario = usuario;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Alumno.password = password;
    }
}
