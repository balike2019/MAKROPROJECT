# MAKROPROJECT


JAVA
DESIGN FOR MAKRO PROJECT

CLASSES INVOLUE
1 PERSON CLASS
 2 EMPLOYEES CLASS
 3 COMPANY CLASS
 4 INVENTORY CLASS
5 PRODUCTS CLASS
6 PAYMENT CLASS
7 CART CLASS
8 SUPPLY CLASS


CLASSIFICATION OF CLASSES

 UNDER PEOPLE
1 PERSON CLASS 
2 CUSTOMER CLASS
3 EMPLOYEES CLASS 
4 COMPANY CLASS

 UNDER STOCK
1 INVENTORY
2 PRODUCTS
3 SUPPLY

UNDER  SALES

1 PAYMENT CLASS
2 CART CLASS
 
TEST

1 APPLICATION CLASS

VARIABLES AND METHODS OF THE VARIOUS CLASSES

1 PERSON CLASS
name 
age
address
emailAddress
phoneNumber
gender

2 EMPLOYEES CLASS
staffNumber
position
password
userName
idnumber


METHODS

sellProducts
registerProducts(manager)
voidProducts(manager)
login

3 CUSTOMER ClASS

card

METHODS
selectProducts
buyProducts

RELATIONSHIP BETWEEN CLASS ABOVE
1 customer is a person
2 employee is a person

4 COMPANY CLASS

name
address
emailAddress
phoneNumber

METHODS
employeesregistration
login
printReceipt

RELATIONSHIP BETWEEN EMPLOYEES AND COMPANY

company has employees


5 INVENTORY CLASS
 has a relationship with supply

6 SUPPLY CLASS

supplier supply products
supplier is a company

7 PRODUCTS CLASS
name 
price
barcode
manifacture date
expired date

RELATIONSHIP
products has  relationship with inventory
supply has relationship with products


8 PAYMENT CLASS
date
time
totalPayment
balance
salesPerson
pointOfSalesNumber
customerName
cashTender
price
quantity
totalAmount
METHOD
typyOfPayment



9 CART CLASS
has relationship with products
has relationship with payment
 METHOD
addProductToCart
 

