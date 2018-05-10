package devutility.test.external.basic.util.stream;

import java.util.List;

import com.devutility.test.model.NormalModel;
import com.fasterxml.jackson.core.JsonProcessingException;

import devutility.external.json.JsonUtils;
import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;
import devutility.internal.util.CollectionUtils;

public class ReferenceTest extends BaseTest {
	@Override
	public void run() {
		List<NormalModel> list = NormalModel.list(2);
		NormalModel normalModel = CollectionUtils.find(list, i -> "name_0".equals(i.getName()));
		normalModel.setName("asd");
		normalModel.getReferencedModel().setName("referenced_asd");

		try {
			println(JsonUtils.serialize(list));
			println(JsonUtils.serialize(normalModel));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(ReferenceTest.class);
	}
}