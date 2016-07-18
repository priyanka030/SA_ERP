package com.Stockaccounting.tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.crypto.tls.SRPTlsClient;

import com.Stockaccounting.masterscripts.StockAccounting_Library;

public class ERP_ext {

	public static void main(String[] args) throws IOException 
	{
    StockAccounting_Library sa=new StockAccounting_Library();
   String result= sa.openapp("http://webapp.qedgetech.com");
    System.out.println(result);
    
   result=sa.AdminLogin("admin", "master");
    System.out.println(result);
    
  /*  result=sa.supplierscreation("mahi", "kempapuram", "banglore", "India", "mahi", "8978675689", "mahi@gmail.com", "8786567876", "welcum");
    System.out.println(result);
    
	*/

 /* result=sa.stockcategorycreation("Electronics");
   System.out.println(result);
    
   result=sa.Uomcreation("U7654","ert");
   System.out.println(result);
    
   result=sa.Stockitemcreation("Electronics", "mahi", "Air conditioner", "100", "300000", "500000", "Stock ill be good");
   System.out.println(result);*/
   //test data path
  /* FileInputStream fis=new FileInputStream("D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\testdata\\UnitOfMeasurement.xlsx"); 
   //create workbook
   XSSFWorkbook wb=new XSSFWorkbook(fis);
   XSSFSheet ws=wb.getSheet("UOM");
   int rc=ws.getLastRowNum();
   System.out.println(rc);
   for (int i = 1; i <=rc; i++)
   {
	   XSSFRow wr=ws.getRow(i);
	   XSSFCell wc1=wr.getCell(0);
	   XSSFCell wc2=wr.getCell(1);
	   XSSFCell wc3=wr.createCell(2);
	   String uomid=wc1.getStringCellValue();
	   String uomdes=wc2.getStringCellValue();
	  String res=sa.Uomcreation(uomid, uomdes);
	  System.out.println(res);
	   wc3.setCellValue(res);
	    
}
   FileOutputStream fos=new FileOutputStream("D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\results\\uomresult.xlsx");
   
   wb.write(fos);
   wb.close();
	}

}*/
	/*FileInputStream fis1=new FileInputStream("D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\testdata\\Suppliers.xlsx"); 
	 XSSFWorkbook wb=new XSSFWorkbook(fis1);
	   XSSFSheet ws=wb.getSheet("Suppliers");
	   int rc=ws.getLastRowNum();
	   System.out.println(rc);
	   for (int i = 1; i <=rc; i++)
	   {
		   XSSFRow wr=ws.getRow(i);
		   XSSFCell wc1=wr.getCell(0);
		   XSSFCell wc2=wr.getCell(1);
		   XSSFCell wc3=wr.getCell(2);
		   XSSFCell wc4=wr.getCell(3);
		   XSSFCell wc5=wr.getCell(4);
		   XSSFCell wc6=wr.getCell(5);
		   XSSFCell wc7=wr.getCell(6);
		   XSSFCell wc8=wr.getCell(7);
		   XSSFCell wc9=wr.getCell(8);
           XSSFCell wc10=wr.createCell(9);
		   String supplierName=wc1.getStringCellValue();
		   String Adress=wc2.getStringCellValue();
		   String City=wc3.getStringCellValue();
		   String Country=wc4.getStringCellValue();
		   String Contactperson=wc5.getStringCellValue();
		   String Phnum=wc6.getStringCellValue();
		   String Email=wc7.getStringCellValue();
		   String mobnum=wc8.getStringCellValue();
		   String Notes=wc9.getStringCellValue();
		   String res=sa.supplierscreation(supplierName, Adress, City, Country, Contactperson, Phnum, Email, mobnum, Notes);
		  System.out.println(res);
		   wc10.setCellValue(res);
		    
	}
	   FileOutputStream fos1=new FileOutputStream("D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\results\\Suppliersresult.xlsx");
	   
	   wb.write(fos1);
	   wb.close();
		}*/
    
	
	/*FileInputStream fis2=new FileInputStream("D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\testdata\\Stockcategory.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis2);
	XSSFSheet ws=wb.getSheet("Stockcategory");
	int rc=ws.getLastRowNum();
	System.out.println(rc);
    for (int i = 1; i <=rc; i++) 
    {
    XSSFRow wr=ws.getRow(i);
    XSSFCell wc1=wr.getCell(0);
    XSSFCell wc2=wr.createCell(1);
    String stoccategory=wc1.getStringCellValue();
    String res=sa.stockcategorycreation(stoccategory);
    System.out.println(res);
    wc2.setCellValue(res);
    }
    FileOutputStream fos2=new FileOutputStream("D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\results\\Stockcategoryresult.xlsx");
    wb.write(fos2);
    wb.close();
	}*/
	
    FileInputStream fis1=new FileInputStream("D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\testdata\\Suppliers.xlsx"); 
	 XSSFWorkbook wb=new XSSFWorkbook(fis1);
	   XSSFSheet ws=wb.getSheet("Suppliers");
	   int rc=ws.getLastRowNum();
	   System.out.println(rc);
	   for (int i = 1; i <=rc; i++)
	   {
		   XSSFRow wr=ws.getRow(i);
		   XSSFCell wc1=wr.getCell(0);
		   XSSFCell wc2=wr.getCell(1);
		   XSSFCell wc3=wr.getCell(2);
		   XSSFCell wc4=wr.getCell(3);
		   XSSFCell wc5=wr.getCell(4);
		   XSSFCell wc6=wr.getCell(5);
		   XSSFCell wc7=wr.getCell(6);
		   XSSFCell wc8=wr.getCell(7);
		   XSSFCell wc9=wr.getCell(8);
          XSSFCell wc10=wr.createCell(9);
		   String supplierName=wc1.getStringCellValue();
		   String Adress=wc2.getStringCellValue();
		   String City=wc3.getStringCellValue();
		   String Country=wc4.getStringCellValue();
		   String Contactperson=wc5.getStringCellValue();
		   String Phnum=wc6.getStringCellValue();
		   String Email=wc7.getStringCellValue();
		   String mobnum=wc8.getStringCellValue();
		   String Notes=wc9.getStringCellValue();
		   String res=sa.supplierscreation(supplierName, Adress, City, Country, Contactperson, Phnum, Email, mobnum, Notes);
		  System.out.println(res);
		   wc10.setCellValue(res);
		    
	}
	   FileOutputStream fos1=new FileOutputStream("D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\results\\Suppliersresult.xlsx");
	   
	   wb.write(fos1);
	   wb.close();
		}
	
	
	
}
