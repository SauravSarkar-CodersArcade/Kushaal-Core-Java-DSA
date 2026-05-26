package oops.nestedClasses;
public interface Payment {
    void pay();
}
class A{

}
class PaymentDemo {
    public static void main(String[] args) {
        A a = new A();
        // Boring Code : Boilerplate Code
        Payment p = new Payment() {
             public void pay(){
                 System.out.println("Payment done using Credit Card 💳.");
             }
        };
        p.pay();
        // SCALA - JAVA 8 Lambda Expression ->
        Payment p1 = () -> System.out.println("Payment done using SCALA CARD 💳.");
        p1.pay();
    }
}
