//WU Xiaotao 21097724D
//hw3 BlueJ
public class Course
{
    String courseName;
    int testMarks;
    
    public Course(String inCourseName, int inTestMarks){
    courseName = inCourseName ;
    testMarks = inTestMarks;    
    
    }
    
    public String toString(){
        return courseName+ ", " +testMarks ;
    }
}
