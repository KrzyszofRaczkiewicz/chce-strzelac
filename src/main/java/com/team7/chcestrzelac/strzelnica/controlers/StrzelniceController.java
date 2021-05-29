package com.team7.chcestrzelac.strzelnica.controlers;

import com.team7.chcestrzelac.strzelnica.model.Strzelnica;
import com.team7.chcestrzelac.strzelnica.services.StrzelnicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/strzelnice")
public class StrzelniceController {

    @Autowired
    StrzelnicaService strzelnicaService;

    @GetMapping("/strzelnice")
    public String getStrzelniceInfo(Model model) {
        //model.addAttribute("strzelnice", new Strzelnica());
        return "strzelnice";
    }

    @GetMapping("/strzelniceList")
    public String allStrzelnicas(Model model) {
        model.addAttribute("allStrzelnicas", strzelnicaService.getAllStrzelnicas());
        return "strzelnice_list";
    }

    @GetMapping("/newstrzelnica")
    public String getStrzelnicaForm(Model model) {
        model.addAttribute("strzelnica", new Strzelnica());
        return "strzelnica_form";
    }

    @PostMapping("/newstrzelnica")
    public String addNewStrzelnica(Strzelnica strzelnica) {
        strzelnicaService.insertNewStrzelnica(strzelnica);
        return "redirect:/strzelnice/strzelniceList";
    }
}
