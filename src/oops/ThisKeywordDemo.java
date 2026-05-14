package oops;
public class ThisKeywordDemo {
    // Class Level variable // Instance Variable
    boolean i;
    void show(){

    }
    void change(boolean i){
        this.i = i; // Ambiguity => Fallback mechanism
    }
    void display(){
        System.out.println("The value of i is: " + i);
    }
    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo();
        obj.change(true);
        // obj.display();
    }
}
