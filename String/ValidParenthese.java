package String;
import java.util.Stack;

//Given a string s containing just the characters 
// '(', ')', '{', '}', '[' and ']', 
// determine if the input string is valid.


//Input: s = "()"
//Output: true

public class ValidParenthese {
    
    public static void main(String[] args) {
        
        String str ="(){}[]";
        
        boolean res = isValid(str);
        System.out.println(res);
    }

    // Time complexity - 0(N) and space complexity- 0(N)
    private static boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        int len =s.length();

        for (int i = 0; i < len; i++) {
            
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else if(s.charAt(i)=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            else if(s.charAt(i)==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else{
                return false;

            }
        }
        return stack.isEmpty();

    }
}
