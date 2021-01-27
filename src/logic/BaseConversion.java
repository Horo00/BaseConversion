package logic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseConversion {
	public static BigDecimal change(BigDecimal prototypeNumber, BigDecimal modNumber) {
		//変更後が何桁になるか計算
		int digits = getDigits(prototypeNumber, modNumber);

		//元の値をX進数表記に変更する
		BigDecimal changedNumber = getChangedNumber(prototypeNumber,modNumber,digits);

		return changedNumber;
	}

	private static BigDecimal getChangedNumber(BigDecimal prototypeNumber, BigDecimal modNumber, int digits) {

		return null;
	}

	private static int getDigits(BigDecimal prototypeNumber, BigDecimal modNumber) {
		//桁数の仮変数。最低保証の1で初期化
		int count = 1;
		while (true) {
			//変更したい値がX進数のXよりも小さくなった時点でループを抜ける
			if (prototypeNumber.compareTo(modNumber) == -1)
				break;

			//元の値をmodNumberで割り（小数点以下切り捨て）、商を再代入とcountのインクリメント。
			prototypeNumber = prototypeNumber.divide(modNumber, 0, RoundingMode.HALF_EVEN);
			count++;
		}

		return count;
	}
}
