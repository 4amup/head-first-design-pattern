package headfirst.proxy.protect;

import java.lang.reflect.*;

public interface InvocationHandler {
	Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException;
}
