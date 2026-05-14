package basics.arrays;
public class Example4 {
    public static void main(String[] args) {
        char[][] letters = {{'S','u','n','i','l'},
                            {'R','a','m'},
                            {'S','a','m'},
                            {'V','i','r'}};

        for(char[] chars : letters){
            for (char c : chars){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
