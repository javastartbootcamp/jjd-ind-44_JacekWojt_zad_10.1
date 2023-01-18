package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        Person[] persons = builder.createPersonArray(3);

        System.out.println("Obiekty zapisane w tablicy: ");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}