package firstproject.sample.service;

import firstproject.sample.DTO.UserDetail;
import firstproject.sample.entity.Formdata;
import firstproject.sample.repository.FormRepo;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class Formservices{

    @Autowired
   private  FormRepo formRepo;

    public List<Formdata> detaillist(){
        return formRepo.findAll();
    }
    public Optional<Formdata> getUserById( Integer Id){
        return formRepo.findById(Id);
    }
//    public  void register(String Firstname, String Lastname, String Email, String number, String Datebirth, String Department, String College) {
//        //   Formdata formdata = new Formdata();
//        Formdata  formdata=new Formdata( Firstname,Lastname,Email,number,Datebirth,Department,College);
//        formRepo.save(formdata);
//    }

    public void register(Formdata formdata) {
        formRepo.save(formdata);
    }
//    public boolean checkEmail(String email) {
//        return formRepo.findbyByEmail(email);
//    }

//    public boolean validate(String Email) {
//        Optional login = formRepo.findByEmail(Email );
//        return login.isPresent();
//    }
public List<Formdata> login(){
    return formRepo.findAll();
}
}
