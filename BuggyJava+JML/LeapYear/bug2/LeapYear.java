

public class LeapYear {

 /*@ requires 0 < year && year <= Integer.MAX_VALUE;
 {|
    //@ requires year % 4 != 0; 
    //@ ensures \result == false;

    also
 
    //@ requires year % 4 == 0 && year % 100 != 0;
    //@ ensures \result == true;

    also

   //@ requires year % 4 == 0 && year % 100 == 0 && year % 400 != 0;
   //@ ensures \result == false;

   also
 
   //@ requires year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
   //@ ensures \result == true;
 |} @*/
 

    public boolean LeapChecking(int year) {
        boolean leap = false;
         
        if (year % 4 != 0)//if (year % 4 == 0)
        {
            if ( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
	
	return leap;
   }
}
