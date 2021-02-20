/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alaa_Ibrahim
 */
public class Validation {
    public static String validateName(String name){
        String pattern = "[a-z]";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      String message="";
      if(checkLengthAndIsempty(name).equals("ok")){
          Matcher m = r.matcher(name);
          if (m.find( )) {
           message="";
          }else {
           message="Invalid";
          }
      }
      else{
          message=checkLengthAndIsempty(name);
      }
      
      return message;
      
    }
    public static String checkLengthAndIsempty(String name){
        if(!name.equals("") && name.length()>=3)
            return "ok";
        return "name is empty or very small";
    }
}
