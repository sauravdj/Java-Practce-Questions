public class SelectionSort {
    public static void main(String[] args){
        int i, j, min;
        int arr[] = {7, 4, 3, 4,3,8, 9};
        for( i = 0; i < arr.length; i++){
            min = i;
            for(j = i+1; j< arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(i != min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        for(int k = 0; k < arr.length; k++)
            System.out.print(arr[k]+" ");

    }
}
