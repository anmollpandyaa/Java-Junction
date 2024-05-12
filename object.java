class Person {
    String name;
    int age;

    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class object {
    public static void main(String[] args) 
    {
        Person person1 = new Person("Rajeev", 25);

        System.out.format("Person 1:");
        person1.displayInfo();

        Person person2 = new Person("Ranjeet", 40);

        System.out.format("\nPerson 2:");
        person2.displayInfo();
    }
}
