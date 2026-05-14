package basics.Strings;

public class CharacterFrequency {
    public static void main(String[] args) {
        System.out.println('A' - 'a');
        System.out.println((int)'a');
        System.out.println((int)'A');
        for(int i=65; i <= 97; i++){
            System.out.print((char)i + ", ");
        }
        String str = "kushaal"; // a-z
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }
        System.out.println();
        for (int i=0; i<25; i++){
            if(freq[i] > 0){
                System.out.println((char)(i+'a') +
                        " -> " + freq[i]);
            }
        }
        System.out.println((char)(0 + 'a'));
        System.out.println((char)(1 + 'a'));
        System.out.println((char)(2 + 'a'));
        System.out.println((char)(3 + 'a'));

    }
}
