class Person {
    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}

class Employee extends Person {
    int salary;

    public Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }
}

class Student extends Person {
    int grade;

    public Student(String name, String lastName, int age, int grade) {
        super(name,lastName,age);
        this.grade = grade;
    }

    public void printDetails() {
        System.out.println(name + " " + lastName + " " + age + " " + grade);
    }
}

class Retiree extends Person {
    String seniorActivity;
    public Retiree(String name, String lastName, int age, String seniorActivity) {
        super(name, lastName, age);
        this.seniorActivity = seniorActivity;

    }

    public void printDetails() {
        System.out.println(name + " " + lastName + " " + age + " " + seniorActivity );
    }
}




