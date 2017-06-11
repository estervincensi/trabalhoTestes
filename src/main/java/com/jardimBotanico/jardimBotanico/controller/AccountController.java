package com.jardimBotanico.jardimBotanico.controller;

import com.jardimBotanico.jardimBotanico.domain.Account;
import com.jardimBotanico.jardimBotanico.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by harley on 10/06/2017.
 */

@Controller
public class AccountController {

    private final AccountService accountService;


      public AccountController(AccountService accountService) {
         this.accountService =  accountService;
      }

      @GetMapping("/")
      public ModelAndView create() {
          return new ModelAndView("register")
                  .addObject("account", new Account());
      }

    @PostMapping("/save")
    public String save(@Valid Account operador, BindingResult bindingResult, Model model) {
        if(this.accountService.save(operador)==null){
        	model.addAttribute("erro", "Atenção! usuário já existe!");
        	model.addAttribute("operador", operador);
        	return "register";
        }
        return "redirect:/";
    }
}
