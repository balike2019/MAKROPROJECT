package za.co.makro.test.application;

import za.co.makro.people.employee.Employee;
import za.co.makro.stock.company.Company;
import za.co.makro.stock.supply.Supply;
import za.co.makro.people.customer.Customer;
import za.co.makro.stock.inventory.Inventory;
import za.co.makro.stock.product.Product;
import za.co.makro.people.person.Person;
import za.co.makro.sales.payment.Payment;
 import java.util.Scanner;

public class Application{
Scanner scanner=new Scanner(System.in);
public static void main(String[]args){

Scanner scanner=new Scanner(System.in);
Employee employee = new Employee();
Product product=new Product();
Supply supply=new Supply();
Company company = new Company();
Inventory inventory=new Inventory();
Person person=new Person();
Customer customer=new Customer();
Payment payment= new Payment();

System.out.println(".WELCOME TO..MAKRO  SERVICE VORNA VALLEY.....");
System.out.println("...EXPRESS VORNA VALLEY SERVICES...");
for(; ;){
System.out.println("press 1  for HR , press 2 CustomerRegistration,press 3 MANAGER,press 4 for Cashier,Press 5 to exit");
int choice= scanner.nextInt();

if(choice==1){
System.out.println("HR");
employee.login(scanner);
company.employeeRegistration(scanner,person,employee);
}else if(choice==2){

employee.login(scanner);
System.out.println("MANAGER");

employee.customerRegistration(scanner);

employee.displayCustomerRegistration();
}else if(choice==3){

System.out.println("MANAGER");  
supply.supplyProduct(product,inventory);
supply.displaySuppliedProduct(inventory);
}else if(choice==4){

 System.out.println("press 1. to add product to cart");
System.out.println("press 2.to void product");
System.out.println("press 3.proceed to payment");
int button=scanner.nextInt();
switch(button){
case 1:
employee.sellProduct(payment,scanner);
break;
case 2:
employee.login(scanner);
employee.voidProduct(inventory,product,payment,scanner);
break;
case 3:
employee.payForProducts(payment,scanner);
break;
case 4:
payment.receipt();
break;
case 5:

}
}

}

}

}






