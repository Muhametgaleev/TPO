import org.example.task1.ArccosExpansion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestTask1 {
    double epsilon = 1e-6;

    @ParameterizedTest
    @CsvFileSource(resources = "testate.csv")
    void positiveNumbers(double value) {
        Assertions.assertEquals(Math.acos(value), ArccosExpansion.getAcos(value), epsilon);
    }
}
