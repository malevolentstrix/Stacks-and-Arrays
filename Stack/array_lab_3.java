class array_lab3 {
    static final int limit = 15;
    int end;
    int front;
    char a[] = new char[limit];

    array_lab3() {
        end = -1;
        front = -1;
    }

    void Insert(char element) {
        end++;
        a[end] = element;
    }

    void Delete() {
        front = front + 1;
        System.out.println("Helli");
    }

    void Checkfull() {
        if (a.length - 1 == end) {
            System.out.println("The array is full");
        } else {
            System.out.println("Not full");
        }
    }

    void Checkempty() {
        if (end == front) {
            System.out.println("The array is empty");
        } else {
            System.out.println("Not empty");
        }
    }

    void Show() {
        System.out.println(front);
        for (int i = front; i <= end; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}