package devutility.test.external.util.propertiesutils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Properties;

import devutility.external.json.JsonUtils;
import devutility.internal.io.ResourcesUtils;
import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;
import devutility.internal.util.PropertiesUtils;

public class GetPropertiesByDefaultOrderTest extends BaseTest {
	@Override
	public void run() {
		Properties properties;

		try {
			InputStream inputStream = ResourcesUtils.getInputStream("email.properties");
			properties = PropertiesUtils.getProperties(inputStream);
			println(JsonUtils.serialize(properties));
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(GetPropertiesByDefaultOrderTest.class);
	}
}