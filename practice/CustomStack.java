import java.util.Arrays;

public class CustomStack <T>{
    private int top ;
    private int size;
    protected Object[] arr;
    CustomStack(int size){
        this.size = size;
        this.top = -1;
        this.arr = new Object[size];
    }
    CustomStack(){
        this(10);//default size
    }

    void push(T val){
        if(isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = val;
    }

    T pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return (T)"-1";
        }
        T res = (T)arr[top--];
        return res;
    }

    T peek(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
            return (T)"-1";
        }
        return (T)arr[top];
    }

    int getSize(){
        return top + 1;
    }
    boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }


    boolean isFull(){
        if(top == arr.length - 1)
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "CustomStack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }


}
