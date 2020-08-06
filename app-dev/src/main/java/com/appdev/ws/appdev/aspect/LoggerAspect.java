package com.appdev.ws.appdev.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LoggerAspect {
	private Logger logger= LogManager.getLogger(LoggerAspect.class);
	 
	@Pointcut("execution(* com.appdev.ws.appdev.*.*.*(..))")
	private void generalPointcut(){
		
	}
	
	@Before("generalPointcut()")
	public void infoLog(JoinPoint joinPoint){
		
		logger.info(joinPoint.getTarget().getClass().getSimpleName()+" : "+joinPoint.getSignature().getName());
	}

}
