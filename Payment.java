package za.co.makro.sales.payment;

import java.util.Scanner;
import za.co.makro.people.employee.Employee;
import za.co.makro.people.person.Person;
import za.co.makro.stock.inventory.Inventory;
import za.co.makro.stock.product.Product;

public class Payment{

private String paymentType;


private String CustomerName;
private double tenderCash;
private String agentName;
private double totalBalance;
private double amount;
private double balance;
private double subTotal;
private double grandTotal;
private int items;
private double totalPayment;
public static final int VAT = 15;
private String[] itemsName = new String[5];
private double[] itemsPrice = new double[5]; 
private int[] itemsQuantities = new int[5];
int input = 0;

 Scanner scanner=new Scanner(System.in);

public void setItemsName(String[] itemsName){
this. itemsName = itemsName;
}
public String[] getItemsName(){
return itemsName;

}
public void setItemsPrice(double[] itemsPrice){
this.itemsPrice = itemsPrice;
}
public double[] getItemsPrice(){
return itemsPrice;
}

public void setItemsQuantities(int[] itemsQuantities){
this.itemsQuantities = itemsQuantities;
}
public int[] getItemsQuantities(){
return itemsQuantities;
}
public void setAmount(double amount){
this. amount = amount;
}
public double getAmount(){
return amount;
}
public void setSubTotal(double subTotal){
this.subTotal = subTotal;
}
public double getSubTotal(){
return subTotal;
}
public void setGrandTotal(double grandTotal){
this.grandTotal = grandTotal;
}
public double getGrandTotal(){
return grandTotal;
}

public void setBalance(double balance){
this.balance = balance;
}
public double getBalance(){
return balance;
}
public void setTotalPayment(double totalPayment){
this.totalPayment = totalPayment;
}
public double getTotalPayment(){
return totalPayment;
}

public void receipt(){
Scanner scanner=new Scanner(System.in);
System.out.println("MAKRO VORNA VALLEY");
System.out.println("crn henry gaulan and Albertine street");
System.out.println("Tel:0872880247");
System.out.println("Fax:0864971806");
System.out.println("vat registration: 45678952147");
System.out.println("Company reg no:1991/06002212");

System.out.println("........... TAX INVOICE ...........");

 int count =0;
for(int x =0; x< count; x++){
count++;
System.out.println(itemsName[x]+"------->" + itemsQuantities[x]+"-------->R"+itemsPrice[x]);
}
System.out.println("============================================");
System.out.println("Grand - Total: " + grandTotal);
System.out.println("Amount: R" + amount);
System.out.println("Balance: R"+ balance);
System.out.println("*******************************************");

System.out.println("Next customer please");
}

}
