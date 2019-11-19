package za.co.makro.test.application;

import za.co.makro.people.employee.Employee;
import za.co.makro.stock.company.Company;
import za.co.makro.stock.product.Product;
import za.co.makro.stock.supply.Supply;
import za.co.makro.people.customer.Customer;
import za.co.makro.stock.inventory.Inventory;
import za.co.makro.sales.payment.Payment;
import za.co.makro.sales.card.Card;
 import java.util.Scanner;

public class Application{
public static void main(String[]args){

Scanner scanner=new Scanner(System.in);
Employee employee = new Employee();
Product product=new Product();
Supply supply=new Supply();
Company company = new Company();
Inventory inventory=new Inventory();
Customer customer=new Customer();
Payment payment= new Payment();
Card card=new Card();


String maNusername = null; 
String maNpassword;
int g=0;
System.out.println("......WELCOME TO..MAKRO  SERVICE VORNA VALLEY.....");
System.out.println(".........EXPRESS VORNA VALLEY SERVICES...");
GEN:for(; ;){
System.out.println("press 1  for HR , press 2 to login, Press 4 to exit");
int choice= scanner.nextInt(); 
if(choice==1){

  System.out.println("HR");
  company.employeeRegistration(scanner);
  company.displayEmployeeRegistration(employee);

}else if(choice==2){ 
  System.out.println("*******login******");
  System.out.println("enter maNusername");
  maNusername=scanner.nextLine();
  scanner.nextLine();
  System.out.println("enter maNpassword");
  maNpassword=scanner.nextLine();
for(g=0; g<company.employees.length; g++){
    if(company.employees[g].getUsername().equals(maNusername) && company.employees[g].getPassword().equals(maNpassword)
     && company.employees[g].getPosition().equalsIgnoreCase("MANAGER")){
    System.out.println("=====SUCCESSFUL=====");
MAN:for(int n=0; n<6; n++){
 System.out.println("take 1 to supply, take 2 to register Customer, take 3 to void Product, take 4 to log out");
 System.out.println("press 5 to shutdown");
 int take=scanner.nextInt();
if(take==1){
  supply.supplyProduct(inventory);
  supply.displaySuppliedProduct(inventory);
}else if(take==2){

  employee.customerRegistration(company,customer,scanner);
  employee.displayCustomerRegistration(company);
}else if(take==3){

  employee.voidProduct(inventory,product,payment,scanner);
}else if(take==4){
break MAN;
}//if statement
}//n loop

}else if(company.employees[g].getUsername().equals(maNusername) && company.employees[g].getPassword().equals(maNpassword)
    && company.employees[g].getPosition().equalsIgnoreCase("CASHIER")){
for(int d=0; d<10; d++){
System.out.println("=======CASHIER=====");
 System.out.println("press 1. to add product to cart");
System.out.println("press 2.proceed to payment");
System.out.println("press 3.for receipt");
System.out.println("press 4.to to log out");
System.out.println("press 5 to shutdown");
int button=scanner.nextInt();
if(button== 1){
System.out.println("ASK CUSTOMER-------->DO YOU HAVE A MAKROCARD?");
card.makroCard(company,scanner);
System.out.println("--------SUCCESS-----------");
employee.sellProduct(payment,product,inventory,supply,scanner);

}else if(button==2){ 
employee.payForProducts(payment,scanner);
}else if(button==3){

payment.receipt(supply,employee);
}else if(button==4){

g=200;   
d = 100;

}//d loop end
}//cashier if statement
}//g loop
}//loop

}else if(choice==4){
       System.out.println("***********GOOD BYE HOPE TO SEE YOU AGAIN********");
     break GEN;
}
}//main loop
}///main
}//class



