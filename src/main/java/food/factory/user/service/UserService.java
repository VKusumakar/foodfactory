
package food.factory.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import food.factory.user.dto.Userdto;
import food.factory.user.entity.UserEntity;
import food.factory.user.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(Userdto userdto) {

        if(userRepository.existsByEmail(userdto.getEmail())) {
            return "Email Already registered";
        }
        UserEntity user = new UserEntity();
        user.setName(userdto.getName());
        user.setEmail(userdto.getEmail());
        user.setPhone(userdto.getPhone());
        user.setPassword(userdto.getPassword());
        
        userRepository.save(user);
        return "User Registered Successfully";
    }
}