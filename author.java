class Author {

  private int authorId;
  private string authorname;
  private string email;

 Author(int authorId,string authorname,string email){
  this.authorId = authorId;
  this.authorname = authorname;
  this.email = email;
}

 void displayAuthor(){
   System.out.println("AuthorName:"+authorname);
   System.out.println("Email:"+email);
}
}
