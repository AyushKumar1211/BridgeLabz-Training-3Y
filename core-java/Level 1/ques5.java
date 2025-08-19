public class ques5 {
    public static void main(String[] args) {
        int pens =14;
        int students =3;
        int equal_parts = pens/students;
        int remaining = students%pens;
        System.out.println("The Pen Per Student is "+equal_parts+" and the remaining pen not distributed is "+remaining);
    }
}
