package False_Authentication.Academia.Guidance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class welcomeView {
    @GetMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("message", "hello world");
        return  "welcome";
    }
}
