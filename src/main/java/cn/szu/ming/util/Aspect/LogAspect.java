package cn.szu.ming.util.Aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LogAspect {
    private static Logger logger = Logger.getLogger(LogAspect.class.getName());

    @AfterReturning(value = "execution(public * cn.szu.ming.controller.htownController.*(..))")
    public void logAfterLogin(JoinPoint joinPoint){
        System.out.println(111);
        logger.error("username:"+joinPoint.getArgs()[0]);
    }

}
