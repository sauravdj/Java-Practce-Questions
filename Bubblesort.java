public class Bubblesort {
    public static void main(String[] args){
        int i, j;
        int arr[] = {55, 10, 40, 20,30, 7,3, 4, 8, 2, 6, 0, 5};
        for( i = 0; i < arr.length; i++){
          
            for( j = i+1; j< arr.length; j++){
                
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                 
                }
            
        }
        
        for(int k = 0; k < arr.length; k++)
            System.out.print(arr[k]+" ");
}
}
