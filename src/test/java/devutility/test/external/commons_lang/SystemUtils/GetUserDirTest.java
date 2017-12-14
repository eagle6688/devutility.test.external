package devutility.test.external.commons_lang.SystemUtils;

import java.io.File;

import org.apache.commons.lang3.SystemUtils;

import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class GetUserDirTest extends BaseTest {
	@Override
	public void run() {
		File file = SystemUtils.getUserDir();
		println(file.getPath());
	}

	public static void main(String[] args) {
		TestExecutor.run(GetUserDirTest.class);
	}
}