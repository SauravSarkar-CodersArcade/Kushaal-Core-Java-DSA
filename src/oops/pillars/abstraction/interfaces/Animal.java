package oops.pillars.abstraction.interfaces;
public interface Animal {
    void run();
    void eat();
}
class Rat implements Animal{
    @Override
    public void run() {
        System.out.println("Rats run very fast. ⚡");
    }
    @Override
    public void eat() {
        System.out.println("Rats love to eat cheese. 🧀");
    }
}
class Sloth implements Animal{
    @Override
    public void run() {
        System.out.println("Sloths run very very slow. 🦥");
    }
    @Override
    public void eat() {
        System.out.println("Rats love to eat spinach. 🌱");
    }
}
class Main{
    public static void main(String[] args) {
        new Rat().run();
        new Rat().eat();
        new Sloth().run();
        new Sloth().eat();
    }
}
