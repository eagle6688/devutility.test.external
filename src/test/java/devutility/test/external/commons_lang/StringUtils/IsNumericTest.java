package devutility.test.external.commons_lang.StringUtils;

import org.apache.commons.lang3.StringUtils;

import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class IsNumericTest extends BaseTest {
	String value;

	public IsNumericTest(String value) {
		this.value = value;
	}

	@Override
	public void run() {
		if (StringUtils.isNumeric(value)) {
			println(String.format("\"%s\" is numeric!", value));
		} else {
			println(String.format("\"%s\" is not numeric!", value));
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(new IsNumericTest("asd"));
		TestExecutor.run(new IsNumericTest("123"));
	}
}