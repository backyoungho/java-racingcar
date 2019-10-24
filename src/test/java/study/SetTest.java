package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
	private Set<Integer> numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	@Test
	void size() {
		assertThat(numbers).hasSize(4);
	}

	@ParameterizedTest
	@ValueSource(ints={1,2,3,4})
	void contains(int num) {
		assertThat(numbers.contains(num)).isTrue();
	}

	@ParameterizedTest
	@CsvSource(value= {"1:true", "4:false", "5:true"}, delimiter = ':')
	void contains2(int num, boolean result) {
		assertThat(numbers.contains(num)).isEqualTo(result);
	}
}