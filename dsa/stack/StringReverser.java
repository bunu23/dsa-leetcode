import java.util.Stack;

public class StringReverser {

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }

        for(int i=0;i<str.length();i++){
            chars[i]=stack.pop();
        }
        return new String(chars);

    }

    public static void main(String[] args){
        String original = "hello";
        System.out.println("Original String: "+original);
        String result=StringReverser.reverseString(original);
        System.out.println("Reversed String: "+result);

    }
}
