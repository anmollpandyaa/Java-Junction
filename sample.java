class Detail
{
    String name;

    public void printName()
    {
        System.out.print(this.name);
    }
}
public class sample {
    public static void main(String[] args) 
    {
        Detail Anmol = new Detail();
        Anmol.name = "huu";

        Anmol.printName();
    }
}