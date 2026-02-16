package org.example.homework_13.task1;

public class Authorization {


    public static void login(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (!isLoginValid(login)) {
            throw new WrongLoginException("Длина login должна быть меньше 20 символов и не должен содержать пробелы");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!isPasswordValid(password, confirmPassword)) {
            throw new WrongPasswordException("Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру. password и confirmPassword должны совпадать");
        }
    }

    private static boolean isLoginValid(String login) {
        return  login.matches("^\\S{1,19}$");
    }

    private static boolean isPasswordValid(String password, String confirmPassword) {
        return password.equals(confirmPassword) && password.matches("^(?=.*\\d)\\S{1,19}$");
    }
}
