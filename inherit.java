class Name
{
    public void printName()
    {
        System.out.println("My name is Rajeev");   
    }
}
class Hobby extends Name
{
    public void myHobby()
    {
        System.out.println("I like Horseriding");
    }
}

public class inherit {
    public static void main(String[] args) {
        Hobby one = new Hobby();
        one.printName();
        one.myHobby();
    }
}
