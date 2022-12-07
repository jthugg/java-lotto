package lotto.utils;

import java.util.regex.Pattern;

public enum Validator {

	IS_NUMBERS_REGEX("^\\d{4,6}$"),
	INVALID_NUMBERS("[ERROR] 1,000 ~ 100,000 사이 1,000원 단위의 숫자만 입력 가능합니다."),
	MIN_PURCHASE_PRICE(1000),
	MAX_PURCHASE_PRICE(100000),
	ZERO(0);

	private String value;

	Validator(String value) {
		this.value = value;
	}

	private int numbers;

	Validator(int numbers) {
		this.numbers = numbers;
	}

	public static int validateIsNumbers(String userInput) {
		if(!Pattern.matches(IS_NUMBERS_REGEX.value, userInput)) {
			throw new IllegalArgumentException(INVALID_NUMBERS.value);
		}
		return validateRange(Integer.parseInt(userInput));
	}

	private static int validateRange(int userInput) {
		if(userInput > MAX_PURCHASE_PRICE.numbers ||
				userInput < MAX_PURCHASE_PRICE.numbers ||
				userInput % MIN_PURCHASE_PRICE.numbers != ZERO.numbers) {
			throw new IllegalArgumentException(INVALID_NUMBERS.value);
		}
		return userInput / MIN_PURCHASE_PRICE.numbers;
	}
}
