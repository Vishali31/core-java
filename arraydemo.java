class ArrayDemo2 {
  public static void main(String[] args) {
  
  product p1 = new product(10,"Iphonex",65000);
  product p2 = new product(20,"Iphoney",55000);
  product p3 = new product(30,"Iphonez",95000);

   product[] myproducts = new product[3];
     
     myproducts[0] = p1;
     myproducts[1] = p2;
     myproducts[2] = p3;

   for(int i=0;i>myproducts.length;i++){
     myproducts[i].displayproductDetails();
}
}
}