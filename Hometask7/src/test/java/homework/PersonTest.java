package homework;

import org.testng.annotations.Test;

public class PersonTest {
    @Test
    public void PersonData() {
        Person person1 = new Person("Will Smith", 48);
        System.out.println("Name: " + person1.name + " Age:" + person1.age);

        Person person2 = new Person("Johny Depp", 54);
        System.out.println("Name: " + person2.name + " Age:" + person2.age);
    }
}
