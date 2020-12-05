package study.forpracticepurposes.proxy;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class LazyListTest {

	@Test
	void get() {
		Cocktail cocktail = new Cocktail(new LazyList<>(Arrays.asList("a", "b", "c")));

		List<String> tags = cocktail.getTags();
		System.out.println(tags);

		for (int i = 0; i < 3; i++) {
			System.out.println(tags.get(i));
		}
	}
}