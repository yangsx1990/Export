package com.erp.utils;

import com.erp.model.Expert;
import com.erp.model.ExportParam;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.Region;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 导出Excel的工具类
 */
public class ExportUtil {


    public static HSSFWorkbook export(List<ExportParam> params,String[] columns){
        // 第一步，创建一个webbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet("学生表一");

        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short

        //加筛选项
        CellRangeAddress c = CellRangeAddress.valueOf("B2:K2");
        sheet.setAutoFilter(c);
        sheet.setColumnWidth(0, 3766); //第一个参数代表列id(从0开始),第2个参数代表宽度值
        HSSFRow row1 = sheet.createRow((int)0);
        row1 = sheet.createRow(0);
        row1.createCell((short) 0).setCellValue("负责填写部门");
        row1.setRowStyle(setCenterStyle(wb.createCellStyle()));
        HSSFCell cell = row1.createCell((short)1);
        cell.setCellValue("销售");
        sheet.addMergedRegion(new Region(
                0, //first row (0-based)
                (short)1, //first column  (0-based)
                0, //last row (0-based)
                (short)6  //last column  (0-based)
        ));

        HSSFCell cellsecond = row1.createCell((short)2);
        cellsecond.setCellValue("文签");
        sheet.addMergedRegion(new Region(
                0, //first row (0-based)
                (short)7, //first column  (0-based)
                0, //last row (0-based)
                (short)16  //last column  (0-based)
        ));
        // 第四步，创建单元格，并设置值表头 设置表头居中
        //设置数据项格式
        HSSFCellStyle style= setColumnStyle(wb.createCellStyle());

       // 每一列
        HSSFRow row = sheet.createRow((int)1);
        row.setHeightInPoints(80);
        row.createCell(0).setCellValue("表头基本字段");
        for(int i=0;i<columns.length;i++){
            HSSFCell cellTitle = row.createCell((short) i+1);
            cellTitle.setCellValue(columns[i]);
            cellTitle.setCellStyle(style);
            sheet.setColumnWidth(i+1,2500);
        }

        for (int i = 0; i < params.size(); i++)
        {
            row = sheet.createRow((int) i + 2);
            ExportParam stu = (ExportParam) params.get(i);
            // 第四步，创建单元格，并设置值

           /* HSSFCellStyle style1 = wb.createCellStyle();
            style1.setWrapText(true); //自动换行
            HSSFCell cell1=row.createCell((short) 1);
            cell1.setCellStyle(style1);
            cell1.setCellValue(new HSSFRichTextString("1."+stu.getName()+"\r\n"+"2.提高!"));*/
           if(stu.getStudent()!=null) {
               row.createCell((short) 1).setCellValue(stu.getStudent().getSchoolNo()==null?"无":stu.getStudent().getSchoolNo());
               row.createCell((short) 2).setCellValue(stu.getStudent().getSystemNo()==null?"无":stu.getStudent().getSystemNo());
               row.createCell((short) 3).setCellValue(stu.getStudent().getName()==null?"无":stu.getStudent().getName());
               if(stu.getStudent().getGender()!=null){
                   row.createCell((short) 4).setCellValue(stu.getStudent().getGender()==1?"男":"女");
               }
               row.createCell((short)5).setCellValue(stu.getStudent().getBirthday()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getStudent().getBirthday()));
               row.createCell((short)6).setCellValue(stu.getStudent().getBranchId());
               row.createCell((short) 8).setCellValue(stu.getStudent().getVipStatus()==1?"是":"否");
               row.createCell((short) 14).setCellValue(stu.getStudent().getSchool()==null?"无":stu.getStudent().getSchool());
               row.createCell((short)15).setCellValue(stu.getStudent().getGraduationStatus()==1?"毕业":"在读");
               row.createCell((short)16).setCellValue(stu.getStudent().getEducation());
               row.createCell((short)17).setCellValue(stu.getStudent().getMajor()==null?"无":stu.getStudent().getMajor());
               row.createCell((short) 18).setCellValue(stu.getStudent().getGrade()==null?"无":stu.getStudent().getGrade());

           }
            if(stu.getContract()!=null){
                row.createCell((short) 7).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(stu.getContract().getSignDate()));
                row.createCell((short) 9).setCellValue(stu.getContract().getContractType().toString());
                row.createCell((short) 10).setCellValue(stu.getContract().getAmount()==null?"无":stu.getContract().getAmount().toString());
            }

