class array_lab_qn1 {
    static final int limit = 1000;
    int end;
    int a[] = new int[limit];

    array_lab_qn1() {
        end = -1;
    }

    void Insert(int element) {
        end++;
        a[end] = element;
    }

    void Delete(int element) {
        int flag = 0;
        for (int i = 0; i <= end; i++) {
            if (a[i] == element) {
                flag++;
                while (i != (end)) {
                    a[i] = a[i + 1];
                    i++;
                }
            }

        }
        end--;
        if (flag == 0)
            System.out.println("There is no such element to delete");
        System.out.println(element + " was deleted " + flag + " times from the array");
    }

    void Search(int element) {
        int i = 0;
        int flag = 0;
        while (i != end) {
            if (a[i] == element) {
                flag++;
                System.out.println(element + " was found in postion " + i + " of the array ");
            }
            i++;
        }
        if (flag == 0) {
            System.out.println("There is no such element in the array");
        }
    }

    void Sort() {
        for (int i = 0; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                int tmp = 0;
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.println(a[i]);
        }
    }

    int Maximum() {
        int large = a[0], i = 0;
        while (i <= end) {
            if (large < a[i]) {
                large = a[i];
            }
            i++;
        }
        return large;
    }

    int Minimum() {
        int small = a[0], i = 0;
        while (i <= end) {
            if (small > a[i]) {
                small = a[i];
            }
            i++;
        }
        return small;
    }

    void Show() {
        for (int i = 0; i <= end; i++) {
            System.out.println(a[i] + " ");
        }
    }

}