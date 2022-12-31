package com.example.minimumBinaryAdditions.controller;

import com.example.minimumBinaryAdditions.service.MinimumBinaryAdditionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/minimumBinaryAdditions")
public class MinimumBinaryAdditionsController {
    @Autowired
    private MinimumBinaryAdditionsService minimumBinaryAdditionsService;

    @PostMapping
    public int computeMinimumAdditionsThatSumToS(@RequestBody String s) {
        return minimumBinaryAdditionsService.computeMinimumAdditionsThatSumToS(s);
    }

}
