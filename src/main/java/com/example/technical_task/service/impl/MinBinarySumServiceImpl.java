package com.example.technical_task.service.impl;

import com.example.technical_task.service.MinBinarySumService;
import org.springframework.stereotype.Service;

@Service
public class MinBinarySumServiceImpl implements MinBinarySumService {

    public int computeMinBinaryDigitsSumToS(String s) {
        int minSum = 1;
        for (int i = 0; i < s.length(); i++) {
            int intHolder = Character.getNumericValue(s.charAt(i));
            minSum = Math.max(minSum, intHolder);
        }
        return minSum;
    }
}
