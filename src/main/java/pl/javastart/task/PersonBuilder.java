package pl.javastart.task;

import java.util.Scanner;

public class PersonBuilder {
    private Scanner scanner = new Scanner(System.in);

    int i = 1;

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
        Person firstPerson = createPerson();
        for (int i = 0; i < persons.length; i++) {
            persons[i] = firstPerson;
        }
        Person personToAdd = createPerson();
        checkArrayDuplicate(persons, personToAdd);
        personToAdd = createPerson();
        checkArrayDuplicate(persons, personToAdd);
        return persons;
    }

    void checkArrayDuplicate(Person[] people, Person personToAdd) {
        for (Person person : people) {
            while (person.equals(personToAdd)) {
                System.out.println("Duplikat");
                personToAdd = createPerson();
            }
        }
        people[i] = personToAdd;
        i++;
    }
}



