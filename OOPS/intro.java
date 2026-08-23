public class Intro {
    public static void main(String[] args) {
        Student Tushar = new Student();
        Tushar.rollNo[0] = 150;
        System.out.println(Tushar.rollNo[1]);
    }
}
class Student{
    int[] rollNo = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];
}