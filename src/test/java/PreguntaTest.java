import com.co.Feedback;
import com.co.Pregunta;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PreguntaTest {

    @Test
    void testValidarRespuesta() {
        // Crear una pregunta con una respuesta correcta
        Pregunta pregunta = new Pregunta("¿Cuál es la capital de Francia?", "París",
                Arrays.asList("Madrid", "Londres", "París", "Berlín"), null);

        // Verificar que la respuesta "París" sea considerada correcta
        assertTrue(pregunta.validarRespuesta("París"));

        // Verificar que una respuesta incorrecta no sea considerada correcta
        assertFalse(pregunta.validarRespuesta("Londres"));
    }

    @Test
    void testGetterSetter() {
        // Crear una pregunta con valores iniciales
        Pregunta pregunta = new Pregunta("¿Cuál es la capital de España?", "Madrid",
                new ArrayList<>(Arrays.asList("Madrid", "Barcelona", "Valencia", "Sevilla")), null);

        // Verificar los valores iniciales con los getters
        assertEquals("¿Cuál es la capital de España?", pregunta.getPregunta());
        assertEquals("Madrid", pregunta.getRespuesta());
        assertEquals(Arrays.asList("Madrid", "Barcelona", "Valencia", "Sevilla"), pregunta.getRespuestas());
        assertNull(pregunta.getFeedback());

        // Cambiar los valores utilizando los setters
        pregunta.setPregunta("¿Cuál es la capital de Italia?");
        pregunta.setRespuesta("Roma");
        pregunta.setRespuestas(Arrays.asList("Roma", "Madrid", "París", "Londres"));
        Feedback feedback = new Feedback("Respuesta incorrecta", "Negativo");
        pregunta.setFeedback(feedback);

        // Verificar los nuevos valores con los getters
        assertEquals("¿Cuál es la capital de Italia?", pregunta.getPregunta());
        assertEquals("Roma", pregunta.getRespuesta());
        assertEquals(Arrays.asList("Roma", "Madrid", "París", "Londres"), pregunta.getRespuestas());
        assertEquals(feedback, pregunta.getFeedback());
    }

    @Test
    void testToString() {
        // Crear una pregunta con valores específicos
        Pregunta pregunta = new Pregunta("¿Cuál es la capital de Argentina?", "Buenos Aires",
                Arrays.asList("Buenos Aires", "Santiago", "Montevideo", "Lima"), null);

        // Verificar que el método toString() devuelve la representación correcta
        assertEquals("Pregunta{pregunta='¿Cuál es la capital de Argentina?', respuesta='Buenos Aires', respuestas=[Buenos Aires, Santiago, Montevideo, Lima], feedback=null}",
                pregunta.toString());
    }
}
