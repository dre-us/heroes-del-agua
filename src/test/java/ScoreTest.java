import com.co.Score;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreTest {

    @Test
    void testScore() {
        // Arrange
        Score score = new Score();
        // Act
        score.addPoints(true); // Respuesta correcta
        score.addPoints(true); // Respuesta correcta
        score.addPoints(false); // Respuesta incorrecta
        // Assert
        assert score.getTotal() == 20;
    }

    @Test
    void testAddPoints() {
        Score score = new Score();

        // Verificar que el puntaje inicial es 0
        assertEquals(0, score.getTotal());

        // Añadir puntos por respuestas correctas
        score.addPoints(true);
        assertEquals(10, score.getTotal());

        // Añadir puntos por respuestas incorrectas (no debe cambiar el puntaje)
        score.addPoints(false);
        assertEquals(10, score.getTotal());

        // Añadir más puntos por respuestas correctas
        score.addPoints(true);
        assertEquals(20, score.getTotal());
    }

    @Test
    void testUpdateRango() {
        Score score = new Score();

        // Verificar que el rango inicial es "No clasificado"
        assertEquals("No clasificado", score.getRango());

        // Añadir suficientes puntos para alcanzar el rango "Bajo"
        for (int i = 0; i < 5; i++) {
            score.addPoints(false); // Respuestas incorrectas
        }
        assertEquals("Bajo", score.getRango());

        // Añadir suficientes puntos para alcanzar el rango "Medio"
        for (int i = 0; i < 9; i++) {
            score.addPoints(true); // Respuestas correctas
        }
        assertEquals("Medio", score.getRango());

        // Añadir suficientes puntos para alcanzar el rango "Alto"
        for (int i = 0; i < 5; i++) {
            score.addPoints(true); // Respuestas correctas
        }
        assertEquals("Alto", score.getRango());
    }
}
