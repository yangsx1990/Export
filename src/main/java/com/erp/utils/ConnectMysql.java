package com.erp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectMysql {


    public Connection conn = null;
    public PreparedStatement pst = null;

    public void connect(String driver, String url, String username, String password) {

     try{
        Class.forName(driver);//指定连接类型
        conn = DriverManager.getConnection(url, username, password);//获取连接
       // pst = conn.prepareStatement("select * from country_info");//准备执行语句
    } catch(Exception e){
        e.printStackTrace();
    }
}
}
