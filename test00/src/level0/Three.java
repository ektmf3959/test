package level0;

import java.util.Arrays;

public class Three {
	public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
