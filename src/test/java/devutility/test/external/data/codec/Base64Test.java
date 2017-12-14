package devutility.test.external.data.codec;

import org.apache.commons.codec.binary.Base64;

import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class Base64Test extends BaseTest {
	@Override
	public void run() {
		String value = "Hellp World!Hello World!";
		byte[] bytes = value.getBytes();
		byte[] base64Bytes = Base64.encodeBase64(bytes);
		String base64String = new String(base64Bytes);
		println(base64String);
	}

	public static void main(String[] args) {
		TestExecutor.run(Base64Test.class);
	}
}