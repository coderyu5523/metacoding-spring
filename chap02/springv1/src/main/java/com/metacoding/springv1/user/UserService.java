package com.metacoding.springv1.user;

import org.springframework.stereotype.Service;
import com.metacoding.springv1._config.exception.Exception401;
import lombok.RequiredArgsConstructor;
import jakarta.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void 회원가입(UserRequest.SaveDTO requestDTO){
        // 중복 체크
        User userCheck = userRepository.findByUsername(requestDTO.getUsername());
        if(userCheck != null){
            throw new Exception401("이미 존재하는 아이디입니다.");
        }
        User user = requestDTO.toEntity();
        userRepository.save(user);
    }
}
