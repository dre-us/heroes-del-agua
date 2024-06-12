package com.co;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de la lectura de las preguntas desde un archivo
 */
public class CSVReader {

    /**
     * Método encargado de leer las preguntas de un archivo csv
     * @param archivo direccion del archivo que contiene las preguntas
     * @return lista de preguntas
     */
    public static List<Pregunta> readQuestionsFromCSV(String archivo) {
        List<Pregunta> preguntas = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            // Leer la primera línea de encabezados
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 6) {
                    List<String> respuestas = new ArrayList<>();
                    respuestas.add(values[1]);
                    respuestas.add(values[2]);
                    respuestas.add(values[3]);
                    respuestas.add(values[4]);
                    Feedback feedback = new Feedback("", "");
                    preguntas.add(new Pregunta(values[0], values[5], respuestas, feedback));
                } else {
                    System.out.println("Línea malformada: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return preguntas;
    }

}
