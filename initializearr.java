// diffferent methods to declare & initialize array
public class initializearr 
{
    public static void main(String[] args) 
    {
        // 1st
        int [] marks;
        marks = new int [5];
        marks[0] = 50;
        marks[1] = 55;
        marks[2] = 60;
        marks[3] = 40;
        marks[4] = 100;
        System.out.println(marks[0]);

        // 2nd
        int [] roll = new int [5];
        roll[0] = 1;
        roll[1] = 2;
        roll[2] = 3;
        roll[3] = 4;
        roll[4] = 5;
        System.out.println(roll[0]);

        // 3rd
        int [] reg = {2, 4, 6, 8, 10};
        System.out.println(reg[0]);

        // array of strings
        String [] name = {"Anmol", "Imran", "Ranveer", "Rajeev", "Ayushmann"};
        System.out.println(name[0]);

        // initialize a 2d array
        int [][] mat = new int[2][2];
        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[1][0] = 3;
        mat[1][1] = 4;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println(mat[i][j]);
            }            
        }
    }
}