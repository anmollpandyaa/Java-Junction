public class FindNonRepeatingCharacter {
    public static void findNonRepeatingCharacter(int [] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < i + 1; j++) {
                
                if (array[i] != array[j]) {
                    int index = i;
                    System.out.println(index);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {2, 2, 6, 8};
        findNonRepeatingCharacter(array);
    }
}
