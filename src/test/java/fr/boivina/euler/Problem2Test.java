package fr.boivina.euler;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class Problem2Test {

    @Test
    public void should_return_10_when_10() throws Exception {
        // Given
        long limit = 10;

        // When
        long result = Problem2.fibo(limit);

        // Then
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void should_return_4613732L_when_4_000_000() throws Exception {
        // Given
        long limit = 4_000_000;

        // When
        long result = Problem2.fibo(limit);

        // Then
        assertThat(result).isEqualTo(4613732L);
    }
}