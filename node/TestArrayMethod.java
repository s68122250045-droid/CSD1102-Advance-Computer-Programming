package node;

public class TestArrayMethod {
    public static void main(String[] args) {
        int[][] a1 = new int[5][3];

        System.out.println("Array before random:");
        printArray(a1);

        randomArray(a1);

        System.out.println("Array after random:");
        printArray(a1);

        int sum = sumArray(a1);
        System.out.println("sum = " + sum);
        System.out.println("min = " + minArray(a1));
        System.out.println("max2 = " + max2Array(a1));
        System.out.println("avg = " + avgArray(a1));
    }

    public static void printArray(int[][] x) {
        for (int[] row : x) {
            for (int v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static void randomArray(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (int)(50 + Math.random() * 10);
            }
        }
    }
    public static int sumArray(int[][] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                sum += x[i][j];
            }
        }
        return sum;
    }
    public static int minArray(int[][] x) {
        int min = x[0][0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] < min) {
                    min = x[i][j];
                }
            }
        }
        return min;
    }
    public static int max2Array(int[][] x) {
        int max1 = x[0][0];
        int max2 = x[0][0];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                int val = x[i][j];
                if (val > max1) {
                    max2 = max1;
                    max1 = val;
                } else if (val > max2 && val != max1) {
                    max2 = val;
                }
            }
        }
        return max2;
    }
    public static double avgArray(int[][] x) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                sum = sum + x[i][j];
                count++;
            }
        }
        return sum / count;
    }
}