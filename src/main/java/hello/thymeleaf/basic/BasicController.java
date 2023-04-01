package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {

    /**
     * 이스케이프 처리
     * @param model
     * @return
     */
    @GetMapping("text-basic")
    public String textBasic(Model model){
        model.addAttribute("data", "Hello <b>Spring!</b>");
        return "basic/text-basic";
    }

    /**
     * 이스케이프 미처리
     * @param model
     * @return
     */
    @GetMapping("text-unescaped")
    public String texUnescaped(Model model){
        model.addAttribute("data", "Hello <b>Spring!</b>");
        return "basic/text-unescaped";
    }
}
