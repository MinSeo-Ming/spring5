package chap07.src.main.java.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class CacheAspect {
    private Map<Long, Object> cache = new HashMap<>();

    @Pointcut("execution(public * java.chap07.src.main.java.src..*(long))")
    public void  cacheTarget() {
    }

    @Around("cacheTarget()")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        Long num = (Long)joinPoint.getArgs()[0];
        System.out.println("test");
        if (this.cache.containsKey(num)) {
            System.out.printf("CacheAspect: Cache에서 구함[%d]\n", num);
            return this.cache.get(num);
        } else {
            Object result = joinPoint.proceed();
            this.cache.put(num, result);
            System.out.printf("CacheAspect: Cache에 추가[%d]\n", num);
            return result;
        }
    }
}
