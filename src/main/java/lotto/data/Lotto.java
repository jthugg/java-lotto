package lotto.data;

import java.util.List;

public class Lotto {

	private final List<Integer> numbers;

	public Lotto(List<Integer> numbers) {
		validate(numbers);
		this.numbers = numbers;
	}

	private void validate(List<Integer> numbers) {
		if (numbers.size() != 7) {
			throw new IllegalArgumentException();
		}
	}

	public List<Integer> getLottos() {
		return numbers.subList(0, 6);
	}

	public int getBonusNumber() {
		return numbers.get(6);
	}

	// TODO: 추가 기능 구현
}
