package za.co.makro.sales.payment;

import za.co.makro.stock.supply.Supply;
import za.co.makro.stock.company.Company;
import za.co.makro.people.employee.Employee;
import za.co.makro.people.person.Person;
import za.co.makro.stock.inventory.Inventory;
import za.co.makro.stock.product.Product;
//import za.co.makro.sales.cart.Cart;


public class Payment{

private String paymentType;
//private double salePrice=5;
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
private static final int VAT = 15;
//private String[] itemsName = new String[5];
//private double[] itemsPrice = new double[5]; 
//private int[] itemsQuantities = new int[5];
//int input = 0;

//public void setItemsName(String[] itemsName){
//this.itemsName = itemsName;
//}		 
//public String[] getItemsName(){
//return itemsName;

//}
//public void setItemsPrice(double[] itemsPrice){
//this.itemsPrice = itemsPrice;
//}
//public double[] getItemsPrice(){
//return itemsPrice;
//}

//public void setItemsQuantities(int[] itemsQuantities){
//this.itemsQuantities = itemsQuantities;
//}
//public int[] getItemsQuantities(){
//return itemsQuantities;
//}
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
public void receipt(Supply supply,Employee employee){

               System.out.println("MAKRO SHOPPING CENTER");
           System.out.println("=============================");

   System.out.println("Items-----------------QUANTITY----------------Price");
for(int x =0; x<employee.countItem; x++){
System.out.println(employee.itemsName[x]+"----->"+employee.itemsQuantities[x]+"----->R"+employee.itemsPrice[x]);
}
System.out.println("******************************");
System.out.println("Grand-Total: " + getGrandTotal());
System.out.println("Amount: R" + getAmount());
System.out.println("Balance: R" + getBalance());
System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

System.out.println("Next customer, please!!!");

}
}
