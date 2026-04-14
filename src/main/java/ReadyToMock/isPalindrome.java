package ReadyToMock;

public class isPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "madam";
        System.out.println(isPalindrome(test) ? "палиндром" : "нет");
    }
}
