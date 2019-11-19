
package za.co.makro.people.person;

public abstract class Person{

private String name;
private int age;
private String address;
private String gender;
private String emailAddress;
private long phoneNumber;

public void setName(String name){
this.name=name;
}

public String getName(){
return name;
}

public void setAge(int age){
this.age=age;
}
public int getAge(){
return this.age;
}
public void setAddress(String address){
this.address = address;
}

public String getAddress(){
return address;
}

public void setGender(String gender){
this.gender = gender;
}
public String getGender(){
return gender;
}
public void setEmailAddress(String emailAddress){
this.emailAddress = emailAddress;
}
public String getEmailAddress(){
return this.emailAddress;
}

public void setPhoneNumber(long phoneNumber){
this.phoneNumber = phoneNumber;
}

public long getPhoneNumber(){
return this.phoneNumber;
}




}















































