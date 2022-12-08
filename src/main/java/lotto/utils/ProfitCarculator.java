package lotto.utils;

import java.util.List;

public class ProfitCarculator {

	public static double getProfits(List<Integer> portfolios, int investedMoney) {
		return (double) (portfolios.get(0) * 5000 +
				portfolios.get(1) * 50000 +
				portfolios.get(2) * 1500000 +
				portfolios.get(3) * 30000000 +
				portfolios.get(4) * 2000000000) * 100 / investedMoney;
	}
}
