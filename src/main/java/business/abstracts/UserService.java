package business.abstracts;

import java.util.List;

import org.apache.catalina.User;

import core.utilities.results.DataResult;
import core.utilities.results.Result;

public interface UserService {
	DataResult<List<User>> getAll();
	DataResult<User> getByEmail(String email);
	Result add(User user);
	Result verifyUser(String email,String verificationCode);
}
