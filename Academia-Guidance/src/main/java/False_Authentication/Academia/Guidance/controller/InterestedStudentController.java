package False_Authentication.Academia.Guidance.controller;

import False_Authentication.Academia.Guidance.service.InterestedStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterestedStudentController {
    private InterestedStudentService interestedStudentService;

    public InterestedStudentController(InterestedStudentService interestedStudentService){
        super();
        this.interestedStudentService = interestedStudentService;
    }

    @GetMapping("/interestedStudents")
    public String listInterestedStudents(Model model){
        model.addAttribute("interestedStudents", interestedStudentService.getAllInterestedStudents());
        return "interestedStudents";
    }
}
