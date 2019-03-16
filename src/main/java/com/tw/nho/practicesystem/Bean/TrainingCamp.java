package com.tw.nho.practicesystem.Bean;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_train")
@Data
@Builder
public class TrainingCamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

}
