import java.util.Scanner;

public class PasswordChecker {

    public void checkPassword(String password) throws Exception {

        if (password == null) {
            throw new WeakPasswordException("null");
        }

        if (password.length() < 8) {
            throw new WeakPasswordException(password);
        }

        if (!Character.isUpperCase(password.charAt(0))) {
            throw new WeakPasswordException(password);
        }

        if (!Character.isDigit(password.charAt(password.length() - 1))) {
            throw new WeakPasswordException(password);
        }

        boolean special = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (ch == '@' || ch == '#' || ch == '$' ||
                ch == '%' || ch == '&' || ch == '*') {
                special = true;
                break;
            }
        }

        if (!special) {
            throw new WeakPasswordException(password);
        }

        System.out.println("Strong Password");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password =sc.nextInt();
        char[] ch = password.toCharArray();
        if(ch[0]>'A' && ch[0]<'Z')
            if(ch[password.length()-1]>0 && ch[password.length()-1]<9)
                if(ch[i]=='' ||})
                return;
                if(password.length()>=8)
                     return true;
        PasswordChecker p = new PasswordChecker();
        try {
            p.checkPassword("Sarthak2003");
        }

        catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
