package BasicPrinciple.SRP.WithSRP;

public class TestSRP {
    public static void main(String[] args) {
        LiveCourse liveCourse = new LiveCourse();
        ReplyCourse replyCourse = new ReplyCourse();
        liveCourse.learn("LiveCourse");
        replyCourse.learn("ReplyCourse");
    }
}
