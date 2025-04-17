package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/index")
  public String home() {
    return "home.index";
  }

  @GetMapping("/help")
  public String helpPage() {
    return "home.help";
  }
}
