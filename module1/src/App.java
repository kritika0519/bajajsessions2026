public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //remove duplicacy
        int size=9;
        int[] arr={1,2,2,3,3,5,7,9,9};
        int index=0;
        for(int i=0;i<size;i++){
            if(arr[i]!=arr[index]){
                index++;
                arr[index]=arr[i];
                
            }
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
