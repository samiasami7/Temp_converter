import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Temp_converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		f.setTitle("Temperature Converter");
		f.setSize(450, 400);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		
		
		JLabel l1 = new JLabel("Enter Temperature: ");
        l1.setBounds(20, 20, 150, 25);
        f.add(l1);
		
        JTextField tf1 = new JTextField();
        tf1.setBounds(150, 20, 100, 25);
        f.add(tf1);
        
        JLabel l2 = new JLabel("Convert To: ");
        l2.setBounds(20, 60, 100, 25);
        f.add(l2);
        
        String[] op = {"Celsius", "Fahrenheit"};
        JComboBox<String> cb = new JComboBox<>(op);
        cb.setBounds(150, 60, 100, 25);
        f.add(cb);
        
        JButton cn = new JButton("Convert");
        cn.setBounds(150, 120, 100, 25);
        f.add(cn);

        JLabel r = new JLabel("Result: ");
        r.setBounds(20, 180, 300, 40);
        f.add(r);
        
        cn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String input = tf1.getText();
        		
        		try {
        			double temp = Double.parseDouble(input);
        			String selected = (String) cb.getSelectedItem();
                    double result;
                    
                    if (selected.equals("Celsius")) {
                        result = (temp - 32) * 5 / 9;
                        r.setText("Result: " + String.format("%.2f", result) + " °C");
                    } else {
                        result = (temp * 9 / 5) + 32;
                        r.setText("Result: " + String.format("%.2f", result) + " °F");
                    }

        		} catch (NumberFormatException ex) {
        			JOptionPane.showMessageDialog(f, "Please enter a valid number!", "Invaild input",JOptionPane.ERROR_MESSAGE);
        		}
        	}
        });
        
		f.setVisible(true);
		
	}

}
