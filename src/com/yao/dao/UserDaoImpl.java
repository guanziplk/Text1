package com.yao.dao;

import com.yao.entity.User;
import com.yao.utils.CloseUtils;
import com.yao.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDao{
    @Override
    public User checkUser(String username, String password) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        User user = null;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement("select * from user where username=? and password=?");
            ps.setString(1,username);
            ps.setString(2,password);
            resultSet = ps.executeQuery();
            while(resultSet.next())
            {
                String username1 = resultSet.getString(1);
                String password1 = resultSet.getString(2);
                user = new User();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally
        {
            CloseUtils.CloseAll(resultSet,ps,connection);
        }
        return user;
    }

    @Override
    public Integer addUser(User user) {
        Connection connection = null;
        PreparedStatement ps = null;
        int newSet = 0;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement("insert into user(username,password) value(?,?)");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            newSet = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            CloseUtils.CloseAll(ps, connection);
        }
        return newSet;
    }
}
