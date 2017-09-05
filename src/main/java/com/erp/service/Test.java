package com.erp.service;

import com.erp.utils.FreemarkUtil;
import com.erp.utils.Params;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static Map<String, Map<String, Params>> connect(String driver,
                                                           String url, String username, String password) {
        try {
            //加载驱动类
            Class.forName(driver);
        }catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        //将各种流放入try()中，将由try来执行close()操作
        try (Connection con
                     = DriverManager.getConnection(url, username,password);
             PreparedStatement ps
                     = con.prepareStatement("select table_name,column_name,column_comment,column_type,column_key,column_default  from INFORMATION_SCHEMA.Columns  where table_name='m_user'  and table_schema='test'");
             ResultSet rs = ps.executeQuery();
        ) {

            Map<String, Map<String, Params>> map = new HashMap<>();
            Map<String, Params> mapCommon = new HashMap<>();
            int i = 0;
            while (rs.next()) {
                String tableName = rs.getString("table_name");
                String className = tableName.replaceAll("m_", "");
                String columnName = rs.getString("column_name");
                String type = rs.getString("column_type");
                if("(varchar(255)".equals(type)){
                    type = "String";
                }else if("int(11)".equals(type)){
                    type = "int";
                }
                // 使首字母大写
                String classNameUpCase = FreemarkUtil.toUpString(className);
                String columnNameUpCase = FreemarkUtil.toUpString(columnName);
                //这里只是使用一个实体类接收ResultSet的结果
                Params p = new Params.Build()
                        .column(columnName)
                        .comment(rs.getString("column_comment"))
                        .defaultName(rs.getString("column_default"))
                        .type(type)
                        .key(rs.getString("column_key")).tableName(tableName)
                        .className(className).classNameUpCase(classNameUpCase)
                        .columnNameUpCase(columnNameUpCase)
                        .buildParams();
                //将每一个组装好的实体类存入MAP，指定key
                mapCommon.put("Params" + i, p);
                i++;
            }
            //全部的MAP
            map.put("Paramss", mapCommon);
            System.out.println(map);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
