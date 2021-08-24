import java.util.Scanner;
public class Asgn3Q2 {
    public static void main(String[] args){
        int p, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array : ");
        p = s.nextInt();
        int a[] = new int[p];
        System.out.println("Enter all the elements : ");
        for(int i = 0; i < p; i++){
            a[i] = s.nextInt();
            sum = sum + (a[i] * a[i]);
        }
        System.out.println("Sum: "+sum);
    }
}