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
        int i = 0;
        Person[] persons = new Person[size];
        do {
            Person person = createPerson();
            if (isDuplicate(person, persons, i)) {
                System.out.println("Duplikat");
                persons[i] = createPerson();
            } else {
                persons[i] = person;
            }
            i++;
        } while (i < size);
        return persons;
    }

    boolean isDuplicate(Person personToAdd, Person[] people, int checkNumber) {
        for (int i = 0; i <= checkNumber; i++) {
            if (personToAdd.equals(people[i])) {
                return true;
            }
        }
        return false;
    }
}



