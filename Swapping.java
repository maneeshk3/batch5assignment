public class Swapping{
    public static void main (String[] args) {
        int[] arr={10,20,30,40,50};
        
        System.out.println("before swapping:");
        for(int efg:arr){
           System.out.println(efg);
        }
        
        System.out.println("swapping first and last number in the given array:");
        int temp;
        temp=arr[4];
        arr[4]=arr[0];
        arr[0]=temp;
        
        for(int abc:arr){
            System.out.println(abc);
        }
        
    }
}