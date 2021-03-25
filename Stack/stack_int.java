class stackint {
    static final int limit = 1000;
    int top;
    int top_rev;
    int a[] = new int[limit];

    stackint() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (limit - 1)) {
            System.out.println("Stack is Overflowed");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack is currently on Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack is currently on Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    boolean isEmpty() {
        return (top < 0);
    }

    void print() {
        System.out.println("Stack elements are");
        while (!isEmpty()) {
            System.out.println(pop());
        }
    }

    int largest() {
        int large = peek();
        while (!isEmpty()) {
            if (large < peek()) {
                large = peek();
            }
            pop();
        }
        return large;
    }

    void revcontent() {
        stackint t = new stackint();
        while (!isEmpty()) {
            t.push(this.pop());
        }
        System.out.println("Reversed stack elements are : ");
        t.print();
    }

}