package firstproject.sample.controller;
import firstproject.sample.DTO.Login;
import firstproject.sample.DTO.UserDetail;
import org.springframework.web.bind.annotation.CrossOrigin;
import firstproject.sample.entity.Formdata;
import firstproject.sample.service.Formservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import java.util.List;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins ="http://127.0.0.1:5500")
public class Formcontroller {

    @Autowired
    private Formservices formservices;

    @GetMapping("/formdata")
    public List<Formdata> detaillist() {
        return formservices.detaillist();
    }

    @GetMapping("/user/{id}")
    public Optional<Formdata> getUserById(@PathVariable Integer id) {
        return formservices.getUserById(id);
    }
    @PostMapping("/register")
    public String register(@RequestBody UserDetail userDetail) {

        Formdata formdata = new Formdata();
        formdata.setCollege(userDetail.getCollege());
        formdata.setDepartment(userDetail.getDepartment());
        formdata.setDatebirth(userDetail.getDatebirth());
        formdata.setEmail(userDetail.getEmail());
        formdata.setFirstname(userDetail.getFirstname());
        formdata.setLastname(userDetail.getLastname());
        formdata.setNumber(userDetail.getNumber());
        formdata.setPassword(userDetail.getPassword());
        formservices.register(formdata);
        return "finish";
    }
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
//    @PostMapping("/login")
//    public String validate(@RequestBody Formdata   formdata) {
//        String email = formdata.getEmail();
//        boolean isValid = formservices.validate(email);
//        return isValid ? "Login successful" : "Invalid email or password";
//    }
//    @GetMapping("/check-email")
//    public String request(@RequestParam String email) {
//        boolean exists = formservices.checkEmail(email);
//        return exists ? "Email exists" : "Email not found";
//    }


}
