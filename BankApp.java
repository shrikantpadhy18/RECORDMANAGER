import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
class Details
{
	private  Integer acc_No, inamt;
	private String name,Address;
	public void setAccNo(Integer n)
	{
		acc_No=n;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAdd(String add)
	{
		Address=add;
	}
	public void setIntAmt(Integer r)
	{
		inamt=r;
	}
	public Integer getNo()
	{
		return(this.acc_No);
	}
	public String getName()
	{
		return(this.name);
	}
	public String getAddres()
	{
		return(this.Address);
	}
	public Integer getBalance()
	{
		return(this.inamt);
	}
}
class Exampl extends JFrame
{
	ListIterator it;
	 	 JButton b1,b2,b3,b4,b5,b6;
	 	  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	 	 JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	 	 ArrayList list;
	 	 Details dt;
	 	 public void start()
	 	 {
	 	 	list=new ArrayList();
	 	 l1=new JLabel("acc_No is");
		l2=new JLabel("name of the account holder is");
		l3=new JLabel("the address of account holder is");
		l4=new JLabel("the balance in the account of account holder is");
		l5=new JLabel("acc_No is");
		l6=new JLabel("name of account holder is");
		l7=new JLabel("the address of account holder is");
		l8=new JLabel("the balance in the account is");
		l9=new JLabel("enter the unique acc_No of the customer to get the detail");
		l10=new JLabel("enter the name");
		l11=new JLabel();
		l12=new JLabel("enter the acc_No for which updation is to be done");
		t9=new JTextField();
		t10=new JTextField();
		t1=new JTextField();
 		t2=new JTextField();
 		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
 		t6=new JTextField();
 		t7=new JTextField();
		t8=new JTextField();
		t11=new JTextField();
		b1=new JButton("SUBMIT");
		b2=new JButton("NEXT-DATA");
		b3=new JButton("PREV-DATA");
		b4=new JButton("get-details");
		b5=new JButton("ENTER");
		b6=new JButton("UPDATE");
	 	 }
	 	 public void setComponent()
	 	 {
	 	 setLayout(null);
		l1.setBounds(30,30,300,25);
		l2.setBounds(30,90,300,25);
		t1.setBounds(290,30,100,25);
		t2.setBounds(340,90,500,25);
		l3.setBounds(30,152,300,25);
		t3.setBounds(340,152,500,25);
		l4.setBounds(30,210,275,25);
		t4.setBounds(325,210,240,25);
		b1.setBounds(55,280,110,45);
		b2.setBounds(195,280,130,45);
		b3.setBounds(335,280,130,45);
		l5.setBounds(30,335,250,25);
		l6.setBounds(30,386,300,25);
		t5.setBounds(290,335,100,25);
		t6.setBounds(340,386,500,25);
		l7.setBounds(30,440,300,25);
		t7.setBounds(340,440,500,25);
		l8.setBounds(30,495,350,25);
		t8.setBounds(300,495,500,25);
		l9.setBounds(30,540,410,25);
		t9.setBounds(460,540,150,25);
		l10.setBounds(30,585,260,25);
		t10.setBounds(310,585,165,25);
		b4.setBounds(100,620,129,25);
		l11.setBounds(30,660,390,26);
		l12.setBounds(30,690,300,25);
		t11.setBounds(340,690,30,25);
		b5.setBounds(45,720,130,25);
		b6.setBounds(475,280,130,45);
	 	 }
	 	public void addition()
	 	{
	 	add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(b1);
		add(b2);
		add(b3);
		add(l9);
		add(l10);
		add(t9);
		add(t10);
		add(b4);
		add(l12);
		add(t11);
		add(b5);
		add(b6);
		b1.addActionListener(new MyHand());
		b2.addActionListener(new MyHand1());
		b3.addActionListener(new MyHand2());
		b4.addActionListener(new MyHand3());
		b5.addActionListener(new MyHand4());
		b6.addActionListener(new MyHand());
	 	}
	 	public Exampl(String s)
	 	{
	 		super(s);
	 	}
	 	public Exampl(){}

	 	class MyHand  implements ActionListener
	 	{
	 		
	 		public void actionPerformed(ActionEvent e)
	 		{	
	 			 dt=new Details();
	 			dt.setAccNo(Integer.parseInt(t1.getText()));
	 			dt.setName(t2.getText());
	 			dt.setAdd(t3.getText());
	 			dt.setIntAmt(Integer.parseInt(t4.getText()));
	 			list.add(dt);
	 			 it=list.listIterator();
	 		}
	 	}					
	 	class MyHand1 implements ActionListener
	 		{		
	 			public void actionPerformed(ActionEvent e){
	 				if(it.hasNext())
	 				 dt=(Details)it.next();
	 				t5.setText(Integer.toString(dt.getNo()));
	 				t6.setText(dt.getName());
	 				t7.setText(dt.getAddres());
	 				t8.setText(Integer.toString(dt.getBalance()));
	 			}
	 		}

	 	class MyHand2 implements ActionListener
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{
	 			if(it.hasPrevious()){
	 				 dt=(Details)it.previous();
	 				t5.setText(Integer.toString(dt.getNo()));
	 				t6.setText(dt.getName());
	 				t7.setText(dt.getAddres());
	 				t8.setText(Integer.toString(dt.getBalance()));
	 			}
	 		}
	 	}
	 	class MyHand4 implements ActionListener
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{
	 			do{
	 			dt=(Details)it.next();
	 			}while(dt.getNo()!=Integer.parseInt(t11.getText()) && it.hasNext());
	 			if(dt==null)
	 				l11.setText("there is no customer having that entered account number with that corresponding name");
	 			else	{
	 				t1.setText(Integer.toString(dt.getNo()));
	 				t2.setText(dt.getName());
	 				t3.setText(dt.getAddres());
	 				t4.setText(Integer.toString(dt.getBalance()));
	 				}
	 				list.remove(dt);
	 		}
	 	}
	 	class MyHand3 implements ActionListener
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{	
	 			do{
	 			dt=(Details)it.next();
	 			}while(dt.getNo()!=Integer.parseInt(t9.getText()) && dt.getName()!=t10.getText() && it.hasNext());
	 			if(dt==null)
	 				l11.setText("there is no customer having that entered account number with that corresponding name");
	 			else	{
	 				t5.setText(Integer.toString(dt.getNo()));
	 				t6.setText(dt.getName());
	 				t7.setText(dt.getAddres());
	 				t8.setText(Integer.toString(dt.getBalance()));
	 				}
	 		}
	 	}
}

class BankApp
{
	 
	 public static void main(String[] args) {
		Exampl jf=new Exampl("WELCOME TO RECORD MANAGER");
		jf.start();
		jf.setComponent();
		jf.addition();
		jf.setSize(950,850);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}