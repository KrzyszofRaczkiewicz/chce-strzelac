package com.team7.chcestrzelac.grupa.controlers;

import com.team7.chcestrzelac.grupa.model.Grupa;
import com.team7.chcestrzelac.grupa.services.GrupaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/groups")
public class GroupsController {

    @Autowired
    GrupaService grupaService;


    @GetMapping("/groups")
    public String getProductForm(Model model) {
        model.addAttribute("grupa", new Grupa());
        return "grupy";
    }

    @GetMapping("/grupyList")
    public String allGroups(Model model) {
        model.addAttribute("allGroups", grupaService.getAllGroups());
        return "grupy_list";
    }

    @GetMapping("/newgrupa")
    public String getGrupaForm(Model model) {
        model.addAttribute("grupa", new Grupa());
        return "grupa_form";
    }

    @PostMapping("/newgrupa")
    public String addNewGrupa(Grupa grupa) {
        grupaService.insertNewGroup(grupa);
        return "redirect:/grupy/grupyList";
    }
}
