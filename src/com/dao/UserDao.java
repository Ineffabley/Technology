package com.dao;/*package com.dao;

import com.bean.User;
import com.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

*//**
 * @author ywq
 * @date 2020/10/6 10:36
 *//*
public class UserDao {

    //注册
 public boolean addUser(User user)
 {
     Connection con = DBUtil.getConnection();
     String sql = "INSERT INTO user(username,password) VALUES (?,?,?,?)";
     PreparedStatement ps = null;
     try {
         ps = con.prepareStatement(sql);
         ps.setString(1,user.getUsername());
         ps.setString(2,user.getPassword());
         ps.setString(3,user.getPhone());
         ps.setString(4,user.getDw());

         System.out.println("注册信息:"+user.getUsername()+user.getPassword());
         ps.executeUpdate();
         return true;
     } catch (SQLException e) {
         e.printStackTrace();
     }

     return false;
 }
    //登录
public User loadUser(String username, String password)
{
    Connection con = DBUtil.getConnection();
    String sql = "SELECT * FROM user WHERE username = ? and password = ?";
    PreparedStatement ps = null;
    ResultSet rs = null;
    User user = null;
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2,password);
        rs = ps.executeQuery();
        while (rs.next()){      //查询到用户
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setUsername(rs.getString("password"));
            user.setDw(rs.getString("dw"));
            user.setPhone(rs.getString("phone"));
            System.out.println("查询到用户:"+rs.getString("username"));
            return user;
        }
    } catch (SQLException e) {      //出错
        e.printStackTrace();
    }
    //查询失败
    return user;
}

    public String findUsername(String username) {
        Connection con = DBUtil.getConnection();
        String sql = "SELECT * FROM user WHERE username = ? ";
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,username);
            //ps.setString(2,password);
            rs = ps.executeQuery();
            while (rs.next()){      //查询到用户
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setUsername(rs.getString("password"));
                user.setDw(rs.getString("dw"));
                user.setPhone(rs.getString("phone"));
                System.out.println("查询到用户的密码是:"+rs.getString("password"));
                return user.getPassword();
            }
        } catch (SQLException e) {      //出错
            e.printStackTrace();
        }
        //查询失败

        return user.getPassword();

    }
}
*/