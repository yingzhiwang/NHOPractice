package com.tw.nho.practicesystem.Bean;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_train")
@Data
public class TrainingCamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

}
