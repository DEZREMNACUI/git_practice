package constructor;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小李";
        s1.score = 100;

        Student s2 = new Student("小黑", 59);
        System.out.println(s2.name);
        System.out.println(s2.score);
    }
}
