package tyro.community.dao;

import org.apache.ibatis.annotations.Mapper;
import tyro.community.entity.User;

@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String name);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);
    // the name of the parameter should match the xml #{}
    int updatePassword(int id, String password);

}
