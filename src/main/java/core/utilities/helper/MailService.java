package core.utilities.helper;

import core.utilities.results.Result;

public interface MailService {
	Result send(String to, String title, String message);
}
