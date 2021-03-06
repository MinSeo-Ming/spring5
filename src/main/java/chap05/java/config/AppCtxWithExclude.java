package chap05.java.config;

import chap05.java.spring.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;

@Configuration
//@ComponentScan(basePackages = {"spring"},
//                excludeFilters = @Filter(type = FilterType.REGEX,pattern = "spring\\..*Dao"))
//@ComponentScan(basePackages = {"spring"},
//                excludeFilters = @Filter(type = FilterType.ASPECTJ,pattern = "spring.*Dao"))
@ComponentScan(basePackages = {"spring,spring2"},
                excludeFilters = @Filter(type = FilterType.ANNOTATION,classes = {NoProduct.class,ManualBean.class}))
public class AppCtxWithExclude {
    @Bean
    public MemberDao memberDao(){
        return new MemberDao();
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
