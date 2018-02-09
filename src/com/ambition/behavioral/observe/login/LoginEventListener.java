package com.ambition.behavioral.observe.login;

import java.util.EventListener;

public interface LoginEventListener extends EventListener{
	void validateLogin(LoginEvent event);
}
