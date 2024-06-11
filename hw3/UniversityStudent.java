//WU Xiaotao 21097724D
//hw3 BlueJ
import java.util.Arrays;
import java.util.stream.Collectors;
public class UniversityStudent
{
    private String studentName;
    private int courseNumber;
    private Course[] courseList;
    
    public UniversityStudent(String inStudentName, int inCourseNumber, Course[] inCourseList){ 
    studentName = inStudentName;
    courseNumber = inCourseNumber;
    courseList = inCourseList;
    }
    
    public void print(){
    
    System.out.println("Student Name: "+ studentName);
    //System.out.println(Arrays.toString(courseList));
    //The result will be:
    //Student Name: John
    //[EIE3320,60, EIE3105,40, null, null, null, null, null, null, null, null]
    //Student Name: Mary
    //[COMP1001,84, EIE3105,68, EIE3320,52, null, null, null, null, null, null, null]

    StringBuilder withoutNull = new StringBuilder();
        for (Course course : courseList) {
            if (course != null) {
                withoutNull.append(course.toString()).append("\n");
            }
        }
        System.out.println(withoutNull.toString());
    }
}
