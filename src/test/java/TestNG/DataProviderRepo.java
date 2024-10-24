package TestNG;

import org.testng.annotations.DataProvider;

public class DataProviderRepo {
	
	@DataProvider
	public String[] getdata()
	{
		String [] data= new String [3];
		data[0]= "Phone";
		data[1]= "TV";
		data[2]="Laptop";
		return data;
	}
	@DataProvider
	public String[] newsGetdata()
	{
		String inputdata[]= new String[3];
		inputdata[0]= "School News";
		inputdata[1]="Politics News";
		inputdata[2]= "Child health Care";
	    return inputdata;
		
	}
	

}
