class shape
{
    public void area()
    {
        System.out.println("This is the area");
    }
}
class triangle extends shape
{
    public void area(int l, int h)
    {
        System.out.println(1/2 *l * h);
    }
}
class circle extends shape
{
    public void area(int r)
    {
        System.out.println((3.14) * r * r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        circle tri = new circle();
        tri.area(4);
    }
}
