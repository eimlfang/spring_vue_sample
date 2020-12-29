package me.naijiz.springvue.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author naijiz
 */
@Controller
public class VueController {

    @GetMapping("/vue")
    public String index() {
        return "vue/index";
    }
}