            //自信顾问，文案 业务员

            row.createCell((short)11).setCellValue(stu.getSaleOperator()==null?"无":stu.getSaleOperator());
            row.createCell((short)12).setCellValue(stu.getCopyOperator()==null?"无":stu.getCopyOperator());
            row.createCell((short)13).setCellValue(stu.getVisaOperator()==null?"无":stu.getVisaOperator());

            if(stu.getMainApply()!=null){
                if(stu.getMainApply().getAddCollegeStatus()!=null){
                    row.createCell((short) 27).setCellValue(stu.getMainApply().getAddCollegeStatus()==1?"是":"否");
                }
                if(stu.getMainApply().getAddMajorStatus()!=null){
                    row.createCell((short) 28).setCellValue(stu.getMainApply().getAddMajorStatus()==1?"是":"否");
                }
                if(stu.getMainApply().getAddProtocol()!=null){
                    row.createCell((short) 29).setCellValue(stu.getMainApply().getAddProtocol()==1?"是":"否");
                }
                row.createCell((short) 30).setCellValue(stu.getMainApply().getApplyCollege());
                row.createCell((short) 31).setCellValue(stu.getMainApply().getApplyMajor());

                row.createCell((short) 37).setCellValue(stu.getMainApply().getApplyStatus());
                row.createCell((short) 36).setCellValue(stu.getMainApply().getApplyDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainApply().getApplyDate()));

