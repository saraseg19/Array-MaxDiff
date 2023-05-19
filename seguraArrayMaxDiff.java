import java.util.Arrays;

public class seguraArrayMaxDiff {
    //Ch 1, Quest 33

    public static void main(String args[])
    {
        int a[] = {180, 130, 118, 5, 170, 23, 127, 33, 41, 151};
        diff(a);

        System.out.println();

        int b[] = {13, 44, 19, 91, 103, 6, 145, 21};
        diff(b);

        System.out.println();

        int c[] = {134, 38, 18, 155, 84, 88};
        diff(c);

        System.out.println();

        int d[] = {44, 6, 37, 51};
        diff(d);
    }

    public static void diff(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;
        int middle = (arr.length)/2;

        System.out.println("The array is: " + Arrays.toString(arr));

        sort(arr, start, end); 

        //System.out.println("The array is: " + Arrays.toString(arr)); //View sorted array

        int sub1[] = new int [middle];
        int sub2[] = new int [middle]; 

        int j = middle;

        for(int i = 0; i < sub1.length; i++)
        {
            sub1[i] = arr[i];
            sub2[i] = arr[j];
            j++;
        }

        System.out.println("Our sublists are: " + Arrays.toString(sub1) + " and " + Arrays.toString(sub2));

        int sub1Sum = sum(sub1);
        int sub2Sum = sum(sub2);

        System.out.println("The sum of " + Arrays.toString(sub1) + " is: " + sub1Sum);
        System.out.println("The sum of " + Arrays.toString(sub2) + " is: " + sub2Sum);

        int difference = sub2Sum - sub1Sum;

        System.out.println("Their difference is: " + difference);        
    }
    
    public static void merge(int arr[], int start, int middle, int end)
    {
        int leftSize = middle - start + 1;
        int rightSize = end - middle;

        int left[] = new int[leftSize];
        int right[] = new int[rightSize];

        for(int i = 0; i < leftSize; i++)
            left[i] = arr[start + i];
        for(int j = 0; j < rightSize; j++)
            right[j] = arr[middle + 1 + j];

        int i = 0; 
        int j = 0;

        int k = start;
        while(i < leftSize && j < rightSize)
        {
            if(left[i] <= right[j]) 
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < leftSize)
        {
            arr[k] = left[i]; //out of bounds
            i++;
            k++;
        }

        while(j < rightSize)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int start, int end)
    {   
        if(start < end)
        {
            int middle = start + (end - start) / 2;

            sort(arr, start, middle);
            sort(arr, middle + 1, end);

            merge(arr, start, middle, end);
        }
    }

    public static int sum(int arr[])
    {
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }

        return sum;
    }

}