package com.co;

import java.util.Collections;
import java.util.List;

public class BancoPreguntas {

    private List<Pregunta> preguntas;
    private List<Pregunta> preguntasJuego;

    public BancoPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public void prepararPreguntas(int cantidad) {
        Collections.shuffle(preguntas);
        preguntasJuego.clear();
        for (int i = 0; i < cantidad; ++i) {
            preguntasJuego.add(preguntas.get(i));
        }
    }

    public Pregunta siguientePregunta() {
        return preguntasJuego.removeLast();
    }

    public boolean hayPreguntas() {
        return preguntasJuego.isEmpty();
    }

}
