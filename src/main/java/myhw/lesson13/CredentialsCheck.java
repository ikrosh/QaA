package myhw.lesson13;

//1. Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.

// Login должен содержать только латинские буквы, цифры и знак подчеркивания. Длина login должна быть меньше 20 символов.
// Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.

// Password должен содержать только латинские буквы, цифры и знак подчеркивания.
// Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
// Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//
// WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами –
// один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
// Обработка исключений проводится внутри метода. Используем multi-catch block.
// Метод возвращает true, если значения верны или false в другом случае.

public class CredentialsCheck {

    public static boolean checkCredentials(String credLogin, String passLogin, String passConirm) throws WrongLoginException, WrongPasswordException  {

        try {
            if (!credLogin.matches("[a-zA-Z0-9_]+") || credLogin.length() >= 20)
                throw new WrongLoginException("Exception: You login is incorrect!");
            if (!passLogin.matches("[a-zA-Z0-9_]+") || passLogin.length() >= 20 || !passLogin.equals(passConirm))
                throw new WrongPasswordException("Exception: You password is incorrect!");
        } catch ( WrongLoginException | WrongPasswordException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

        return true;
    }






}



