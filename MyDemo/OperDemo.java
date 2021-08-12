
public class OperDemo {
		public static void main(String args[]){  
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		int a=10;  
		int b=10;  
	    int c=20;  
	    boolean m = true;  
		boolean d = false;  
		
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21  

		
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!m);//false (opposite of boolean value)  
		System.out.println(!d);//true
		
		System.out.println(a+b);//15  
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		System.out.println(a%b);//0  
		
		
		System.out.println(10*10/5+3-1*4/2);  

		//Left Shift
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
		
		//Right Shift
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  

		// Java Shift Operators 
		
	    //For positive number, >> and >>> works same  
	    System.out.println(20>>2);  
	    System.out.println(20>>>2);  
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  

	    // And
	    System.out.println(a<b&&a<c);//false && true = false  
	    System.out.println(a<b&a<c);//false & true = false  

	    
	    //Bit Wise
	    
	    System.out.println(a<b&&a++<c);//false && true = false  
	    System.out.println(a);//10 because second condition is not checked  
	    System.out.println(a<b&a++<c);//false && true = false  
	    System.out.println(a);//11 because second condition is checked  

	    // Or
	    
	    System.out.println(a>b||a<c);//true || true = true  
	    System.out.println(a>b|a<c);//true | true = true  
	    //|| vs |  
	    System.out.println(a>b||a++<c);//true || true = true  
	    System.out.println(a);//10 because second condition is not checked  
	    System.out.println(a>b|a++<c);//true | true = true  
	    System.out.println(a);//11 because second condition is checked  
	    
	    // Ternary Operation
	    
	    int min=(a<b)?a:b;  
	    System.out.println(min);  

	    
	    // Assignment Operations
	    
	    a+=4;//a=a+4 (a=10+4)  
	    b-=4;//b=b-4 (b=20-4)  
	    System.out.println(a);  
	    System.out.println(b);  
	    
	    // Type Casting
	    
	    short ab=10;  
	    short ba=10;  
	    ab=(short)(ab+ba);//20 which is int now converted to short  
	    System.out.println(ab);  

	    		
		}  
}
