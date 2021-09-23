package chap05.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component("listPrinter")
public class MemberListPrinter {
    private MemberDao memberDao;
    private MemberPrinter printer;

    public MemberListPrinter(){

    }
    public MemberListPrinter(MemberDao memberDao, MemberPrinter printer){
        this.memberDao =memberDao;
        this.printer =printer;

    }

    @Autowired
    public void setMemberPrinter(MemberPrinter printer) {
        this.printer = printer;
    }

    @Autowired
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void printAll(){
        Collection<Member> members = memberDao.selectAll();
        members.forEach(m -> printer.print(m));
    }
}
