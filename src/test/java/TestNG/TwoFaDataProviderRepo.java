package TestNG;

import org.testng.annotations.DataProvider;

public class TwoFaDataProviderRepo 
{
	@DataProvider
	public Object[][] getLoginCre() 
	{
	    return new Object[][] 
	    {
	       // {"admin", "Admin@12"},
	        {"ADMIN", "Admin@123"}
	        
	    };
	}
	
	@DataProvider
	public String[] OTPpass()
	{
		
		String[] data = new String[1]; 
		
		data[0]= "1111111";
		return data;
		
	}
}

