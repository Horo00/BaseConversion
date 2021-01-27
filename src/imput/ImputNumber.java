package imput;

import java.math.BigDecimal;
import java.util.Scanner;

public class ImputNumber {
	public static BigDecimal getDecimal() {
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextBigDecimal()) {
			return scanner.nextBigDecimal();
		} else {
			System.out.println("無効な数字です");
			return getDecimal();
		}
	}
}
