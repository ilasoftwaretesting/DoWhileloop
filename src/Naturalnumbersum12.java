import java.util.Scanner;

public class Naturalnumbersum12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int count = 1, total = 0;

        while(count <= num)
        {
            total = total + count;
            count++;
        }

        System.out.println("Sum of first " + num + " natural numbers is: "+total);
    }
}

