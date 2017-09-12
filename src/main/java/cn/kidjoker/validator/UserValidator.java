package cn.kidjoker.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import cn.kidjoker.model.User;

@Component
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> class1) {
		return class1.isAssignableFrom(User.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		User user = (User) obj;
		if(user.getUserName().length() < 8) {
			errors.rejectValue("userName", "valid.userNameLen", new Object[]{"用户名不能少于8位"}, null);
		}
	}

}
