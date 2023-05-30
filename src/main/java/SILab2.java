import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function (User user, List<User> allUsers) {
        if (user==null || user.getPassword()==null || user.getEmail()==null){//a
            throw new RuntimeException("Mandatory information missing!");//b
        }

        if (user.getUsername()==null){//c
            user.setUsername(user.getEmail());//d
        }

        int same = 1;//e
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) {//f
            same = 0;//g
            for (int i=0;i<allUsers.size();i++) {//h1 h2 h3
                User existingUser = allUsers.get(i);//i
                if (existingUser.getEmail() == user.getEmail()) {//j
                    same += 1;//k
                }
                if (existingUser.getUsername() == user.getUsername()) {//l
                    same += 1;//m
                }
            }
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";//n
        String password = user.getPassword();//n
        String passwordLower = password.toLowerCase();//n

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) {//o
            return false;//p
        }
        else {//q
            if (!passwordLower.contains(" ")) {//r
                for (int i = 0; i < specialCharacters.length(); i++) {//s1 s2 s3
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) {//t
                        return same == 0;//u
                    }
                }
            }
        }
        return false;//v
    }//w
}
