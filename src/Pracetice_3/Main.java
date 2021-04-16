package Pracetice_3;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String testWord = "abcdefghijk";


        for(int element : testArray){
            System.out.print(element + "   ");
        }
        System.out.println();


        testArray = Reversal.reverseArray(testArray);
        for(int elenment : testArray){
            System.out.print(elenment+"   ");
        }
        System.out.println();
        // dao nguoc chuoi
        System.out.println(testWord);
        System.out.println(Reversal.reverseString(testWord));
    }
}
