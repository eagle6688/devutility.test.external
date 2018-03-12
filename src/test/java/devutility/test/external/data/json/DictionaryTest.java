package devutility.test.external.data.json;

import java.util.Dictionary;
import java.util.Hashtable;

import com.fasterxml.jackson.core.JsonProcessingException;

import devutility.external.data.json.JsonHelper;
import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class DictionaryTest extends BaseTest {
	@Override
	public void run() {
		Dictionary<String, String> dictionary = new Hashtable<String, String>();
		dictionary.put("asd", "123");
		dictionary.put("qwe", "456");

		try {
			println(JsonHelper.serialize(dictionary));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(DictionaryTest.class);
	}
}