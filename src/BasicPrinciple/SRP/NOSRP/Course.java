package BasicPrinciple.SRP.NOSRP;

public class Course {
    public void learn(String courseName){
        if ("LiveCourse".equals(courseName)){
            System.out.println("No reply");
        }else {
            System.out.println("Reply Casually");
        }
    }
}
