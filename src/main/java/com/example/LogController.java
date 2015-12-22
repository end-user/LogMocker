package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Oblio.Leitch on 12/18/2015.
 */
@RestController
public class LogController {
    private final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Fresh site.");
        model.addAttribute("message", "Greetings!");
        return "index";
    }


    @RequestMapping("/showerror")
    public String makeError() {
        LOGGER.error("Wrote an Error!");
        return "Whoops!";
    }
}
