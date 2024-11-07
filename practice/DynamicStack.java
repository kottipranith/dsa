public class DynamicStack <T> extends CustomStack{

    public DynamicStack(){
        super();
    }
    @Override
    void push(Object val) {
        if(super.isFull()){
            Object[] newarr = new Object[2*this.arr.length];
            for(int i = 0; i < this.arr.length; i++){
                newarr[i] = this.arr[i];
            }
            this.arr = newarr;
        }
        super.push(val);
    }


}
