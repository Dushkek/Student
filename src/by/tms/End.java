package by.tms;

import by.tms.Action.App;
import by.tms.application.ConsoleApp;
import by.tms.application.ConsoleApplication;
import by.tms.componentsOfUniversity.Faculty;
import by.tms.reader.Read;
import by.tms.reader.Reader;
import by.tms.writer.Write;
import by.tms.writer.Writer;

public class End {
    private ConsoleApplication consoleApplication = new ConsoleApp();
    private App app = new App();
    private Reader read = new Read();
    private Faculty faculty = new Faculty();
    private Writer write = new Write();

    void run() {
        read.read("Welcome to creating a database of a University.\nHow many faculties do u want: ");
        faculty.setNumOfFac((int) write.writeNum());
        while (true){
            consoleApplication.run();
            app.run();
        }
    }

}
