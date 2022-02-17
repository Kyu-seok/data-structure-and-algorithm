public class TwoDimension {
    public static void main(String[] args) {
        TwoDimension twoDimension = new TwoDimension();
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(twoDimension.sumDiagonal(input));
    }

    public int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        return sum;
    }
}
