package chap03.src.main.java.spring;

public class MemverInfoPrinter {

    private MemberDao memberDao;
    private MemberPrinter printer;

    public void printMemberIno(String email){
        Member member = memberDao.selectByEmail(email);
        if(member==null){
            System.out.println("데이터 없음");
            return;
        }
        printer.print(member);
        System.out.println();
    }

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void setPrinter(MemberPrinter printer) {
        this.printer = printer;
    }
}
