public class StackPalindromeCheck {
    public static void main(String [] args) {
    String str = "vnav";
        System.out.println(isPalindrome(str));
}
    public static boolean isPalindrome(String str){

        if(str.isEmpty()){
            return true;
        }

        Stack test = new Stack();
        int length = str.length();

        int left = 0;
        int midpoint = length / 2;

        while(left < midpoint){
            test.push(str.charAt(left));
            left++;
        }

        int right = (length / 2 == 0) ? midpoint : midpoint + 1;

        while(right < length){
            if(test.isEmpty() || test.pop() != str.charAt(right)){
                return false;
            }
            right++;
        }
        return test.isEmpty();
    }
}