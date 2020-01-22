package by.tms.Action;

import by.tms.Validator.OperValidator;
import by.tms.reader.Read;
import by.tms.reader.Reader;
import by.tms.writer.Write;
import by.tms.writer.Writer;

public class App {
    private Writer write = new Write();
    private Reader read = new Read();
    private StudSorting sorting = new StudSorting();

    public void run(){
        String op;
        do {
            read.read("What do u want: list of students by course or by faculty or exit? (cour||fac||exit)");
            op = write.write();
            switch (op) {
                case "cour":
                    sorting.courseSorting();
                    break;
                case "fac":
                    sorting.facultySorting();
                    break;
                case "exit":
                    System.exit(0);
            }
            read.read("Continue or u can add students? (Yes||Add)");
        }while (OperValidator.validator(write.write()));
    }

}
