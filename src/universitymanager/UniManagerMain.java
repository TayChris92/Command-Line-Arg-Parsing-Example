package universitymanager;

import universitymanager.util.CommandArgProcessor;

public class UniManagerMain {

    public static void main(String... args) {

        CommandArgProcessor stringProc = new CommandArgProcessor();
        CommandArgProcessor argProcessor = new CommandArgProcessor(args);

        UniManager uniManager = new UniManager();

        uniManager.registerCourses(argProcessor.getResolvedCoursesMap());
        uniManager.registerStudents(argProcessor.getResolvedStudentsList());

        uniManager.listAllStudents();
        uniManager.listAllCourses();
    }

}
