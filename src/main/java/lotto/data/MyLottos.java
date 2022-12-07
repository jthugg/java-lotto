package lotto.data;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class MyLottos {

	private List<List<Integer>> myNumbers;

	public MyLottos() {
		myNumbers = new ArrayList<>();
	}

	public void purchase(int purchaseAmount) {
		for(int count = 0; count < purchaseAmount; count++) {
			myNumbers.add(Randoms.pickUniqueNumbersInRange(1, 45, 6));
		}
	}
}
