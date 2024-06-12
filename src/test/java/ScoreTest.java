import com.co.Score;
import org.junit.jupiter.api.Test;

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

}
