package imlsw96.spring.mvc.dao;


import imlsw96.spring.mvc.vo.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("mdao04")
public class MemberDAO04 implements MemberDAO {
    @Autowired
    private SqlSession sqlSession;
    // mybatis 사용하기 위해
    // SqlSession 객체를 MemberDAO03에 DI함

    @Override
    public int insertMember(MemberVO mvo) {

        return sqlSession.insert("member.insertMember",mvo);
    }

    @Override
    public int updateMember(MemberVO mvo) {

        return sqlSession.update("member.updateMember",mvo);

    }

    public int deleteMember(String name) {

        return sqlSession.update("member.deleteMember",name);
    }

    @Override
    public List<MemberVO> selectMember() {


        return sqlSession.selectList("member.selectList");
    }

    @Override
    public MemberVO selectOneMember(String userid) {

        return sqlSession.selectOne("member.selectOne",userid);
   }



    }


