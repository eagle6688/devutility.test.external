package devutility.test.external.data.codec;

import org.apache.commons.codec.binary.Base64;

import devutility.internal.test.BaseService;
import devutility.internal.test.ServiceExecutor;

public class Base64Test extends BaseService {
	@Override
	public void run() {
		String value = "Hellp World!Hello World!";
		byte[] bytes = value.getBytes();
		byte[] base64Bytes = Base64.encodeBase64(bytes);
		String base64String = new String(base64Bytes);
		println(base64String);
	}

	public static void main(String[] args) {
		ServiceExecutor.run(Base64Test.class);
	}
}