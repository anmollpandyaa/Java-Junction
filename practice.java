public class practice {
    public static void main(String[] args) {

        int [] num = {1, 2, 3, 4, 5};

        // // find sum of elements in array
        // System.out.println("Traversing array using for-each loop:");
        // int sum = 0;
        // for (int i = 0 ; i <= num.length ; i++) {
        //     sum += i;
        // }
        // System.out.println(sum);

        // find wheather the element is present in the array
        boolean isInArray = false;
        int n = 5;
        for (int i : num) {
            if (n == i) {
                System.out.println(n + " is present in the array");
                isInArray = true;
                System.out.println(isInArray);
            }
        } 
    }
}
