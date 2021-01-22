package imlsw96.spring.mvc.controller;



import imlsw96.spring.mvc.service.SungJukV13ServiceImpl;
import imlsw96.spring.mvc.vo.SungJukVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

// URL                          view
// ~/sungjuk                (sungjuk.jsp)
// ~/sungjukok

// ~/sungklist
// ~/sungkview


@Controller
public class SungJukController {

    @Autowired
    private SungJukV13ServiceImpl sjsrv13;
    // 성적입력폼을 띄울 것이다 .
    @GetMapping("/sungjuk")
        public String sungjuk() {
        return "sungjuk";
    }

    // 성적입력처리 (post방식으로 요청시 호출됨 그외의 방법으로 요청시 오류가 날것 )
    // 성적입력 폼에 입력한 내용들은 스프링 컨테이너에 의해
    // SungJukVO의 멤버변수에 자동으로 저장됨
    // 단, form의 각 변수명과 SungJukVO의 멤버변수명은 일치해야 함
    // ~/sungjuk -> ~/sungjukok -> sjsrv13 -> sjdao12 ->db
    //      view                WAS                service      dao
    @PostMapping("/sungjukok")
    public ModelAndView sungjukok(SungJukVO sjvo) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sungjukok");
        mv.addObject("result",sjsrv13.newSungJuk(sjvo));
        mv.addObject("sj",sjvo);

        return mv;
    }

    // 성적 데이터 조회
    // 학생번호, 이름, 국어, 영어, 수학, 등록일 형태로 출력
    // ~/sungjuklist ->  sjsrv13 -> sjdao12 -> db
    //      view                service          dao
    @GetMapping("/sungjuklist")
    public ModelAndView sungjuklist() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sungjuklist");

        mv.addObject("sjlist",sjsrv13.readSungJuk());

        return mv;
    }


    // sungjuklist.jsp에서
    // 학생이름을 클릭하면 학생번호 sjno를 전송하는데
    //
    @GetMapping("/sungjukview")
    public ModelAndView sungjukview(String sjno){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("sungjukview");
        // 뷰리졸버의 머리글 + 뷰이름 + 뷰리졸버의 꼬리글
        // WEB-INF/jsp + sungjukview + .jsp
        mv.addObject("sj",sjsrv13.readOneSungJuk(sjno));

        return mv;
    }

    //성적번호를 이용해서 지정한 성적데이터를 삭제함
    @GetMapping("/sungjukdel")
    public String sungjukdel(String sjno) {

        sjsrv13.removeSungJuk(sjno);

        // 성적데이터를 삭제하고 난뒤 /sungjuklist로 바로 이동
        return "redirect:/sungjuklist";
    }

    // 성적번호를 이용해서 수정할 성적데이터를 읽어와서
    // sungjukupd.jsp에 출력함.
    @GetMapping("/sungjukupd")
    public ModelAndView sungjukupd(String sjno) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("sungjukupd");
        mv.addObject("sj",sjsrv13.readOneSungJuk(sjno));
        return mv;
    }

    // 수정할 성적데이터를 전송 받아서
    // sungjuk테이블에 적용하고 sungjuklist로 redirect 한다.
    @PostMapping("/sungjukupdok")
    public String sungjukupdok(SungJukVO sj) {

        // 내부적으로 데이터가 수정되었는지 확인하기 위해서 System.out.print를 이용하여 한다.
        System.out.println(sjsrv13.modifySungJuk(sj));
        // 특정 메서드에서 return한 결과를 콘솔에서 확인
        return "redirect:/sungjuklist";
    }
}
