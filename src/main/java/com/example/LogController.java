package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Oblio.Leitch on 12/18/2015.
 */
@Controller
public class LogController {
    private final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Fresh site.");
        model.addAttribute("message", "Greetings!");
        return "index";
    }

    @RequestMapping("/showerror")
    public String makeError(Model model) {
        LOGGER.error("Wrote an Error!");
        model.addAttribute("message", "Whoops!");
        return "index";
    }
}
