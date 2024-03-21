
/**
 *
 * @author tika
 */
public class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;
    
    public Student (String name, String address) {
        super (name, address);
        this.numCourses = 0;
        this.courses = new String[40];
        this.grades = new int[40];
    }
    
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }
    
    public void printGrades() {
        System.out.print("Grades :");
        for (int i = 0; i < numCourses; i++) {
            System.out.print(courses[i] + ":" + grades[i] + "");
            
        }
        System.out.println();
    }
    
    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0.0;
            
        }
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum/numCourses;
    }
    
    @Override
    public String toString() {
        return "Student: " + super.name + "(" + super.Address +")";
    }
    
    
}
