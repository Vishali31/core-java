class BasicPhone {
 
  void makecall() {
    System.out.println("make calls....");
}
void receivecall() {
    System.out.println("receive calls....");
}
void sendTextMsg() {
    System.out.println("Send text msg....");
}
void receiveTextMsg() {
    System.out.println("receive Text Msg ....");
}
}
class SmartPhone extends BasicPhone {
  void browseInternet() {
   System.out.println("browsing internet.....");
}
   void usecamera() {
   System.out.println("use camera.....");
}
}
class InheritanceDemo {

 public static void main(String[] args) {
 
Smartphone sphone = new SmartPhone();
 sphone.makcall();
 sphone.receivecall();
 sphone.sendTextMsg();
 sphone.receiveTextMsg();
 sphone.browseInternet();
 sphone.useCamera();
}
}
