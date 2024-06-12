package com.co;

/**
 * La clase Feedback representa un objeto de retroalimentación con un mensaje y un tipo asociado.
 */
public class Feedback {

    private String mensaje; // Almacena el mensaje de retroalimentación
    private String tipo; // Almacena el tipo de retroalimentación

    /**
     * Constructor de la clase Feedback.
     * @param mensaje El mensaje de retroalimentación.
     * @param tipo El tipo de retroalimentación.
     */
    public Feedback(String mensaje, String tipo) {
        this.mensaje = mensaje;
        this.tipo = tipo;
    }

    /**
     * Método getter para obtener el mensaje de retroalimentación.
     * @return El mensaje de retroalimentación.
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Método setter para establecer el mensaje de retroalimentación.
     * @param mensaje El mensaje de retroalimentación a establecer.
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Método getter para obtener el tipo de retroalimentación.
     * @return El tipo de retroalimentación.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método setter para establecer el tipo de retroalimentación.
     * @param tipo El tipo de retroalimentación a establecer.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método que devuelve una representación de cadena del objeto Feedback.
     * @return Una cadena que representa el objeto Feedback, incluyendo su mensaje y tipo.
     */
    @Override
    public String toString() {
        return "Feedback{" +
                "mensaje='" + mensaje + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
