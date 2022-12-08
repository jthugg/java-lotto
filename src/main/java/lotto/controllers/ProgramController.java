package lotto.controllers;

import java.util.List;
import lotto.data.Lotto;
import lotto.data.MyLottos;
import lotto.io.Ui;
import lotto.io.UserInput;

public class ProgramController {

	MyLottos myLottos = new MyLottos();
	Lotto lotto;

	public void runProgram() {
		requestPurchaseAmount();
		printMyLottos();
		requestWinningNumbers();
		printResult();
	}

	private void requestPurchaseAmount() {
		Ui.printPurchaseAmountRequest();
		purchaseLottos(UserInput.requestPurchaseAmount());
	}

	private void purchaseLottos(int purchaseAmount) {
		myLottos.purchase(purchaseAmount);
	}

	private void printMyLottos() {
		Ui.printPurchaseResult(myLottos.getMyLottos());
	}

	private void requestWinningNumbers() {
		Ui.printWinningNumberRequest();
		requestBonusNumber(UserInput.requestWinningNumbers());
	}

	private void requestBonusNumber(List<Integer> winningNumbers) {
		Ui.printBonusNumberRequest();
		winningNumbers.add(UserInput.requestBonusNumber(winningNumbers));
		lotto = new Lotto(winningNumbers);
	}

	private void printResult() {

	}
}
