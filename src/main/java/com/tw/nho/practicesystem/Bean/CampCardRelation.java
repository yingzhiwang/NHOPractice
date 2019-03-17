package com.tw.nho.practicesystem.Bean;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CampCardRelation")
@Data
@Builder
public class CampCardRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer trainingCampId;

    private Integer taskCardId;

    private LocalDateTime taskCardCreateTime;

    private LocalDateTime taskCardLastModifyTime;

    private Integer cmpCardRelationFlag;
}


