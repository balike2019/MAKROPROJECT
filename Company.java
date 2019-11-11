package za.co.makro.stock.company;

import za.co.makro.people.employee.Employee;
import za.co.makro.people.person.Person;
//import za.co.makro.sales.payment.Payment;
//import za.co.makro.stock.product.Product;
//import za.co.makro.sales.cart.Cart;
import java.util.Scanner; 

public class Company{


public static  Company [] companies;

Scanner scanner=new Scanner(System.in);


public void employeeRegistration(Scanner scanner, Person person,Employee employee){

System.out.println("enter name");
person.setName(scanner.nextLine());

System.out.println("enter age");
person.setAge(scanner.nextInt());

System.out.println("enter address");
person.setAddress(scanner.nextLine());

System.out.println("enter gender");
person.setGender(scanner.nextLine());

System.out.println("enter emailAddress");
person.setEmailAddress(scanner.nextLine());

System.out.println("enter position");
employee.setPosition(scanner.nextLine());

System.out.println("enter staffNumber");
employee.setStaffNumber(scanner.nextInt());

System.out.println("enter phoneNumber");
person.setPhoneNumber(scanner.nextLong());
}


public void displayEmployeeRegistration(Person person,Employee employee){

for(int k=0; k<companies.length; k++){

System.out.println("name"+ companies[k].setName());
System.out.println("age"+  companies[k].setAge());
System.out.println("address"+ companies[k].getAddress());
System.out.println("gender"+ companies[k].getGender());
System.out.println("emailAddress"+ companies[k].getEmailAddress());
System.out.println("position"+ companies[k].getPosition());
System.out.println("staffNumber"+ companies[k].getStaffNumber());
System.out.println("phoneNumber"+ companies[k].getPhoneNumber());

}
}

}





