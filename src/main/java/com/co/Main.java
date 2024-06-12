package com.co;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Clase principal del juego, inicializa los objetos bancoPreguntas, Jugador y Tablero
 */
public class Main {

    /**
     * Método principal el cual inicia el juego
     * @param args argumentos de entrada
     * @throws IOException excepción por error en la lectura del archivo de preguntas
     */
    public static void main(String[] args) throws IOException {
        String path = new File(".").getAbsolutePath();
        System.out.println(path);
        List<Pregunta> preguntas = CSVReader.readQuestionsFromCSV("src/main/resources/preguntas.csv");
        BancoPreguntas bancoPreguntas = new BancoPreguntas(preguntas);
        Jugador jugador = new Jugador();
        Tablero tablero = new Tablero(bancoPreguntas, jugador);
        tablero.iniciarJuego(10);
    }
}