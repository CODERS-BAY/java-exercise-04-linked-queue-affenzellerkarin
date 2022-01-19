package skeleton;
import java.util.UUID;

/**
 * Model an abstract person class.
 * 
 * @author your name
 *
 */
public abstract class Person {
    public String firstName;
    public String lastName;

    int salary;
    int age;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return (firstName +" "+ lastName);
    }
}



