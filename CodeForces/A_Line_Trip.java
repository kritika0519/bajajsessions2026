import java.util.*;

class A_Line_Trip{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-- >0){
            int n = sc.nextInt();
            int x= sc.nextInt();

            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int ans=arr[0];
            for(int i=0;i<n-1;i++){
                ans=Math.max(ans, arr[i+1]-arr[i]);
            }
            ans=Math.max(ans, (x-arr[n-1])*2);

            System.out.println(ans);

        }
        sc.close();
    }
}