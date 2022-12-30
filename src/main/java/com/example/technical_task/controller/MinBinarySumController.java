package com.example.technical_task.controller;

import com.example.technical_task.service.MinBinarySumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/minBinarySum")
public class MinBinarySumController {
    @Autowired
    private MinBinarySumService minBinarySumService;

    @PostMapping
    public int computeMinBinaryDigitsSumToS(@RequestBody String s) {
        return minBinarySumService.computeMinBinaryDigitsSumToS(s);
    }

}
