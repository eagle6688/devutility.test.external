package devutility.test.external.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.devutility.test.model.Student;

import devutility.internal.util.RandomHelper;

public class StudentsData {
	public static List<Student> list() {
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
}