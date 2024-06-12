package com.co;

/**
 * La clase Score representa el puntaje y el rango de un jugador en un juego o una aplicación.
 */
public class Score {
    private int total;  // Atributo para almacenar el puntaje total
    private String rango;  // Atributo para almacenar el rango del jugador

    /**
     * Constructor de la clase Score.
     * Inicializa el puntaje total en 0 y el rango en "No clasificado".
     */
    public Score() {
        this.total = 0;
        this.rango = "No clasificado";
    }

    /**
     * Método para añadir puntos al puntaje total.
     * @param correctAnswer Booleano que indica si la respuesta es correcta o incorrecta.
     *                      Si es true, se añaden 10 puntos al puntaje total.
     */
    public void addPoints(boolean correctAnswer) {
        if (correctAnswer) {
            this.total += 10;
        }
        updateRango();  // Actualiza el rango cada vez que se añaden puntos
    }

    /**
     * Método para obtener el puntaje total.
     * @return El puntaje total del jugador.
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Método para obtener el rango del jugador.
     * @return El rango del jugador según su puntaje total.
     */
    public String getRango() {
        return this.rango;
    }

    /**
     * Método privado para actualizar el rango del jugador basado en el puntaje total.
     * Imprime un mensaje según el rango alcanzado.
     */
    private void updateRango() {
        if (this.total >= 0 && this.total <= 49) {
            this.rango = "Bajo";
            System.out.println("No te preocupes, todos empezamos desde algún lugar. Prueba de nuevo, juntos hacemos la diferencia.");
        } else if (this.total >= 50 && this.total <= 139) {
            this.rango = "Medio";
            System.out.println("Buen trabajo, estás en camino de volverte un héroe del agua.");
        } else if (this.total >= 140 && this.total <= 150) {
            this.rango = "Alto";
            System.out.println("¡Felicidades, eres un héroe del agua!");
        }
    }
}