package eu.agilejava.dukes;


import jakarta.persistence.*;

@Entity
@Table(name ="greeting")
public class DukesGreeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name ="message")
    private String message;

    @Column(name="email")
    private String email;

    public DukesGreeting() {
    }

    public DukesGreeting(final String message, final String email) {
        this.message=message;
        this.email=email;
    }

    public String getMessage() {
        return message;
    }

    public String getEmail() {
        return email;
    }
}
