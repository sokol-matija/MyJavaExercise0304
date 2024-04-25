package hr.algebra.model;

public class Student implements Comparable<Student> {

    private final String firstName;
    private final String lastName;
    private final int indexNumber;

    public Student(String firstName, String lrstName, int indexNumber) {
        this.firstName = firstName;
        this.lastName = lrstName;
        this.indexNumber = indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(indexNumber, o.indexNumber);
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", indexNumber=" + indexNumber + '}';
    }

}
