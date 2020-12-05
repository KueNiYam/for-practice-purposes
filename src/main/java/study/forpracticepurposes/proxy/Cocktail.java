package study.forpracticepurposes.proxy;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Cocktail {
	private final List<String> tags;
}
