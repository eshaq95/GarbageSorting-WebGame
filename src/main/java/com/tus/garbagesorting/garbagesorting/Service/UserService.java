package com.tus.garbagesorting.garbagesorting.Service;

import com.tus.garbagesorting.garbagesorting.Mapper.UserMapper;
import com.tus.garbagesorting.garbagesorting.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserService implements UserMapper {

    public User user;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User insert(User user) {
        int a = jdbcTemplate.update(
                "insert into tb_user (user_name, user_email, user_phone, user_password, user_role, user_status) " +
                        "values(?,?,?,?,?,?)",
                user.getUser_name(), user.getUser_email(), user.getUser_phone(), user.getUser_password(),
                user.getUser_role(), user.getUser_status());

        return user;

    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update(
                "update tb_user set user_name = ? where user_email = ?",
                user.getUser_name(), user.getUser_email());
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM tb_user WHERE id=?", id);
    }

//    @Override
//    public int findById(int id) {
//        var rowMapper = BeanPropertyRowMapper.newInstance(User.class);
//
//    }


    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(
                "select * from tb_user",
                (rs, rowNum) ->
                        new User(
                                rs.getInt("id"),
                                rs.getString("user_email"),
                                rs.getString("user_name"),
                                rs.getString("user_phone"),
                                rs.getString("user_password"),
                                rs.getString("user_role"),
                                rs.getString("user_status")
                        )
        );
    }
}