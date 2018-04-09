package devutility.test.external.cache.redis.redishelper;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import devutility.external.data.json.JsonHelper;
import devutility.external.test.model.User;
import devutility.internal.test.TestExecutor;
import devutility.test.external.cache.redis.BaseRedisCache;

public class EntitiesGetTest extends BaseRedisCache {
	@Override
	public void run() {
		try {
			List<User> list = redisHelper.entitiesGet("Test-Users", User.class);
			println(JsonHelper.serialize(list));
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(EntitiesGetTest.class);
	}
}