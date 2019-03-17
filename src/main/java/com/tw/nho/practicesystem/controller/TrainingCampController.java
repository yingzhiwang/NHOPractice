package com.tw.nho.practicesystem.controller;

import com.tw.nho.practicesystem.Bean.TrainingCamp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingCampController {

    @GetMapping("/training_camps")
    public TrainingCamp getTrainingCamps() {

        TrainingCamp trainingCamp = TrainingCamp.builder().trainingCampFlag(0).id(1L).trainingCampName("敏捷训练营").build();
        return trainingCamp;
    }

}
