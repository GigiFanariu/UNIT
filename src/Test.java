
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Test {

        public void testSubtraction () {
            int result = MathOperations.subtraction(10, 5);
            assertEquals(5, result, "Subtraction failed");
        }

        public void testSubtractionWithNegativeResult () {
            int result = MathOperations.subtraction(5, 10);
            assertEquals(-5, result, "Subtraction with negative result failed");
        }

        public void testMultiplication () {
            int result = MathOperations.multiplication(3, 4);
            assertEquals(12, result, "Multiplication failed");
        }

        public void testMultiplicationWithZero () {
            int result = MathOperations.multiplication(7, 0);
            assertEquals(0, result, "Multiplication with zero failed");
        }
    }

