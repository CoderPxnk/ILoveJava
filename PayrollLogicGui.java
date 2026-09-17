import javax.swing.JOptionPane;

public class PayrollLogicGui
{

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        double salary;
        double yearsOnJob;
        String input;
        
        input = JOptionPane.showInputDialog("Enter your annual salary,");
        
        salary = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter the number of years at your current job.");
        
        yearsOnJob = Double.parseDouble(input);
        
        if (salary >=3000)
        {
            if (yearsOnJob >= 2)
            {
                JOptionPane.showMessageDialog(null, "You qualify for the loan.");
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You musth ave been on your current job for at least two years to qualify.");
                
            }
            
        }
        else
        {
            JOptionPane.showConfirmDialog(null, "You must earn at least 30,000 per year to qualify.");
        }
        
        System.exit(0);
    }
}
