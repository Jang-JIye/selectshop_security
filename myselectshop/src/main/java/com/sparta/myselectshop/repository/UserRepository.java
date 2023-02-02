package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByKakaoId(Long id); //기존에 카카오 아이디가 있는지 없는지 확인
    Optional<User> findByEmail(String email); //email 이 중복이 됬는지 안됬는지 확인
}