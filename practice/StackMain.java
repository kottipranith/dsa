public class StackMain {
    public static void main(String[] args) {
        CustomStack<Integer> st = new CustomStack<>();
        for(int i = 1; i <= 11; i++)
            st.push(i);
        System.out.println(st);

    }
}
