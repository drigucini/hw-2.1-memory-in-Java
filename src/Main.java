import java.util.Arrays;

public class Main {

    public static int changeValue(int value) {
        value = 22;
        return value;
    }

    public static Integer changeValue(Integer value) {
        value = 22;
        return value;
    }

    public static Integer[] changeValue(Integer[] value) {
        value[0] = 1;
        value[1] = 2;
        return value;
    }

    public static Integer[] changeValue1(Integer[] value) {
        value[0] = 99;
        return value;
    }

    public static Person changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
        return person;
    }
    public static Person changePerson1(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
        return person;
    }
    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task5 () {
        System.out.println("Task 5");
        int value = 33;
        System.out.println("Initial value = " + value);
        changeValue(value);
        System.out.println("New value is " + value);
    }

    public static void task6 () {
        System.out.println("\nTask 6");
        Integer value = 33;
        System.out.println("Initial value = " + value);
        changeValue(value);
        System.out.println("New value is " + value);

    }

    public static void task7 () {
        System.out.println("\nTask 7");
        Integer[] value = {3, 4};
        System.out.println("Initial value is " + Arrays.toString(value));
        changeValue(value);
        System.out.println("New value is " + Arrays.toString(value));
    }

    public static void task8 () {
        System.out.println("\nTask 8");
        Integer[] value = {3, 4};
        System.out.println("Initial value is " + Arrays.toString(value));
        changeValue1(value);
        System.out.println("New value is " + Arrays.toString(value));
    }

    public static void task9 () {
        System.out.println("\nTask 9");
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("Initial person is " + person);
        changePerson(person);
        System.out.println("New person is " + person);
    }

    public static void task10 () {
        System.out.println("\nTask 10");
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("Initial person is " + person);
        changePerson1(person);
        System.out.println("New person is " + person);
    }
}