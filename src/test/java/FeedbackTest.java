import com.co.Feedback;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FeedbackTest {

    @Test
    void testConstructorAndGetters() {
        // Crear un objeto Feedback
        Feedback feedback = new Feedback("Mensaje de prueba", "Tipo de prueba");

        // Verificar que los valores se establecieron correctamente mediante el constructor
        assertEquals("Mensaje de prueba", feedback.getMensaje());
        assertEquals("Tipo de prueba", feedback.getTipo());
    }

    @Test
    void testSetters() {
        // Crear un objeto Feedback
        Feedback feedback = new Feedback("Mensaje original", "Tipo original");

        // Cambiar el mensaje y el tipo utilizando los setters
        feedback.setMensaje("Nuevo mensaje");
        feedback.setTipo("Nuevo tipo");

        // Verificar que los valores se cambiaron correctamente
        assertEquals("Nuevo mensaje", feedback.getMensaje());
        assertEquals("Nuevo tipo", feedback.getTipo());
    }

    @Test
    void testToString() {
        // Crear un objeto Feedback
        Feedback feedback = new Feedback("Mensaje de prueba", "Tipo de prueba");

        // Verificar que el método toString() devuelve la representación correcta del objeto
        assertEquals("Feedback{mensaje='Mensaje de prueba', tipo='Tipo de prueba'}", feedback.toString());
    }
}
