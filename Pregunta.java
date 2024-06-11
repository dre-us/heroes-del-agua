package com.co.model;

import java.util.List;import java.util.List;

// Clase Feedback
class Feedback {
    private String mensaje;
    private String tipo;

    // Constructor
    public Feedback(String mensaje, String tipo) {
        this.mensaje = mensaje;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "mensaje='" + mensaje + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

// Clase Pregunta
class Pregunta {
    private String pregunta;
    private String respuesta;
    private List<String> respuestas;
    private Feedback feedback;

    // Constructor
    public Pregunta(String pregunta, String respuesta, List<String> respuestas, Feedback feedback) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.respuestas = respuestas;
        this.feedback = feedback;
    }

    // Getters y Setters
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "pregunta='" + pregunta + '\'' +
                ", respuesta='" + respuesta + '\'' +
                ", respuestas=" + respuestas +
                ", feedback=" + feedback +
                '}';
    }
}



