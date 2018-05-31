package devutility.test.external.io.directoryutils;

import java.net.URISyntaxException;

import devutility.internal.io.DirectoryUtils;
import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class GetResourcePathByDefaultOrderTest extends BaseTest {
	@Override
	public void run() {
		try {
			String path = DirectoryUtils.getResourcePathByDefaultOrder("email.properties");
			println(path);

			path = DirectoryUtils.getResourcePathByDefaultOrder("system.properties");
			println(path);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(GetResourcePathByDefaultOrderTest.class);
	}
}