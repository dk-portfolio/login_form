package firstproject.sample.controller;

import firstproject.sample.DTO.Login;
import firstproject.sample.entity.Formdata;
import firstproject.sample.service.Formservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api2")
@CrossOrigin(origins ="http://127.0.0.1:5500")
public class Logincontroller {
    @Autowired
    Formservices formservices;

    @PostMapping("/login")
    public String login( @RequestBody Login login) {
        List<Formdata> allUsers = formservices.login();
        for (Formdata a : allUsers){
            if (a.getEmail().equals(login.getEmail())){
                System.out.println("Email found: " +login.getEmail());
                return "logged";
            }
        }
        return "no logged";
    }
}
