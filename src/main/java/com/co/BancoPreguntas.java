package com.co;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase banco preguntas, es la encargada de escoger
 * las preguntas para el juego.
 */
public class BancoPreguntas {

    private List<Pregunta> preguntas;
    private List<Pregunta> preguntasJuego;

    /**
     * Constructor de BancoPreguntas el cual recibe todas las preguntas
     * que serán cargadas
     * @param preguntas lista de preguntas a almacernar
     */
    public BancoPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
        this.preguntasJuego = new ArrayList<>();
    }

    /**
     * De manera aleatoria guarda las preguntas para el juego actual
     * @param cantidad indica cuántas preguntas se quieren alistar para el juego
     */
    public void prepararPreguntas(int cantidad) {
        Collections.shuffle(preguntas);
        preguntasJuego.clear();
        for (int i = 0; i < cantidad; ++i) {
            preguntasJuego.add(preguntas.get(i));
        }
    }

    /**
     * Devuelve y elimina la siguiente pregunta del juego actual
     * @return devuelve Pregunta
     */
    public Pregunta siguientePregunta() {
        return preguntasJuego.removeLast();
    }

    /**
     * Informa si hay más preguntas en el juego actual
     * @return booleano indicando si hay más preguntas
     */
    public boolean hayPreguntas() {
        return preguntasJuego.isEmpty();
    }

}
