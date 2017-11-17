package devutility.test.external.commons_lang.StringUtils;

import org.apache.commons.lang3.StringUtils;

import devutility.internal.test.BaseService;
import devutility.internal.test.ServiceExecutor;

public class IsNumericTest extends BaseService {
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
		ServiceExecutor.run(new IsNumericTest("asd"));
		ServiceExecutor.run(new IsNumericTest("123"));
	}
}