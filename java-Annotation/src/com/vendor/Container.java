package com.vendor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Container {

	public void processAnyRequest(String incommingUrl) {

		// ...
		try {
			Class<?> clazz = Class.forName("com.app.components.UserController");
			Object userController = clazz.newInstance();
			// using Reflection API
			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				RequestMapping rm = method.getAnnotation(RequestMapping.class);
				String givenUrl = rm.url();
				RequestMethod givenMethod = rm.method();
				if (incommingUrl.equals(givenUrl)) {
					method.invoke(userController, new Object[] {});
					return;
				}

			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
