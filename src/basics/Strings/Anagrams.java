package basics.Strings;

import java.util.Arrays;

public class Anagrams {
    // listen silent night thing article recital
    // dirty room - dormitory
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        char[] a = s1.toCharArray(); // {s,i,l,e,n,t}
        char[] b = s2.toCharArray(); // {l,i,s,t,e,n}
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int result = (Arrays.equals(a,b)) ? 1 : 0;
        if(result == 1) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}
