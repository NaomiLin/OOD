package Lab.Lab1;

/**
 * This class represents an email address. An email address a username and a domain.
 */
public class Email {
    private String userName;
    private String domain;

    /**
     * Construct a Email object that has the provided username and domain.
     *
     * @param userName the username to be given to this Email
     * @param domain the domain to be given to this Email
     */

    public Email(String userName, String domain) {
        this.userName = userName;
        this.domain = domain;
    }

    /**
     * Get the username of this person.
     *
     * @return the username of this person
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Get the domain of this person.
     *
     * @return the domain of this person
     */
    public String getDomain() {
        return this.domain;
    }
}
