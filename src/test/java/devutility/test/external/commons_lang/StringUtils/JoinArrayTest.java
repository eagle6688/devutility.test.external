package devutility.test.external.commons_lang.StringUtils;

import org.apache.commons.lang3.StringUtils;

import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class JoinArrayTest extends BaseTest {
	@Override
	public void run() {
		String[] array = { "1", "2" };
		String str = StringUtils.join(array, ",");
		println(str);
	}

	public static void main(String[] args) {
		TestExecutor.run(JoinArrayTest.class);
	}
}