package com.example.email_validator_ui;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int main( String email )
    {
    	int passed = 0;                     //Number of tests passed set to 0;
    	if (email.contains("@")){			            //Check to see if the email contains an @ symbol
    		passed++;                                   //Increment the number of tests passed
    	}
    	int otherat = email.indexOf("@");               //Location of first @
    	int dot = email.lastIndexOf(".");               //Location of last . -1 if not present
    	int at = email.lastIndexOf("@");                //Location of last @ -1 if not present
        if (at == otherat && at != -1){                 //If at = otherat then there is only one at and thus valid. Ensure not -1
    		passed++;                                   //Increment the number of tests passed
    	}
    	if (dot-at>0 && dot != -1 && at != -1){         //If the last dot comes after the last @ and make sure both are present
    		passed++;                                   //Increment the number of tests passed
    	}
    	String ePattern = new String("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
    	if (email.matches(ePattern)) {                  //The above regular expression should pass on all valid emails.
    		passed++;                                   //Increment passed counter
    	}
        return passed;
    }
}
