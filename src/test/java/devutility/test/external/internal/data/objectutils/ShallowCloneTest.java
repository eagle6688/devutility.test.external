package devutility.test.external.internal.data.objectutils;

import com.devutility.test.model.NormalModel;
import com.devutility.test.model.ReferencedModel;
import com.fasterxml.jackson.core.JsonProcessingException;

import devutility.external.json.JsonUtils;
import devutility.internal.data.BeanUtils;
import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class ShallowCloneTest extends BaseTest {
	@Override
	public void run() {
		NormalModel normalModel1 = NormalModel.list(1).get(0);

		try {
			NormalModel normalModel2 = BeanUtils.shallowClone(normalModel1, NormalModel.class, NormalModel.class);
			println(JsonUtils.serialize(normalModel2));
		} catch (ReflectiveOperationException | JsonProcessingException e) {
			e.printStackTrace();
		}

		ReferencedModel referencedModel = normalModel1.getReferencedModel();

		try {
			NormalModel normalModel3 = BeanUtils.shallowClone(referencedModel, ReferencedModel.class, NormalModel.class);
			println(JsonUtils.serialize(normalModel3));
		} catch (ReflectiveOperationException | JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(ShallowCloneTest.class);
	}
}