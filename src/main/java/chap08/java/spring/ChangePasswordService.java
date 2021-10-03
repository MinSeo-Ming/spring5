package chap08.java.spring;

import chap08.java.spring.Member;
import chap08.java.spring.MemberDao;
import chap08.java.spring.MemberNotFoundException;

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
