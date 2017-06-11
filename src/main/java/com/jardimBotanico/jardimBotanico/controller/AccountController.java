package com.jardimBotanico.jardimBotanico.controller;

import com.jardimBotanico.jardimBotanico.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by harley on 10/06/2017.
 */

@Controller
public class AccountController {

      @GetMapping("/")
      public ModelAndView create() {
          return new ModelAndView("register")
                  .addObject("account", new Account());
      }

    @GetMapping("/save")
    public void save() {
      
    }
}
