package devutility.test.external.commons_lang.StringUtils;

import org.apache.commons.lang3.StringUtils;

import devutility.internal.test.BaseService;
import devutility.internal.test.ServiceExecutor;

public class JoinArrayTest extends BaseService {
	@Override
	public void run() {
		String[] array = { "1", "2" };
		String str = StringUtils.join(array, ",");
		println(str);
	}

	public static void main(String[] args) {
		ServiceExecutor.run(JoinArrayTest.class);
	}
}