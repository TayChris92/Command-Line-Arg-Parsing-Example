package universitymanager;

import universitymanager.util.CommandArgProcessor;

public class UniManagerMain {

    public static void main(String... args) {
        UniManager uniManager = new UniManager();
        CommandArgProcessor argProcessor = new CommandArgProcessor(args);

        uniManager.registerCourses(argProcessor.getResolvedCoursesMap());
        uniManager.registerStudents(argProcessor.getResolvedStudentsList());

        uniManager.listAllStudents();
        uniManager.listAllCourses();
    }

}
