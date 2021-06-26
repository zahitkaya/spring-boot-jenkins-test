package com.example.demo.controller.web;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Hidden // Hide all endpoints
@FieldDefaults(level = AccessLevel.PRIVATE)
@Controller
public class WebController {

   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String index(HttpServletRequest request) {
      return "redirect:/swagger-ui.html";
   }

}