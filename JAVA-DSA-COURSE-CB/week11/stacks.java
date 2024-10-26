package week11;
import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        //System.out.println(stacks.empty());
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);

        //System.out.println(stacks.peek());
        //System.out.println(stacks.pop());
        System.out.println(stacks.search(1));
    }
}
