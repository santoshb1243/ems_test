package com.emSigner.lib.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import com.google.common.collect.Table.Cell;

public class DataHandler {
	
	public static String getDataFrompropfile(String filename,String key) {
		String data=null;
		try {
			File f= new File("./config_data/"+filename+".properies");
			FileInputStream fis=new FileInputStream(f);
			Properties pro=new Properties();
			pro.load(fis);
		    data=pro.get(key).toString();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return data; 
		
	}
	public static void setDataFrompropfile(String filename, String key,String value,String comments) {
		//String d=null;
		try {
			File f=new File("./config_data/"+filename+".properies");
			FileInputStream fis= new FileInputStream(f);
			Properties pro=new Properties();
			pro.load(fis);
			pro.put(key, value);
			FileOutputStream fos=new FileOutputStream(f);
			pro.store(fos, comments);
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
	}
	public static String getDataFromExcel(String filename,String sheet,int rowno,int cellno) {
		String data=null;
		try {
			File f=new File("./test_data/"+filename+".xlsx");
			FileInputStream fis= new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sht=wb.getSheet(sheet);
			Row r=sht.getRow(rowno);
			Cell c=r.getCell(cellno);
			 data = c.toString();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return data; 
	}
	public static void setDataFromExcel(String filename,String sheet,int rowno,int cellno,String data) {
		//String data=null;
		try {
			File f=new File("./test_data/"+filename+".xlsx");
			FileInputStream fis= new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sht=wb.getSheet(sheet);
			Row r=sht.getRow(rowno);
			Cell c=r.getCell(cellno);
			 c.setCellValue(data);
			 FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
