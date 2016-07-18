import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

import com.Stockaccounting.masterscripts.StockAccounting_Library;

public class NotepadUom {

	public static void main(String[] args) throws IOException {
		StockAccounting_Library sa=new StockAccounting_Library();
		   String result= sa.openapp("http://webapp.qedgetech.com");
		    System.out.println(result);
		    
		   result=sa.AdminLogin("admin", "master");
		    System.out.println(result);
		   
		    
	/*String Fpath="D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\testdata\\Uom.txt";
	String Respath="D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\results\\Uomresult.txt";
	String sd;
	FileReader fr=new FileReader(Fpath);
	BufferedReader br=new BufferedReader(fr);
	String sread=br.readLine();
	System.out.println(sread);
	FileWriter fw=new FileWriter(Respath);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(sread+"@@@"+"Result");
	bw.newLine();
	while ((sd=br.readLine())!=null)
	{
		System.out.println(sd);
		String [] sr=sd.split("@@@");
		String uomid=sr[0];
		System.out.println(uomid);
		String uomdes=sr[1];
		System.out.println(uomdes);
		String res=sa.Uomcreation(uomid, uomdes);
		System.out.println(res);
		bw.write(uomid+"@@@"+uomdes+"@@@"+res);
		bw.newLine();
		}
	bw.close();
	br.close();
	}*/
   /* String fpath="D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\testdata\\Stockitemcr.txt";
    String respath="D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\results\\Stockitemcrresult.txt";
    String sd;
	FileReader fr=new FileReader(fpath);
	BufferedReader br=new BufferedReader(fr);
	String sread=br.readLine();
	System.out.println(sread);
	FileWriter fw=new FileWriter(respath);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(sread+"@@@"+"Result");
	bw.newLine();
	while ((sd=br.readLine())!=null) 
	{
	System.out.println(sd);
	String []sr=sd.split("##");
	String category=sr[0];
	System.out.println(category);
	String suppliername=sr[1];
	System.out.println(suppliername);
	String stockName=sr[2];
	System.out.println(stockName);
	String uom=sr[3];
	System.out.println(uom);
	String purchasingprice=sr[4];
	System.out.println(purchasingprice);
	String sellingprice=sr[5];
	System.out.println(sellingprice);
	String notes=sr[6];
	System.out.println(notes);
	String res=sa.Stockitemcreation(category, suppliername, stockName, uom, purchasingprice, sellingprice, notes);
	System.out.println(res);
	bw.write(category+"@@@"+suppliername+"@@@"+stockName+"@@@"+uom+"@@@"+purchasingprice+"@@@"+sellingprice+"@@@"+notes+"@@@"+res);
	bw.newLine();
	}
	bw.close();
	br.close();
	
	}
	}*/
		    String fpath="D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\testdata\\Supplierscreationnote.txt";
		    String respath="D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\results\\Supplierscreationnoteresult.txt";
		    String sd;
			FileReader fr=new FileReader(fpath);
			BufferedReader br=new BufferedReader(fr);
			String sread=br.readLine();
			System.out.println(sread);
			FileWriter fw=new FileWriter(respath);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(sread+"@@@"+"Result");
			bw.newLine();
			while ((sd=br.readLine())!=null) 
			{
			System.out.println(sd);
			String []sr=sd.split("@@@");
			
			String supplierName=sr[0];
			System.out.println(supplierName);
			String Adress=sr[1];
			System.out.println(Adress);
			String City=sr[2];
			System.out.println(City);
			String Country=sr[3];
			System.out.println(Country);
			String ContactPerson=sr[4];
			System.out.println(ContactPerson);
			String Phnum=sr[5];
			System.out.println(Phnum);
			String Email=sr[6];
			System.out.println(Email);
			String mobnum=sr[7];
			System.out.println(mobnum);
			String Notes=sr[8];
			System.out.println(Notes);
            String res=sa.supplierscreation(supplierName, Adress, City, Country, ContactPerson, Phnum, Email, mobnum, Notes);
			System.out.println(res);
			bw.write(supplierName+"@@@"+Adress+"@@@"+City+"@@@"+Country+"@@@"+ContactPerson+"@@@"+Phnum+"@@@"+Email+"@@@"+mobnum+"@@@"+Notes+"@@@"+res);
			bw.newLine();
			}
			bw.close();
			br.close();
			}
			}

	
	
	
	


	
