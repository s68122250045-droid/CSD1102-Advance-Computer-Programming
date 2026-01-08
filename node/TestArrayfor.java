package node;

public class TestArrayfor {
    public static void main(String[] args) {
      int []t = new int [10];
      for(int i=0; i < t.length; i++){
          t[i] = 50+i;
      }
    for(int value : t){
        System.out.print(value + " ");
    }
         double sum = 0;;
        for(int i=0; i < t.length; i++){
            sum = sum + t[i];
        }
    double avg = 0;
    avg = sum / t.length;
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + avg);
    }
    }   
