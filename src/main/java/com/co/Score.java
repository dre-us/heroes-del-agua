package com.co;

public class Score {
    private int total;  // Atributo para almacenar el puntaje total
    private String rango;  // Atributo para almacenar el rango


    public Score() {
        this.total = 0;
        this.rango = "No clasificado";
    }

    // Método para añadir puntos al puntaje total
    public void addPoints(boolean correctAnswer) {
        if (correctAnswer) {
            this.total += 10;
        }
        updateRango();  // Actualiza el rango cada vez que se añaden puntos
    }

    // Método para obtener el puntaje total
    public int getTotal() {
        return this.total;
    }

    // Método para obtener el rango
    public String getRango() {
        return this.rango;
    }

    // Método privado para actualizar el rango basado en el puntaje total
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

    public static void main(String[] args) {

        Score score = new Score();
        score.addPoints(true); // Respuesta correcta
        score.addPoints(true); // Respuesta correcta
        score.addPoints(false); // Respuesta incorrecta

        System.out.println("Puntaje total: " + score.getTotal());
        System.out.println("Rango: " + score.getRango());
    }
}
