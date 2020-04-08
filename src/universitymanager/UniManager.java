package universitymanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class UniManager {

    HashMap<String, Course> coursesMap = new HashMap<String, Course>();
    List<Student> studentList = new ArrayList<Student>();

    public UniManager() {
    }

    public void registerCourses(HashMap<String, Course> coursesToAdd) {
        coursesToAdd.forEach((courseId, course) -> {
            coursesMap.put(courseId, course);
        });
    }

    public void registerStudents(List<Student> studentsToAdd) {
        studentsToAdd.forEach(student -> {
            studentList.add(student);
        });
    }

    public void addCourse(Course course) {
        coursesMap.put(course.getCourseId(), course);
    }

    public void addStudent(Student student) {
        getStudentList().add(student);
    }

    public void listAllCourses() {
        if (coursesMap != null) {
            List<Entry<String, Course>> sortedClassList = new ArrayList<Entry<String, Course>>(coursesMap.entrySet());
            Collections.sort(sortedClassList, new Comparator<Entry<String, Course>>() {
                @Override
                public int compare(Entry<String, Course> course1, Entry<String, Course> course2) {
                    return course1.getValue().getCourseId().compareTo(course2.getValue().getCourseId());
                }

            });

            System.out.println("Number of registered courses: " + coursesMap.size());
            System.out.println("Courses: ");
            sortedClassList.forEach(entry -> {
                Course course = entry.getValue();
                System.out.println("Course ID: " + course.getCourseId());
                System.out.println("Course Name: " + course.getCourseName() + "\n");
                System.out.println("Registered Students: ");
                course.listAllRegisteredStudents();
            });

        } else {
            System.out.println("No Courses Registered!");
        }
        System.out.print("\n");

    }

    public void listAllStudents() {
        System.out.println("Number of registered students: " + studentList.size());
        System.out.println("Students: ");
        studentList.forEach(student -> {
            System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
        });
        System.out.print("\n");
    }

    public HashMap<String, Course> getCoursesMap() {
        return coursesMap;
    }

    public List<Student> getStudentList() {
        if (studentList == null) {
            studentList = new ArrayList<>();
        }
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

}
