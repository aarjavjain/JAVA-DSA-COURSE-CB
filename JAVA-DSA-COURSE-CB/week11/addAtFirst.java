package week11;
import java.util.Stack;
public class addAtFirst {
    static void insert(Stack<Integer> stk, int n){
        if (stk.isEmpty()){
            stk.push(n);
            return;
        }
        int x stk.pop();
        insert(stk,n);
        stk.push(x);
    }
    static void addFirst(Stack<Integer> stk , int n){
        Stack<Integer> stk2 = new Stack();
        while(!stk.isEmpty())
        stk2.push(stk.pop());
    }
    stk.push(n);
    while(!stk2.isEmpty()){
        stk.push(stk2.pop());
    }
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
