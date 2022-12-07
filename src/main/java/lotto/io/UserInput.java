package lotto.io;

import camp.nextstep.edu.missionutils.Console;
import lotto.utils.Validator;

public class UserInput {

	public static int requestPurchaseAmount() {
		return Validator.validateIsNumbers(Console.readLine());
	}
}
