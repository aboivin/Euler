package fr.boivina.euler;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class Problem1Test {

    @Test
    public void should_return_23_when_10() throws Exception {
        // Given
        int limit = 10;

        // When
        int result = Problem1.sumOf3and5belowGivenNumber(limit);

        // Then
        assertThat(result).isEqualTo(23);
    }


    @Test
    public void should_return_233168_when_1000() throws Exception {
        // Given
        int limit = 1000;

        // When
        int result = Problem1.sumOf3and5belowGivenNumber(limit);

        // Then
        assertThat(result).isEqualTo(233168);
    }
}