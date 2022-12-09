package lotto.data;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyLottos {

	private List<List<Integer>> myNumbers;

	public MyLottos() {
		myNumbers = new ArrayList<>();
	}

	public void purchase(int purchaseAmount) {
		for(int count = 0; count < purchaseAmount; count++) {
			List<Integer> generatedNumbers =
					sortNumbers(Randoms.pickUniqueNumbersInRange(1, 45, 6));
			myNumbers.add(generatedNumbers);
		}
	}

	private List<Integer> sortNumbers(List<Integer> generatedNumbers) {
		List<Integer> numbers = new ArrayList<>(generatedNumbers);
		Collections.sort(numbers);
		return numbers;
	}

	public List<List<Integer>> getMyLottos() {
		return myNumbers;
	}
}
