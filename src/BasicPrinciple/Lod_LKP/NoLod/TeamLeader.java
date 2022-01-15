package BasicPrinciple.Lod_LKP.NoLod;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader  {
    public void commandAndGetCourseNumber(Employee employee){
        List<Course> courseList = new ArrayList<Course>();

        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }

        employee.getCourseNumber(courseList);
    }

}
