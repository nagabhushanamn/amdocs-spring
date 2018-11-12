package com.bank;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.bank.service.TxrServiceImpl;

public class BPP implements BeanPostProcessor {

	private static Logger logger = Logger.getLogger("bank");

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		logger.info("BPP : before init " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		logger.info("BPP : after init " + beanName);
		if (beanName.equals("txrService")) {
			TxrServiceImpl txrService = (TxrServiceImpl) bean;
			if (txrService.getTxrType() == null)
				throw new BeanInitializationException("txrType missing on " + beanName);
		}
		return bean;
	}

}
