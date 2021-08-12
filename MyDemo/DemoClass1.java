//another class  
//Creating Student class.  
class Student{  
 int id;  
 String name; 
}

 class Employee{  
	    int id;  
	    String name;  

 float salary;  
 void insert(int i, String n, float s) {  
     id=i;  
     name=n;  
     salary=s;  
 }  
 void display(){System.out.println(id+" "+name+" "+salary);}  


}  

 class Rectangle{  
	 int length;  
	 int width;  
	 void insert(int l,int w){  
	  length=l;  
	  width=w;  
	 }  
	 void calculateArea(){System.out.println(length*width);}  
	}  


//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods  
class Account{  
int acc_no;  
String name;  
float amount;  
//Method to initialize object  
void insert(int a,String n,float amt){  
acc_no=a;  
name=n;  
amount=amt;  
}  
//deposit method  
void deposit(float amt){  
amount=amount+amt;  
System.out.println(amt+" deposited");  
}  
//withdraw method  
void withdraw(float amt){  
if(amount<amt){  
System.out.println("Insufficient Balance");  
}else{  
amount=amount-amt;  
System.out.println(amt+" withdrawn");  
}  
}  
//method to check the balance of the account  
void checkBalance(){System.out.println("Balance is: "+amount);}  
//method to display the values of an object  
void display(){System.out.println(acc_no+" "+name+" "+amount);}  
}  

class Bike1{  
	//creating a default constructor  
	Bike1(){System.out.println("Bike is created");}  
}
 


class Student5{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Student5(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Student5(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    
    Student5(Student5 s){  
        id = s.id;  
        name =s.name;  
        }  
    void display(){System.out.println(id+" "+name+" "+age);}  
}
    
public class DemoClass1 {
	//Java Program to illustrate how to define a class and fields  
	//Defining a Student class.  
	 //defining fields  
	 int id;//field or data member or instance variable  
	 String name;  
	 //creating main method inside the Student class  
	 public static void main(String args[]){  
	  //Creating an object or instance  
	  DemoClass1 DC1=new DemoClass1();//creating an object of Student  
	  //Printing values of the object  
	  System.out.println(DC1.id);//accessing member through reference variable  
	  System.out.println(DC1.name);  

	  
	  // The Class 
	  
	  Student s1=new Student();  
	  System.out.println(s1.id);  
	  System.out.println(s1.name); 
	  
	  // Class Initialization through reference
	  
	  s1.id=101;  
	  s1.name="Demo1";  
	  System.out.println(s1.id+" "+s1.name);//printing members with a white space  

	  Student s2=new Student();  
	  //Initializing objects  
	  s2.id=102;  
	  s2.name="Amit";  
	  //Printing data  
	  System.out.println(s1.id+" "+s1.name);  
	  System.out.println(s2.id+" "+s2.name);  

	  
	  //Object and Class Example: Employee


	    Employee e1=new Employee();  
	    Employee e2=new Employee();  
	    Employee e3=new Employee();  
	    e1.insert(1001,"Rohit",55000);  
	    e2.insert(1002,"Mani",25000);  
	    e3.insert(1003,"Boon",15000);  
	    e1.display();  
	    e2.display();  
	    e3.display();  

	    Rectangle r1=new Rectangle(),r2=new Rectangle();//creating two objects  
	    r1.insert(11,5);  
	    r2.insert(3,15);  
	    r1.calculateArea();  
	    r2.calculateArea();  
 

	    Account a1=new Account();  
	    a1.insert(832345,"Selvi",1000);  
	    a1.display();  
	    a1.checkBalance();  
	    a1.deposit(40000);  
	    a1.checkBalance();  
	    a1.withdraw(15000);  
	    a1.checkBalance();  

	    
	  //calling a default constructor  
	    Bike1 b=new Bike1();  
	    
	    Student5 s51 = new Student5(111,"Karan",23);  
	    Student5 s52 = new Student5(222,"Aryan",25);  
	    Student5 s3 = new Student5(s51);  
	    s3.display();  
	    s51.display();  
	    s52.display();  
	  

	 }  

}  


