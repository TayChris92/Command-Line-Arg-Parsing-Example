package universitymanager.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import universitymanager.Course;
import universitymanager.Student;

public class CommandArgProcessor {

    private String[] appArguments;

    private List<String> appArgumentList = new ArrayList<String>();

    private List<Student> resolvedStudentsList = new ArrayList<Student>();

    private HashMap<String, Course> resolvedCoursesMap = new HashMap<String, Course>();

    public CommandArgProcessor() {
    }

    public CommandArgProcessor(String[] args) {
        appArguments = args;
        resolveClasses(args);
        resolveStudents(args);
    }

    private void resolveClasses(String[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals("-c")) {
                i++;
                while (i <= args.length - 2) {
                    Course course = null;
                    String courseId = args[i];
                    String courseName = args[i + 1];

                    for (char c : courseId.toCharArray()) {
                        if (Character.isDigit(c)) {
                            course = new Course(courseId, courseName);
                            resolvedCoursesMap.put(course.getCourseId(), course);
                            break;
                        }
                    }
                    if (!args[i + 2].equals("-s")) {
                        i = i + 2;
                    } else {
                        break;
                    }

                }
            }
        }
    }

    private void resolveStudents(String[] args) {
        Student student = null;
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals("-s")) {
                i++;
                while (i <= args.length - 2) {

                    if (!isCourseId(args[i])) {
                        String firstName = args[i];
                        String lastName = args[i + 1];

                        student = new Student(firstName, lastName);
                        resolvedStudentsList.add(student);
                        i = i + 2;

                        while (i <= args.length - 1) {
                            if (isCourseId(args[i])) {
                                String courseId = args[i];
                                if (resolvedCoursesMap.get(courseId) != null) {
                                    Course resolvedCourse = resolvedCoursesMap.get(courseId);
                                    resolvedCourse.registerStudentToCourse(student);
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                    }

                }
            }
        }
    }

    private boolean isCourseId(String arg) {
        for (char c : arg.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public HashMap<String, Course> getResolvedCoursesMap() {
        return resolvedCoursesMap;
    }

    public List<Student> getResolvedStudentsList() {
        return resolvedStudentsList;
    }

    public String[] getAppArguments() {
        return appArguments;
    }

    public List<String> getAppArgumentList() {
        return appArgumentList;
    }

}
