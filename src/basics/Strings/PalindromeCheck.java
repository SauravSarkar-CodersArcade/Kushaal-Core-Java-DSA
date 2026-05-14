package basics.Strings;
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "malayalam";
        boolean isPalindrome = true;
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
    // Reverse a string
    // Anagram - use logic
    // Count vowels in a string
}
