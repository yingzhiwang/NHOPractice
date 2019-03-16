package com.tw.nho.practicesystem.controller;

import com.tw.nho.practicesystem.Bean.TrainingCamp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingCampController {

    @GetMapping("/training_camps")
    public TrainingCamp getTrainingCamps() {

        TrainingCamp trainingCamp = TrainingCamp.builder().age(12).id(1L).name("abc").build();
        return trainingCamp;
    }

}
