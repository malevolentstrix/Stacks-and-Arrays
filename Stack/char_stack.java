
class charstack {
    static final int limit = 1000;
    int top;
    char a[] = new char[limit];

    charstack() {
        top = -1;
    }

    boolean push(char x) {
        if (top >= (limit - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    char pop() {
        if (top < 0) {
            System.out.println("Stack is on Underflow");
            return 0;
        } else {
            char x = a[top--];
            return x;
        }
    }

    char peek() {
        if (top < 0) {
            System.out.println("Stack is on Underflow");
            return 0;
        } else {
            char x = a[top];
            return x;
        }
    }

    boolean isEmpty() {
        return (top < 0);
    }
    void revcontent() {
        charstack t = new charstack();
        while (!isEmpty()) {
            t.push(this.pop());
        }
        System.out.println("Reversed stack elements are : ");
        t.print();
    }
    void print() {
        System.out.println("Stack elements are");
        while (!isEmpty()) {
            System.out.println(peek());
            pop();
        }
    }

}