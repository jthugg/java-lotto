package lotto.data;

import java.util.ArrayList;
import java.util.List;

public class Portfolios {

	private List<Integer> portfolios = new ArrayList<>();

	public Portfolios() {
		for (int count = 0; count < 5; count++) {
			portfolios.add(0);
		}
	}

	public void compare(List<List<Integer>> myLottos, List<Integer> lottos, int bonusNumber) {
		for (List<Integer> myNumbers : myLottos) {
			int matches = checkMatches(myNumbers, lottos);
			isMoreThan3(matches);
			checkSecond(matches, myNumbers, bonusNumber);
		}
		alignPortfolios();
	}

	private int checkMatches(List<Integer> myNumbers, List<Integer> lottos) {
		int match = 0;
		for (int myNumber : myNumbers) {
			if (lottos.contains(myNumber)) {
				match++;
			}
		}
		return match;
	}

	private void isMoreThan3(int matches) {
		if (matches >= 3) {
			portfolios.set(matches - 3, portfolios.get(matches - 3) + 1);
		}
	}

	private void checkSecond(int matches, List<Integer> myNumbers, int bonusNumber) {
		if (matches == 5 && myNumbers.contains(bonusNumber)) {
			portfolios.set(matches - 3, portfolios.get(matches - 3) - 1);
			portfolios.set(4, portfolios.get(4) + 1);
		}
	}

	private void alignPortfolios() {
		int winner = portfolios.get(3);
		portfolios.remove(3);
		portfolios.add(winner);
	}

	public List<Integer> getPortfolios() {
		return portfolios;
	}
}
