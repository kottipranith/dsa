public class SubStrings {
    
    static void subStrings(String ans,String s){
        if(s.equals("")){
            System.out.println(ans);
            return ;
        }
        subStrings(ans + s.charAt(0),s.substring(1));
        subStrings(ans,s.substring(1));
    }
    public static void main(String[] args) {
        String s = "abc";
        subStrings("", s);
    }
}
