package by.tms.componentsOfUniversity;


import java.util.Objects;

public class Faculty extends University {

    public void setNameOfFac(String nameOfFac) {
        this.nameOfFac = nameOfFac;
    }

    protected String nameOfFac;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(nameOfFac, faculty.nameOfFac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfFac);
    }

    public String getNameOfFac() {
        return nameOfFac;
    }


}
