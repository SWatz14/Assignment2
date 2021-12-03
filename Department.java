import java.util.Vector;

public class Department {
    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.

    //Constructor
    public Department(String name, String id) {
        this.id=id;
        this.name=name;
        // also initialize the vectors

    }

    public void setName(String name) {
        this.name = name;
    }


    // 1.To add a given course to the department
    public void offerCourse(Course course){
        courseList.add(course);

    }

    // 2.This displays the list of all the courses offered by the department
    public void printCoursesOffered(){
        for(Course course:courseList);
        courseList.toString();
    }


    // 4.This displays the list of all the Students taking the courses in the department
    public void printStudentsByName(){
        for(Student student:registerList){
            registerList.toString();
        }
    }
    // 6. indicates whether or not a Student is registered in a given department
    public boolean isRegistered(Student student){
        return registerList.contains(student);
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students
        return  name + " " +id+ " " + String.valueOf(courseList.size())+ " "+ String.valueOf(registerList.size());
    }

}
