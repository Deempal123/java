import java.util.Scanner;

public class Array {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the Array ");
        for(int i=0; i<5; i++)
        {
            
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            System.out.print(arr[i]+ "  ");
            
        }
    }
    
}
