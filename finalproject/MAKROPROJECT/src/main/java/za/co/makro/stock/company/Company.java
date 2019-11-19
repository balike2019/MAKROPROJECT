package za.co.makro.stock.company;

import za.co.makro.people.employee.Employee;
import za.co.makro.people.customer.Customer;
//import za.co.makro.sales.payment.Payment;
//import za.co.makro.stock.product.Product;
//import za.co.makro.sales.cart.Cart;
import java.util.Scanner; 

public class Company{
int countEmployee=0;
private static Customer[]customers;

public void setCustomers(Customer[] customers){
this.customers=customers;
}
public Customer[] getCustomers(){
return customers;
}

public static  Employee [] employees;

Scanner scanner=new Scanner(System.in);


public void employeeRegistration(Scanner scanner){

System.out.println("enter number of employee you want to add");
int number=scanner.nextInt();
employees = new Employee[number];
countEmployee=0;
for(int h=0;h<employees.length;h++){
Employee employee = new Employee();
System.out.println("employee#"+ ++countEmployee);

scanner.nextLine();
System.out.println("enter name");
employee.setName(scanner.nextLine());
scanner.nextLine();

System.out.println("enter age");
employee.setAge(scanner.nextInt());

scanner.nextLine();
System.out.println("enter address");
employee.setAddress(scanner.nextLine());
scanner.nextLine();
System.out.println("enter gender");
employee.setGender(scanner.nextLine());

System.out.println("enter emailAddress");
employee.setEmailAddress(scanner.nextLine());

System.out.println("enter position");
employee.setPosition(scanner.nextLine());

System.out.println("enter staffNumber");
employee.setStaffNumber(scanner.nextInt());

System.out.println("enter phoneNumber");
employee.setPhoneNumber(scanner.nextLong());

scanner.nextLine();
System.out.println("enter username");
employee.setUsername(scanner.nextLine());

System.out.println("enter password");
employee.setPassword(scanner.nextLine());

employees[h]=employee;
}
}

public void displayEmployeeRegistration(Employee employee){

for(int k=0; k<employees.length; k++){

System.out.println("name:"+ employees[k].getName());
System.out.println("age:"+  employees[k].getAge());
System.out.println("address:"+ employees[k].getAddress());
System.out.println("gender:"+ employees[k].getGender());
System.out.println("emailAddress:"+ employees[k].getEmailAddress());
System.out.println("position:"+ employees[k].getPosition());
System.out.println("staffNumber:"+ employees[k].getStaffNumber());
System.out.println("phoneNumber:"+ employees[k].getPhoneNumber());
System.out.println("username:"+ employees[k].getUsername());
System.out.println("password:"+ employees[k].getPassword());
}
}

}





