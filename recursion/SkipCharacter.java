public class SkipCharacter {
    // static String ans = "";
    // static void skipCharacter(String s,int i){
    //     if(i == s.length())
    //         return ;
    //     if(s.charAt(i) != 'a')
    //         ans += s.charAt(i);
    //     skipCharacter(s, i+1);
    // } 
    static String skipCharacter(String s){
        if( s.equals(""))
            return "";
        if(s.charAt(0) == 'a')
            return skipCharacter(s.substring(1));
        return s.charAt(0) + skipCharacter(s.substring(1));
        

    }
    public static void main(String[] args) {
        String s = "bccaadac";
        System.out.println(skipCharacter(s));
    }
}
