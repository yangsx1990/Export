package com.erp.service;

import com.erp.model.Expert;
import com.erp.model.ExportParam;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.util.List;

public interface ExportService {

    List<Expert> queryList();
    List<ExportParam> export(Integer countryId);
    List<ExportParam> queryParams();

}
