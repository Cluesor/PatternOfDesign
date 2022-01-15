package BasicPrinciple.Lod_LKP.WithLod;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    public void getCourseNumber(){

        List<Course> courseList = new ArrayList<Course>();

        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }


        System.out.println("The Number of Course is : " + courseList.size());



    }
}
