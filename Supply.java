 package za.co.makro.stock.supply;

import za.co.makro.stock.product.Product;
import za.co.makro.stock.inventory.Inventory;
import java.util.Scanner;

public class Supply{
 
Scanner scanner= new Scanner(System.in);

public void supplyProduct(Product product,Inventory inventory){

System.out.println("Enter number of products to add");
int number = scanner.nextInt();

inventory.products = new Product[number];
//inventory.totalQuantities= new int[number];

for(int a = 0; a < number; a++){



System.out.println("enter productName");
product.setProductName(scanner.nextLine());

System.out.println("enter barcode");
product.setBarcode(scanner.nextLong());

System.out.println("enter manudate");
product.setManudate(scanner.nextLine());

System.out.println("enter expdate");
product.setExpdate(scanner.nextLine());

//System.out.println("enter price");
//product.setPrice(scanner.nextDouble());

System.out.println("enter quantity");
product.setQuantity(scanner.nextInt());

inventory.products[a]= product;
}//first loop
  

}

public void displaySuppliedProduct(Inventory inventory){

for(int i=0; i<inventory.products.length; i++){
 
System.out.println("productName"+ inventory.products[i].getProductName());
System.out.println("barcode"+  inventory.products[i].getBarcode());
System.out.println("manudate"+ inventory.products[i].getManudate());
System.out.println("expdate"+ inventory.products[i].getExpdate());
//System.out.println("price"+ inventory.products[i].getPrice());
System.out.println("quantity"+ inventory.products[i].getQuantity());
}
}

 
} 


