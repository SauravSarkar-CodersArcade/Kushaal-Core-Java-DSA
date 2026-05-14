package basics.dataTypesAndOperators;

class Pen {
    String name;
    String color;
}
public class Demo {
    public static void main(String[] args) {
        Pen[] pens = new Pen[3];
        pens[0] = new Pen();
        pens[0].name = "Writometer";
        pens[0].color = "Red";
        pens[1] = new Pen();
        pens[1].name = "Blue-gel";
        pens[1].color = "Blue";
        pens[2] = new Pen();
        pens[2].name = "Cello-Gripper";
        pens[2].color = "Green";

        for (Pen pen : pens){
            System.out.println(pen.name + ", " + pen.color);
        }

    }
}
