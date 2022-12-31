package com.example.minimumBinaryAdditions.service.impl;

import com.example.minimumBinaryAdditions.service.MinimumBinaryAdditionsService;
import org.springframework.stereotype.Service;

@Service
public class MinimumBinaryAdditionsServiceImpl implements MinimumBinaryAdditionsService {

    public int computeMinimumAdditionsThatSumToS(String s) {
        int minSum = 1;
        for (int i = 0; i < s.length(); i++) {
            int intHolder = Character.getNumericValue(s.charAt(i));
            minSum = Math.max(minSum, intHolder);
        }
        return minSum;
    }
}
