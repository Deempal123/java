public class multidimensionalArray {
    public static void main(String ar[])
    {
        int arr[][] = new int[3][3];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    //modified for loop
    System.out.println();
        for(int k[] : arr)
        {
            for(int x : k)
            {
                System.out.print(x+ " ");
            }
            System.out.println();
        }

        //jagged array
        System.out.println();
        int jar[][] = new int[3][];

        jar[0] = new int[3];
        jar[1] = new int[4];
        jar[2] = new int[2];

        for(int i=0; i<3; i++)
        {
            for( int j=0; j<jar[i].length; j++)
            {
                jar[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0; i<3; i++)
        {
            for( int j=0; j<jar[i].length; j++)
            {
                System.out.print(jar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
