import java.util.Random;

interface Average {
    float average();
}

interface Scholarship {
    float rate();
}

class Person {
    String p_name;

    public Person(String name) {
        p_name = name;
    }
}

class Employee extends Person implements Average {
    int no_salaries;
    int[] salary = new int[12];

    public Employee(String name, int n) {
        super(name);
        no_salaries = n;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            salary[i] = rand.nextInt(30000);
        }
    }

    public float average() {
        if (no_salaries == 0) {
            return 0;
        }
        float sum = 0;
        for (int i = 0; i < no_salaries; i++) {
            sum += salary[i];
        }
        return sum / no_salaries;
    }
}

class Student extends Person implements Average, Scholarship {
    int no_grades;
    Employee parent1, parent2;
    int[] grade = new int[6];

    public Student(String name, int n, Employee r1, Employee r2) {
        super(name);
        no_grades = n;
        parent1 = r1;
        parent2 = r2;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            grade[i] = rand.nextInt(6) + 5;
        }
    }

    public float average() {
        float sum = 0;
        for (int i = 0; i < no_grades; i++) {
            sum += grade[i];
        }
        return sum / no_grades;
    }

    public float rate() {
        float gpa = average();
        float sum_salaries = parent1.average() + parent2.average();
        float points = gpa * 6 + (60000 - sum_salaries) * 4;
        return points;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("John", 3);
        employees[1] = new Employee("Jane", 0);
        employees[2] = new Employee("Bob", 5);
        employees[3] = new Employee("Alice", 0);
        employees[4] = new Employee("Mike", 7);
        employees[5] = new Employee("Sara", 4);

        Student[] students = new Student[3];
        students[0] = new Student("Tom", 6, employees[0], employees[1]);
        students[1] = new Student("Linda", 6, employees[2], employees[3]);
        students[2] = new Student("David", 6, employees[4], employees[5]);

        float max_points = 0;
        Student scholarship_winner = null;
        for (Student student : students) {
            float points = student.rate();
            if (points > max_points) {
                max_points = points;
                scholarship_winner = student;
            }
        }

        System.out.println("Student data:");
        System.out.println("Name: " + scholarship_winner.p_name);
        System.out.println("GPA: " + scholarship_winner.average());
        System.out.println("First parent name: " + scholarship_winner.parent1.p_name);
        System.out.println("First parent average salary: " + scholarship_winner.parent1.average());
        System.out.println("Second parent name: " + scholarship_winner.parent2.p_name);
        System.out.println("Second parent average salary: " + scholarship_winner.parent2.average());
        System.out.println("Scholarship points: " + scholarship_winner.rate());
        System.out.println("Congratulations to " + scholarship_winner.p_name + " for winning the scholarship!");
    }}
