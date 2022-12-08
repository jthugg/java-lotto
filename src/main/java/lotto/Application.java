package lotto;

import lotto.controllers.ProgramController;

public class Application {

	public static void main(String[] args) {
		ProgramController programController = new ProgramController();
		try {
			programController.runProgram();
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
		}
	}
}
