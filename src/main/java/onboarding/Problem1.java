package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int pobiNum = numCalculator(pobi);
        int crongNum = numCalculator(crong);
        if (exceptionHandler(pobi) || exceptionHandler(crong)) {
            return -1;
        } else if (pobiNum > crongNum) {
            return 1;
        } else if (crongNum > pobiNum) {
            return 2;
        } else {
            return 0;
        }
    }

    public static boolean exceptionHandler(List<Integer> pageList) {
        int left = pageList.get(0);
        int right = pageList.get(1);
        return ((left + 1 != right) || (left == 1) || (right == 400));
    }

    public static int numCalculator(List<Integer> pageList) {
        int n = Integer.parseInt(pageList.get(0) + Integer.toString(pageList.get(1)));
        int sum = 0;
        int product = 1;
        while (true) {
            sum += (n % 10);
            product *= (n % 10);
            if (n < 10) {
                break;
            }
            n /= 10;
        }
        return Math.max(sum, product);
    }
}