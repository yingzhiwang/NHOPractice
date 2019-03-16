package com.tw.nho.practicesystem.controller;

import com.tw.nho.practicesystem.Bean.ResultBo;
import com.tw.nho.practicesystem.Bean.TrainingCamp;
import com.tw.nho.practicesystem.Dao.TrainingCampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainingCampController {

    @Autowired
    private TrainingCampRepository trainingCampRepository;

    @GetMapping("/training_camps")
    public TrainingCamp getTrainingCamps() {

        TrainingCamp trainingCamp = TrainingCamp.builder().age(12).id(1L).name("abc").build();
        return trainingCamp;
    }

    @PostMapping("/training_camp")
    public ResultBo saveTrainingCamps(@RequestBody TrainingCamp trainingCamp) {

        System.out.println(trainingCamp);
        return ResultBo.builder().code(1).msg("succ").build();
    }

    @PostMapping("/training_camp/{id}")
    public ResultBo updateTrainingCamp(@PathVariable Integer id) {


        return ResultBo.builder().code(1).msg("succ").build();
    }

    @DeleteMapping("/training_camp/{id}")
    public ResultBo deleteTrainingCamp(@PathVariable Integer id) {

        return ResultBo.builder().code(1).msg("succ").build();
    }

}
