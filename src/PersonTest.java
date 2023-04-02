public class PersonTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Joe","Smith",35,35000);
        employee.printDetails();
        Student student = new Student("Adam","Smith",15,10);
        student.printDetails();
        Retiree retiree = new Retiree("Frank","Smith",15,"tour");
        retiree.printDetails();

    }

}
