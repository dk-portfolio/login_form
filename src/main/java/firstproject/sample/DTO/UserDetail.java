package firstproject.sample.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class UserDetail {
    private String Firstname;
    private String Lastname;
    private  String Email;
    private String number;
    private String Datebirth;
    private  String Department;
    private String College;
    private String Password;



}
