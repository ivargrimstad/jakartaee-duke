package eu.agilejava.jakartaeeduke;

public class DukeSays {

    private final String message;
    private final String email;

    public DukeSays(String message, String email) {
        this.message = message;
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public String getEmail() {
        return email;
    }
}
