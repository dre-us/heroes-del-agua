package com.co;

import java.util.Timer;
import java.util.TimerTask;

public class Tablero {

    private BancoPreguntas banco;
    private Timer timer;
    private Jugador jugadorActual;
    private Pregunta preguntaActual;

    public Tablero(BancoPreguntas banco, Timer timer, Jugador jugadorActual) {
        this.banco = banco;
        this.timer = timer;
        this.jugadorActual = jugadorActual;
    }

    public void iniciarJuego(int cantidadPreguntas) {
        banco.prepararPreguntas(cantidadPreguntas);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("¡Se acabó el tiempo!");
                validarRespuesta(null); // Simular respuesta incorrecta por tiempo agotado
            }
        }, 30000); // 30 segundos

        siguientePregunta();
    }

    public void siguientePregunta() {
        preguntaActual = banco.siguientePregunta();
        System.out.println(preguntaActual.getPregunta());

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("¡Se acabó el tiempo!");
                validarRespuesta(null); // Simular respuesta incorrecta por tiempo agotado
            }
        }, 30000); // 30 segundos
    }

    public boolean validarRespuesta(String respuesta) {
        timer.cancel();

        boolean respuestaCorrecta = preguntaActual != null && preguntaActual.validarRespuesta(respuesta);

        jugadorActual.actualizarPuntuacion(respuestaCorrecta);
        siguienteJugador();

        return respuestaCorrecta;
    }

    private void siguienteJugador() {
        // Implementar la lógica para pasar el turno al siguiente jugador
        // ...
    }

    public boolean esFinDelJuego() {
        return banco.hayPreguntas();
    }

    public Jugador obtenerGanador() {
        // Determinar el jugador con mayor puntuación
        // ... (Implementar la lógica para determinar el ganador)
        return null;
    }

}
