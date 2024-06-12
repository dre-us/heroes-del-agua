package com.co;

import java.util.List;

/**
 * La clase Pregunta representa una pregunta con sus posibles respuestas y feedback.
 */
public class Pregunta {

    private String pregunta;
    private String respuesta;
    private List<String> respuestas;
    private Feedback feedback;

    /**
     * Constructor de la clase Pregunta.
     *
     * @param pregunta El enunciado de la pregunta.
     * @param respuesta La respuesta correcta de la pregunta.
     * @param respuestas Las posibles respuestas de la pregunta.
     * @param feedback El feedback asociado a la pregunta.
     */
    public Pregunta(String pregunta, String respuesta, List<String> respuestas, Feedback feedback) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.respuestas = respuestas;
        this.feedback = feedback;
    }

    /**
     * Obtiene el enunciado de la pregunta.
     *
     * @return El enunciado de la pregunta.
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Establece el enunciado de la pregunta.
     *
     * @param pregunta El enunciado de la pregunta.
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * Obtiene la respuesta correcta de la pregunta.
     *
     * @return La respuesta correcta de la pregunta.
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Establece la respuesta correcta de la pregunta.
     *
     * @param respuesta La respuesta correcta de la pregunta.
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * Obtiene las posibles respuestas de la pregunta.
     *
     * @return Las posibles respuestas de la pregunta.
     */
    public List<String> getRespuestas() {
        return respuestas;
    }

    /**
     * Establece las posibles respuestas de la pregunta.
     *
     * @param respuestas Las posibles respuestas de la pregunta.
     */
    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }

    /**
     * Obtiene el feedback asociado a la pregunta.
     *
     * @return El feedback asociado a la pregunta.
     */
    public Feedback getFeedback() {
        return feedback;
    }

    /**
     * Establece el feedback asociado a la pregunta.
     *
     * @param feedback El feedback asociado a la pregunta.
     */
    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    /**
     * Valida si una respuesta proporcionada es correcta.
     *
     * @param respuesta La respuesta proporcionada.
     * @return true si la respuesta es correcta, false en caso contrario.
     */
    public boolean validarRespuesta(String respuesta) {
        return respuesta.equals(this.respuesta);
    }

    /**
     * Devuelve una representación en cadena de la pregunta.
     *
     * @return Una cadena que representa la pregunta.
     */
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