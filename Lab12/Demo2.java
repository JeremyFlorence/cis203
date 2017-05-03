import java.util.*;

public class Demo2 {

    public static void main (String [] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.print("\"" + word + "\" is");
        if (!isPalindrome(word))
	    System.out.print(" NOT");
        System.out.println(" a palindrome.");        
    }

    // write your method here
    public static boolean isPalindrome(String word) {
	Stack<Character> chars1 = new Stack<Character>();
	for(int i = 0; i < word.length(); i++) {
	    if(!(Character.isLetter(word.charAt(i)))) {
		continue;
	    }
	    chars1.push(Character.toLowerCase(word.charAt(i)));
	}
	Stack<Character> chars2 = new Stack<Character>();
	int stkSize = chars1.size();
	for(int i = 0; i < stkSize/2; i++) {
	    chars2.push(chars1.pop());
	}
	if(chars1.size() > chars2.size()) {
	    chars1.pop();
	}
	while(!chars1.isEmpty()) {
	    if(chars1.pop() != chars2.pop()) {
		return false;
	    }
	}
	return true;
    }
}
