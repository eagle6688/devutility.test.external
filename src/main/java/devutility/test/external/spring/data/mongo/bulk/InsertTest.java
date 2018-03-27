package devutility.test.external.spring.data.mongo.bulk;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.BulkOperations;
import org.springframework.data.mongodb.core.BulkOperations.BulkMode;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.devutility.test.model.Student;
import com.mongodb.bulk.BulkWriteResult;

import devutility.internal.test.TestExecutor;
import devutility.internal.util.RandomHelper;
import devutility.test.external.spring.data.mongo.BaseMongo;

public class InsertTest extends BaseMongo {
	@Override
	public void run() {
		List<Student> list = list();
		BulkOperations bulkOperations = mongoOperations.bulkOps(BulkMode.UNORDERED, "Student");

		for (Student item : list) {
			Query query = new Query();
			query.addCriteria(Criteria.where("Number").is(item.getNumber()));

			Update update = new Update();
			update.set("_id", item.getNumber());
			update.set("Number", item.getNumber());
			update.set("Name", item.getName());
			update.set("Age", item.getAge());
			update.set("Birthday", item.getBirthday());

			bulkOperations.upsert(query, update);
		}

		BulkWriteResult bulkWriteResult = bulkOperations.execute();
		println(bulkWriteResult.getInsertedCount());
		println(bulkWriteResult.getModifiedCount());
		println(bulkWriteResult.getMatchedCount());
		println(bulkWriteResult.getUpserts().size());
		System.out.println(bulkWriteResult);
	}

	private List<Student> list() {
		List<Student> list = new ArrayList<>(100);

		for (int i = 0; i < 100; i++) {
			int number = i + 1;

			Student student = new Student();
			student.setAge(RandomHelper.getNumber(20));
			student.setBirthday(new Date());
			student.setLocal(true);
			student.setName(String.format("Name_%d", number));
			student.setNumber(String.valueOf(number));
			list.add(student);
		}

		return list;
	}

	public static void main(String[] args) {
		TestExecutor.run(InsertTest.class);
	}
}