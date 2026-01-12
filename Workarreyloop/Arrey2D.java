package Workarreyloop;
public class Arrey2D {
    public static void main(String[] args) {
        int[][] a1 = new int[10][10];
        int[][] a2 = new int[10][10];

        randomArray(a1);
        randomArray(a2);

        System.out.println("Array 1:");
        printArray(a1);
        System.out.println("--------------------");
        System.out.println("Array 2:");
        printArray(a2);
        System.out.println("--------------------");
        int[][] sum = sumArray(a1, a2);
        System.out.println("Sum Array:");
        printArray(sum);

    }
    public static void randomArray(int [][] x){
        for (int i = 0; i<x.length; i++)
            for (int j = 0; j<x[i].length; j++)
                x[i][j] = (int)(Math.random()*10)+50;
    }
    public static void printArray(int [][] x){
        for (int[] row : x){
            for (int v : row){
                System.out.print(v + " ");}
            System.out.println();
        }
    }
    public static int[][] sumArray(int[][] x, int[][] y) {
        int[][] result = new int[10][10];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                result[i][j] = x[i][j] + y[i][j];
            }
        }
        return result;
    }
}