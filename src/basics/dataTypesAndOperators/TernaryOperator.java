package basics.dataTypesAndOperators;
public class TernaryOperator {
    public static void main(String[] args) {
        String s1 = (2 < 3) ? "true" : "false";
        int i1 = (2 < 3) ? 1 : 0;
        boolean b1 = (2 > 3) ? true : false;
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(b1);
        // data_type var_name = (condition) ? tv : fv;

    }
}
