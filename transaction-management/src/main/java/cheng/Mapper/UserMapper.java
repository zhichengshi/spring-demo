package cheng.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import cheng.pojo.User;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    @Insert("insert into user(user_id,username,age) values(#{userId},#{userName},#{age})")
    void save(User user);
}
