package com.qfmyy.aspcetj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @describe :
 * @Date : 2016年10月20日 下午10:31:06
 * @Author : Ding
 */

@Component
@Aspect
public class LogAspcetj {
	@Pointcut("within(@org.springframework.stereotype.Controller *)")
	public void cutController() {

	}

	@Before(value = "cutController()")
	public void doAccessCheck() {
		System.out.println("前置通知");
	}

	@After(value = "cutController()")
	public void after() {
		System.out.println("最终通知");
	}

	@AfterReturning(value = "cutController()")
	public void doAfter() {
		System.out.println("后置通知");
	}

	@AfterThrowing(value = "cutController()")
	public void doAfterThrow() {
		System.out.println("例外通知");
	}

	@Around(value = "cutController()")
	public Object doBasicProfiling(ProceedingJoinPoint point) throws Throwable {

		System.out.println("进入环绕通知");
		Object result = point.proceed();
		System.out.println("退出方法");

		return result;
	}
}
