package com.co;

import java.util.List;

public class Pregunta {

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

    public boolean validarRespuesta(String respuesta) {
        return respuesta.equals(respuesta);
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



