package com.tw.nho.practicesystem.Dao;

import com.tw.nho.practicesystem.Bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface UserRepository extends JpaRepository<User, Long> , QuerydslPredicateExecutor<User> {
}


