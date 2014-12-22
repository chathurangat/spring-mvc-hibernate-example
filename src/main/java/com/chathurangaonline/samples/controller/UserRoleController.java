package com.chathurangaonline.samples.controller;

import com.chathurangaonline.samples.model.UserRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "/user-role")
public class UserRoleController {

    private  static final Logger logger = LoggerFactory.getLogger(UserRoleController.class);

    @RequestMapping(value = "/createUserRoleView", method = RequestMethod.GET)
    public ModelAndView displayUserRoleCreationView(Model model){

        logger.info(" == displaying the user role registration view == ");
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.setViewName("createUserRole");
        model.addAttribute("userRoleModel",new UserRole());
        return modelAndView;
    }


    @RequestMapping(value = "/createUserRole", method = RequestMethod.POST)
    private ModelAndView createUserRole(@Valid @ModelAttribute("userRoleModel") UserRole userRole,BindingResult bindingResult,Model model){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.setViewName("createUserRole");
        if(!bindingResult.hasErrors()){
            logger.info(" request to create user role with name  ["+userRole.getRoleNameEnglish()+"]");
            //todo persisting data in the database

            model.addAttribute("userRoleModel",new UserRole());
        }
        else{
            model.addAttribute("userRoleModel",userRole);

            logger.info(" [{}] validation errors found while trying to create user role ", bindingResult.getFieldErrorCount());
        }
        return modelAndView;
    }

}
