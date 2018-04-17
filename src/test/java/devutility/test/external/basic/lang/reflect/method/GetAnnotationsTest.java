package devutility.test.external.basic.lang.reflect.method;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

import com.devutility.test.json.User;

import devutility.internal.lang.ClassHelper;
import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class GetAnnotationsTest extends BaseTest {
	@Override
	public void run() {
		List<Method> declaredMethods = ClassHelper.getAllDeclaredMethods(User.class);

		for (Method method : declaredMethods) {
			Annotation[] annotations = method.getAnnotations();

			for (Annotation annotation : annotations) {
				println(String.format("%s annotation type name: %s", method.getName(), annotation.annotationType().getName()));
			}
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(GetAnnotationsTest.class);
	}
}