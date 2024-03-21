
/**
 *
 * @author Tika
 */
public class Teacher extends Person{
    private int numCourses;
    private String[] courses;
    
    public Teacher (String name, String address) {
        super (name, address);
        this.numCourses = 0;
        this.courses = new String[40];
    }
    
    public boolean addCourse(String course) {
        for (int i = 0; i< numCourses; i++) {
            if(courses[i].equals(course)) {
                return false;
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }
    public boolean removeCourse(String course) {
        for(int i = 0; i < numCourses; i++ ) {
            if (courses[i].equals(course)){
                for(int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[i + 1];
                }
                
                numCourses--;
                return true;
                
            }
        }
        return false;
        
    }
    
    @Override
    public String toString() {
        return "Teacher :" + super.name + "(" + super.Address + ")";
    }
    
    
}
