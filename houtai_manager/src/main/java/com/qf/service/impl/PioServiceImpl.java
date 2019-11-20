package com.qf.service.impl;

import com.qf.domain.DrugMsg;
import com.qf.domain.GithubLoginUser;
import com.qf.service.PioService;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
@Service
public class PioServiceImpl implements PioService {

    @Override
    public String export(DrugMsg drugMsg) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFCellStyle styleTitle;
        styleTitle = workbook.createCellStyle();
        styleTitle.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
        styleTitle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        styleTitle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        styleTitle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        styleTitle.setBorderRight(HSSFCellStyle.BORDER_THIN);
        styleTitle.setBorderTop(HSSFCellStyle.BORDER_THIN);
        styleTitle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        styleTitle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        styleTitle.setAlignment(HSSFCellStyle.ALIGN_CENTER); //水平布局：居中
        styleTitle.setWrapText( true);
        HSSFCellStyle styleCellNumber;
        styleCellNumber = workbook.createCellStyle();
        styleCellNumber.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        styleCellNumber.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        styleCellNumber.setBorderRight(HSSFCellStyle.BORDER_THIN);
        styleCellNumber.setBorderTop(HSSFCellStyle.BORDER_THIN);
        styleCellNumber.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        styleCellNumber.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        styleCellNumber.setAlignment(HSSFCellStyle.ALIGN_CENTER); //水平布局：居中
        styleCellNumber.setDataFormat(HSSFDataFormat.getBuiltinFormat( "0"));
        HSSFSheet sheet = workbook.createSheet("药品详单");
        Class<? extends DrugMsg> aClass = drugMsg.getClass();
        int i=0;
        Field[] declaredFields = aClass.getDeclaredFields();
        HSSFRow row1 = sheet.createRow(0);
        for (Field declaredField : declaredFields) {
            HSSFCell cell = row1.createCell(i++);
            System.out.println( declaredField.getName());
            cell.setCellValue( declaredField.getName());
        }
        HSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
        Method[] declaredMethods = aClass.getDeclaredMethods();
        int j=0;
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().contains("get")) {
                try {
                    Object invoke = declaredMethod.invoke(drugMsg);
                    HSSFCell cell = row.createCell(j++);
                    cell.setCellValue(invoke+"");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(new File("e:/药品详情单.xls"));
            workbook.write(fileOutputStream);
            fileOutputStream.close();
            return "导出成功";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "导出失败";
    }

    @Override
    public void addexcel() {

    }
}
