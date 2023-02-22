package service;

import dto.User;
import dto.UserMapper;
import entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private UserMapper userMapper = new UserMapper();

    private final UserRepository userRepository;

    public User readUser(String identification) {
        UserEntity userEntity = userRepository.findByIdentificationNumber(identification).get();
        return userMapper.convertToDto(userEntity);
    }

    public List<User> readUsers(SpringDataWebProperties.Pageable pageable) {
        return userMapper.convertToDtoList(userRepository.findAll((Pageable) pageable).getContent());
    }
}
