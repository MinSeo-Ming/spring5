package chap05.java.config;

import chap05.java.spring.MemberDao;
import chap05.java.spring.MemberPrinter;
import chap05.java.spring.MemberSummaryPrinter;
import chap05.java.spring.VersionPrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring"})
public class AppCtxWithExplicit {
    @Bean
    public MemberDao memberDao2(){
        MemberDao memberDao = new MemberDao();
        System.out.println("explict : "+memberDao);
        return memberDao;
    }

    @Bean
    @Qualifier("printer")
    public MemberPrinter memberPrinter1(){
        return new MemberPrinter();
    }

    @Bean
    @Qualifier("summaryPrinter")
    public MemberSummaryPrinter memberPrinter2(){
        return new MemberSummaryPrinter();
    }
    @Bean
    public VersionPrinter versionPrinter(){
        VersionPrinter versionPrinter =new VersionPrinter();
        versionPrinter.setMajorVersion(5);
        versionPrinter.setMinorVersion(0);
        return versionPrinter;
    }
}
