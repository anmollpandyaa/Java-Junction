public class array_methods {
    public static void main(String[] args) {

        int [] num = {1, 2, 3, 4, 5};
        // this method will return length of the array
        System.out.print("Length of the array is: ");
        System.out.println(num.length);

        // traversal can be performed using this method
        System.out.println("Elements of the array is -");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // for-each loop is a better way to traverse
        System.out.println("Traversing array using for-each loop:");
        for (int i : num) {
            System.out.println(i);
        }
    }
}
