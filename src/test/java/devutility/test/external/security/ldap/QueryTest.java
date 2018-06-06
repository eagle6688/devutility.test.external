package devutility.test.external.security.ldap;

import com.fasterxml.jackson.core.JsonProcessingException;

import devutility.external.json.JsonUtils;
import devutility.internal.security.ldap.LdapAccount;
import devutility.internal.security.ldap.LdapUtils;
import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;

public class QueryTest extends BaseTest {
	@Override
	public void run() {
		String loginName = "";
		String password = "";
		String host = "";
		LdapAccount result = LdapUtils.getLdapAccount(loginName, password, host);

		try {
			println(JsonUtils.serialize(result));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestExecutor.run(QueryTest.class);
	}
}