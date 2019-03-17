package com.tw.nho.practicesystem.Bean;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "taskCard")
@Data
@Builder

public class TaskCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskCardName;

    private Integer taskCardDescription;

    private LocalDateTime taskCardCreateTime;

    private LocalDateTime taskCardLastModifyTime;

    private Integer taskCardFlag;

}

