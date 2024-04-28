class Book {

 private int bookId;
 private string bookname;
 private double price;
 private Author author;
 
   Book(int bookId,string bookname,double price,Author author){
    this.bookId = bookId;
    this.bookname = bookname;
    this.price = price;
    this.author = author;
}
  void display(){
   System.out.println("BookId:"+bookId);
   System.out.println("Name:"+bookname);
   System.out.println("price:"+price);
   System.out.println("Author Deatils:");
    author.displayAuthor();
}
}