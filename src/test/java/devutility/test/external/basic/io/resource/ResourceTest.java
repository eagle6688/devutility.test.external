package devutility.test.external.basic.io.resource;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import devutility.internal.io.DirectoryUtils;
import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class ResourceTest extends BaseTest {
	@Override
	public void run() {
		println("DirectoryUtils.getProjectDirectory(): %s", DirectoryUtils.getProjectDirectory());

		File file = null;
		URL url = this.getClass().getClassLoader().getResource("");

		try {
			println("url.toURI().toString(): %s", url.toURI().toString());

			file = new File(url.toURI());
			println("file.getAbsolutePath(): %s", file.getAbsolutePath());
			println("file.getParent(): %s", file.getParent());
			println("file.exists(): %s", file.exists());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		println("url.getProtocol(): %s", url.getProtocol());
		println("url.getPath(): %s", url.getPath());
		println("url.toString(): %s", url.toString());

		url = this.getClass().getClassLoader().getResource("email.properties");
		println("url.getProtocol(): %s", url.getProtocol());
		println("url.getPath(): %s", url.getPath());
		println("url.toString(): %s", url.toString());

		url = this.getClass().getClassLoader().getResource("system.properties");
		println("url.getProtocol(): %s", url.getProtocol());
		println("url.getPath(): %s", url.getPath());
		println("url.toString(): %s", url.toString());
	}

	public static void main(String[] args) {
		TestExecutor.run(ResourceTest.class);
	}
}