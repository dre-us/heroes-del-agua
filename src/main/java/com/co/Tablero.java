package com.co;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

/**
 * La clase Tablero representa el tablero de un juego de preguntas.
 * Gestiona las preguntas, el tiempo y el jugador actual.
 */
public class Tablero {

    private BancoPreguntas banco;
    private Jugador jugadorActual;
    private Pregunta preguntaActual;

    /**
     * Constructor de la clase Tablero.
     *
     * @param banco El banco de preguntas que se utilizará en el juego.
     * @param jugadorActual El jugador que inicia el juego.
     */
    public Tablero(BancoPreguntas banco, Jugador jugadorActual) {
        this.banco = banco;
        this.jugadorActual = jugadorActual;
    }

    /**
     * Inicia el juego con una cantidad específica de preguntas.
     *
     * @param cantidadPreguntas La cantidad de preguntas que tendrá el juego.
     * @throws IOException error en la lectura de la respuesta dada por el jugador
     */
    public void iniciarJuego(int cantidadPreguntas) throws IOException {
        banco.prepararPreguntas(cantidadPreguntas);
        siguientePregunta();
    }

    /**
     * Muestra la siguiente pregunta al jugador.
     * @throws IOException error en la lectura de la respuesta dada por el jugador
     */
    public void siguientePregunta() throws IOException {
        Score score = jugadorActual.getScore();
        System.out.println("Puntuación final: " + score.getTotal());
        System.out.println("Rango: " + score.getRango());
        preguntaActual = banco.siguientePregunta();
        System.out.println(preguntaActual.getPregunta());
        for (int i = 0; i < preguntaActual.getRespuestas().size(); ++i) {
            System.out.println((i + 1) + ". " + preguntaActual.getRespuestas().get(i));
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta = br.readLine();
        int idx = Integer.parseInt(respuesta) - 1;
        validarRespuesta(preguntaActual.getRespuestas().get(idx));
        if (!esFinDelJuego()) {
            siguientePregunta();
        } else {
            System.out.println("Fin del juego.");
        }
    }

    /**
     * Valida la respuesta proporcionada por el jugador.
     *
     * @param respuesta La respuesta del jugador.
     * @return true si la respuesta es correcta, false en caso contrario.
     */
    public boolean validarRespuesta(String respuesta) {
        boolean respuestaCorrecta = preguntaActual != null && preguntaActual.validarRespuesta(respuesta);
        jugadorActual.actualizarPuntuacion(respuestaCorrecta);
        return respuestaCorrecta;
    }

    /**
     * Verifica si el juego ha terminado.
     *
     * @return true si hay preguntas restantes, false en caso contrario.
     */
    public boolean esFinDelJuego() {
        return banco.hayPreguntas();
    }

}