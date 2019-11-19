package za.co.makro.sales.card;

//import za.co.makro.people.employee.Employee;
import za.co.makro.stock.company.Company;
import java.util.Scanner;

public class Card{

public void makroCard(Company company,Scanner scanner){
  
System.out.println("Enter cardNum");
int cardNum=scanner.nextInt();

for(int y = 0; y < company.getCustomers().length; y++){
if(cardNum == company.getCustomers()[y].getCardNumber()){

System.out.println(company.getCustomers()[y].getName());
System.out.println(company.getCustomers()[y].getAge());
System.out.println(company.getCustomers()[y].getAddress()); 
System.out.println(company.getCustomers()[y].getGender());
System.out.println(company.getCustomers()[y].getEmailAddress());
System.out.println(company.getCustomers()[y].getPhoneNumber());
System.out.println(company.getCustomers()[y].getCardNumber());
 
} 
}
}
}
