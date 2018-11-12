package com.bank.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component 
@Aspect
public class TxnAspect {

	@Before("execution(* *(..))")
	public void begin(JoinPoint joinPoint) {
		System.out.println("before: - "+joinPoint.getSignature().toLongString());
	}

//	@AfterReturning("execution(boolean txr(..))")
//	public void commit() {
//		System.out.println("Txn commit");
//	}
//
//	@AfterThrowing(pointcut = "execution(boolean txr(..))", throwing = "e")
//	public void rollback(Throwable e) {
//		System.out.println("Txn rolback");
//	}
//
//	@After("execution(boolean txr(..))")
//	public void close() {
//		System.out.println("close connection");
//	}

//	@Around(value = "execution(boolean txr(..))")
//	public Object manageTxn(ProceedingJoinPoint proceedingJoinPoint) {
//		Object obj = null;
//		try {
//			System.out.println("Txn begin");
//			obj = proceedingJoinPoint.proceed();
//			System.out.println("Txn commit");
//		} catch (Throwable e) {
//			System.out.println("Txn rolback");
//		} finally {
//			System.out.println("close connection");
//		}
//		return obj;
//	}

}
