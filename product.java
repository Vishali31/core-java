class Product {
 private int productId;
 private String productName;
 private double productPrice;

Product(){
  ProductId = 100;
  ProductName = "ddd";
  ProductPrice = 150 ;
}
Product(int pId, string pname, double pprice){
  ProductId = pId;
  ProductName = pname;
  ProductPrice = pprice;
}
void displayProductDeatils(){
System.out.println("ProductId:"+ProductId);
System.out.println("Name:"+ProductName);
System.out.println("price:"+ProductPrice);
}
class ProductMain{
public static void main(String[] args){

Product product1 = new product();
product1.displayProductDetails();

Product product2 = new product(20,"Iphonex",50000);
product2.displayProductDetails();

Product product3 = new product(30,"Iphonex+",90000);
product3.displayProductDetails();
}
}
