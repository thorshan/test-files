import javax.swing.JOptionPane;

public class Login{
    public static void main(String[] args) {
        String username = null;
        String password = null;
        boolean isTrue = true;
        while(isTrue){

            if(username == null){
                String inputUsername = JOptionPane.showInputDialog("Username");

                if(inputUsername.contentEquals("admin")){
                    username = inputUsername;
                }
            }
            else {
                String inputPassword = JOptionPane.showInputDialog("Password");

                if(inputPassword .contentEquals("12345")){
                    password = inputPassword;
                    JOptionPane.showMessageDialog(null, "Welcome to dashboard!");
                    isTrue = false;
                }
            }
            
        }
    }
}