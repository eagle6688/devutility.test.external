package devutility.test.external.cache.redis.redishelper;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.devutility.test.json.User;

import devutility.internal.test.TestExecutor;
import devutility.test.external.cache.redis.BaseRedisCache;

public class EntitiesSetTest extends BaseRedisCache {
	@Override
	public void run() {
		List<User> list = User.list(100);

		try {
			redisHelper.entitiesSet("Test-Users", list, User.class);
		} catch (IllegalArgumentException | IllegalAccessException | IOException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(EntitiesSetTest.class);
	}
}