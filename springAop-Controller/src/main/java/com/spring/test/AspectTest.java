package com.spring.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @describe :
 * @Date : 2016年10月21日 上午1:49:04
 * @Author : Ding
 */
public class AspectTest {

	public void before(JoinPoint joinPoint) {
		System.out.println("log Begining method: " + joinPoint.getTarget().getClass().getName() + "."
				+ joinPoint.getSignature().getName());
	}

	public void after(JoinPoint joinPoint) {
		System.out.println("log Ending method: " + joinPoint.getTarget().getClass().getName() + "."
				+ joinPoint.getSignature().getName());
	}

	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("进入环绕模式!");
		Object retVal = pjp.proceed();
		System.out.println("退出环绕模式!");
		return retVal;
	}

	public void throwing(JoinPoint point, Throwable ex) {
		System.out.println("method " + point.getTarget().getClass().getName() + "." + point.getSignature().getName()
				+ " throw exception");
		System.out.println(ex.getMessage());
	}

}
