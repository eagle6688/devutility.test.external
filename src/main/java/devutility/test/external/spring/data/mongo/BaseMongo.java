package devutility.test.external.spring.data.mongo;

import org.springframework.data.mongodb.core.MongoOperations;

import devutility.internal.test.BaseTest;
import devutility.test.external.config.DbConfig;

public abstract class BaseMongo extends BaseTest {
	protected MongoOperations mongoOperations;

	public BaseMongo() {
		mongoOperations = DbConfig.mongoDb();
	}
}