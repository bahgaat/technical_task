package com.example.minimumBinaryAdditions.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MinimumBinaryAdditionsServiceTest {

    @Autowired
    MinimumBinaryAdditionsService minimumBinaryAdditionsService;

    @Test
    void whenBinaryInput_thenMinSum() {
        // when
        int actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("10");
        int expected = 1;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("1");
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("0");
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("10101010");
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("11110101010");
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("11111111");
        // then
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void whenSmallInput_thenMinSum() {
        // when
        int actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("180003");
        int expected = 8;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("111112");
        expected = 2;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("87654");
        expected = 8;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("909909090");
        expected = 9;
        // then
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void whenMediumInput_thenMinSum() {
        // when
        int actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("76543123456876543223456");
        int expected = 8;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("90909090233454545455450");
        expected = 9;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("11111111111111111112");
        expected = 2;
        // then
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void whenLargeInput_thenMinSum() {
        // when
        int actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("765431234568345654322345676543234567887654334576543223456");
        int expected = 8;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("000000000000000000000000000000000000000000000000000000000000");
        expected = 1;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS("80000000000000000000000000000000000000" +
                "007654234567654345676543456543234000000000345434533000000000");
        expected = 8;
        // then
        Assertions.assertEquals(actual, expected);
    }

}
