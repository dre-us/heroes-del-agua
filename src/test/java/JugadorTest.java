import com.co.Jugador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JugadorTest {

    @Test
    void testConstructor() {
        // Crear un jugador sin alias
        Jugador jugador1 = new Jugador();
        assertEquals("", jugador1.alias); // Verificar que el alias se inicializa como una cadena vacía
        assertNotNull(jugador1.score); // Verificar que se crea un objeto Score

        // Crear un jugador con un alias específico
        Jugador jugador2 = new Jugador("Juan");
        assertEquals("Juan", jugador2.alias); // Verificar que el alias se establece correctamente
        assertNotNull(jugador2.score); // Verificar que se crea un objeto Score
    }

    @Test
    void testActualizarPuntuacion() {
        Jugador jugador = new Jugador();

        // Verificar que el puntaje inicial del jugador es 0
        assertEquals(0, jugador.score.getTotal());

        // Actualizar la puntuación con una respuesta correcta
        jugador.actualizarPuntuacion(true);
        assertEquals(10, jugador.score.getTotal()); // Verificar que se añaden 10 puntos

        // Actualizar la puntuación con una respuesta incorrecta (no debe cambiar el puntaje)
        jugador.actualizarPuntuacion(false);
        assertEquals(10, jugador.score.getTotal()); // Verificar que el puntaje sigue siendo 10
    }
}
