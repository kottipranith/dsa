public class DynamicStackMain {
    public static void main(String[] args) {
        DynamicStack<Integer> st = new DynamicStack<>();
        for(int i = 1; i <= 11; i++)
            st.push(i);
        System.out.println(st);

        for(int i = 12; i <= 22; i++)
            st.push(i);
        System.out.println(st);
    }
}
