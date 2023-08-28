package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainSceneController {
    public TextField txtUserName;
    public PasswordField txtPassword;
    public Button btnLogin;
    public Label lbValid;

    public  void initialize(){
        // is in starting
        lbValid.setText("-");
    }

    public void btnLoginOnAction(ActionEvent actionEvent) {

        String username=txtUserName.getText().strip();
        String password =txtPassword.getText().strip();

    if (username.isBlank()&& password.isBlank()){
        lbValid.setText("Login Failed");

    }
    if(!isValidPw(password)){
        lbValid.setText("Invalid password");
    }
    if(username.equals("Kavi1995") && password.equals("kgs1234")){
        lbValid.setText("Login Successfully");
    }else{
        lbValid.setText("Login Failed");
    }
    }

    //password validation
    public static boolean isValidPw(String password){
       boolean UpperCaseCharacter=false;
       boolean LowerCaseCharacter=false;
       boolean IsDigit=false;

        for (int i = 0; i <password.length() ; i++) {

            char c= password.charAt(i);
            if( UpperCaseCharacter && LowerCaseCharacter && IsDigit) break;
            if (Character.isUpperCase(c)) UpperCaseCharacter=true;
            if(Character.isLowerCase(c)) LowerCaseCharacter=true;
            if(Character.isDigit(c)) IsDigit=true;
        }
        return  UpperCaseCharacter && LowerCaseCharacter && IsDigit;
    }

}
