public class GenerateStringOfLengthN {

    // generate string with only 'A' , 'B' , 'C'
    private static void printPath(String path, int n){
        if(path.length() > n)
            return;
        if(path.length() == n){
            System.out.println(path);
        }
        printPath(path+'A', n);

        printPath(path+'B', n);

        printPath(path+'C', n);

    }
    public static void main(String[] args) {
        printPath("", 2);
    }
}
