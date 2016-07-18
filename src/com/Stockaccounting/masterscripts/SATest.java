package com.Stockaccounting.masterscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Suppliers;

public class SATest extends Testngbase
{
	@Test(dataProvider="udata")
	public void Suppliers(String sname,String sadress,String scity,String scountry,String cperson,String pnumber,String email,String mnum,String notes)
	{
	 sl.supplierscreation(sname, sadress, scity, scountry,cperson,pnumber, email, mnum, notes);
	}
/*public void uom(String uid,String udes)	
{
	sl.Uomcreation(uid, udes);
	}
	
	@Test
	public void sc()
{
		
	sl.stockcategorycreation("cname23");	
		
		}*/
/*@DataProvider
public Object [][] udata()
{
 Object [][] obj=new Object[3][2];
 
obj[0][0]="p098";
obj[0][1]="udes1";

obj[1][0]="p099";
obj[1][1]="udes2";

obj[2][0]="p100";
obj[2][1]="udes3";
return obj;
}*/
@DataProvider
public Object [][] udata()
{
Object [][] obj=new Object[2][9];
obj[0][0]="Babloo";
obj[0][1]="JNTU";
obj[0][2]="Hyd";
obj[0][3]="India";
obj[0][4]="Hemanth";
obj[0][5]="8978675645";
obj[0][6]="babloo56@gmail.com";
obj[0][7]="8978765645";
obj[0][8]="descrition1";

obj[1][0]="Niha";
obj[1][1]="Illinois";
obj[1][2]="US";
obj[1][3]="USA";
obj[1][4]="Niharika";
obj[1][5]="9089786756";
obj[1][6]="niha@gmail.com";
obj[1][7]="08814222345";
obj[1][8]="description2";
return obj;


	
}
}



