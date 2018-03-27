package devutility.test.external.config;

import org.springframework.data.mongodb.core.MongoTemplate;

import devutility.external.dao.mongodb.MongoDBHelper;
import devutility.internal.dao.DbInstanceHelper;
import devutility.internal.dao.models.DbInstance;

public class DbConfig {
	/**
	 * Configuration for database
	 */
	public static final String CONFIG_NAME = "dbconfig.properties";

	/**
	 * MongoDbHolder
	 */
	private static class MongoDbHolder {
		private static DbInstance dbInstance = DbInstanceHelper.getInstance(CONFIG_NAME, "mongodb");
		public static MongoTemplate mongoTemplate = MongoDBHelper.mongoTemplate(dbInstance);
	}

	/**
	 * mongoDb
	 * @returnMongoTemplate
	 */
	public static MongoTemplate mongoDb() {
		return MongoDbHolder.mongoTemplate;
	}
}