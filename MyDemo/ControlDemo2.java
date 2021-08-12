
public class ControlDemo2 {

    public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }    

	public static void main(String args[]){  

	int number=13;
	int k=0;
	int i=1;

    //Using ternary operator  
    String output=(number%2==0)?"even number":"odd number";    
    System.out.println(output);  
	
	
    int month=7;    
    String monthString="";  
    //Switch statement  
    switch(month){    
    //case statements within the switch block  
    case 1: monthString="1 - January";  
    break;    
    case 2: monthString="2 - February";  
    break;    
    case 3: monthString="3 - March";  
    break;    
    case 4: monthString="4 - April";  
    break;    
    case 5: monthString="5 - May";  
    break;    
    case 6: monthString="6 - June";  
    break;    
    case 7: monthString="7 - July";  
    break;    
    case 8: monthString="8 - August";  
    break;    
    case 9: monthString="9 - September";  
    break;    
    case 10: monthString="10 - October";  
    break;    
    case 11: monthString="11 - November";  
    break;    
    case 12: monthString="12 - December";  
    break;    
    default:System.out.println("Invalid Month!");    
    }    
    //Printing month of the given number  
    System.out.println(monthString);  

    
    
    
    Day[] DayNow = Day.values();    
    for (Day Now : DayNow)    
    {    
         switch (Now)    
         {    
             case Sun:    
                 System.out.println("Sunday");    
                 break;    
             case Mon:    
                 System.out.println("Monday");    
                 break;    
             case Tue:    
                 System.out.println("Tuesday");    
                 break;         
             case Wed:    
                 System.out.println("Wednesday");    
                 break;    
             case Thu:    
                 System.out.println("Thursday");    
                 break;    
             case Fri:    
                 System.out.println("Friday");    
                 break;    
             case Sat:    
                 System.out.println("Saturday");    
                 break;    
         }    
     }    

	
    if(number%2==0){  
        System.out.println("even number");  
    }else{  
        System.out.println("odd number");  
    }  

    
    
    for(int i1=1;i1<=5;i1++){  
    	for(int j=1;j<=i1;j++){  
    	        System.out.print("* ");  
    	}  
    	System.out.println();//new line  
    	}  

	
    
    //Declaring an array  
    int arr[]={12,23,44,56,78};  
    //Printing array using for-each loop  
    for(int i3:arr){  
        System.out.println(i3);  
    }  

    
    do{    
        System.out.println(i);    
    i++;    
    }while(i<=10);    
    

    
 /*  for(;;){  
 //       System.out.println("infinitive loop");  
//    }  
    
      
  //  do{  
  //      System.out.println("infinitive do while loop");  
  //  }while(true);  
*/

    while(k<=10){  
    System.out.println(k);  
k++;  
}  
	
  //This is single line comment  

    
    
    // Document Comments
 /*   
    /** 
     * <h2> Calculation of numbers </h2> 
     * This program implements an application 
     * to perform operation such as addition of numbers  
     * and print the result  
     * <p> 
     * <b>Note:</b> Comments make the code readable and  
     * easy to understand. 
     *  
     * @author Anurati  
     * @version 21.08
     * @since 2021-08-11 
     */  

	
	}
}
