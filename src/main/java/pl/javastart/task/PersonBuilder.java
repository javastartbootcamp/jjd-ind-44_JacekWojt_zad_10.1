package pl.javastart.task;

import java.util.Scanner;

public class PersonBuilder {
    private Scanner scanner = new Scanner(System.in);

    private Person createPerson() {
        System.out.print("Podaj imię: ");
        String firstname = scanner.nextLine();
        System.out.print("Podaj wiek: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        return new Person(firstname, age);
    }

    Person[] createPersonArray(int size) {
        Person[] persons = new Person[size];
        int i = 0;
        persons[i] = createPerson();
        do {
            i++;
            persons[i] = createPerson();
            while (persons[i - 1].equals(persons[i])) {
                System.out.println("Duplikat");
                persons[i] = createPerson();
            }
        } while (i < size - 1);
        return persons;
    }

    boolean checkArrayDuplicate(Person[] people) {
        boolean result = false;
        for (int i = 0; i < people.length - 1; i++) {
            if (people[i].equals(people[people.length - 1])) {
                result = true;
            }
        }
        return result;
    }
}

