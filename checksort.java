public class checksort {
    public static void main(String[] args) {
        int [] arr = {34, 43, 55, 67, 82, 100};

        boolean sorted = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.print("SORTED");
        }
        else{
            System.out.print("UNSORTED");
        }
    }
}