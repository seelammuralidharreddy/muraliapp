package naresh.it;

import java.util.Base64;

public class NareshDevelopProject {
    public String test(String s){
        return Base64.getEncoder().encodeToString(s.getBytes());
    }
    public String test2(String s){

        System.out.println("helo new code added");
        return  Base64.getDecoder().decode(s).toString();
    }
}
