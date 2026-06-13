package basics.arrays;
public class RubixCube {
    public static void main(String[] args) {
        String[][][] rubixCube = new String[6][3][3];
        rubixCube[0] = new String[][] {{"W","W","w"},{"W","W","w"},{"W","W","w"}};
        rubixCube[1] = new String[][] {{"B","B","B"},{"B","B","B"},{"B","B","B"}};
        rubixCube[2] = new String[][] {{"Y","Y","Y"},{"Y","Y","Y"},{"Y","Y","Y"}};
        rubixCube[3] = new String[][] {{"O","O","O"},{"O","O","O"},{"O","O","O"}};
        rubixCube[4] = new String[][] {{"G","G","G"},{"G","G","G"},{"G","G","G"}};
        rubixCube[5] = new String[][] {{"R","R","R"},{"R","R","R"},{"R","R","R"}};

        for (int face = 0; face < rubixCube.length; face++){
            System.out.println("Face " + (face + 1) + ":");
            for (int row = 0; row < rubixCube[face].length; row++){
                for (int col = 0; col < rubixCube[face][row].length; col++){
                    System.out.print(rubixCube[face][row][col] + " ");
                }
                System.out.println(); // Each row
            }
            System.out.println(); // Each face
        }
    }
}
