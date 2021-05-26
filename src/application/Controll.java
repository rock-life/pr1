package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

import java.math.*;

import javax.swing.JOptionPane;
public class Controll {
	@FXML
	private	TextField a=new TextField();
	@FXML
	private	TextField b=new TextField();
	@FXML
	private	TextField c=new TextField();
	@FXML
	private	TextField r=new TextField();
	@FXML
	private Button btn=new Button();
	
public void click(ActionEvent e)
{
	try 
	{
		float aa=Float.parseFloat(a.getText());
		float bb=Float.parseFloat(b.getText());
		float cc=Float.parseFloat(c.getText());
		double d=Math.pow(bb, 2)+4*aa*cc;
		if(d>0)
		{
			r.setFont(Font.font(24));
			double x_1=(-bb+Math.sqrt(d))/2*aa;
			double x_2=(-bb-Math.sqrt(d))/2*aa;
			System.out.print("\nx1: "+x_1+"\nx2: "+x_2);
			if(x_1!=x_2)
				r.setText("1");
			else
				r.setText("0");
		}
		else
			r.setText("0");
	}
	catch(Exception ex) {
		r.setFont(Font.font(14));
		JOptionPane.showMessageDialog(null,"Невірно заповнені данні: "+ex.getMessage());
		};
		
}
}
