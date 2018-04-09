package devutility.test.external.cache.redis;

import devutility.external.dao.redis.RedisHelper;
import devutility.internal.test.BaseTest;
import devutility.test.external.config.DbConfig;

public abstract class BaseRedisCache extends BaseTest {
	protected RedisHelper redisHelper = DbConfig.redisHelper();
}