package lotto.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public enum Validator {

	IS_NUMBERS_REGEX("^\\d{4,6}$"),
	MIN_PURCHASE_PRICE(1000),
	MAX_PURCHASE_PRICE(100000),
	ZERO(0),
	WINNING_NUMBERS_LENGTH(6),
	MIN_LOTTO_NUMBER(1),
	MAX_LOTTO_NUMBER(45);

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
			throw new IllegalArgumentException(ErrorMessages.PURCHASE_PRICE_ERROR);
		}
		return validateRange(Integer.parseInt(userInput));
	}

	private static int validateRange(int userInput) {
		if(userInput > MAX_PURCHASE_PRICE.numbers ||
				userInput < MAX_PURCHASE_PRICE.numbers ||
				userInput % MIN_PURCHASE_PRICE.numbers != ZERO.numbers) {
			throw new IllegalArgumentException(ErrorMessages.PURCHASE_PRICE_ERROR);
		}
		return userInput / MIN_PURCHASE_PRICE.numbers;
	}

	public static List<Integer> validateWinningNumbers(List<String> winningNumbers) {
		try {
			return checkLength(winningNumbers.stream()
					.map(index -> Integer.parseInt(index))
					.collect(Collectors.toList()));
		} catch (NumberFormatException exception) {
			throw new IllegalArgumentException();
		}
	}

	private static List<Integer> checkLength(List<Integer> winningNumbers) {
		if(winningNumbers.size() != WINNING_NUMBERS_LENGTH.numbers) {
			throw new IllegalArgumentException();
		}
		return checkEachNumber(winningNumbers);
	}

	private static List<Integer> checkEachNumber(List<Integer> winningNumbers) {
		for(int number : winningNumbers) {
			if(number > MAX_LOTTO_NUMBER.numbers || number < MIN_LOTTO_NUMBER.numbers) {
				throw new IllegalArgumentException();
			}
		}
		return checkDuplication(winningNumbers);
	}

	private static List<Integer> checkDuplication(List<Integer> winningNumbers) {
		Set<Integer> numbers = new TreeSet<>(winningNumbers);
		if(numbers.size() != WINNING_NUMBERS_LENGTH.numbers) {
			throw new IllegalArgumentException();
		}
		return new ArrayList<>(numbers);
	}
}
