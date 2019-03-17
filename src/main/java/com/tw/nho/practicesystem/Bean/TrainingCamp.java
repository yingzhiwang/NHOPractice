package com.tw.nho.practicesystem.Bean;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "trainingCamp")
@Data
@Builder
public class TrainingCamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainingCampName;

    private Integer trainingCampDescription;

    private LocalDateTime trainingCampCreateTime;

    private LocalDateTime trainingCampLastModifyTime;

    private Integer trainingCampFlag;

}
