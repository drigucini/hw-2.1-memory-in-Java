import java.util.Arrays;

public class Main {

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
        Integer[] value = new Integer[] {3, 4};
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

    public static void changeValue(int value) {
        value = 22;
        System.out.println("Inside method: " + value);
    }

    public static void changeValue(Integer value) {
        value = 22;
        System.out.println("Inside method: " + value);
    }

    public static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
        System.out.println("Inside method: " + Arrays.toString(value));
    }

    public static void changeValue1(Integer[] value) {
        value[0] = 99;
        System.out.println("Inside method: " + Arrays.toString(value));
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
}