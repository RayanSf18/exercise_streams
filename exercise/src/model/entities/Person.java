package model.entities;

/**
 * This class represents a person with a name and a gender.
 *
 * @author Rayan silva
 * @version 1.0
 */
public class Person {

    /**
     * The person's name.
     */
    private String name;

    /**
     * The person's gender, either "male" or "female".
     */
    private String gender;

    /**
     * Creates a new Person object with an empty name and gender.
     */
    public Person() {
    }

    /**
     * Creates a new Person object with the specified name and gender.
     *
     * @param name The person's name.
     * @param gender The person's gender, either "male" or "female".
     * @throws IllegalArgumentException If the gender is not "male" or "female".
     */
    public Person(String name, String gender) throws IllegalArgumentException {
        if (gender.equals("male") || gender.equals("female")) {
            this.name = name;
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid gender. Only 'male' or 'female' is allowed.");
        }
    }

    /**
     * Gets the person's name.
     *
     * @return The person's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the person's name.
     *
     * @param name The new name for the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the person's gender.
     *
     * @return The person's gender, either "male" or "female".
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the person's gender.
     *
     * @param gender The new gender for the person, either "male" or "female".
     * @throws IllegalArgumentException If the gender is not "male" or "female".
     */
    public void setGender(String gender) throws IllegalArgumentException {
        if (gender.equals("male") || gender.equals("female")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid gender. Only 'male' or 'female' is allowed.");
        }
    }

    /**
     * Returns a string representation of the person.
     *
     * @return A string in the format "Name, Gender".
     */
    @Override
    public String toString() {
        return name + ", " + gender;
    }
}
