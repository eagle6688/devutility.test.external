package devutility.test.external.data.json;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;
import devutility.internal.test.models.Person;

public class JacksonTest extends BaseTest {
	@Override
	public void run() {
		String json = null;

		Person person = new Person();
		person.setName("Eagle");
		person.setAge(30);
		person.setBirthday(new Date());

		try {
			json = serialize(person);
			println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Person person2 = deSerialize(json, Person.class);
			println(person2.getName());
			println(String.valueOf(person2.getAge()));
			println(person2.getBirthday().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private <T> String serialize(T model) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = mapper.writeValueAsString(model);
		return jsonStr;
	}

	private <T> T deSerialize(String value, Class<T> cl) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(value, cl);
	}

	public static void main(String[] args) {
		TestExecutor.run(JacksonTest.class);
	}
}