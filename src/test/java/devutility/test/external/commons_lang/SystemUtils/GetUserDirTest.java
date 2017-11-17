package devutility.test.external.commons_lang.SystemUtils;

import java.io.File;

import org.apache.commons.lang3.SystemUtils;

import devutility.internal.test.BaseService;
import devutility.internal.test.ServiceExecutor;

public class GetUserDirTest extends BaseService {
	@Override
	public void run() {
		File file = SystemUtils.getUserDir();
		println(file.getPath());
	}

	public static void main(String[] args) {
		ServiceExecutor.run(GetUserDirTest.class);
	}
}