public class driver_array_lab_qn1 {
    public static void main(String args[]) {
        array_lab_qn1 s = new array_lab_qn1();

        s.Insert(100);
        s.Insert(500);
        s.Insert(900);
        s.Insert(609);
        s.Insert(294);
        s.Show();
        s.Delete(500);
        s.Show();
        s.Search(900);
        s.Sort();
        System.out.println("The Maximum value in the array is " + s.Maximum());
        System.out.println("The Minimum value in the array is " + s.Minimum());
    }
}