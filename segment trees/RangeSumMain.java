public class RangeSumMain {
    public static void main(String[] args) {
        RangeSum rangeSum = new RangeSum(new int[]{1,3,5});
        System.out.println(rangeSum.getRangeSum(0, 2, 0, 0, 2));
        rangeSum.update(1, 0, 2, 2, 0);
        System.out.println(rangeSum.getRangeSum(0, 2, 0, 0, 2));
    }
}
