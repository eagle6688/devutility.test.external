package devutility.test.external.data.json;

import java.io.IOException;
import java.util.Map;

import devutility.external.data.json.JsonHelper;
import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class MapTest extends BaseTest {
	@Override
	public void run() {
		try {
			@SuppressWarnings("unchecked")
			Map<String, String> map = JsonHelper.deserialize("{\"asd\":\"qwe\"}", Map.class);
			println(map.getClass().getName());
			println(JsonHelper.serialize(map));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(MapTest.class);
	}
}