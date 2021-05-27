
package payroll.system;

import java.text.ParseException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
public class PAYROLLSYSTEM {

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        String Lastname = (String)JOptionPane.showInputDialog("Lastname");
        String  Firstname = (String)JOptionPane.showInputDialog("Firstname: ");
        String MiddleInitial =(String)JOptionPane.showInputDialog("Middleinitial");
        
        String InMonMorn = (String)JOptionPane.showInputDialog("Mon Time In (AM)");
        String OutMonMorn = (String)JOptionPane.showInputDialog("Mon Time Out (AM)");
        String InMonAft = (String)JOptionPane.showInputDialog("Mon Time In (PM)");
        String OutMonAft = (String)JOptionPane.showInputDialog("Mon Time Out (PM)");
        String InTueMorn = (String)JOptionPane.showInputDialog("Tue Time In (AM)");
        String OutTueMorn = (String)JOptionPane.showInputDialog("Tue Time Out (AM)");
        String InTueAft = (String)JOptionPane.showInputDialog("Tue Time In (PM)");
        String OutTueAft = (String)JOptionPane.showInputDialog("Tue Time Out (PM)");
        String InWedMorn = (String)JOptionPane.showInputDialog("Wed Time In (AM)");
        String OutWedMorn = (String)JOptionPane.showInputDialog("Wed Time Out (AM)");
        String InWedAft = (String)JOptionPane.showInputDialog("Wed Time In (PM)");
        String OutWedAft = (String)JOptionPane.showInputDialog("Wed Time Out (PM)");
        String InThuMorn = (String)JOptionPane.showInputDialog("Thu Time In (AM)");
        String OutThuMorn = (String)JOptionPane.showInputDialog("Thu Time Out (AM)");
        String InThuAft = (String)JOptionPane.showInputDialog("Thu Time In (PM)");
        String OutThuAft = (String)JOptionPane.showInputDialog("Thu Time Out (PM)");
        String InFriMorn = (String)JOptionPane.showInputDialog("Fri Time In (AM)");
        String OutFriMorn = (String)JOptionPane.showInputDialog("Fri Time Out (AM)");
        String InFriAft = (String)JOptionPane.showInputDialog("Fri Time In (PM)");
        String OutFriAft = (String)JOptionPane.showInputDialog("Fri Time Out (P.M)");
        String SalaryRate = (String)JOptionPane.showInputDialog("Salary Rate");
       
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date InMonAM = format.parse(InMonMorn);
        Date OutMonAM = format.parse(OutMonMorn);
        Date InMonPM = format.parse(InMonAft);
        Date OutMonPM = format.parse(OutMonAft);
        Date InTueAM = format.parse(InTueMorn);
        Date OutTueAM = format.parse(OutTueMorn);
        Date InTuePM = format.parse(InTueAft);
        Date OutTuePM = format.parse(OutTueAft);
        Date InWedAM = format.parse(InWedMorn);
        Date OutWedAM = format.parse(OutWedMorn);
        Date InWedPM = format.parse(InWedAft);
        Date OutWedPM = format.parse(OutWedAft);
        Date InThuAM = format.parse(InThuMorn);
        Date OutThuAM = format.parse(OutThuMorn);
        Date InThuPM = format.parse(InThuAft);
        Date OutThuPM = format.parse(OutThuAft);
        Date InFriAM = format.parse(InFriMorn);
        Date OutFriAM = format.parse(OutFriMorn);
        Date InFriPM = format.parse(InFriAft);
        Date OutFriPM = format.parse(OutFriAft);
        
        double MonMorn = OutMonAM.getTime() - InMonAM.getTime();
        double MonAft = OutMonPM.getTime() - InMonPM.getTime();
        double TueMorn = OutTueAM.getTime() - InTueAM.getTime();
        double TueAft = OutTuePM.getTime() - InTuePM.getTime();
        double WedMorn = OutWedAM.getTime() - InWedAM.getTime();
        double WedAft = OutWedPM.getTime() - InWedPM.getTime();
        double ThuMorn = OutThuAM.getTime() - InThuAM.getTime();
        double ThuAft = OutThuPM.getTime() - InThuPM.getTime();
        double FriMorn = OutFriAM.getTime() - InFriAM.getTime();
        double FriAft = OutFriPM.getTime() - InFriPM.getTime();
        
        double WorkHours = ((MonMorn + MonAft + TueMorn + TueAft + WedMorn 
               + WedAft + ThuMorn + ThuAft + FriMorn + FriAft)/1000)/3600;
        
        
        Date date = new Date();
        
        
        final double SSS = 0.03, Philhealth = 0.02 , PagIbig = 0.05, BIR = 0.036;
      
        double Grossincome = Double.parseDouble(SalaryRate) * WorkHours;
        double dedSSS = Grossincome * SSS;
        double dedPhilHealth = Grossincome * Philhealth;
        double dedPagIbig = Grossincome * PagIbig;
        double dedBIR = Grossincome * BIR;
        double netIncome = Grossincome - (dedSSS + dedPhilHealth + dedPagIbig + dedBIR);
        
        JOptionPane.showMessageDialog(null, Lastname + " " + MiddleInitial + " " + Firstname + " " 
        + "\n Gross Income: PHP " + Grossincome +  "\n Deduction " + "\n SSS: PHP " + dedSSS +
         "\n PhilHealth: " + dedPhilHealth + "\n PagIbig: PHP " + dedPagIbig + 
         "\n BIR: PHP " + dedBIR + "\n Netincome: PHP " + netIncome + "\n" + "\n Date " + "\n" + "\n Work Hour: " + WorkHours,
         "Payroll System",
                1);       
        
       
    }
    
}
