package lotto.controllers;

import lotto.data.MyLottos;
import lotto.data.WinningNumbers;
import lotto.io.Ui;
import lotto.io.UserInput;

public class ProgramController {

	MyLottos myLottos = new MyLottos();
	WinningNumbers winningNumbers = new WinningNumbers();

	public void runProgram() {
		requestPurchaseAmount();
		purchaseLottos();
		printMyLottos();
		requestWinningNumbers();
		requestBonusNumber();
		printResult();
	}

	private void requestPurchaseAmount() {
		Ui.printPurchaseAmountRequest();
		myLottos.purchase(UserInput.requestPurchaseAmount());
	}

	private void purchaseLottos() {

	}

	private void printMyLottos() {

	}

	private void requestWinningNumbers() {

	}

	private void requestBonusNumber() {

	}

	private void printResult() {

	}
}
