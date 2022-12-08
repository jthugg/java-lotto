package lotto.io;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import lotto.utils.Validator;

public class UserInput {

	public static int requestPurchaseAmount() {
		return Validator.validateIsNumbers(Console.readLine());
	}

	public static List<Integer> requestWinningNumbers() {
		return Validator.validateWinningNumbers(Arrays.asList(Console.readLine().split(",")));
	}
}
