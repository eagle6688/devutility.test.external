package devutility.test.external.config;

import devutility.external.dao.redis.RedisHelper;
import devutility.internal.dao.RedisInstanceHelper;
import devutility.internal.dao.models.RedisInstance;

public class DbConfig {
	/**
	 * Configuration for database
	 */
	public static final String CONFIG_NAME = "dbconfig.properties";

	private static class RedisHolder {
		private static RedisInstance redisInstance = RedisInstanceHelper.getInstance(CONFIG_NAME, "redis");
		public static RedisHelper redisHelper = new RedisHelper(redisInstance);
	}

	public static RedisHelper redisHelper() {
		return RedisHolder.redisHelper;
	}
}