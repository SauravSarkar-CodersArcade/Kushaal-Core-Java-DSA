package basics.arrays;
public class Example3 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(a.length);
        int[][] matrix = {{1,2,3,4,5}
                         ,{6,7,8,9,0},
                          {9,8,7,6,5}}; // Array of arrays
        System.out.println(matrix.length);
        for (int r=0; r< matrix.length; r++){
            for (int c=0; c<matrix[r].length; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
            // r=0 c0 1 2 3 4
            // r=1 c0 1 2 3 4
            // r02 c0 1 2 3 4
        }
        int[][] jagged = {{1,2,3,4,5,6,7,8,9,10}, // 0
                          {6,7,8,9,10}, // 1
                          {9,8,7,6}}; // 2

        for (int r=0; r<jagged.length; r++){
            for (int c=0; c<jagged[r].length; c++){
                System.out.print(jagged[r][c] + " ");
            }
            System.out.println();
        }
        // For each loop
        for (int[] nums : jagged){
            for (int x : nums){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
