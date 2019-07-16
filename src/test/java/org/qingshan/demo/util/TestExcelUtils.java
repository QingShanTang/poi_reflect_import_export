package org.qingshan.demo.util;

import jdk.internal.util.xml.impl.Input;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestExcelUtils {

    //导出excel
//    public static void main(String[] args) {
//        //excel中sheet的名称
//        String sheetName = "student_info";
//        String title = "学生信息表";
//        String fileName = "student_info.xlsx";
//        String[] headers = {"id", "name", "age", "school", "create_date"};
//        String pattern = "yyyy-MM-dd";
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("1", "花花", 7, "第一中学", new Date()));
//        students.add(new Student("2", "嘿嘿", 8, "第一中学", new Date()));
//        students.add(new Student("3", "豆包", 9, "第一中学", new Date()));
//        ExcelUtils excelUtils = new ExcelUtils();
//        SXSSFWorkbook wb = excelUtils.generateWB(sheetName, title, Arrays.asList(headers), students, pattern);
//        String url = excelUtils.generateExcelByWB(wb, fileName, "/Users/qingshan/Desktop/tempfiles/demo_java_poi_reflect_import_export/init");
//    }

    //导入excel
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("/Users/qingshan/Desktop/tempfiles/demo_java_poi_reflect_import_export/init/20190716/13/student_info_65672f82c4044fbe85433f9d4cc2c681.xlsx");
        Class clazz = Student.class;
        List<Student> studentList = (List<Student>) ExcelUtils.importMappingExcel(inputStream, 0, 2, clazz);
        System.out.println(studentList);
    }


}
