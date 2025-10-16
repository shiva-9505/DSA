import java.util.*;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        while(temp != 0)
        {
            int lastDig = temp % 10;
            reverse = reverse * 10 + lastDig;
            temp = temp / 10;
        }
        if(reverse == n)
        {
            System.out.println("Number is a palindrome number.");
        }
        else
        {
            System.out.println("Number is not a palindrome number.");
        }
    }
}