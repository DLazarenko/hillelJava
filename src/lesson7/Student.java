package lesson7;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int[] marks;

    public Student(String name, String surname, int[] marks) {
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String name) {
        this.surname = surname;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String toString() {
        String string = name;
        string = string + " " + surname;
        if (marks != null) {
            for (int mark : marks) {
                string = string + " " + mark;
            }
        }
        return string;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
