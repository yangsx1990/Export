package com.erp.utils;

import freemarker.template.Configuration;
import freemarker.template.Template;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/***
 * 导出excel的工具类
 */
public class ExcelUtil {

    private static Configuration configuration =null;
    private static Map<String, Template> allTemplates =null;
    // private static String realPath = ServletActionContext.getServletContext().getRealPath("/");
    private String realPath="";
    public File createExcel(HttpServletRequest request, Map<?, ?> dataMap, String type, String valueName){
        realPath=request.getServletContext().getRealPath("");
        try {
            configuration = new Configuration();
            configuration.setDefaultEncoding("UTF-8");
            configuration.setDirectoryForTemplateLoading(new File(realPath+""));
            allTemplates = new HashMap<String, Template>();
            allTemplates.put(type, configuration.getTemplate(valueName));
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        String name = "temp" + (int) (Math.random() * 100000) + ".xls";
        File file = new File(name);
        Template template = allTemplates.get(type);
        try {
            Writer w = new OutputStreamWriter(new FileOutputStream(file), "utf-8");
            template.process(dataMap, w);
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return file;
    }
}
