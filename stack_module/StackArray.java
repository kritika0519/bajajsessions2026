public class StackArray {
    int idx=0;
    int[] arr=new int[5];

    public  void push(int num){
        if(idx==5){
            System.out.println("stack is full");
            return;
        }
        arr[idx]=num;
        idx++;
    }

    public  void pop(){
        if(idx==0){
            System.out.println("stack is empty");
            return;
        }
        idx--;
    }

    public  boolean isFull(){
        if(idx==5) return true;
        return false;
    }

    public  boolean isEmpty(){
        if(idx==0) return true;
        return false;
    }

    public  int peek(){
        if(idx==0){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[idx-1];
    }

    public void display(){
        if(idx==0){
            System.out.println("stack is empty");
        }
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray st=new StackArray();
        
        st.push(100);
        st.push(200);
        st.push(300);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.pop();
        st.pop();
        st.display();
        st.pop();
    }
}
