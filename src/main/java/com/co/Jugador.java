package com.co;

/**
 * La clase Jugador representa a un jugador en un juego.
 */
public class Jugador {
    /**
     * El alias del jugador.
     */
    public String alias;

    /**
     * El puntaje del jugador.
     */
    public Score score;

    /**
     * Constructor por defecto de la clase Jugador.
     * Inicializa el puntaje del jugador en 0 y el alias en una cadena vacía.
     */
    public Jugador() {
        this.score = new Score();
        this.alias = "";
    }

    /**
     * Constructor de la clase Jugador con un alias dado.
     * @param a El alias del jugador.
     */
    public Jugador(String a) {
        this.alias = a;
        this.score = new Score();
    }

    /**
     * Método que retorna el score actual del jugador
     * @return score
     */
    public Score getScore() {
        return score;
    }

    /**
     * Método para insertar un score al jugador
     * @param score puntaje actual
     */
    public void setScore(Score score) {
        this.score = score;
    }

    /**
     * Método que devuelve el alias del jugador
     * @return alias del jugador
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * Método para insertar el alias al jugador
     * @param alias alias del jugador
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Método para actualizar el puntaje del jugador.
     * @param correctAnswer Indica si la respuesta dada por el jugador es correcta o no.
     */
    public void actualizarPuntuacion(boolean correctAnswer) {
        if (correctAnswer)
            score.addPoints(correctAnswer);
    }
}