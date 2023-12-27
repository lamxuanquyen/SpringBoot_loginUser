package fa.training.loginTest.service;

import java.util.List;

import fa.training.loginTest.dto.UserDto;
import fa.training.loginTest.entity.User;

public interface UserService {
	void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
    
    void save(User user);
}
