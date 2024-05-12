//encrypt string by adding integer
public class encrypt {
    public static void main(String[] args) {
        char name = 'A';
        name = (char)(name + 10);

        System.out.println(name);

        name = (char)(name - 10);

        System.out.println(name);
    }
}
