package za.co.makro.people.employee;
import za.co.makro.stock.supply.Supply;
import za.co.makro.people.person.Person;
import za.co.makro.stock.product.Product;
import za.co.makro.stock.inventory.Inventory;
import za.co.makro.sales.payment.Payment;
import za.co.makro.people.customer.Customer;
import za.co.makro.stock.company.Company;
import java.util.Scanner;

public class Employee extends Person{
private Employee[]employees;

private String username;
private String password;
private int staffNumber;
private String position;
private int cardNumber;
public String[] itemsName= new String[5];
public double[] itemsPrice= new double[5];
public int[] itemsQuantities= new int[5];
public int countItem=0;

public void setCardNumber(int cardNumber){
this.cardNumber=cardNumber;
}
public int getCardNumber(){
return cardNumber;
}

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
return password;
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

public void sellProduct(Payment payment,Product product,Inventory inventory,Supply supply,Scanner scanner){
System.out.println("select 1 to sellProduct, select 2 for grandTotal,3 to exit");
double price = 0.0;
int qty = 0;
for(int i=0; i<10;i++){
int select=scanner.nextInt();
if(select==1){
System.out.println("Enter productBarcode");
long productBarcode=scanner.nextLong();
for(int a = 0; a < inventory.products.length; a++){
if(productBarcode == inventory.products[a].getBarcode()){
System.out.println(inventory.products[a].getProductName());
System.out.println(inventory.products[a].getManudate());
System.out.println(inventory.products[a].getExpdate()); 
System.out.println(inventory.products[a].getPrice());
itemsName[i] =  inventory.products[a].getProductName();
price = inventory.products[a].getPrice();
itemsPrice[i] = inventory.products[a].getPrice();
++countItem;
}
}
System.out.println("Enter quantity");
product.setQuantity(scanner.nextInt());
itemsQuantities[i] = product.getQuantity();
payment.setSubTotal(product.getQuantity() * price);
System.out.println("SubTotal R"+ payment.getSubTotal());
}else if(select==2){
payment.setGrandTotal(payment.getGrandTotal() + payment.getSubTotal());
System.out.println("GrandTotal R"+ payment.getGrandTotal());
}else if(select==3){
i=100;
System.out.println("exit");
}
}
}


public void voidProduct(Inventory inventory,Product product,Payment payment, Scanner scanner){
System.out.println("Enter proBarcode");
long proBarcode=scanner.nextLong();

for(int b = 0; b< inventory.products.length; b++){

if(proBarcode == inventory.products[b].getBarcode()){
System.out.println(inventory.products[b].getProductName());
System.out.println(inventory.products[b].getManudate());
System.out.println(inventory.products[b].getExpdate());
System.out.println(inventory.products[b].getPrice());
itemsName[b]=""; 
itemsPrice[b]=0.0;
itemsQuantities[b]=0;

  System.out.println("Enter quantity");
  product.setQuantity(scanner.nextInt());

payment.setGrandTotal(payment.getGrandTotal()-product.getQuantity() * inventory.products[b].getPrice());
}
}
System.out.println("Total after void: " + payment.getGrandTotal());
}


public void payForProducts(Payment payment,Scanner scanner){
 System.out.println("Enter tender cash: R");
payment.setAmount(scanner.nextDouble());
payment.setBalance(payment.getAmount() - payment.getGrandTotal());
System.out.println("Balance: R" +  payment.getBalance());
}


public void customerRegistration(Company company,Customer customer,Scanner scanner){
System.out.println("enter number of customer you want to register");
int number=scanner.nextInt();
company.setCustomers(new Customer[number]);
int countCustomer=0;

for(int c=0;c<company.getCustomers().length;c++){
countCustomer++;
System.out.println("Customer#"+ countCustomer);

scanner.nextLine();
System.out.println("enter name");
customer.setName(scanner.nextLine());
scanner.nextLine();

System.out.println("enter age");
customer.setAge(scanner.nextInt());
scanner.nextInt();

System.out.println("enter address");
customer.setAddress(scanner.nextLine());
scanner.nextLine();

System.out.println("enter gender");
customer.setGender(scanner.nextLine());
scanner.nextLine();
scanner.nextLine();
System.out.println("enter emailAddress");
customer.setEmailAddress(scanner.nextLine());
scanner.nextLine();

System.out.println("enter phoneNumber");
customer.setPhoneNumber(scanner.nextLong());
scanner.nextLine();

System.out.println("enter cardNumber");
customer.setCardNumber(scanner.nextInt());

company.getCustomers()[c]=customer;
}
}

public void displayCustomerRegistration(Company company){

for(int j=0; j<company.getCustomers().length; j++){

System.out.println("name"+ company.getCustomers()[j].getName());
System.out.println("age"+ company.getCustomers()[j].getAge());
System.out.println("address"+ company.getCustomers()[j].getAddress());
System.out.println("gender"+ company.getCustomers()[j].getGender());
System.out.println("emailAddress"+ company.getCustomers()[j].getEmailAddress());
System.out.println("phoneNumber"+ company.getCustomers()[j].getPhoneNumber());
System.out.println("cardNumber"+  company.getCustomers()[j].getCardNumber());

}

}
}

