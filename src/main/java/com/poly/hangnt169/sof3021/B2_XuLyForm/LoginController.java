package com.poly.hangnt169.sof3021.B2_XuLyForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "/buoi2/login";
    }

    @PostMapping("/ket-qua")
    public String hienThiKetQua(@RequestParam("uname")String username,
                                @RequestParam("psw") String password
    , Model model){
        // Lay gia tri tu view(form)
        // J4: getParamter
        // J5: Request Param
        model.addAttribute("login",username);
        model.addAttribute("demo2",password);
        return "/buoi2/ket-qua";
    }
}
