package com.erp.controller;

import com.erp.model.Expert;
import com.erp.model.ExportParam;
import com.erp.model.StudentInfo;
import com.erp.service.ExportService;
import com.erp.service.StudentInfoService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ExportController {

    @Autowired
    private ExportService exportService;

    @Autowired
    private StudentInfoService studentInfoService;

    @RequestMapping("index")
    public void index(HttpServletRequest request, HttpServletResponse response, Model model) {
        List<ExportParam> exports=exportService.export();
        File file = null;
        InputStream inputStream = null;
        ServletOutputStream out = null;
        try{
            request.setCharacterEncoding("UTF-8");
            Map map =new HashMap();
            map.put("exports",exports);
            file = createExcel(request,map, "myExcel","ao.ftl");//调用创建excel帮助类
            inputStream = new FileInputStream(file);
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/msexcel");
            response.setHeader("content-disposition", "attachment;filename="+ URLEncoder.encode("订单统计" + ".xls", "UTF-8"));
            out = response.getOutputStream();
            byte[] buffer = new byte[512]; // 缓冲区
            int bytesToRead = -1;
            // 通过循环将读入的Excel文件的内容输出到浏览器中
            while ((bytesToRead = inputStream.read(buffer)) != -1) {
                out.write(buffer, 0, bytesToRead);
            }
            out.flush();
        }catch(Exception e){

        }
    }
    private static Configuration configuration =null;
    private static Map<String, Template> allTemplates =null;
   // private static String realPath = ServletActionContext.getServletContext().getRealPath("/");
   private String realPath="";
    private   File createExcel(HttpServletRequest request,Map<?, ?> dataMap, String type, String valueName){
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
    @RequestMapping("/export")
    public void export(HttpServletResponse response){
       /* HSSFWorkbook wb=exportService.export();
        try{
            OutputStream output = response.getOutputStream();
            response.addHeader("Content-Disposition", "inline;filename="
                    + new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date()) + ".xls");
            response.setContentType("application/msexcel");
            wb.write(output);
            output.close();
        }catch (Exception e){

        }*/
    }

    @RequestMapping("student")
    public List<StudentInfo> student() {
        return studentInfoService.getList(new StudentInfo());
    }
}
