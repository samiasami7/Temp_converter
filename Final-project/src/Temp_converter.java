import javax.swing.JFrame;
import javax.swing.JLabel;

public class Temp_converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		f.setTitle("Temperature Converter");
		f.setSize(450, 400);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel l1 = new JLabel("Enter Temperature:");
        l1.setBounds(20, 20, 150, 25);
        f.add(l1);
		
        
        
		f.setVisible(true);
		
	}

}
