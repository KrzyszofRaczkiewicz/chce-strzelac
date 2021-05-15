package com.team7.chcestrzelac.controlers;

import com.team7.chcestrzelac.model.Grups;
import com.team7.chcestrzelac.model.Strzelnica;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/groups")
public class GroupsController {

    @GetMapping("/groups")
    public String getProductForm(Model model) {
        model.addAttribute("grupa", new Grups());
        return "grupy";
    }
}
