import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        twoSum(arr,target);
    }

    //BRUTE FORCE


//    private static void twoSum(int[] arr, int target) {
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(i+" "+j);
//                }
//            }
//        }
//    }
    private static void twoSum(int[] arr, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                System.out.println(map.get(target-arr[i])+" "+i);
                return;
            }
            map.put(arr[i],i);
        }
    }
}
