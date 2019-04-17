package enumtest.testenum;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSearch
{
	
    @Test
	public void test() 
	{
		  String[] monthArray= Month.contains(31);
		  
		  for(int i=0;i<monthArray.length;i++)
	    	{
	    		if(monthArray[i]!=null)
	    		{
	    		System.out.println(monthArray[i]);
	    	    }
	    	}
		  String[] monthtestArray={"April","June","September","November"};
		  String[] monthtestArray2={"January","March","May","July","August","October","December"};
		 
			 assertNotNull(monthArray);
			 //assertArrayEquals(monthtestArray,monthArray); 
			 assertArrayEquals(monthtestArray2,monthArray); 
			 
	}
}