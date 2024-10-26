package week5;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder(10);
        sb.append("Hello");
        // sb.delete(2, 5);
        // sb.reverse();
        sb.replace(2, 5,"meow");
        // sb.append("Hey");
        // sb.ensureCapacity(100);
        // sb.append("Bye");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
