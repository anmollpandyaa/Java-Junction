public class method_overloading 
{
    static void me()
    {
        System.out.println("Anmol");
    }

    static void me(int a)
    {
        System.out.println(a);
        // return a;
    }

    public static void main(String[] args) 
    {
        System.out.println("About me:");
        me();
        me(19);
    }
}
