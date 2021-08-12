
public class ControlDemo2Loop {
	public static void main(String[] args) {  

	int sum = 0;  
	for(int j = 1; j<=10; j++) {  
	sum = sum + j;  
	}  
	System.out.println("The sum of first 10 natural numbers is " + sum);  
	
	
	String[] names = {"Java","C","C++","Python","JavaScript"};    
	System.out.println("Printing the content of the array names:\n");    
	for(String name:names) {    
	System.out.println(name);    
	}    

	int i = 0;    
	System.out.println("Printing the list of first 10 even numbers \n");    
	while(i<=10) {    
	System.out.println(i);    
	i = i + 2;    
	}    

	
	int j = 0;    
	System.out.println("Printing the list of first 10 even numbers \n");    
	do {    
	System.out.println(j);    
	j = j + 2;    
	}while(j<=10);    

	for(int i3 = 0; i3<= 10; i3++) {  
		System.out.println(i3);  
		if(i3==6) {  
		break;  
		}  
		}  


		a:    
		for(int i2 = 0; i2<= 10; i2++) {    
		b:    
		for(int j2 = 0; j2<=15;j2++) {    
		c:    
		for (int k = 0; k<=20; k++) {    
		System.out.println(k);    
		if(k==5) {    
		break a;    
		}    
		}    
		}    


		
		
		for(int i1 = 0; i1<= 2; i1++) {  
			  
			for (int j1 = i; j1<=5; j1++) {  
			  
			if(j1 == 4) {  
			continue;  
			}  
			System.out.println(j1);  
			}  
			}  
			}  

		
		
	    
	    
	    
	
	}  


}
