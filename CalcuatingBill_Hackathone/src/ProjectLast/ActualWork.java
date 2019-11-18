package ProjectLast;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ActualWork  extends JFrame
{
	ActualWork()
	{
		
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
		
		
		
		//firstframe
		JLabel l1=new JLabel("ChikenBurger");
		l1.setBounds(50, 50, 100, 30);
		
		JTextField chkbrgr=new JTextField();
		chkbrgr.setBounds(140, 50, 150, 20);
		
		JLabel l2=new JLabel("ChikenBurger Meal");
		l2.setBounds(50, 100, 100, 30);
		
		JTextField chkbrgrMeal=new JTextField();
		chkbrgrMeal.setBounds(140, 100, 150, 20);
		
		JLabel l3=new JLabel("Cheese Burger");
		l3.setBounds(50, 150, 100, 30);
		
		JTextField cheese=new JTextField();
		cheese.setBounds(140, 150, 150, 20);
		
		
		 String dr[]={"Tea","Coffee"};        
		  JComboBox cb=new JComboBox(dr);
		cb.setBounds(50, 200, 70, 30);
		
		JTextField drp=new JTextField();
		drp.setBounds(140, 200, 150, 20);
		
		
		JRadioButton r1=new JRadioButton("A)Home Delivery"); 
		r1.setBounds(10, 250, 150, 20);
		
		JRadioButton r2=new JRadioButton("B) Tax");  
		r2.setBounds(10, 270, 150, 20);
		
	/////////////////////////////////////////////////////////////////////////////	
		
		////////////////////////*********************Currency Converter
		JLabel curLabel=new JLabel("Currency Converter");
		curLabel.setBounds(350, 50, 200, 50);
		
		 String Country[]={"India","America"};        
		  JComboBox Cuntry=new JComboBox(Country);
		  Cuntry.setBounds(350, 100, 200, 50);
		
			JTextField drpCurrency=new JTextField();
			drpCurrency.setBounds(350, 230, 200, 40);
			
			
			JButton btnCalc=new JButton("Calculator");
			btnCalc.setBounds(650, 50, 100, 30);
			///////////////////////////////////////////////////////
			
			JTextField l = new JTextField(16); 
		    l.setEditable(false);
		    l.setBounds(700, 100, 250, 70);
		    add(l);
		    JButton b=new JButton("B");
			b.setBounds(700, 200, 50, 50);
			 JButton c=new JButton("C");
			c.setBounds(760, 200, 50, 50);
			JButton dot=new JButton("...");
			dot.setBounds(820, 200, 50, 50);
			 JButton Plus=new JButton("+");
			 Plus.setBounds(890, 200, 50, 50);
			
			 
			    JButton b7=new JButton("7");
			    b7.setBounds(700, 260, 50, 50);
				 JButton b8=new JButton("8");
				b8.setBounds(760, 260, 50, 50);
				JButton b9=new JButton("9");
				b9.setBounds(820, 260, 50, 50);
				 JButton Minus=new JButton("-");
				 Minus.setBounds(890, 260, 50, 50);
			
				  JButton b4=new JButton("4");
				    b4.setBounds(700, 320, 50, 50);
					 JButton b5=new JButton("5");
					b5.setBounds(760, 320, 50, 50);
					JButton b6=new JButton("6");
					b6.setBounds(820, 320, 50, 50);
					 JButton Mul=new JButton("*");
					 Mul.setBounds(890, 320, 50, 50);
					 
					    JButton b1=new JButton("1");
					    b1.setBounds(700, 380, 50, 50);
						 JButton b2=new JButton("2");
						b2.setBounds(760, 380, 50, 50);
						JButton b3=new JButton("3");
						b3.setBounds(820, 380, 50, 50);
						 JButton Div=new JButton("/");
						 Div.setBounds(890, 380, 50, 50);
						 
						 
						  JButton b0=new JButton("0");
						  b0.setBounds(700, 440, 50, 50);
							 JButton point=new JButton(".");
							 point.setBounds(760, 440, 50, 50);
							JButton bdot=new JButton(".");
							bdot.setBounds(820, 440, 50, 50);
							 JButton Equal=new JButton("=");
							 Equal.setBounds(890, 440, 50, 50);		 
			
			add(b);add(c);add(dot);add(Plus);add(b7);add(b8);add(b9);add(Minus);add(b4);add(b5);add(b6);add(Mul);
			add(b1);add(b2);add(b3);add(Div);
			add(b0);add(point);add(bdot);add(Equal);
			/////////////////////////////////////////////////////////////
		//	b1.addActionListener(new);
			
			
			
			
			////////////////////////////////////////////////////////////////////////
			JLabel tl=new JLabel("Tax");
			tl.setBounds(350, 300, 100, 30);
			
			JTextField tax=new JTextField();
			tax.setBounds(400, 300, 150, 20);
			
			JLabel subl=new JLabel("Sub Total");
			subl.setBounds(350, 350, 100, 30);
			
			JTextField subtotal=new JTextField();
			subtotal.setBounds(400, 350, 150, 20);
			
			JLabel totl=new JLabel("Total");
			totl.setBounds(350, 400, 100, 30);
			
			JTextField totalText=new JTextField();
			totalText.setBounds(400, 400, 150, 20);
		
		
		add(curLabel);add(Cuntry);add(drpCurrency);add(tl);add(tax);
		add(subl);add(subtotal);add(totl);add(totalText);add(btnCalc);
	/////////////////////////////////////////////////////////////////////////////////	//Secod Frame
		
		JLabel l6=new JLabel("CostofDrinks");
		l6.setBounds(50, 300, 100, 30);
		
		JTextField cstDrink=new JTextField();
		cstDrink.setBounds(140, 300, 150, 20);
		
		JLabel l7=new JLabel("CostOfmeal");
		l7.setBounds(50, 350, 100, 30);
		
		JTextField cstofMeal=new JTextField();
		cstofMeal.setBounds(140, 350, 150, 20);
		
		
		JLabel l8=new JLabel("CostOf Delivery");
		l8.setBounds(50, 400, 100, 30);
		
		JTextField cstDel=new JTextField();
		cstDel.setBounds(140, 400, 150, 20);
		//End Secod Frame
		
		//////////////////////////Third Frame/////////////////////
		JButton btnTot=new JButton("Total");
		btnTot.setBounds(40, 600, 100, 30);
		
		
		
		JButton btnReceipt=new JButton("Receipt");
		btnReceipt.setBounds(200, 600, 100, 30);
		
		
		//////////////////////////////////////////////////////////
		 
		  add(l1);add(l3);add(l2);add(cb);add(l6);add(l7);add(r1);add(r2);add(l8);
		  add(chkbrgr);add(chkbrgrMeal);add(cheese);add(drp);add(cstDrink);add(cstofMeal);add(cstDel);
		  add(btnTot);add(btnReceipt);
		  
		  
		  //Cost of Meal
		  //First Text Box
		  chkbrgr.addActionListener(new ActionListener() 
		  {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
				ConnectionManager con=new ConnectionManager();
				  Statement	stn = con.gtconctn().createStatement();	
				ResultSet rs = stn.executeQuery("Select Price,Pdct_ID,Tax from products where pdct_ID="+1);
				
				while(rs.next())
				 {
				  int Price=rs.getInt("Price");
				  int Tax=rs.getInt("Tax");
				  int PdctID=rs.getInt("Pdct_ID");
				  int total=Price*Integer.parseInt(chkbrgr.getText());
				  cstofMeal.setText(String.valueOf(total));	  
				  tax.setText(String.valueOf(Tax));
				  
				  String s1="INSERT INTO receipttab(pdID,OrderQuantity,Amountperproduct)VALUES("+PdctID+","+Integer.parseInt(chkbrgr.getText())+","+total+")";
				  stn.executeUpdate(s1);
				  int TotalperProduct=0;
				   TotalperProduct=Integer.parseInt(chkbrgr.getText())*total;
				  stn.executeUpdate("update receipttab set TotalperProduct="+TotalperProduct+" where pdID="+PdctID);
				  
				 }
				} catch (ClassNotFoundException|SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		  
		//Second Text Box
		  chkbrgrMeal.addActionListener(new ActionListener() 
		  {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
				ConnectionManager con=new ConnectionManager();
				  Statement	stn = con.gtconctn().createStatement();	
				ResultSet rs = stn.executeQuery("Select Price,Pdct_ID,Tax from products where pdct_ID="+2);
				
				while(rs.next())
				 {
				  int Price=rs.getInt("Price");
				  int Tax=rs.getInt("Tax");
				  int PdctID=rs.getInt("Pdct_ID");
				  int total=Price*Integer.parseInt(chkbrgrMeal.getText());
				  int t1=Integer.parseInt(cstofMeal.getText());
				  int tot=total+t1;
				  
				  cstofMeal.setText(String.valueOf(tot));
				  int tax1=Tax+Integer.parseInt(tax.getText());
				  tax.setText(String.valueOf(tax1));
				  
				  String s1="INSERT INTO receipttab(pdID,OrderQuantity,Amountperproduct)VALUES("+PdctID+","+Integer.parseInt(chkbrgrMeal.getText())+","+total+")";
				  stn.executeUpdate(s1);
				  int TotalperProduct=Integer.parseInt(chkbrgrMeal.getText())*total;
				  stn.executeUpdate("update receipttab set TotalperProduct="+TotalperProduct+" where pdID="+PdctID);
				 }
				} catch (ClassNotFoundException|SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		  
			//Third Text Box
		  cheese.addActionListener(new ActionListener() 
		  {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
				ConnectionManager con=new ConnectionManager();
				  Statement	stn = con.gtconctn().createStatement();	
				ResultSet rs = stn.executeQuery("Select Price,Pdct_ID,Tax from products where pdct_ID="+3);
				
				while(rs.next())
				 {
				  int Price=rs.getInt("Price");
				  int Tax=rs.getInt("Tax");
				  int PdctID=rs.getInt("Pdct_ID");
				  int total=Price*Integer.parseInt(cheese.getText());
				  int t1=Integer.parseInt(cstofMeal.getText());
				  int tot=total+t1;	  
				  int tax1=Tax+Integer.parseInt(tax.getText());
				  tax.setText(String.valueOf(tax1));
				  
				  String s1="INSERT INTO receipttab(pdID,OrderQuantity,Amountperproduct)VALUES("+PdctID+","+Integer.parseInt(cheese.getText())+","+total+")";
				  stn.executeUpdate(s1);
				  int TotalperProduct=Integer.parseInt(cheese.getText())*total;
				  stn.executeUpdate("update receipttab set TotalperProduct="+TotalperProduct+" where pdID="+PdctID);
				  
				  int sub=Integer.parseInt(tax.getText());
				  subtotal.setText(String.valueOf(sub));
				  totalText.setText(String.valueOf(sub));
				  
				  cstofMeal.setText(String.valueOf(tot));
				  
				 }
				} catch (ClassNotFoundException|SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		  
		//End Cost of Meal
		  
		  
		  
		  
		  
		  //////////////////////////////////////Cost of Drinks///////////////////////////////
		  //Tea
		  drp.addActionListener(new ActionListener() 
		  {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
				ConnectionManager con=new ConnectionManager();
				  Statement	stn = con.gtconctn().createStatement();	
				//  String dr=cb.getText();
				  String s="Select Drinkname,Value,DrinkID from drinks where Drinkname="+"'Tea'";
				//  System.out.println(s);
				  ResultSet rs = stn.executeQuery(s);
				
				while(rs.next())
				 {
				  int Value=rs.getInt("Value");
				//  System.out.println(Value);
				  int total=Value*Integer.parseInt(drp.getText());
				
				  cstDrink.setText(String.valueOf(total));
				 }
				} catch (ClassNotFoundException|SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		  
		  //Coffee
		  /*
		  drp.addActionListener(new ActionListener() 
		  {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
				ConnectionManager con=new ConnectionManager();
				  Statement	stn = con.gtconctn().createStatement();	
				//  String dr=cb.getText();
				  String s="Select Drinkname,Value,DrinkID from drinks where Drinkname="+"'Coffe'"+"AND where DrinkID="+2;
				//  System.out.println(s);
				  ResultSet rs = stn.executeQuery(s);
				
				while(rs.next())
				 {
				  int Value=rs.getInt("Value");
				  System.out.println(Value);
				  int total=Value*Integer.parseInt(drp.getText());
				
				  cstDrink.setText(String.valueOf(total));
				 }
				} catch (ClassNotFoundException|SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		  */
		  /////////////////////////////////////////////////////////////////////////
		  //////////////////////////////Cost of delivery//////////////////////////////////////////////////////
		  
		  r1.addActionListener(new ActionListener() 
		  {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				cstDel.setText("50");
				
			}
		});
			////////////////////////////////////////////////curency//////////////////////
		  btnTot.addActionListener(new ActionListener() 
		  {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int total=Integer.parseInt(cstDel.getText())+Integer.parseInt(cstDrink.getText())+Integer.parseInt(cstofMeal.getText());
				drpCurrency.setText("INR"+String.valueOf(total));
			//	System.out.println(total);
				
			}
		});
		  
		  ///////////////////////////////////////////////////////////////////////////////
		  
	    Cuntry.addActionListener(new ActionListener() 
	    {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(Cuntry.getSelectedItem()=="America")
				{
					int total=Integer.parseInt(cstDel.getText())+Integer.parseInt(cstDrink.getText())+Integer.parseInt(cstofMeal.getText());
					drpCurrency.setText("$"+String.valueOf(total/16));
				}
				
			}
		});
	    ///////////////////////////////////////////////////////////////////////
	    
	    ////////////////////////////Receipt///////////////////////////////
	    btnReceipt.addActionListener(new ActionListener()
	    {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JFrame Rf=new JFrame();
				
				Rf.setSize(400,400);
				Rf.setLayout(null);
				Rf.setVisible(true);
				Rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				JLabel l1=new JLabel("ProductName");
				l1.setBounds(10,25,150,30);
				
				JLabel l2=new JLabel("OrderQuantity");
				l2.setBounds(120,25,150,30);
				
				JLabel l3=new JLabel("TotalperProduct");
				l3.setBounds(240,25,150,30);
				
				Rf.add(l1);Rf.add(l2);Rf.add(l3);
				
				ConnectionManager con=new ConnectionManager();
				try {
					Statement stn=con.gtconctn().createStatement();
					String s="SELECT   P.PdctName,R.OrderQuantity,R.TotalperProduct  FROM products P\r\n" + 
							"inner join receipttab R \r\n" + 
							"ON p.Pdct_ID=r.pdID;";
					ResultSet rs=stn.executeQuery(s);
					 int a=0;	
						
						while(rs.next())
						{
							String PdctName=rs.getString("PdctName");
							String OrderQuantity=rs.getString("OrderQuantity");
							String TotalperProduct=rs.getString("TotalperProduct");
							
							
							 JLabel pdname=new JLabel(PdctName);
							 pdname.setBounds(10,50+a,150,30);;
							    
								JLabel orderq=new JLabel(OrderQuantity);
								orderq.setBounds(120,50+a,150,30);
								
								JLabel ttperprodt=new JLabel(TotalperProduct);
								ttperprodt.setBounds(240,50+a,150,30);
								
								
								Rf.add(pdname);Rf.add(orderq);Rf.add(ttperprodt);
								a=a+30;
							
						}
			 
			}catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
				
			}
		});
	    /////////////////////////////////////////////////////Calculator////////////////////
	    
        
	    ///////////////////////////////////////////////////////////////////////////////////////
	    btnCalc.addActionListener(new ActionListener()
	    {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
			
			
		  
		    }			
			
		});
	    
	    
		   setSize(400,800);
		   setLayout(null);
		   setVisible(true);
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 //end firstframe
		     
		
		
	}

}
