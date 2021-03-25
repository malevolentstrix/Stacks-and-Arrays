class array_lab_qn2 {
    static final int limit = 15;
    int end;
    int a[] = new int[limit];

    array_lab_qn2() {
        end = -1;
    }

    void Insert(int element) {
        end++;
        a[end] = element;
    }

    void Delete() {

        if (end == -1)
            System.out.println("There is no such element to delete");
        else
            end--;
    }

    void Checkfull() {
        if (a.length - 1 == end) {
            System.out.println("The array is full");
        } else {
            System.out.println("The Array is not full");
        }
    }

    void Checkempty() {
        if (end == -1) {
            System.out.println("The array is empty");
        } else {
            System.out.println("The Array is not empty");
        }
    }

    void Show() {
        for (int i = 0; i <= end; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}