public class string_methods {
    public static void main(String[] args) {
        System.out.println("The String is:");
        String name = "This is Visual Studio Code";
        String ut = "          1";
        System.out.println(name);
        System.out.println("The length of String is: ");
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(ut.trim());
        System.out.println(name.replace('s', 'x'));
        System.out.println(name.charAt(5));
        System.out.println(name.startsWith(" "));
    }
}