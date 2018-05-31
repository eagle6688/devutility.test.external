package devutility.test.external.util.propertiesutils;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Properties;

import com.fasterxml.jackson.core.JsonProcessingException;

import devutility.external.json.JsonUtils;
import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;
import devutility.internal.util.PropertiesUtils;

public class GetPropertiesByDefaultOrderTest extends BaseTest {
	@Override
	public void run() {
		Properties properties;
		try {
			properties = PropertiesUtils.getPropertiesByDefaultOrder("email.properties");
			println(JsonUtils.serialize(properties));
		} catch (FileNotFoundException | URISyntaxException | JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(GetPropertiesByDefaultOrderTest.class);
	}
}