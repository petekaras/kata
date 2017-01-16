package codewars;

/**
 * Created by peter on 1/16/17.
 *
 */

public class Persist{
    static int count = 0;

    public static int persistence(long m) {
        count =0;
        return doWork(m);
    }

    private static int doWork(long m){
        int[] digits = Long.toString(m).chars().map(c -> c -= '0').toArray();
        if (digits.length > 1) {
            count++;
            long sum = 0;
            for (int i = 0; i < digits.length; i++) {
                if (i == 0) {
                    sum = digits[i];
                } else {
                    sum = sum * digits[i];
                }
            }
            doWork(sum);
        }
        return count;
    }

}
