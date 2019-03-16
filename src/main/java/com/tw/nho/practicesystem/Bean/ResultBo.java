package com.tw.nho.practicesystem.Bean;

import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResultBo<T> {
    private Integer code;
    private String msg;
    private T data;
}
