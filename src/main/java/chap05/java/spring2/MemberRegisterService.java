package chap05.java.spring2;

import chap05.java.spring.DuplicateMemberException;
import chap05.java.spring.Member;
import chap05.java.spring.MemberDao;
import chap05.java.spring.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class MemberRegisterService {
    private MemberDao memberDao;

    public MemberRegisterService(){

    }

    public Long register(RegisterRequest req){
        Member member = memberDao.selectByEmail(req.getEmail());
        if(member !=null){
            throw new DuplicateMemberException("dup email "+ req.getEmail());
        }
        Member newMember = new Member(
                req.getEmail(),req.getPassword(), req.getName(),
                LocalDateTime.now()
        );
        memberDao.insert(newMember);
        return newMember.getId();
    }

    @Autowired
    public void setMemberDao(MemberDao memberDao){
        this.memberDao =memberDao;
    }
}
