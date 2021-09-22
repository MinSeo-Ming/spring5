package chap03.src.main.java;

import chap03.src.main.java.spring.Member;
import chap03.src.main.java.spring.MemberDao;
import chap03.src.main.java.spring.MemberNotFoundException;

public class ChangePasswordService {
    private MemberDao memberDao;
    public void changePassword(String email, String oldPwd, String newPwd){
        Member member = memberDao.selectByEmail(email);
        if(member== null)
            throw new MemberNotFoundException();

        member.changePassword(oldPwd, newPwd);
        memberDao.update(member);
    }

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
}
