import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {

        double height = Double.parseDouble(JOptionPane.showInputDialog("Height in Meter"));
        System.out.println("Your height in Meter = " + height + "m");
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Weight in Kilogram"));
        System.out.println("Your height in Kilogram = " + height + "kg");
        double heightConverted = height * height;
        double bmiResult = weight / heightConverted;
        String bmi = String.format("%.1f", bmiResult);
        System.out.println("Your BMI result is " + bmi);
        if(bmiResult <= 18.5){
            JOptionPane.showMessageDialog(null, "Your BMI result is " + bmi);
            JOptionPane.showMessageDialog(null, "You're Under-weight");
            System.out.println("You're Under-Weight");
        } else if(bmiResult > 18.5 && bmiResult <= 24.9){
            JOptionPane.showMessageDialog(null, "Your BMI result is " + bmi);
            JOptionPane.showMessageDialog(null, "You're Healthy-weight");
            System.out.println("You're Healthy-Weight");
        } else if(bmiResult >= 25.0 && bmiResult <= 29.9){
            JOptionPane.showMessageDialog(null, "Your BMI result is " + bmi);
            JOptionPane.showMessageDialog(null, "You're Over-weight");
            System.out.println("You're Over-Weight");
        } else if(bmiResult >= 30.0){
            JOptionPane.showMessageDialog(null, "Your BMI result is " + bmi);
            JOptionPane.showMessageDialog(null, "You're Obesity");
            System.out.println("You're Obesity");
        } else {
            JOptionPane.showMessageDialog(null, "Result undefined! Plaese try again.");
        }
        
    }
}