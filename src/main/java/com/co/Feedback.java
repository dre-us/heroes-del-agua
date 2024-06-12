package com.co;

public class Feedback {

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
