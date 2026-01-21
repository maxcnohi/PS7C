public class BigIntArrayAdder {

    public static int[] add(int[] a, int[] b) {
        int maxLength = Math.max(a.length, b.length);
        int[] result = new int[maxLength + 1];
        int carry = 0;
        int i = a.length - 1;
        int j = b.length - 1;
        int k = result.length - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = i >= 0 ? a[i] : 0;
            int digitB = j >= 0 ? b[j] : 0;
            int sum = digitA + digitB + carry;
            result[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }

        if (result[0] == 0) {
            int[] trimmed = new int[result.length - 1];
            for (int m = 1; m < result.length; m++) {
                trimmed[m - 1]=result[m];
            }
            return trimmed;
        }

        return result;
    }

}
