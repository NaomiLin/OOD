package Lab.Lab1;

/**
 * This class represents a person The person has a first name, last name and an year of birth.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String phoneNum;
    private Email emailAdd;

    /**
     * Constructs a Person object and initializes it to the given first name, last name and year of
     * birth.
     *
     * @param firstName   the first name of this person
     * @param lastName    the last name of this person
     * @param yearOfBirth the year of birth of this person
     * @param phoneNum the phone number of this person
     * @param emailAdd the email address of this person
     */

    public Person(String firstName, String lastName, int yearOfBirth, String phoneNum, Email emailAdd) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.phoneNum = phoneNum;
        this.emailAdd = emailAdd;
    }

    /**
     * Get the first name of this person.
     *
     * @return the first name of this person
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Return the last name of this person.
     *
     * @return the last name of this person
     */

    public String getLastName() {
        return this.lastName;
    }

    public String getAuthor() {
        return this.firstName + this.lastName;
    }

    /**
     * Return the year of birth of this person.
     *
     * @return the year of birth of this person
     */
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    /**
     * Return the phone number of this person.
     *
     * @return the phone number of this person
     */
    public String getPhoneNumber() {
        return this.phoneNum;
    }

    /**
     * Return the email address of this person.
     *
     * @return the email address of this person
     */
    public String getEmailAddress() {
        return this.emailAdd.getUserName() + "@" + this.emailAdd.getDomain();
    }

    /**
     * Return the email address of this person.
     *
     * @return the email address of this person
     */
    public Email getEmailAdd() {
        return this.emailAdd;
    }

    /**
     * return a string representation of this person with first and last name
     *
     * @return a formatted string
     */
    public String toString() {
        /*
         Fields
         this.firstName: String
         this.lastName: String
         this.yearOfBirth: int
         */
        return firstName + " " + lastName;
    }
    /**
     * check if this person is the same as the person in the argument.
     * two persons are the same iff they have the same first and last
     * names and the same years of birth
     * @param other the other person to be compared to
     * @Return true if this person is the same as other, false otherwise
     */
    public boolean same(Person other) {
        return this.firstName.equals(other.firstName)
                && this.lastName.equals(other.lastName)
                && this.yearOfBirth == other.yearOfBirth;
    }

}
