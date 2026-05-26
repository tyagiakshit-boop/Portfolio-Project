package com.example.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PortfolioController {
    @GetMapping("/")
    public String homePage(Model model) {
        // Hardcoded Projects List
        List<Project> myProjects = new ArrayList<>();
        myProjects.add(new Project(" Chat Bot ", "Spring Boot REST API , API Calling ,Telegram dependencies.", "https://github.com/tyagiakshit-boop/CHAT-BOT-"));
        myProjects.add(new Project("Developer Portfolio", "Professional Portfolio of mine using spring boot and java in backend.", "https://github.com/tyagiakshit-boop/Portfolio-Project.git"));

        // Data ko HTML me bhejna
        model.addAttribute("myName", "AKSHIT TYAGI");
        model.addAttribute("projectsList", myProjects);
        // Existing code ke niche ye lines add karein:
        model.addAttribute("gmailId", "tyagiakshit404.email@gmail.com");
        model.addAttribute("linkedinUrl", "https://www.linkedin.com/in/akshit-tyagi-56284a3b0/");
        model.addAttribute("leetcodeCount", 73); // Apna number daalein
        model.addAttribute("codechefCount", 126); // Apna number daalein


        return "index";
    }
}

