package BasicPrinciple.DIP.WithDIP;

public class ForTest {

    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.learn(new JavaCourse());
        tom.learn(new PythonCourse());
    }

}
