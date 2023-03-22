package TASK1;

public class Subject {
    private String name;
    private Person teacher;
    private Student[] students;
    private int index;

    public Subject(String name) {
        this.name = name;
        students = new Student[10];
        index = 0;
    }

    public void setTeacher(Person teacher){
        this.teacher = teacher;
    }

    public void addStudent(Student student) throws TooManyStudentsException {
        if (index < students.length) {
            students[index++]= student;
        }else throw new TooManyStudentsException();
    }

    public String toString(){
        String result =  name +", teacher: "+ teacher + ", students: ";

        for (int i = 0; i < index; i++) {
            result += students[i] + " ";
        }
        return result;
    }
}
