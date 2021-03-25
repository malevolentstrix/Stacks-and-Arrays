public class driver_char_stack {
    public static void main(String args[]) {
        charstack s = new charstack();

        s.push('a');
        s.push('b');
        s.push('c');
        s.push('d');
        System.out.println(s.pop() + " was popped from the stack");
        System.out.println("The topmost element of the stack is " + s.peek());
        if (s.isEmpty() == true) {
            System.out.println("The stack is empty ");
        } else {
            System.out.println("The stack is not empty ");
        }
        s.print();
        s.push('e');
        s.push('f');
        s.push('g');
        s.push('h');
        s.revcontent();

    }
}