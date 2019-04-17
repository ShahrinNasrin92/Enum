package enumtest.testenum;

public enum Month {
	JANUARY("January",31),
	FEBRUARY("February",28),
	MARCH("March",31),
	APRIL("April",30),
	MAY("May",31),
	JUNE("June",30),
	JULY("July",31),
	AUGUST("August",31),
	SEPTEMBER("September",30),
	OCTOBER("October",31),
	NOVEMBER("November",30),
	DECEMBER("December",31);
	
	private final String monthName;
    private final int days;
   
	static String[] found=new String[12];
	static String[] firstArray=new String[4];
	static String[] secondArray=new String[7];
  
	private Month(String monthName, int days) {
		this.monthName = monthName;
		this.days = days;
	}
	public String getMonthName() {
		return monthName;
	}
	public int getDays() {
		return days;
	}

    // order of fields matter
	public static String[] contains(int d)
	  {
		int index=0;
	      for(Month choice:values())
	      {
	          if(choice.getDays()==d)
	    	   {
	        	  if(d==30)
	        	  {
            	  firstArray[index]= choice.getMonthName();
	    		   index++;
	        	  }
	        	  else if(d==31)
	        	  {
	        		  secondArray[index]= choice.getMonthName();
		    		   index++;  
	        	  }
	    	   }
	     }
	      
	      if(d==30)
	      {
	    	  return firstArray;  
	      }
	      else
	      {
	    	  return secondArray;
	      }
	         
	  }
}