package huy.thuchanh.controller;

import huy.thuchanh.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("")
    public ModelAndView showLoginForm(){
        ModelAndView modelAndView=new ModelAndView("login");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }
    @PostMapping("login")
    public ModelAndView doLogin(@ModelAttribute User user){
        if(user.getUsername().equals("huy")&& user.getPassword().equals("Ducminhhuy")){
            ModelAndView modelAndView=new ModelAndView("success");
            modelAndView.addObject("user",user);
            return modelAndView;
        }
        return new ModelAndView("error");
    }
}
