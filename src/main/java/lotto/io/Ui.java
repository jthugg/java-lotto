package lotto.io;

public enum Ui {

	PURCHASE_AMOUNT_REQUEST("구입금액을 입력해 주세요."),
	PURCHASE_RESULT("개를 구매했습니다."),
	WINNING_NUMBER_REQUEST("당첨 번호를 입력해 주세요."),
	BONUS_NUMBER_REQUEST("보너스 번호를 입력해 주세요."),
	RESULT_HEADER("당첨 통계\n---"),
	FIFTH("3개 일치 (5,000원) - "),
	FOURTH("4개 일치 (50,000원) - "),
	THIRD("5개 일치 (1,500,000원) - "),
	SECOND("5개 일치, 보너스 볼 일치 (30,000,000원) - "),
	WIN("6개 일치 (2,000,000,000원) - "),
	COUNTER("개"),
	PORTFOLIO_HEADER("총 수익률은 "),
	PORTFOLIO_FOOTER("%입니다.");

	private String value;

	Ui(String value) {
		this.value = value;
	}

	public static void printPurchaseAmountRequest() {
		System.out.println(PURCHASE_AMOUNT_REQUEST.value);
	}
}
