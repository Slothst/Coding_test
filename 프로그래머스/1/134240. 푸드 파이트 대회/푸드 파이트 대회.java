import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            if (food[i] == 1) {
                continue;
            }
            sb.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
        }
        String answer = sb + "0";
        return answer + sb.reverse();
    }
}