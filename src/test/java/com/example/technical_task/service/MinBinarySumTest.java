package com.example.technical_task.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MinBinarySumTest {

    @Autowired
    MinBinarySumService minBinarySumService;

    @Test
    void whenBinaryInput_thenMinSum() {
        // when
        int actual = minBinarySumService.computeMinBinaryDigitsSumToS("10");
        int expected = 1;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("1");
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("0");
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("10101010");
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("11110101010");
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("11111111");
        // then
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void whenSmallInput_thenMinSum() {
        // when
        int actual = minBinarySumService.computeMinBinaryDigitsSumToS("180003");
        int expected = 8;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("111112");
        expected = 2;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("87654");
        expected = 8;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("909909090");
        expected = 9;
        // then
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void whenMediumInput_thenMinSum() {
        // when
        int actual = minBinarySumService.computeMinBinaryDigitsSumToS("76543123456876543223456");
        int expected = 8;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("90909090233454545455450");
        expected = 9;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("11111111111111111112");
        expected = 2;
        // then
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void whenLargeInput_thenMinSum() {
        // when
        int actual = minBinarySumService.computeMinBinaryDigitsSumToS("765431234568345654322345676543234567887654334576543223456");
        int expected = 8;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("000000000000000000000000000000000000000000000000000000000000");
        expected = 1;
        // then
        Assertions.assertEquals(actual, expected);

        // when
        actual = minBinarySumService.computeMinBinaryDigitsSumToS("80000000000000000000000000000000000000007654234567654345676543456543234000000000345434533000000000");
        expected = 8;
        // then
        Assertions.assertEquals(actual, expected);
    }

}
