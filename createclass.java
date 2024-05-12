public class createclass {

    static class student{
        String name;
        byte age;

        public void details()
        {
            System.out.println(name);
            System.out.print(age);
        }
    }
    public static void main(String[] args) {
        student one = new student();
        one.name = "Anmol";
        one.age = 40;

        one.details();
    }
}
