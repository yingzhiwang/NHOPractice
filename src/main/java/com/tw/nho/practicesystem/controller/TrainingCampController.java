package com.tw.nho.practicesystem.controller;

import com.tw.nho.practicesystem.Bean.TrainingCamp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingCampController {

    @GetMapping("/training-camps")
    public TrainingCamp getTrainingCamps() {

        return null;
    }

}
