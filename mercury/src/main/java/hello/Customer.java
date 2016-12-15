// tag::sample[]
package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String title;

	protected Customer() {}

    public Customer(String firstName, String lastName, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, title=%s, firstName='%s', lastName='%s']",
                id, title, firstName, lastName);
    }

// end::sample[]

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
    public String getTitle() {
		return title.toUpperCase();
	}

}

