package by.tms.Action;

import by.tms.componentsOfUniversity.Student;
import by.tms.reader.Read;
import by.tms.reader.Reader;
import by.tms.writer.Write;
import by.tms.writer.Writer;

public class StudSorting {
    private Writer write = new Write();
    private Reader read = new Read();

    void courseSorting(){
        read.read("Enter a course: ");
        int c = (int) write.writeNum();
        for (Student student : Student.students) {
            if(student.getCourse()==c){
                read.read(
                "Name:"+student.getName()+'\n'+"Course:"+student.getCourse()+'\n'+"Faculty:"+student.getNameOfFac());}
        else
              read.read("Course does not exist");

        }
    }

    void facultySorting() {
        read.read("Enter a faculty: ");
        String fac = write.write();
        for (Student student : Student.students) {
            if (student.getNameOfFac().equalsIgnoreCase(fac)){
                read.read(
                        "Name:" + student.getName() + '\n' + "Course:" + student.getCourse() + '\n' + "Faculty:" + student.getNameOfFac());}
          else {
                    read.read("Faculty does not exist");
                }
            }
    }
}
