package com.jardimBotanico.jardimBotanico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by harley on 10/06/2017.
 */

@Controller
public class AccountController {

      @GetMapping("/test")
      public String create() {
          return "registered";
      }

}
