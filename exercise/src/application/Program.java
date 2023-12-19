package application;

import model.entities.Person;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This class takes user input for the number of people to instantiate and collects their names and genders. It then filters the list for females and displays them, or announces no females found if none exist.
 *
 * @author Rayan silva
 * @version 1.0
 */
public class Program {

    /**
     * The main entry point of the program. Takes user input for the number of people, collects their names and genders,
     * filters for females, and displays the results.
     *
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        try {
            System.out.print("\nEnter the number of people you want to instantiate: ");
            int numberOfPersons = read.nextInt();

            for(int i = 0; i < numberOfPersons; i++) {

                System.out.println("Person #" + (i+1) + " data:");

                System.out.print("Name: ");
                read.nextLine();
                String personName = read.next().toLowerCase();

                System.out.print("Gender (male/female): ");
                String personGender = read.next().toLowerCase();

                personList.add(new Person(personName, personGender));

            }

            List<Person> listOfWoman = personList.stream().filter(person -> person.getGender().equals("female")).collect(Collectors.toList());

            if (listOfWoman.isEmpty()) {
                System.out.println("\nNo women found in the list.");
            } else {
                System.out.println("\nList of womans:");
                listOfWoman.forEach(System.out::println);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Input Invalid!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        read.close();
    }
}
