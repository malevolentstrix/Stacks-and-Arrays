public class driver_stack {
    public static void main(String args[]) {
        stackint s = new stackint();

        s.push(10);
        s.push(30);
        s.push(50);
        s.push(40);
        System.out.println(s.pop() + " was popped from the stack");
        System.out.println("The topmost element of the stack is " + s.peek());
        if(s.isEmpty()==true) {
        System.out.println("The stack is empty "); } 
        else {
        System.out.println("The stack is not empty "); } 
        s.print(); 
        s.push(10);
        s.push(30);
        s.push(50);
        s.push(40);
        System.out.println("The largest in the stack is " + s.largest());
        s.push(100);
        s.push(300);
        s.push(450);
        s.push(250);
        s.revcontent();
    }
}
