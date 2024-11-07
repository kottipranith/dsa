public class GenerateBinaryOfLengthNAndKSet {
    private static void generateBinary(String pattern, int n, int k, int curCount){
        if(pattern.length() > n)
            return;
        if(pattern.length() == n && curCount == k)
            System.out.println(pattern);

        generateBinary(pattern + '0', n, k, curCount);

        generateBinary(pattern + '1', n, k, curCount+1);
    }
    public static void main(String[] args) {
        generateBinary("", 3, 2, 0);
    }
}
