package devutility.test.external.spring.data.mongo.bulkoperationshelper;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.devutility.test.entity.mongo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.bulk.BulkWriteResult;

import devutility.external.dao.mongodb.BulkOperationsHelper;
import devutility.external.data.json.JsonHelper;
import devutility.internal.test.TestExecutor;
import devutility.test.external.data.MongoStudentData;
import devutility.test.external.spring.data.mongo.BaseMongo;

public class SaveTest extends BaseMongo {
	@Override
	public void run() {
		List<Student> list = MongoStudentData.list();
		BulkOperationsHelper bulkOperationsHelper = new BulkOperationsHelper(mongoOperations);

		try {
			BulkWriteResult result = bulkOperationsHelper.save(list, Student.class);
			println(JsonHelper.serialize(result));
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(SaveTest.class);
	}
}