import java.util.Vector;

public class Student extends Person {
    private String id;
    private String name;
    private Vector courses; // contains all courses the student is registered in


    public Student(String stdName, String stdId) {
        courses=new Vector<>();

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vector getCourses() {
        return courses;
    }

    public void setCourses(Vector courses) {
        this.courses = courses;
    }


    // 3.Registers a student in a given course and department
    public void registerFor(Course course){
        if(!courses.contains(course)){
            courses.add(course);

        }

    }
    // 5.Indicates whether or not a student is registered for a course
    public boolean isRegisteredInCourse(Course course){
        return courses.contains(course);
    }


    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

        return name+" " +id;
    }
}
