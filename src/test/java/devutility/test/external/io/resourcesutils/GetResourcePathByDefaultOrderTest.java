package devutility.test.external.io.resourcesutils;

import java.net.URISyntaxException;

import devutility.internal.io.ResourcesUtils;
import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class GetResourcePathByDefaultOrderTest extends BaseTest {
	@Override
	public void run() {
		try {
			String path = ResourcesUtils.getPathByDefaultOrder("email.properties");
			println(path);

			path = ResourcesUtils.getPathByDefaultOrder("system.properties");
			println(path);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(GetResourcePathByDefaultOrderTest.class);
	}
}