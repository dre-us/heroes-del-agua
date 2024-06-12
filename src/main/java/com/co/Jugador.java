package com.co;

public class Jugador {
    /*
     * Se agregan las variables
     * La variable ALIAS es para el ingreso del nombre del jugador
     */
    public String alias;
    /* La variable SCORE es donde se muestra el puntaje de jugador */
    public Score score;

    /*
     * Se inicializa la variable alias, y se asigna el nombre
     */
    public Jugador() {
        this.score = new Score();
        this.alias = "";
    }

    /*
     * Se inicializa la variable alias con un parametro
     */
    public Jugador(String a) {
        this.alias = a;
        this.score = new Score();
    }

    public void actualizarPuntuacion(boolean correctAnswer) {
        if (correctAnswer) score.addPoints(correctAnswer);
    }

}

