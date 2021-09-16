package chap03.src.main.config;

import chap03.src.main.java.ChangePasswordService;
import chap03.src.main.java.MemberRegisterService;
import chap03.src.main.java.spring.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class AppConf2 {
    @Autowired
    private MemberDao memberDao;
    @Autowired
    private MemberPrinter memberPrinter;

    @Bean
    public MemberRegisterService memberRegSvc(){
        return new MemberRegisterService(memberDao);
    }

    @Bean
    public ChangePasswordService changePwdSvc(){
        ChangePasswordService pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
        return pwdSvc;
    }
    @Bean
    public MemberListPrinter listPrinter(){
        return new MemberListPrinter(memberDao,memberPrinter);
    }

    @Bean
    public MemverInfoPrinter infoPrinter(){
        MemverInfoPrinter infoPrinter = new MemverInfoPrinter();
        infoPrinter.setMemberDao(memberDao);
        infoPrinter.setPrinter(memberPrinter);
        return infoPrinter;
    }

    @Bean
    public VersionPrinter versionPrinter(){
        VersionPrinter versionPrinter = new VersionPrinter();
        versionPrinter.setMajorVersion(5);
        versionPrinter.setMinorVersion(0);
        return versionPrinter;
    }
}
