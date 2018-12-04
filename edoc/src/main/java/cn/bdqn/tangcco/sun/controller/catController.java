package cn.bdqn.tangcco.sun.controller;

import cn.bdqn.tangcco.sun.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cat")
public class catController {
    @Autowired
    private CategoryServices categoryServices;

    @RequestMapping("queryAll")
    public String queryAll(Model model){

        model.addAttribute("cat",categoryServices.queryAll());
        return "listEntry";
    }
}
