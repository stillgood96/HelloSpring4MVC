package imlsw96.spring.mvc.service;



import imlsw96.spring.mvc.dao.MemberDAO04;

import imlsw96.spring.mvc.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("msrv04")
public class MemberService04 implements MemberService{
    @Autowired
    private MemberDAO04 mdao04;

    // 회원 정보 생성
    public String newMember(MemberVO mvo){
        String result="";
        int cnt = mdao04.insertMember(mvo);
        if(cnt>0) result = "성적데이터 저장완료";

        return result;
    }

    // 회원 정보 수정(이름, 등급, 포인트)
    public String modifyMember(MemberVO mvo) {
        return null;
    }

    // 회원정보 일지매 삭제
    public String removeMember(String name) {
        return null;
    }

    // 회원정보 조회 (아이디,등급,가입일)

    @Override
    public List<MemberVO> readMember() {
        return mdao04.selectMember();
    }

    // 회원정보 조회 ( 아이디로 검색)
    public MemberVO readOneMember(String userid) {

        return mdao04.selectOneMember(userid);
    }
}