                if(stu.getMainSupplement()!=null){
                    row.createCell((short) 39).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainSupplement().getCollectMaterialDate()));
                    row.createCell((short) 40).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainSupplement().getSchoolRequireDate()));
                    row.createCell((short) 41).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainSupplement().getSchoolRequireAddDeadline()));
                    row.createCell((short) 42).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainSupplement().getSupplementDate()));
                    row.createCell((short) 43).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainSupplement().getSchoolConfirmReceiveDate()));
                }
                if(stu.getMainReply()!=null){
                    if(stu.getMainReply().getReplyResult()!=null){
                        row.createCell((short) 45).setCellValue(stu.getMainReply().getReplyResult()==1?"录取":"拒绝");
                    }
                    row.createCell((short) 46).setCellValue(stu.getMainReply().getReplyReason()==null?"无":stu.getMainReply().getReplyReason());
                    row.createCell((short) 44).setCellValue(stu.getMainReply().getReplyDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainReply().getReplyDate()));
                    row.createCell((short) 47).setCellValue(stu.getMainReply().getReplyOfferDealine()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainReply().getReplyOfferDealine()));
                    row.createCell((short) 48).setCellValue(stu.getMainReply().getStudentConfirmDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainReply().getStudentConfirmDate()));
                    row.createCell((short) 49).setCellValue(stu.getMainReply().getSchoolConfirmStuDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainReply().getSchoolConfirmStuDate()));
                    row.createCell((short) 50).setCellValue(stu.getMainApply().getArgueDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainApply().getArgueDate()));
                    row.createCell((short) 53).setCellValue(stu.getMainReply().getUnConditionDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainReply().getUnConditionDate()));
                    row.createCell((short) 55).setCellValue(stu.getMainReply().getStudentConfirmUnConditionDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainReply().getStudentConfirmUnConditionDate()));
                    row.createCell((short) 56).setCellValue(stu.getMainReply().getSchoolConfirmStuUnConditionDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainReply().getSchoolConfirmStuUnConditionDate()));

                }

                if(stu.getMainStayApply()!=null){
                    row.createCell((short) 82).setCellValue(stu.getMainStayApply().getApplyDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainStayApply().getApplyDate()));
                    row.createCell((short) 83).setCellValue("--");

                    if(stu.getMainStayReply()!=null){
                        //row.createCell((short)84).setCellValue(stu.getMainStayReply().getStudentConfirmDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainStayReply().getStudentConfirmDate()));
                        row.createCell((short) 86).setCellValue(stu.getMainStayReply().getReplyOfferDealine()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainStayReply().getReplyOfferDealine()));
                        row.createCell((short) 87).setCellValue(stu.getMainStayReply().getStudentConfirmDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainStayReply().getStudentConfirmDate()));
                        row.createCell((short) 88).setCellValue(stu.getMainStayReply().getSchoolConfirmStuDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getMainStayReply().getSchoolConfirmStuDate()));
                    }
                }
            }
           if(stu.getLangApply()!=null){
               row.createCell((short) 61).setCellValue(stu.getLangApply().getApplyDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangApply().getApplyDate()));
               row.createCell((short) 67).setCellValue(stu.getLangReply().getReplyDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangReply().getReplyDate()));
               if(stu.getLangReply().getReplyResult()!=null){
                   row.createCell((short) 68).setCellValue(stu.getLangReply().getReplyResult()==1?"录取":"拒绝");
               }
               row.createCell((short) 69).setCellValue(stu.getLangReply().getReplyReason()==null?"无":stu.getLangReply().getReplyReason());

               if(stu.getLangSupplement()!=null){
                   row.createCell((short) 62).setCellValue(stu.getLangSupplement().getCollectMaterialDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangSupplement().getCollectMaterialDate()));
                   row.createCell((short) 63).setCellValue("==");
                   row.createCell((short) 64).setCellValue(stu.getLangSupplement().getSchoolRequireDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangSupplement().getSchoolRequireDate()));
                   row.createCell((short) 65).setCellValue(stu.getLangSupplement().getSupplementDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangSupplement().getSupplementDate()));
                   row.createCell((short) 66).setCellValue(stu.getLangSupplement().getSchoolConfirmReceiveDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangSupplement().getSchoolConfirmReceiveDate()));

               }
               if(stu.getLangReply()!=null){
                   row.createCell((short) 70).setCellValue(stu.getLangReply().getReplyOfferDealine()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangReply().getReplyOfferDealine()));
                   row.createCell((short) 71).setCellValue(stu.getLangReply().getStudentConfirmDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangReply().getStudentConfirmDate()));
                   row.createCell((short) 72).setCellValue(stu.getLangReply().getSchoolConfirmStuDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangReply().getSchoolConfirmStuDate()));
                   row.createCell((short) 73).setCellValue(stu.getLangReply().getCoeDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangReply().getCoeDate()));
               }

               if(stu.getLangStayApply()!=null){
                   row.createCell((short) 75).setCellValue(stu.getLangStayApply().getApplyDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangStayApply().getApplyDate()));
                   row.createCell((short) 76).setCellValue("--");

                   if(stu.getLangStayReply()!=null){
                       row.createCell((short) 79).setCellValue(stu.getLangStayReply().getReplyOfferDealine()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangStayReply().getReplyOfferDealine()));
                       row.createCell((short) 80).setCellValue(stu.getLangStayReply().getStudentConfirmDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangStayReply().getStudentConfirmDate()));
                       row.createCell((short) 81).setCellValue(stu.getLangStayReply().getSchoolConfirmStuDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getLangStayReply().getSchoolConfirmStuDate()));
                   }
               }
           }



            row.createCell((short) 32).setCellValue(stu.getCopywriting().getApplyCountryRejectHistory()==1?"是":"否");
            row.createCell((short) 33).setCellValue(stu.getCopywriting().getOtherCountryRejectHistory()==1?"是":"否");
            row.createCell((short)96).setCellValue(stu.getCopywriting().getCopyName());
            row.createCell((short)97).setCellValue("是否接受");
            row.createCell((short)98).setCellValue(stu.getCopywriting().getFirstVisitStatus()==1?"是":"否");
            row.createCell((short) 99).setCellValue(stu.getCopywriting().getSendCopyGuidanceStatus()==1?"是":"否");
            row.createCell((short) 100).setCellValue(stu.getCopywriting().getStudentAcceptStatus()==1?"是":"否");
            row.createCell((short) 101).setCellValue(stu.getCopywriting().getCopyExamType());
            row.createCell((short) 102).setCellValue(stu.getCopywriting().getCopyExamScore());
            row.createCell((short) 103).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(stu.getCopywriting().getCopyExamTime()));
            row.createCell((short) 104).setCellValue(stu.getCopywriting().getGradeFourStatus()==1?"是":"否");
            row.createCell((short) 105).setCellValue(stu.getCopywriting().getCopyGpa());
            row.createCell((short) 106).setCellValue(stu.getCopywriting().getExpectApplyDate());
            row.createCell((short) 107).setCellValue(stu.getCopywriting().getApplyDangerStatus()==1?"是":"否");
            row.createCell((short) 108).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(stu.getCopywriting().getCompleteDate()));
            row.createCell((short) 109).setCellValue(stu.getCopywriting().getCopyPaymentType());
            row.createCell((short) 110).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(stu.getCopywriting().getCompleteDate()));
            row.createCell(26).setCellValue(stu.getCopywriting().getOtherExperience()==null?"无":stu.getCopywriting().getOtherExperience());

            if(stu.getVisa()!=null){
                row.createCell((short) 121).setCellValue(stu.getVisa().getMainSponsor()==null?"无":stu.getVisa().getMainSponsor());
                row.createCell((short)122).setCellValue(stu.getVisa().getSponsorUnit()==null?"无":stu.getVisa().getSponsorUnit());
                row.createCell((short)123).setCellValue(stu.getVisa().getSponsorPosition()==null?"无":stu.getVisa().getSponsorPosition());
                row.createCell((short)124).setCellValue(stu.getVisa().getSponsorIncome()==null?"无":stu.getVisa().getSponsorIncome());
                row.createCell((short)125).setCellValue(stu.getVisa().getOtherSponsor()==null?"无":stu.getVisa().getOtherSponsor());
                row.createCell((short)126).setCellValue(stu.getVisa().getFamilyAsset()==null?"无":stu.getVisa().getFamilyAsset());
                row.createCell((short)127).setCellValue(stu.getVisa().getPaymentDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getVisa().getPaymentDate()));
                row.createCell((short)128).setCellValue(stu.getVisa().getPaymentChannel());
                if(stu.getVisa().getHealthTestStatus()!=null){
                    row.createCell((short)130).setCellValue(stu.getVisa().getHealthTestStatus()==1?"是":"否");
                    row.createCell((short)131).setCellValue(stu.getVisa().getHealthTestDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getVisa().getHealthTestDate()));
                }
                row.createCell((short)132).setCellValue(stu.getVisa().getImitateSurvey()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getVisa().getImitateSurvey()));
                row.createCell((short)133).setCellValue(stu.getVisa().getMaterialCompleteDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getVisa().getMaterialCompleteDate()));
                row.createCell((short)134).setCellValue(stu.getVisa().getCommitDate()==null?"无":new SimpleDateFormat("yyyy-MM-dd").format(stu.getVisa().getCommitDate()));

                row.createCell((short)98).setCellValue("首次回访日期");
            }
        }
        return wb;
        // 第六步，将文件存到指定位置
       /* try
        {
            FileOutputStream fout = new FileOutputStream("E:/students.xls");
            wb.write(fout);
            fout.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }*/
    }

    /**
     * 设置数据项列名样式
     * @param style
     * @return
     */
    private static HSSFCellStyle setColumnStyle(HSSFCellStyle style) {
        style.setWrapText(true); //自动换行
        // 加边框
      /*  style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
        style.setBottomBorderColor(HSSFColor.BLACK.index);
        style.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
        style.setLeftBorderColor(HSSFColor.BLACK.index);
        style.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
        style.setRightBorderColor(HSSFColor.BLACK.index);
        style.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
        style.setTopBorderColor(HSSFColor.BLACK.index);
*/
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
      /*  style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style.setFillForegroundColor(HSSFColor.YELLOW.index);*/
        return style;
    }

    /**
     * 设置数据项列名样式
     * @param style
     * @return
     */
    private static HSSFCellStyle setFirstTitleStyle(HSSFCellStyle style) {
        style.setWrapText(true); //自动换行
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style.setFillForegroundColor(HSSFColor.GREEN.index);
        return style;
    }

    private static HSSFCellStyle setCenterStyle(HSSFCellStyle style) {
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        return style;
    }

    private static HSSFCellStyle setAutoSizeStyle(HSSFCellStyle style) {
        style.setWrapText(true); //自动换行
        return style;
    }
}
