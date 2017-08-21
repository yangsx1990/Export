package com.erp.utils;

import com.erp.model.StudentInfo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap <T>{

  /*  public  List<Map<String,Object>>  list2Map(List<T> list, Class<T> c) {
        List<Map<String,Object>> maps = new ArrayList<>();
        if (list != null) {
            try {
                //Method methodGetKey = c.getMethod(keyMethodName);
                for (int i = 0; i < list.size(); i++) {
                    Map<String,Object> map=new HashMap<>();
                    Object value = list.get(i);
                    @SuppressWarnings("unchecked")
                    Class userCla = (Class) bean.getClass();
                    map.put(key, value);

                }
            } catch (Exception e) {
                throw new IllegalArgumentException("field can't match the key!");
            }
        }

        return maps;
    }

    public static void main(String[] args) {
        List<StudentInfo> list=new ArrayList<>();
        StudentInfo s=new StudentInfo();
        s.setId(1);
        s.setMajor("dfjds");
        list.add(s);
        list2Map<list,
    }*/
}
