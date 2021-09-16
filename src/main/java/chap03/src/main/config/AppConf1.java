package chap03.src.main.config;

import chap03.src.main.java.spring.MemberDao;
import chap03.src.main.java.spring.MemberPrinter;
import org.springframework.context.annotation.Bean;

public class AppConf1 {
    @Bean
    public MemberDao memberDao(){
        return new MemberDao();
    }
    @Bean
    public MemberPrinter memberPrinter(){
        return new MemberPrinter();
    }
}
