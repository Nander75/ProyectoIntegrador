package com.dam.db;

public class Tablas {

    // Tabla USUARIO
    public static final String NOM_TABLA_USUARIOS = "USUARIO";
    public static final String CLM_USUARIOS_ID_USUARIO = "ID_USUARIO";
    public static final String CLM_USUARIOS_NOMBRE = "NOMBRE";
    public static final String CLM_USUARIOS_CONTRASENIA = "CONTRASENIA";

    // Tabla QUIZ
    public static final String NOM_TABLA_QUIZ = "QUIZ";
    public static final String CLM_QUIZ_ID_QUIZ = "ID_QUIZ";
    public static final String CLM_QUIZ_PUNTOS = "PUNTOS";
    public static final String CLM_QUIZ_PREGUNTAS = "PREGUNTAS";
    public static final String CLM_QUIZ_RESPUESTAS = "RESPUESTAS";
    public static final String CLM_QUIZ_COMPLETADO_QUIZ = "COMPLETADO";

    // Tabla TEORIA
    public static final String NOM_TABLA_TEORIA = "TEORIA";
    public static final String CLM_TEORIA_ID_TEORIA = "ID_TEORIA";
    public static final String CLM_TEORIA_CONTENIDO = "CONTENIDO";
    public static final String CLM_TEORIA_ENLACES = "ENLACES";

    // Tabla RANKING
    public static final String NOM_TABLA_RANKING = "RANKING";
    public static final String CLM_RANKING_ID_RANKING = "ID_RANKING";
    public static final String CLM_RANKING_ID_QUIZ_RANKING = "ID_QUIZ";
    public static final String CLM_RANKING_ID_USUARIO_RANKING = "ID_USUARIO";
    public static final String CLM_RANKING_PUESTO = "PUESTO";

    // Tabla PROGRESO
    public static final String NOM_TABLA_PROGRESO = "PROGRESO";
    public static final String CLM_ID_PROGRESO = "ID_PROGRESO";
    public static final String CLM_ID_USUARIO_PROGRESO = "ID_USUARIO";
    public static final String CLM_ID_QUIZ_PROGRESO = "ID_QUIZ";
    public static final String CLM_ID_TEORIA_PROGRESO = "ID_TEORIA";
    public static final String CLM_COMPLETADO_PROGRESO = "COMPLETADO";

    // Tabla RESPUESTAS_USUARIO
    public static final String NOM_TABLA_RESPUESTAS_USUARIO = "RESPUESTAS_USUARIO";
    public static final String CLM_ID_RESPUESTA = "ID_RESPUESTA";
    public static final String CLM_ID_USUARIO_RESPUESTA = "ID_USUARIO";
    public static final String CLM_ID_QUIZ_RESPUESTA = "ID_QUIZ";
    public static final String CLM_RESPUESTA_ELEGIDA = "RESPUESTA_ELEGIDA";
    public static final String CLM_RESPUESTA_ES_CORRECTA = "ES_CORRECTA";

    // Tabla PROGRESO_TEORIA
    public static final String NOM_TABLA_PROGRESO_TEORIA = "PROGRESO_TEORIA";
    public static final String CLM_ID_PROGRESO_TEORIA = "ID_PROGRESO_TEORIA";
    public static final String CLM_ID_USUARIO_PROGRESO_TEORIA = "ID_USUARIO";
    public static final String CLM_ID_TEORIA_PROGRESO_TEORIA = "ID_TEORIA";
    public static final String CLM_COMPLETADO_PROGRESO_TEORIA = "COMPLETADO";

}
