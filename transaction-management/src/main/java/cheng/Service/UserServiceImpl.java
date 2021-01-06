package cheng.Service;

import cheng.Mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import cheng.pojo.User;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userMapper.save(user);

        //测试事务回滚
        if(StringUtils.hasText(user.getUserName())){
            throw new RuntimeException("username不为空");
        }
    }
}
