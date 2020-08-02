package headfirst.proxy.protect;

import java.lang.reflect.*;

public class NonOwnerinvocationHandler implements InvocationHandler {
	PersonBean person;

	public NonOwnerinvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				return method.invoke(person, args);
			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
