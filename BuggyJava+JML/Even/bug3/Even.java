    public class Even
    {	
	 public boolean even;

	//@ assignable even;
    	//@ ensures \result ==>  x % 2 == 0;
    	//@ ensures !\result ==>  x % 2 != 0;
	 public boolean isEven(int x)
         { 
         	if (x % 2 == 0)
        		  even = true;         
         	else
        		  even = false;
         	return  (even == false ? true : false);//even;
       	}
	 
    }
