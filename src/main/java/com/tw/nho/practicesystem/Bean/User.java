package com.tw.nho.practicesystem.Bean;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
