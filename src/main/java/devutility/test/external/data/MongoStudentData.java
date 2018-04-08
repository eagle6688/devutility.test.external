package devutility.test.external.data;

import java.util.ArrayList;
import java.util.List;

import com.devutility.test.entity.mongo.Student;

public class MongoStudentData {
	public static List<Student> list() {
		List<Student> list = new ArrayList<>(100);

		for (int i = 0; i < 100; i++) {
			int number = i + 1;

			Student student = new Student();
			student.setId(number);
			student.setName(String.format("Name_%d", number));
			list.add(student);
		}

		return list;
	}
}