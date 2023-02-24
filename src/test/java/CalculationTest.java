
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculationTest {
    @ParameterizedTest
    @CsvSource({
            "3,3000,10000,20000",
            "2,60000,100000,150000"
    })
    void shouldCalculateMonth(int expected, int expenses, int income, int threshold) {
        CalculationService service = new CalculationService();

        int actual = service.calculate(expenses, income, threshold);

        Assertions.assertEquals(expected, actual);
    }
}


