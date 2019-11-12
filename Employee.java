package za.co.makro.people.employee;

import za.co.makro.people.person.Person;
import za.co.makro.stock.product.Product;
import za.co.makro.stock.inventory.Inventory;
import za.co.makro.sales.payment.Payment;

import java.util.Scanner;

public class Employee extends Person{

private Employee[]employees;

private String username;
private String password;
private int staffNumber;
private String position;

public void setEmployee(Employee[] employees){
this.employees=employees;
}
public Employee[] getEmployees(){
return employees;
}

public void setUsername(String username){
this. username = username;
}
public String getUsername(){
return this.username;
}

public void setPassword(String password){
this. password = password;
}
public String getPassword(){
return this. password;
}
public void setStaffNumber(int staffNumber){
this. staffNumber = staffNumber;
}
public int getStaffNumber(){
return this. staffNumber;
}
public void setPosition(String position){
this. position = position;
}
public String getPosition(){
return this.position;
}

public void login(Scanner scanner){

System.out.println("enter username");
username = scanner.nextLine();

System.out.println("enter password");
password=scanner.nextLine();

if(username.equals(username) && password.equals(password)){
System.out.println("SUCCESSFUL");
}else{ 
System.out.println("FAIL");
}

}
public void sellProduct(Payment payment,Product product, Inventory inventory,Scanner scanner){
System.out.println("Enter productBarcode");
long productBarcode=scanner.nextLong();
for(int i=0; i<10;i++){
for(int a = 0; a < inventory.products.length; a++){
int count=0;
if(productBarcode == inventory.products[a].getBarcode()){
//int count=0;
System.out.println(inventory.products[a].getProductName());
System.out.println(inventory.products[a].getManudate());
System.out.println(inventory.products[a].getExpdate()); 
System.out.println(inventory.products[a].getPrice());
payment.getItemsName()[i] = inventory.products[a].getProductName();
payment.getItemsPrice()[i] = inventory.products[a].getPrice();
//getPrice[i] = inventory.products[a].getPrice();

System.out.println("Enter quantity");
product.setQuantity(scanner.nextInt());
payment.getItemsQuantities()[a] = product.getQuantity();
}
}

//System.out.println(payment.setSubTotal()(product.getQuantity() * product.getPrice()));

//payment.setGrandTotal(payment.setGrandTotal + payment.getSubTotal());

//count++;
}

}


public void voidProduct(Inventory inventory, Product product, Payment payment, Scanner scanner){

   System.out.println("Enter proBarcode");
long proBarcode=scanner.nextLong();

for(int b = 0; b< inventory.products.length; b++){

if(proBarcode == inventory.products[b].getBarcode()){

System.out.println(inventory.products[b].getProductName());
System.out.println(inventory.products[b].getManudate());
System.out.println(inventory.products[b].getExpdate());
System.out.println(inventory.products[b].getPrice());
payment.getItemsName()[b]=""; 
payment.getItemsPrice()[b]=0.0;
payment.getItemsQuantities()[b]=0;
  System.out.println("Enter quantity");
  product.setQuantity(scanner.nextInt());
payment.setGrandTotal(payment.getGrandTotal()-product.getQuantity() * inventory.products[b].getPrice());

	//inventory.products=products; 
}
}
System.out.println("Total after void: " + payment.getGrandTotal());
}

public void payForProducts(Payment payment,Scanner scanner){

 System.out.println("Enter tender cash: R");
payment.setAmount(scanner.nextDouble());

 //payment.setBalance(payment.getAmount() - payment.getGrandTotal());

//System.out.println("Balance: R" +  payment.getBalance());
 }


public void customerRegistration(Scanner scanner){

System.out.println("enter name");
setName(scanner.nextLine());

System.out.println("enter age");
setAge(scanner.nextInt());

System.out.println("enter address");
setAddress(scanner.nextLine());

System.out.println("enter gender");
setGender(scanner.nextLine());

System.out.println("enter emailAddress");
setEmailAddress(scanner.nextLine());

System.out.println("enter phoneNumber");
setPhoneNumber(scanner.nextLong());
}

public void sellProduct(Payment payment,Scanner scanner){
  System.out.println("Enter tender cash: R");
  payment.setAmount(scanner.nextDouble());

 //payment.setBalance(payment.getAmount() - payment.getGrandTotal());

 //System.out.println("Balance: R" +  payment.getBalance());

 }


public void displayCustomerRegistration(){

for(int j=0; j<getEmployees().length; j++){

System.out.println("name"+ getEmployees()[j].getName());
System.out.println("age"+ getEmployees()[j].getAge());
System.out.println("address"+ getEmployees()[j].getAddress());
System.out.println("gender"+ getEmployees()[j].getGender());
System.out.println("emailAddress"+ getEmployees()[j].getEmailAddress());
System.out.println("phoneNumber"+ getEmployees()[j].getPhoneNumber());


}

}
}
