    public class OddOrEven
    {	
	 public boolean even;
	//@ assignable even;
    	//@ ensures \result == true ==>  x % 2 == 0;
    	//@ ensures \result == false ==>  x % 2 != 0;
    	
	 public boolean Even (int x)
         { 
         	if (x % 2 != 0)//if (x % 2 == 0)
        		  even = true;         
         	else
        		  even = false;
         	return even;
       	}
	 
    }
