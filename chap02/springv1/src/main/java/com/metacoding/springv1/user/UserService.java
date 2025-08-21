package com.metacoding.springv1.user;

import org.springframework.stereotype.Service;

import com.metacoding.springv1._config.Exception401;

import lombok.RequiredArgsConstructor;
import jakarta.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void 회원가입(UserRequest.SaveDTO requestDTO){
        // 중복 체크
        if (userRepository.findByUsername(requestDTO.getUsername()).isPresent())
            throw new Exception401("이미 존재하는 아이디입니다.");
        // 회원가입
        User user = requestDTO.toEntity();
        userRepository.save(user);
    }
}
