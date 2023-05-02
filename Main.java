import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        boolean flag = false;

        for(int count=2; count<number; count++) {
            if(number%count == 0) {
                flag = true;
                break;
            }
        }

        if(!flag) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }
}