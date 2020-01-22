package by.tms.application;

import by.tms.componentsOfUniversity.Faculty;
import by.tms.Validator.OperValidator;
import by.tms.componentsOfUniversity.Student;
import by.tms.reader.Read;
import by.tms.reader.Reader;
import by.tms.writer.Write;
import by.tms.writer.Writer;

public class ConsoleApp implements ConsoleApplication {
    private Writer write = new Write();
    private Reader read = new Read();
    private Faculty faculty = new Faculty();

    private void menu(){
        do {
            read.read("Enter a student name, course and faculty: ");
            Student student = new Student();
            String name = write.write();
            student.setName(name);
            int course = (int) write.writeNum();
            student.setCourse(course);
            String faculty = write.write();
            student.setNameOfFac(faculty);
            Student.students.add(student);
            student.setId();

            read.read("Name:"+student.getName()+'\n'+"Course:"+student.getCourse()+'\n'+"Faculty: "+student.getNameOfFac()+'\n'+"id:"+student.getId()+'\n');

            read.read("Continue enter students? (Yes||No)");
        } while (OperValidator.validator(write.write()));
    }


    @Override
    public void run() {
    menu();
    }
}
