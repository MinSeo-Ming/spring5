package chap07.src.main.java.config;

import chap07.src.main.java.aspect.CacheAspect;
import chap07.src.main.java.aspect.ExeTimeAspect;
import chap07.src.main.java.src.Calculator;
import chap07.src.main.java.src.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
public class AppCtxWithCache {
    public AppCtxWithCache() {
    }

    @Bean
    public CacheAspect cacheAspect() {
        return new CacheAspect();
    }

    @Bean
    public ExeTimeAspect exeTimeAspect() {
        return new ExeTimeAspect();
    }

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
}
