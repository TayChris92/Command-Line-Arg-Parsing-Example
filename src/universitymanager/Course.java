package universitymanager;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseId;
    private String courseName;

    private List<Student> registeredStudents = new ArrayList<Student>();

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public void registerStudentToCourse(Student student) {
        registeredStudents.add(student);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void listAllRegisteredStudents() {
        registeredStudents.forEach(student -> {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        });
        System.out.print("\n");
    }

}
