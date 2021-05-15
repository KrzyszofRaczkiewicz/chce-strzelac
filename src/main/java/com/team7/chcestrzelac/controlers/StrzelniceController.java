package com.team7.chcestrzelac.controlers;

import com.team7.chcestrzelac.model.Strzelnica;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/strzelnice")
public class StrzelniceController {

    @GetMapping("/strzelnice")
    public String getProductForm(Model model) {
        model.addAttribute("strzelnice", new Strzelnica());
        return "strzelnice";
    }
}
