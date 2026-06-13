package basics.Strings;
public class BaseExample {
    public static void main(String[] args) {
        char[] letters = {'K','u','s','h','a','a','l'};
        String name = String.valueOf(letters);  // "Kushaal";
        String student = new String(letters);
//        for (int i=0; i<letters.length; i++){
//            name += letters[i]; // new String object [Heap]
//        }
        System.out.println(name + " " + student); // [C@e9e54c2
        String jumbled = "Kushaal#is#feeling#hot#bcoz#he#ate#biryani";
        // {"Kushaal", "is", "feeling", "hot", "bcoz", "he", "ate", "biryani"};
        //     0         1      2         3       4      5     6         7
        String[] words = jumbled.split("#");
        System.out.println(words[7]);
        String sillyName = "           Vin Diesel              ";
        System.out.println(sillyName.trim());

        for (int i=0; i<words.length; i++){
            System.out.print(words[i] + " ");
        }
        System.out.println();
        for (String word : words){
            System.out.print(word + " ");
        }
    }
}
