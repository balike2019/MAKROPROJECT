package za.co.makro.stock.product;
import java.util.Scanner;

public class  Product{
private String productName;
private double price;
private long barcode;
private String manudate;
private String expdate;
private int quantity;

Scanner ss = new Scanner(System.in);

public void setProductName(String productName){

this.productName = productName;
}
public String getProductName(){

return productName;

}
public void setPrice(double price){

this.price = price;


}
public double getPrice(){

return price;


}
public void setBarcode(long barcode){
 
this.barcode = barcode;

}
public long getBarcode(){
 
return barcode;


}
public void setManudate(String manudate){

this.manudate = manudate;

}
public String getManudate(){

return manudate;


}

public void setExpdate(String expdate){


this.expdate = expdate;
}
public String getExpdate(){

return expdate;

}
public void setQuantity(int quantity){
this.quantity = quantity;

}
public int getQuantity(){
return quantity;

}
}
