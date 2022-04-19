package com.ninja.oop.string;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorMain {
    public static boolean isNameValid(String name){
        Pattern namePattern = Pattern.compile("^[A-Za-z][.-_]?[A-Za-z\\s]{3,}$");
        Matcher nameMatcher = namePattern.matcher(name);
        if (!nameMatcher.matches()){
            return false;
        }
        return true;
    }
    private static boolean isEmailValid(String email) {
        Pattern emailPattern = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}");
        Matcher emailMatcher = emailPattern.matcher(email);
        if (!emailMatcher.matches()){
            return false;
        }
        return true;
    }
    private static boolean isMobileValid(String mobile) {
        String regex = "(0/91)?[7-9][0-9]{9}";
        if(mobile.matches(regex))
            return true;
        return false;
    }
    private static boolean isPasswordValid(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{8,}$";
        if(password.matches(regex))
            return true;
        return false;
    }
    private static boolean isDateValid(String date) {
        String[] values = date.split("-");
        if((Integer.parseInt(values[2]) >= 2022) && (Integer.parseInt(values[1]) >= 4)
                && (Integer.parseInt(values[0]) > 18))
            return false;
        String regex = "^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$";
        if(date.matches(regex))
            return true;
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator vd = new Validator();
        System.out.println("Please enter your name(Note: Min 3 chars, no numbers :");
        String name = sc.nextLine();
        boolean nameValid = true;
        while(nameValid){
            if (isNameValid(name)) {
                vd.setName(name);
                System.out.println("Name updated successfully!");
                nameValid = false;
            }else{
                System.out.println("Name should be greater than 3 characters\nPlease enter valid name again");
                name = sc.nextLine();
                isNameValid(name);
            }
        }

        boolean emailValid = true;
        System.out.println("Please enter your Email : ");
        String email = sc.nextLine();
        while(emailValid){
            if (isEmailValid(email)) {
                vd.setEmail(email);
                System.out.println("email updated successfully!");
                emailValid = false;
            }else{
                System.out.println("Email format (xxxxx@domainName.xxx)\nPlease enter valid email again :");
                email = sc.nextLine();
                isEmailValid(email);
            }
        }

        boolean mobileValid = true;
        System.out.println("Please enter your mobile : ");
        String mobile = sc.nextLine();
        while(mobileValid){
            if (isMobileValid(mobile)) {
                vd.setMobile(mobile);
                System.out.println("mobile number updated successfully!");
                mobileValid = false;
            }else{
                System.out.println("Mobile number shoudld be of length 10\nShould start from 6 - 9 only\nPlease enter valid mobile number again");
                mobile = sc.nextLine();
                isMobileValid(mobile);
            }
        }

        boolean passwordValid = true;
        System.out.println("Please enter your password : ");
        String password = sc.nextLine();

        while(passwordValid){
            if (isPasswordValid(password)) {
                vd.setPassword(password);
                System.out.println("password updated successfully!");
                passwordValid = false;
            }else{
                System.out.println("Password should contain atleast 8 characters\n" +
                        "It should atlest contain one uppercase, one lowercase and a special character\nPlease enter valid password again");
                password = sc.nextLine();
                isPasswordValid(password);
            }
        }

        boolean DateValid = true;
        System.out.println("Please enter your date of birth : ");
        String date = sc.nextLine();
        while(DateValid){
            if (isDateValid(date)) {
                vd.setDateOfBirth(date);
                System.out.println("date update successfully!");
                DateValid = false;
            }else{
                System.out.println("Please enter valid date of birth again (DD-MM-YYYY)");
                date = sc.nextLine();
                isDateValid(date);
            }
        }
        System.out.println("Details are : ");
        System.out.println("Name is : " + vd.getName());
        System.out.println("Email is : " + vd.getEmail());
        System.out.println("Mobile number is : " + vd.getMobile());
        System.out.println("Password is : " + vd.getPassword());
        System.out.println("Date of Birth is : " + vd.getDateOfBirth());
    }


}
