package mx.uabcs.programaciongui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

 

public class Memorama extends JFrame implements MouseListener, Runnable {
	
	JButton iniciajuego=new JButton("INICIAR JUEGO");
	JButton salir=new JButton("SALIR DEL JUEGO");
	JButton nivel1= new JButton("NOVATO");
	JButton nivel2= new JButton("SEMIPROFESIONAL");
	JButton nivel3= new JButton("PROFESIONAL");
	int minutos=0, segundos=0, horas=0;
	JButton b1;
	JButton b2;
	Thread crono;
	JLabel lblReloj;
	boolean accion,
	suspend;
	
	/*static JButton ima1=new JButton();
	static JButton ima2=new JButton();
	static JButton ima3=new JButton();
	static JButton ima4=new JButton();
	static JButton ima5=new JButton();
	static JButton ima6=new JButton();
	static JButton ima7=new JButton();
	static JButton ima8=new JButton();
	static JButton ima9=new JButton();
	static JButton ima10=new JButton();
	static JButton ima11=new JButton();
	static JButton ima12=new JButton();
	static JButton ima13=new JButton();
	static JButton ima14=new JButton();
	static JButton ima15=new JButton();
	static JButton ima16=new JButton();
	static JButton ima17=new JButton();
	static JButton ima18=new JButton();
	//////////////////////////////////
	static JButton ima19=new JButton();
	static JButton ima20=new JButton();
	static JButton ima21=new JButton();
	static JButton ima22=new JButton();
	static JButton ima23=new JButton();
	static JButton ima24=new JButton();
	static JButton ima25=new JButton();
	static JButton ima26=new JButton();
	static JButton ima27=new JButton();
	static JButton ima28=new JButton();
	static JButton ima29=new JButton();
	static JButton ima30=new JButton();
	static JButton ima31=new JButton();
	static JButton ima32=new JButton();
	static JButton ima33=new JButton();
	static JButton ima34=new JButton();
	static JButton ima35=new JButton();
	static JButton ima36=new JButton();*/
	
	JPanel p=new JPanel();
	
	Activa act=new Activa();
	int y[], contador, contador2;

	static ImageIcon x[]=new ImageIcon[14];
	
	public Memorama(){
		
		this.lblReloj = new JLabel("");
		this.lblReloj.setBounds(840, 250, 290, 30);
		this.add(lblReloj);
		crono = new Thread (this);
		
		
	setTitle("Mi Memorama");
	setSize(1000,400);
	Container contenedor=getContentPane();
	contenedor.add(p);
	p.setLayout(null);
	p.add(iniciajuego);iniciajuego.setBounds(800,50,150,50);
	iniciajuego.setBackground(Color.LIGHT_GRAY);
	//p.add(salir);salir.setBounds(800,100,170,30);
	p.add(nivel1);
	nivel1.setBounds(800, 100, 150, 50);
	p.add(nivel2);
	nivel2.setBounds(800, 150, 150, 50);
	p.add(nivel3);
	nivel3.setBounds(800, 200, 150, 50);
	//Fila uno
	  /* p.add(ima1);ima1.setBounds(0,10,100,100);
	   p.add(ima2);ima2.setBounds(120,10,100,100);
	   p.add(ima3);ima3.setBounds(240,10,100,100);
	   p.add(ima4);ima4.setBounds(360,10,100,100);
	   p.add(ima5);ima5.setBounds(480,10,100,100);
	   p.add(ima6);ima6.setBounds(600,10,100,100);
	   //Fila dos
	   p.add(ima7);ima7.setBounds(0,120,100,100);
	   p.add(ima8);ima8.setBounds(120,120,100,100);
	   p.add(ima9);ima9.setBounds(240,120,100,100);
	   p.add(ima10);ima10.setBounds(360,120,100,100);
	   p.add(ima11);ima11.setBounds(480,120,100,100);
	   p.add(ima12);ima12.setBounds(600,120,100,100);
	   
	  //fila tres
	   
	    p.add(ima13);ima13.setBounds(0,230,100,100); 
	   p.add(ima14);ima14.setBounds(120,230,100,100);
	    p.add(ima15);ima15.setBounds(240,230,100,100);
	   p.add(ima16);ima16.setBounds(360,230,100,100);
	   p.add(ima17);ima17.setBounds(480,230,100,100);
	   p.add(ima18);ima18.setBounds(600,230,100,100);
	   
	 //Fila cuatro
	   p.add(ima19);ima19.setBounds(0,340,100,100); 
	   p.add(ima20);ima20.setBounds(120,340,100,100);
	    p.add(ima21);ima21.setBounds(240,340,100,100);
	   p.add(ima22);ima22.setBounds(360,340,100,100);
	   p.add(ima23);ima23.setBounds(480,340,100,100);
	   p.add(ima24);ima24.setBounds(600,340,100,100);
	   
	   //Fila 5
	   p.add(ima25);ima25.setBounds(0,450,100,100); 
	   p.add(ima26);ima26.setBounds(120,450,100,100);
	    p.add(ima27);ima27.setBounds(240,450,100,100);
	   p.add(ima28);ima28.setBounds(360,450,100,100);
	   p.add(ima29);ima29.setBounds(480,450,100,100);
	   p.add(ima30);ima30.setBounds(600,450,100,100);
	 //Fila 6
	   p.add(ima31);ima31.setBounds(0,560,100,100); 
	   p.add(ima32);ima32.setBounds(120,560,100,100);
	    p.add(ima33);ima33.setBounds(240,560,100,100);
	   p.add(ima34);ima34.setBounds(360,560,100,100);
	   p.add(ima35);ima35.setBounds(480,560,100,100);
	   p.add(ima36);ima36.setBounds(600,560,100,100);
	   
	   x[0]=new ImageIcon("img/0.jpg");
	   x[1]=new ImageIcon("img/1.jpg");
	   x[2]=new ImageIcon("img/2.jpg");
	   x[3]=new ImageIcon("img/3.jpg");
	   x[4]=new ImageIcon("img/4.jpg");
	   x[5]=new ImageIcon("img/6.jpg");
	   x[6]=new ImageIcon("img/7.jpg");
	   x[7]=new ImageIcon("img/8.jpg");
	   x[8]=new ImageIcon("img/9.jpg");
	   x[9]=new ImageIcon("img/10.jpg");
	   x[10]=new ImageIcon("img/11.jpg");
	   x[11]=new ImageIcon("img/12.jpg");
	   x[12]=new ImageIcon("img/13.jpg");
	   x[13]=new ImageIcon("img/oculta.jpg");
	   
	   //Imagen oculta
	   ima1.setIcon(x[13]);
	   ima2.setIcon(x[13]);
	   ima3.setIcon(x[13]);
	   ima4.setIcon(x[13]);
	   ima5.setIcon(x[13]);
	   ima6.setIcon(x[13]);
	   ima7.setIcon(x[13]);
	   ima8.setIcon(x[13]);
	   ima9.setIcon(x[13]);
	   ima10.setIcon(x[13]);
	   ima11.setIcon(x[13]);
	   ima12.setIcon(x[13]);
	   ima13.setIcon(x[13]);
	   ima14.setIcon(x[13]);
	   ima15.setIcon(x[13]);
	   ima16.setIcon(x[13]);
	   ima17.setIcon(x[13]);
	   ima18.setIcon(x[13]);
	   ima19.setIcon(x[13]);
	   ima20.setIcon(x[13]);
	   ima21.setIcon(x[13]);
	   ima22.setIcon(x[13]);
	   ima23.setIcon(x[13]);
	   ima24.setIcon(x[13]);
	   ima25.setIcon(x[13]);
	   ima26.setIcon(x[13]);
	   ima27.setIcon(x[13]);
	   ima28.setIcon(x[13]);
	   ima29.setIcon(x[13]);
	   ima30.setIcon(x[13]);
	   ima31.setIcon(x[13]);
	   ima32.setIcon(x[13]);
	   ima33.setIcon(x[13]);
	   ima34.setIcon(x[13]);
	   ima35.setIcon(x[13]);
	   ima36.setIcon(x[13]);
	  
	   y=Aleatorios.calcula();*/
	   
	/*ima1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent w)
	{
		ima1.setIcon(x[y[0]]);
		if(contador==0){
		b1=ima1;
		contador++;
		
		}
		else{
		b2=ima1;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		
				
		}
	}});
	
	ima2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent w)
	{
		ima2.setIcon(x[y[1]]);
		if(contador==0){
		b1=ima2;
		contador++;}
		else{
		b2=ima2;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		
	}
	}});
	
	ima3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent w)
	{
		ima3.setIcon(x[y[2]]);
		if(contador==0){
		b1=ima3;
		contador++;}
		else{
		b2=ima3;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		
		}
	}});
	
	ima4.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent w){
	ima4.setIcon(x[y[3]]);
	if(contador==0){
	b1=ima4;
	contador++;}
	else{
	b2=ima4;
	act=new Activa();
	act.start();
	contador=0;
	//JOptionPane.showMessageDialog(null,"ERROR"); 
	}
	}});
	
	ima5.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent w){
	ima5.setIcon(x[y[4]]);
	if(contador==0){
	b1=ima5;
	contador++;}
	else{
	b2=ima5;
	act=new Activa();
	act.start();
	contador=0;
	//JOptionPane.showMessageDialog(null,"ERROR"); 
	}
	}});
	
	ima6.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent w){
	ima6.setIcon(x[y[5]]);
	if(contador==0){
	b1=ima6;
	contador++;}
	else{
	b2=ima6;
	act=new Activa();
	act.start();
	contador=0;
	//JOptionPane.showMessageDialog(null,"ERROR"); 
	}
	}});
	
	ima7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima7.setIcon(x[y[0]]);
		if(contador==0){
		b1=ima7;
		contador++;}
		else{
		b2=ima7;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	
	ima8.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima8.setIcon(x[y[1]]);
		if(contador==0){
		b1=ima8;
		contador++;}
		else{
		b2=ima8;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima10.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima10.setIcon(x[y[2]]);
		if(contador==0){
		b1=ima10;
		contador++;}
		else{
		b2=ima10;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima9.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima9.setIcon(x[y[3]]);
		if(contador==0){
		b1=ima9;
		contador++;}
		else{
		b2=ima9;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima12.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima12.setIcon(x[y[4]]);
		if(contador==0){
		b1=ima12;
		contador++;}
		else{
		b2=ima12;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima11.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima11.setIcon(x[y[5]]);
		if(contador==0){
		b1=ima11;
		contador++;}
		else{
		b2=ima11;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima13.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima13.setIcon(x[y[0]]);
		if(contador==0){
		b1=ima13;
		contador++;}
		else{
		b2=ima13;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima14.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima14.setIcon(x[y[1]]);
		if(contador==0){
		b1=ima14;
		contador++;}
		else{
		b2=ima14;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima16.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima16.setIcon(x[y[2]]);
		if(contador==0){
		b1=ima16;
		contador++;}
		else{
		b2=ima16;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima15.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima15.setIcon(x[y[3]]);
		if(contador==0){
		b1=ima15;
		contador++;}
		else{
		b2=ima15;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima17.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima17.setIcon(x[y[4]]);
		if(contador==0){
		b1=ima17;
		contador++;}
		else{
		b2=ima17;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima18.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima18.setIcon(x[y[5]]);
		if(contador==0){
		b1=ima18;
		contador++;}
		else{
		b2=ima18;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	
	ima19.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima19.setIcon(x[y[0]]);
		if(contador==0){
		b1=ima19;
		contador++;}
		else{
		b2=ima19;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	
	ima20.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima20.setIcon(x[y[1]]);
		if(contador==0){
		b1=ima20;
		contador++;}
		else{
		b2=ima20;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	
	ima21.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima21.setIcon(x[y[2]]);
		if(contador==0){
		b1=ima21;
		contador++;}
		else{
		b2=ima21;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	
	ima22.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima22.setIcon(x[y[3]]);
		if(contador==0){
		b1=ima22;
		contador++;}
		else{
		b2=ima22;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	
	ima23.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima23.setIcon(x[y[4]]);
		if(contador==0){
		b1=ima23;
		contador++;}
		else{
		b2=ima23;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	
	ima24.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima24.setIcon(x[y[5]]);
		if(contador==0){
		b1=ima24;
		contador++;}
		else{
		b2=ima24;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima25.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima25.setIcon(x[y[0]]);
		if(contador==0){
		b1=ima25;
		contador++;}
		else{
		b2=ima25;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima26.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima26.setIcon(x[y[1]]);
		if(contador==0){
		b1=ima26;
		contador++;}
		else{
		b2=ima26;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima27.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima27.setIcon(x[y[2]]);
		if(contador==0){
		b1=ima27;
		contador++;}
		else{
		b2=ima27;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima28.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima28.setIcon(x[y[3]]);
		if(contador==0){
		b1=ima28;
		contador++;}
		else{
		b2=ima28;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima29.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima29.setIcon(x[y[4]]);
		if(contador==0){
		b1=ima29;
		contador++;}
		else{
		b2=ima29;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima30.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima30.setIcon(x[y[5]]);
		if(contador==0){
		b1=ima30;
		contador++;}
		else{
		b2=ima30;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima31.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima31.setIcon(x[y[0]]);
		if(contador==0){
		b1=ima31;
		contador++;}
		else{
		b2=ima31;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima32.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima32.setIcon(x[y[1]]);
		if(contador==0){
		b1=ima32;
		contador++;}
		else{
		b2=ima32;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima33.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima33.setIcon(x[y[2]]);
		if(contador==0){
		b1=ima33;
		contador++;}
		else{
		b2=ima33;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima34.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima34.setIcon(x[y[3]]);
		if(contador==0){
		b1=ima34;
		contador++;}
		else{
		b2=ima34;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima35.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima35.setIcon(x[y[4]]);
		if(contador==0){
		b1=ima35;
		contador++;}
		else{
		b2=ima35;
		act=new Activa();
		act.start();
		contador=0;
		///JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});
	ima36.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
		ima36.setIcon(x[y[5]]);
		if(contador==0){
		b1=ima36;
		contador++;}
		else{
		b2=ima36;
		act=new Activa();
		act.start();
		contador=0;
		//JOptionPane.showMessageDialog(null,"ERROR"); 
		}
		}});*/
			
	
		
	iniciajuego.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent w){
	
	//y=Aleatorios.calcula();
		
		
	
	}});
	
	nivel1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
			crono.start();
	
			
			final JButton ima1=new JButton();
		 final JButton ima2=new JButton();
			 final JButton ima3=new JButton();
			 final JButton ima4=new JButton();
			 final JButton ima5=new JButton();
			 final JButton ima6=new JButton();
			 final JButton ima7=new JButton();
			 final JButton ima8=new JButton();
			 final JButton ima9=new JButton();
			 final JButton ima10=new JButton();
			 final JButton ima11=new JButton();
			final JButton ima12=new JButton();
			 final JButton ima13=new JButton();
			 final JButton ima14=new JButton();
			 final JButton ima15=new JButton();
			 final JButton ima16=new JButton();
			 final JButton ima17=new JButton();
			 final JButton ima18=new JButton();
			//////////////////////////////////
			 final JButton ima19=new JButton();
			 final JButton ima20=new JButton();
			 final JButton ima21=new JButton();
			 final JButton ima22=new JButton();
			 final JButton ima23=new JButton();
			 final JButton ima24=new JButton();
			 final JButton ima25=new JButton();
			 final JButton ima26=new JButton();
			final JButton ima27=new JButton();
			 final JButton ima28=new JButton();
			 final JButton ima29=new JButton();
			 final JButton ima30=new JButton();
			 final JButton ima31=new JButton();
			 final JButton ima32=new JButton();
			 final JButton ima33=new JButton();
			 final JButton ima34=new JButton();
			 final JButton ima35=new JButton();
			 final JButton ima36=new JButton();
			p.add(ima1);ima1.setBounds(0,10,100,100);
			   p.add(ima2);ima2.setBounds(120,10,100,100);
			   p.add(ima3);ima3.setBounds(240,10,100,100);
			   p.add(ima4);ima4.setBounds(360,10,100,100);
			   p.add(ima5);ima5.setBounds(480,10,100,100);
			   p.add(ima6);ima6.setBounds(600,10,100,100);
			   //Fila dos
			   p.add(ima7);ima7.setBounds(0,120,100,100);
			   p.add(ima8);ima8.setBounds(120,120,100,100);
			   p.add(ima9);ima9.setBounds(240,120,100,100);
			   p.add(ima10);ima10.setBounds(360,120,100,100);
			   p.add(ima11);ima11.setBounds(480,120,100,100);
			   p.add(ima12);ima12.setBounds(600,120,100,100);
			   
			  //fila tres
			   
			    p.add(ima13);ima13.setBounds(0,230,100,100); 
			   p.add(ima14);ima14.setBounds(120,230,100,100);
			    p.add(ima15);ima15.setBounds(240,230,100,100);
			   p.add(ima16);ima16.setBounds(360,230,100,100);
			   p.add(ima17);ima17.setBounds(480,230,100,100);
			   p.add(ima18);ima18.setBounds(600,230,100,100);
			   
			 //Fila cuatro
			   p.add(ima19);ima19.setBounds(0,340,100,100); 
			   p.add(ima20);ima20.setBounds(120,340,100,100);
			    p.add(ima21);ima21.setBounds(240,340,100,100);
			   p.add(ima22);ima22.setBounds(360,340,100,100);
			   p.add(ima23);ima23.setBounds(480,340,100,100);
			   p.add(ima24);ima24.setBounds(600,340,100,100);
			   
			   //Fila 5
			   p.add(ima25);ima25.setBounds(0,450,100,100); 
			   p.add(ima26);ima26.setBounds(120,450,100,100);
			    p.add(ima27);ima27.setBounds(240,450,100,100);
			   p.add(ima28);ima28.setBounds(360,450,100,100);
			   p.add(ima29);ima29.setBounds(480,450,100,100);
			   p.add(ima30);ima30.setBounds(600,450,100,100);
			 //Fila 6
			   p.add(ima31);ima31.setBounds(0,560,100,100); 
			   p.add(ima32);ima32.setBounds(120,560,100,100);
			    p.add(ima33);ima33.setBounds(240,560,100,100);
			   p.add(ima34);ima34.setBounds(360,560,100,100);
			   p.add(ima35);ima35.setBounds(480,560,100,100);
			   p.add(ima36);ima36.setBounds(600,560,100,100);
			   
			   //Se le agrega  el numero a la imagen
			   x[0]=new ImageIcon("img/0.jpg");
			   x[1]=new ImageIcon("img/1.jpg");
			   x[2]=new ImageIcon("img/2.jpg");
			   x[3]=new ImageIcon("img/3.jpg");
			   x[4]=new ImageIcon("img/4.jpg");
			   x[5]=new ImageIcon("img/6.jpg");
			   x[6]=new ImageIcon("img/7.jpg");
			   x[7]=new ImageIcon("img/8.jpg");
			   x[8]=new ImageIcon("img/9.jpg");
			   x[9]=new ImageIcon("img/10.jpg");
			   x[10]=new ImageIcon("img/11.jpg");
			   x[11]=new ImageIcon("img/12.jpg");
			   x[12]=new ImageIcon("img/13.jpg");
			   x[13]=new ImageIcon("img/oculta.jpg");
			   
			   //Imagen oculta
			   ima1.setIcon(x[13]);
			   ima2.setIcon(x[13]);
			   ima3.setIcon(x[13]);
			   ima4.setIcon(x[13]);
			   ima5.setIcon(x[13]);
			   ima6.setIcon(x[13]);
			   ima7.setIcon(x[13]);
			   ima8.setIcon(x[13]);
			   ima9.setIcon(x[13]);
			   ima10.setIcon(x[13]);
			   ima11.setIcon(x[13]);
			   ima12.setIcon(x[13]);
			   ima13.setIcon(x[13]);
			   ima14.setIcon(x[13]);
			   ima15.setIcon(x[13]);
			   ima16.setIcon(x[13]);
			   ima17.setIcon(x[13]);
			   ima18.setIcon(x[13]);
			   ima19.setIcon(x[13]);
			   ima20.setIcon(x[13]);
			   ima21.setIcon(x[13]);
			   ima22.setIcon(x[13]);
			   ima23.setIcon(x[13]);
			   ima24.setIcon(x[13]);
			   ima25.setIcon(x[13]);
			   ima26.setIcon(x[13]);
			   ima27.setIcon(x[13]);
			   ima28.setIcon(x[13]);
			   ima29.setIcon(x[13]);
			   ima30.setIcon(x[13]);
			   ima31.setIcon(x[13]);
			   ima32.setIcon(x[13]);
			   ima33.setIcon(x[13]);
			   ima34.setIcon(x[13]);
			   ima35.setIcon(x[13]);
			   ima36.setIcon(x[13]);
			  
			   y=Aleatorios.calcula();
			   ima1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w)
					{
						ima1.setIcon(x[y[0]]);
						//boton1 es igual a al imagen
						if(contador==0){
						b1=ima1;
						contador++;
						
						}
						else{
							//boton2 es igual a al imagen
						b2=ima1;
						//Activa la carta si sopn iguales la voltean
						act=new Activa();
						act.start();
						System.out.println("Son iguales");
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						
								
						}
					}});
					
					ima2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w)
					{
						ima2.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima2;
						contador++;}
						else{
						b2=ima2;
						act=new Activa();
						//si las cartas son iguales las voltea
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						
					}
					}});
					
					ima3.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w)
					{
						ima3.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima3;
						contador++;}
						else{
						b2=ima3;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						
						}
					}});
					
					ima4.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w){
					ima4.setIcon(x[y[3]]);
					if(contador==0){
					b1=ima4;
					contador++;}
					else{
					b2=ima4;
					act=new Activa();
					act.start();
					contador=0;
					//JOptionPane.showMessageDialog(null,"ERROR"); 
					}
					}});
					
					ima5.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w){
					ima5.setIcon(x[y[4]]);
					if(contador==0){
					b1=ima5;
					contador++;}
					else{
					b2=ima5;
					act=new Activa();
					act.start();
					contador=0;
					//JOptionPane.showMessageDialog(null,"ERROR"); 
					}
					}});
					
					ima6.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w){
					ima6.setIcon(x[y[5]]);
					if(contador==0){
					b1=ima6;
					contador++;}
					else{
					b2=ima6;
					act=new Activa();
					act.start();
					contador=0;
					//JOptionPane.showMessageDialog(null,"ERROR"); 
					}
					}});
					
					ima7.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima7.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima7;
						contador++;}
						else{
						b2=ima7;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima8.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima8.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima8;
						contador++;}
						else{
						b2=ima8;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima10.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima10.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima10;
						contador++;}
						else{
						b2=ima10;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima9.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima9.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima9;
						contador++;}
						else{
						b2=ima9;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima12.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima12.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima12;
						contador++;}
						else{
						b2=ima12;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima11.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima11.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima11;
						contador++;}
						else{
						b2=ima11;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima13.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima13.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima13;
						contador++;}
						else{
						b2=ima13;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima14.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima14.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima14;
						contador++;}
						else{
						b2=ima14;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima16.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima16.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima16;
						contador++;}
						else{
						b2=ima16;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima15.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima15.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima15;
						contador++;}
						else{
						b2=ima15;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima17.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima17.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima17;
						contador++;}
						else{
						b2=ima17;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima18.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima18.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima18;
						contador++;}
						else{
						b2=ima18;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima19.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima19.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima19;
						contador++;}
						else{
						b2=ima19;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima20.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima20.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima20;
						contador++;}
						else{
						b2=ima20;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima21.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima21.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima21;
						contador++;}
						else{
						b2=ima21;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima22.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima22.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima22;
						contador++;}
						else{
						b2=ima22;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima23.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima23.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima23;
						contador++;}
						else{
						b2=ima23;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima24.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima24.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima24;
						contador++;}
						else{
						b2=ima24;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima25.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima25.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima25;
						contador++;}
						else{
						b2=ima25;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima26.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima26.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima26;
						contador++;}
						else{
						b2=ima26;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima27.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima27.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima27;
						contador++;}
						else{
						b2=ima27;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima28.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima28.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima28;
						contador++;}
						else{
						b2=ima28;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima29.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima29.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima29;
						contador++;}
						else{
						b2=ima29;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima30.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima30.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima30;
						contador++;}
						else{
						b2=ima30;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima31.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima31.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima31;
						contador++;}
						else{
						b2=ima31;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima32.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima32.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima32;
						contador++;}
						else{
						b2=ima32;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima33.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima33.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima33;
						contador++;}
						else{
						b2=ima33;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima34.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima34.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima34;
						contador++;}
						else{
						b2=ima34;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima35.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima35.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima35;
						contador++;}
						else{
						b2=ima35;
						act=new Activa();
						act.start();
						contador=0;
						///JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima36.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima36.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima36;
						contador++;
						}
						else{
						b2=ima36;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					
		
		}});
	nivel2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
			
			crono.start();
			final JButton ima1=new JButton();
		 final JButton ima2=new JButton();
			 final JButton ima3=new JButton();
			 final JButton ima4=new JButton();
			 final JButton ima5=new JButton();
			 final JButton ima6=new JButton();
			 final JButton ima7=new JButton();
			 final JButton ima8=new JButton();
			 final JButton ima9=new JButton();
			 final JButton ima10=new JButton();
			 final JButton ima11=new JButton();
			final JButton ima12=new JButton();
			 final JButton ima13=new JButton();
			 final JButton ima14=new JButton();
			 final JButton ima15=new JButton();
			 final JButton ima16=new JButton();
			 final JButton ima17=new JButton();
			 final JButton ima18=new JButton();
			//////////////////////////////////
			 final JButton ima19=new JButton();
			 final JButton ima20=new JButton();
			 final JButton ima21=new JButton();
			 final JButton ima22=new JButton();
			 final JButton ima23=new JButton();
			 final JButton ima24=new JButton();
			 final JButton ima25=new JButton();
			 final JButton ima26=new JButton();
			final JButton ima27=new JButton();
			 final JButton ima28=new JButton();
			 final JButton ima29=new JButton();
			 final JButton ima30=new JButton();
			 final JButton ima31=new JButton();
			 final JButton ima32=new JButton();
			 final JButton ima33=new JButton();
			 final JButton ima34=new JButton();
			 final JButton ima35=new JButton();
			 final JButton ima36=new JButton();
			p.add(ima1);ima1.setBounds(0,10,100,100);
			   p.add(ima2);ima2.setBounds(120,10,100,100);
			   p.add(ima3);ima3.setBounds(240,10,100,100);
			   p.add(ima4);ima4.setBounds(360,10,100,100);
			   p.add(ima5);ima5.setBounds(480,10,100,100);
			   p.add(ima6);ima6.setBounds(600,10,100,100);
			   //Fila dos
			   p.add(ima7);ima7.setBounds(0,120,100,100);
			   p.add(ima8);ima8.setBounds(120,120,100,100);
			   p.add(ima9);ima9.setBounds(240,120,100,100);
			   p.add(ima10);ima10.setBounds(360,120,100,100);
			   p.add(ima11);ima11.setBounds(480,120,100,100);
			   p.add(ima12);ima12.setBounds(600,120,100,100);
			   
			  //fila tres
			   
			    p.add(ima13);ima13.setBounds(0,230,100,100); 
			   p.add(ima14);ima14.setBounds(120,230,100,100);
			    p.add(ima15);ima15.setBounds(240,230,100,100);
			   p.add(ima16);ima16.setBounds(360,230,100,100);
			   p.add(ima17);ima17.setBounds(480,230,100,100);
			   p.add(ima18);ima18.setBounds(600,230,100,100);
			   
			 //Fila cuatro
			   p.add(ima19);ima19.setBounds(0,340,100,100); 
			   p.add(ima20);ima20.setBounds(120,340,100,100);
			    p.add(ima21);ima21.setBounds(240,340,100,100);
			   p.add(ima22);ima22.setBounds(360,340,100,100);
			   p.add(ima23);ima23.setBounds(480,340,100,100);
			   p.add(ima24);ima24.setBounds(600,340,100,100);
			   
			   //Fila 5
			   p.add(ima25);ima25.setBounds(0,450,100,100); 
			   p.add(ima26);ima26.setBounds(120,450,100,100);
			    p.add(ima27);ima27.setBounds(240,450,100,100);
			   p.add(ima28);ima28.setBounds(360,450,100,100);
			   p.add(ima29);ima29.setBounds(480,450,100,100);
			   p.add(ima30);ima30.setBounds(600,450,100,100);
			 //Fila 6
			   p.add(ima31);ima31.setBounds(0,560,100,100); 
			   p.add(ima32);ima32.setBounds(120,560,100,100);
			    p.add(ima33);ima33.setBounds(240,560,100,100);
			   p.add(ima34);ima34.setBounds(360,560,100,100);
			   p.add(ima35);ima35.setBounds(480,560,100,100);
			   p.add(ima36);ima36.setBounds(600,560,100,100);
			   
			   x[0]=new ImageIcon("img/0.jpg");
			   x[1]=new ImageIcon("img/1.jpg");
			   x[2]=new ImageIcon("img/2.jpg");
			   x[3]=new ImageIcon("img/3.jpg");
			   x[4]=new ImageIcon("img/4.jpg");
			   x[5]=new ImageIcon("img/6.jpg");
			   x[6]=new ImageIcon("img/7.jpg");
			   x[7]=new ImageIcon("img/8.jpg");
			   x[8]=new ImageIcon("img/9.jpg");
			   x[9]=new ImageIcon("img/10.jpg");
			   x[10]=new ImageIcon("img/11.jpg");
			   x[11]=new ImageIcon("img/12.jpg");
			   x[12]=new ImageIcon("img/13.jpg");
			   x[13]=new ImageIcon("img/oculta.jpg");
			   
			   //Imagen oculta
			   ima1.setIcon(x[13]);
			   ima2.setIcon(x[13]);
			   ima3.setIcon(x[13]);
			   ima4.setIcon(x[13]);
			   ima5.setIcon(x[13]);
			   ima6.setIcon(x[13]);
			   ima7.setIcon(x[13]);
			   ima8.setIcon(x[13]);
			   ima9.setIcon(x[13]);
			   ima10.setIcon(x[13]);
			   ima11.setIcon(x[13]);
			   ima12.setIcon(x[13]);
			   ima13.setIcon(x[13]);
			   ima14.setIcon(x[13]);
			   ima15.setIcon(x[13]);
			   ima16.setIcon(x[13]);
			   ima17.setIcon(x[13]);
			   ima18.setIcon(x[13]);
			   ima19.setIcon(x[13]);
			   ima20.setIcon(x[13]);
			   ima21.setIcon(x[13]);
			   ima22.setIcon(x[13]);
			   ima23.setIcon(x[13]);
			   ima24.setIcon(x[13]);
			   ima25.setIcon(x[13]);
			   ima26.setIcon(x[13]);
			   ima27.setIcon(x[13]);
			   ima28.setIcon(x[13]);
			   ima29.setIcon(x[13]);
			   ima30.setIcon(x[13]);
			   ima31.setIcon(x[13]);
			   ima32.setIcon(x[13]);
			   ima33.setIcon(x[13]);
			   ima34.setIcon(x[13]);
			   ima35.setIcon(x[13]);
			   ima36.setIcon(x[13]);
			  
			   y=Aleatorios2.calcula2();
			   ima1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w)
					{
						ima1.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima1;
						contador++;
						
						}
						else{
						b2=ima1;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						
								
						}
					}});
					
					ima2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w)
					{
						ima2.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima2;
						contador++;}
						else{
						b2=ima2;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						
					}
					}});
					
					ima3.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w)
					{
						ima3.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima3;
						contador++;}
						else{
						b2=ima3;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						
						}
					}});
					
					ima4.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w){
					ima4.setIcon(x[y[3]]);
					if(contador==0){
					b1=ima4;
					contador++;}
					else{
					b2=ima4;
					act=new Activa();
					act.start();
					contador=0;
					//JOptionPane.showMessageDialog(null,"ERROR"); 
					}
					}});
					
					ima5.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w){
					ima5.setIcon(x[y[4]]);
					if(contador==0){
					b1=ima5;
					contador++;}
					else{
					b2=ima5;
					act=new Activa();
					act.start();
					contador=0;
					//JOptionPane.showMessageDialog(null,"ERROR"); 
					}
					}});
					
					ima6.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w){
					ima6.setIcon(x[y[5]]);
					if(contador==0){
					b1=ima6;
					contador++;}
					else{
					b2=ima6;
					act=new Activa();
					act.start();
					contador=0;
					//JOptionPane.showMessageDialog(null,"ERROR"); 
					}
					}});
					
					ima7.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima7.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima7;
						contador++;}
						else{
						b2=ima7;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima8.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima8.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima8;
						contador++;}
						else{
						b2=ima8;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima10.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima10.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima10;
						contador++;}
						else{
						b2=ima10;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima9.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima9.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima9;
						contador++;}
						else{
						b2=ima9;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima12.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima12.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima12;
						contador++;}
						else{
						b2=ima12;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima11.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima11.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima11;
						contador++;}
						else{
						b2=ima11;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima13.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima13.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima13;
						contador++;}
						else{
						b2=ima13;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima14.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima14.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima14;
						contador++;}
						else{
						b2=ima14;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima16.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima16.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima16;
						contador++;}
						else{
						b2=ima16;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima15.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima15.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima15;
						contador++;}
						else{
						b2=ima15;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima17.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima17.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima17;
						contador++;}
						else{
						b2=ima17;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima18.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima18.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima18;
						contador++;}
						else{
						b2=ima18;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima19.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima19.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima19;
						contador++;}
						else{
						b2=ima19;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima20.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima20.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima20;
						contador++;}
						else{
						b2=ima20;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima21.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima21.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima21;
						contador++;}
						else{
						b2=ima21;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima22.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima22.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima22;
						contador++;}
						else{
						b2=ima22;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima23.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima23.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima23;
						contador++;}
						else{
						b2=ima23;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima24.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima24.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima24;
						contador++;}
						else{
						b2=ima24;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima25.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima25.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima25;
						contador++;}
						else{
						b2=ima25;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima26.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima26.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima26;
						contador++;}
						else{
						b2=ima26;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima27.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima27.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima27;
						contador++;}
						else{
						b2=ima27;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima28.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima28.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima28;
						contador++;}
						else{
						b2=ima28;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima29.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima29.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima29;
						contador++;}
						else{
						b2=ima29;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima30.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima30.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima30;
						contador++;}
						else{
						b2=ima30;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima31.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima31.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima31;
						contador++;}
						else{
						b2=ima31;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima32.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima32.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima32;
						contador++;}
						else{
						b2=ima32;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima33.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima33.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima33;
						contador++;}
						else{
						b2=ima33;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima34.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima34.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima34;
						contador++;}
						else{
						b2=ima34;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima35.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima35.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima35;
						contador++;}
						else{
						b2=ima35;
						act=new Activa();
						act.start();
						contador=0;
						///JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima36.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima36.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima36;
						contador++;}
						else{
						b2=ima36;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
		
		}});
	
	nivel3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
			
			crono.start();
			final JButton ima1=new JButton();
		 final JButton ima2=new JButton();
			 final JButton ima3=new JButton();
			 final JButton ima4=new JButton();
			 final JButton ima5=new JButton();
			 final JButton ima6=new JButton();
			 final JButton ima7=new JButton();
			 final JButton ima8=new JButton();
			 final JButton ima9=new JButton();
			 final JButton ima10=new JButton();
			 final JButton ima11=new JButton();
			final JButton ima12=new JButton();
			 final JButton ima13=new JButton();
			 final JButton ima14=new JButton();
			 final JButton ima15=new JButton();
			 final JButton ima16=new JButton();
			 final JButton ima17=new JButton();
			 final JButton ima18=new JButton();
			//////////////////////////////////
			 final JButton ima19=new JButton();
			 final JButton ima20=new JButton();
			 final JButton ima21=new JButton();
			 final JButton ima22=new JButton();
			 final JButton ima23=new JButton();
			 final JButton ima24=new JButton();
			 final JButton ima25=new JButton();
			 final JButton ima26=new JButton();
			final JButton ima27=new JButton();
			 final JButton ima28=new JButton();
			 final JButton ima29=new JButton();
			 final JButton ima30=new JButton();
			 final JButton ima31=new JButton();
			 final JButton ima32=new JButton();
			 final JButton ima33=new JButton();
			 final JButton ima34=new JButton();
			 final JButton ima35=new JButton();
			 final JButton ima36=new JButton();
			p.add(ima1);ima1.setBounds(0,10,100,100);
			   p.add(ima2);ima2.setBounds(120,10,100,100);
			   p.add(ima3);ima3.setBounds(240,10,100,100);
			   p.add(ima4);ima4.setBounds(360,10,100,100);
			   p.add(ima5);ima5.setBounds(480,10,100,100);
			   p.add(ima6);ima6.setBounds(600,10,100,100);
			   //Fila dos
			   p.add(ima7);ima7.setBounds(0,120,100,100);
			   p.add(ima8);ima8.setBounds(120,120,100,100);
			   p.add(ima9);ima9.setBounds(240,120,100,100);
			   p.add(ima10);ima10.setBounds(360,120,100,100);
			   p.add(ima11);ima11.setBounds(480,120,100,100);
			   p.add(ima12);ima12.setBounds(600,120,100,100);
			   
			  //fila tres
			   
			    p.add(ima13);ima13.setBounds(0,230,100,100); 
			   p.add(ima14);ima14.setBounds(120,230,100,100);
			    p.add(ima15);ima15.setBounds(240,230,100,100);
			   p.add(ima16);ima16.setBounds(360,230,100,100);
			   p.add(ima17);ima17.setBounds(480,230,100,100);
			   p.add(ima18);ima18.setBounds(600,230,100,100);
			   
			 //Fila cuatro
			   p.add(ima19);ima19.setBounds(0,340,100,100); 
			   p.add(ima20);ima20.setBounds(120,340,100,100);
			    p.add(ima21);ima21.setBounds(240,340,100,100);
			   p.add(ima22);ima22.setBounds(360,340,100,100);
			   p.add(ima23);ima23.setBounds(480,340,100,100);
			   p.add(ima24);ima24.setBounds(600,340,100,100);
			   
			   //Fila 5
			   p.add(ima25);ima25.setBounds(0,450,100,100); 
			   p.add(ima26);ima26.setBounds(120,450,100,100);
			    p.add(ima27);ima27.setBounds(240,450,100,100);
			   p.add(ima28);ima28.setBounds(360,450,100,100);
			   p.add(ima29);ima29.setBounds(480,450,100,100);
			   p.add(ima30);ima30.setBounds(600,450,100,100);
			 //Fila 6
			   p.add(ima31);ima31.setBounds(0,560,100,100); 
			   p.add(ima32);ima32.setBounds(120,560,100,100);
			    p.add(ima33);ima33.setBounds(240,560,100,100);
			   p.add(ima34);ima34.setBounds(360,560,100,100);
			   p.add(ima35);ima35.setBounds(480,560,100,100);
			   p.add(ima36);ima36.setBounds(600,560,100,100);
			   
			   x[0]=new ImageIcon("img/0.jpg");
			   x[1]=new ImageIcon("img/1.jpg");
			   x[2]=new ImageIcon("img/2.jpg");
			   x[3]=new ImageIcon("img/3.jpg");
			   x[4]=new ImageIcon("img/4.jpg");
			   x[5]=new ImageIcon("img/6.jpg");
			   x[6]=new ImageIcon("img/7.jpg");
			   x[7]=new ImageIcon("img/8.jpg");
			   x[8]=new ImageIcon("img/9.jpg");
			   x[9]=new ImageIcon("img/10.jpg");
			   x[10]=new ImageIcon("img/11.jpg");
			   x[11]=new ImageIcon("img/12.jpg");
			   x[12]=new ImageIcon("img/13.jpg");
			   x[13]=new ImageIcon("img/oculta.jpg");
			   
			   //Imagen oculta
			   ima1.setIcon(x[13]);
			   ima2.setIcon(x[13]);
			   ima3.setIcon(x[13]);
			   ima4.setIcon(x[13]);
			   ima5.setIcon(x[13]);
			   ima6.setIcon(x[13]);
			   ima7.setIcon(x[13]);
			   ima8.setIcon(x[13]);
			   ima9.setIcon(x[13]);
			   ima10.setIcon(x[13]);
			   ima11.setIcon(x[13]);
			   ima12.setIcon(x[13]);
			   ima13.setIcon(x[13]);
			   ima14.setIcon(x[13]);
			   ima15.setIcon(x[13]);
			   ima16.setIcon(x[13]);
			   ima17.setIcon(x[13]);
			   ima18.setIcon(x[13]);
			   ima19.setIcon(x[13]);
			   ima20.setIcon(x[13]);
			   ima21.setIcon(x[13]);
			   ima22.setIcon(x[13]);
			   ima23.setIcon(x[13]);
			   ima24.setIcon(x[13]);
			   ima25.setIcon(x[13]);
			   ima26.setIcon(x[13]);
			   ima27.setIcon(x[13]);
			   ima28.setIcon(x[13]);
			   ima29.setIcon(x[13]);
			   ima30.setIcon(x[13]);
			   ima31.setIcon(x[13]);
			   ima32.setIcon(x[13]);
			   ima33.setIcon(x[13]);
			   ima34.setIcon(x[13]);
			   ima35.setIcon(x[13]);
			   ima36.setIcon(x[13]);
			  
			   y=Aleatorios3.calcula3();
			   ima1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w)
					{
						ima1.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima1;
						contador++;
						
						}
						else{
						b2=ima1;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						
								
						}
					}});
					
					ima2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w)
					{
						ima2.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima2;
						contador++;}
						else{
						b2=ima2;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						
					}
					}});
					
					ima3.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w)
					{
						ima3.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima3;
						contador++;}
						else{
						b2=ima3;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						
						}
					}});
					
					ima4.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w){
					ima4.setIcon(x[y[3]]);
					if(contador==0){
					b1=ima4;
					contador++;}
					else{
					b2=ima4;
					act=new Activa();
					act.start();
					contador=0;
					//JOptionPane.showMessageDialog(null,"ERROR"); 
					}
					}});
					
					ima5.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w){
					ima5.setIcon(x[y[4]]);
					if(contador==0){
					b1=ima5;
					contador++;}
					else{
					b2=ima5;
					act=new Activa();
					act.start();
					contador=0;
					//JOptionPane.showMessageDialog(null,"ERROR"); 
					}
					}});
					
					ima6.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent w){
					ima6.setIcon(x[y[5]]);
					if(contador==0){
					b1=ima6;
					contador++;}
					else{
					b2=ima6;
					act=new Activa();
					act.start();
					contador=0;
					//JOptionPane.showMessageDialog(null,"ERROR"); 
					}
					}});
					
					ima7.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima7.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima7;
						contador++;}
						else{
						b2=ima7;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima8.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima8.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima8;
						contador++;}
						else{
						b2=ima8;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima10.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima10.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima10;
						contador++;}
						else{
						b2=ima10;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima9.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima9.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima9;
						contador++;}
						else{
						b2=ima9;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima12.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima12.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima12;
						contador++;}
						else{
						b2=ima12;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima11.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima11.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima11;
						contador++;}
						else{
						b2=ima11;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima13.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima13.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima13;
						contador++;}
						else{
						b2=ima13;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima14.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima14.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima14;
						contador++;}
						else{
						b2=ima14;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima16.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima16.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima16;
						contador++;}
						else{
						b2=ima16;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima15.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima15.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima15;
						contador++;}
						else{
						b2=ima15;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima17.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima17.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima17;
						contador++;}
						else{
						b2=ima17;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima18.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima18.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima18;
						contador++;}
						else{
						b2=ima18;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima19.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima19.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima19;
						contador++;}
						else{
						b2=ima19;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima20.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima20.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima20;
						contador++;}
						else{
						b2=ima20;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima21.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima21.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima21;
						contador++;}
						else{
						b2=ima21;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima22.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima22.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima22;
						contador++;}
						else{
						b2=ima22;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima23.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima23.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima23;
						contador++;}
						else{
						b2=ima23;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					ima24.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima24.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima24;
						contador++;}
						else{
						b2=ima24;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima25.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima25.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima25;
						contador++;}
						else{
						b2=ima25;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima26.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima26.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima26;
						contador++;}
						else{
						b2=ima26;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima27.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima27.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima27;
						contador++;}
						else{
						b2=ima27;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima28.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima28.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima28;
						contador++;}
						else{
						b2=ima28;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima29.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima29.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima29;
						contador++;}
						else{
						b2=ima29;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima30.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima30.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima30;
						contador++;}
						else{
						b2=ima30;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima31.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima31.setIcon(x[y[0]]);
						if(contador==0){
						b1=ima31;
						contador++;}
						else{
						b2=ima31;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima32.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima32.setIcon(x[y[1]]);
						if(contador==0){
						b1=ima32;
						contador++;}
						else{
						b2=ima32;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima33.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima33.setIcon(x[y[2]]);
						if(contador==0){
						b1=ima33;
						contador++;}
						else{
						b2=ima33;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima34.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima34.setIcon(x[y[3]]);
						if(contador==0){
						b1=ima34;
						contador++;}
						else{
						b2=ima34;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima35.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima35.setIcon(x[y[4]]);
						if(contador==0){
						b1=ima35;
						contador++;}
						else{
						b2=ima35;
						act=new Activa();
						act.start();
						contador=0;
						///JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					ima36.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent w){
						ima36.setIcon(x[y[5]]);
						if(contador==0){
						b1=ima36;
						contador++;}
						else{
						b2=ima36;
						act=new Activa();
						act.start();
						contador=0;
						//JOptionPane.showMessageDialog(null,"ERROR"); 
						}
						}});
					
					
					
					
		
		}});

	/*nivel1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent w){
			
			class Aleatorios{
				public  int ar[][]=new int[6][6];
				public  void aleatorios()
				{
					
					int p=5,x1,y1,x,y ,a=0;
					for(int m=0; m<p; m++)
					{
						for(int j=0; j<p; j++)
						{
							
							for(int k=0; k<p; k++)
							{
								 x=(int) (Math.random()*6);
					 	   		  y=(int) (Math.random()*6);
					 	   		 
							
								if(m!=j && j!=k && m!=k)
								{
									ar[x][y]=m;
									ar[x][y]=j;
									ar[x][y]=k;
									
								
								}
								
								
								
							}
						}
					}
				}
				public int[] calcula()
				{
					aleatorios();
					
					int ar2[]=new int[6];
					int x=(int)(Math.random()*6);
					int y=(int)(Math.random()*6);
					
					for(int m=0; m<ar2.length; m++){
					
					if(m<6){
					
					ar2[m]=ar[x][m];
					}
					else{
					ar2[m]=ar[y][m];
					
					
				}
				
				
				}
				
				return ar2;
				}
				}
		}});*/
	
	}
	
	
	
	
	/*public static class inicializa{
	public static void inicializa(){
	ima1.setIcon(x[13]);
	ima2.setIcon(x[13]);
	ima3.setIcon(x[13]);
	ima4.setIcon(x[13]);
	ima5.setIcon(x[13]);
	ima6.setIcon(x[13]);
	ima7.setIcon(x[13]);
	ima8.setIcon(x[13]);
	ima9.setIcon(x[13]);
	ima10.setIcon(x[13]);
	ima11.setIcon(x[13]);
	ima12.setIcon(x[13]);
	ima13.setIcon(x[13]);
	ima14.setIcon(x[13]);
	ima15.setIcon(x[13]);
	ima16.setIcon(x[13]);
	ima17.setIcon(x[13]);
	ima18.setIcon(x[13]);
	ima19.setIcon(x[13]);
	ima20.setIcon(x[13]);
	ima21.setIcon(x[13]);
	ima22.setIcon(x[13]);
	ima23.setIcon(x[13]);
	ima24.setIcon(x[13]);
	ima25.setIcon(x[13]);
	ima26.setIcon(x[13]);
	ima27.setIcon(x[13]);
	ima28.setIcon(x[13]);
	ima29.setIcon(x[13]);
	ima30.setIcon(x[13]);
	ima31.setIcon(x[13]);
	ima32.setIcon(x[13]);
	ima33.setIcon(x[13]);
	ima34.setIcon(x[13]);
	ima35.setIcon(x[13]);
	ima36.setIcon(x[13]);
	
	
	ima1.setEnabled(true);
	ima2.setEnabled(true);
	ima3.setEnabled(true);
	ima4.setEnabled(true);
	ima5.setEnabled(true);
	ima6.setEnabled(true);
	ima7.setEnabled(true);
	ima8.setEnabled(true);
	ima9.setEnabled(true);
	ima10.setEnabled(true);
	ima11.setEnabled(true);
	ima12.setEnabled(true);
	ima13.setEnabled(true);
	ima14.setEnabled(true);
	ima15.setEnabled(true);
	ima16.setEnabled(true);
	ima17.setEnabled(true);
	ima18.setEnabled(true);
	ima19.setEnabled(true);
	ima20.setEnabled(true);
	ima21.setEnabled(true);
	ima22.setEnabled(true);
	ima23.setEnabled(true);
	ima24.setEnabled(true);
	ima25.setEnabled(true);
	ima26.setEnabled(true);
	ima27.setEnabled(true);
	ima28.setEnabled(true);
	ima29.setEnabled(true);
	ima30.setEnabled(true);
	ima31.setEnabled(true);
	ima32.setEnabled(true);
	ima33.setEnabled(true);
	ima34.setEnabled(true);
	ima35.setEnabled(true);
	ima36.setEnabled(true);
	
	}
	}*/
	
	class Activa extends Thread
	{
		public void run()
		{
			try{
				//pone las cartas con la imagen gris
				Thread.sleep(800);
				if(b1.getIcon().equals(b2.getIcon())==true){
				b2.setEnabled(false);
				b1.setEnabled(false);
			}
			else{
				b1.setIcon(x[13]);
				b2.setIcon(x[13]);
			}
			contador2++;
			}
			catch (Exception er)
			{
			}
		}
	}
	/////////////////PRIMER NIVEL
	public static class Aleatorios{
	public static  int ar[][]=new int[6][6];
	public static  void aleatorios()
	{
		//MEtoso para colocar el numero de las cartas en el arreglo
		int p=5,x1,y1,x,y ,a=0;
		for(int m=0; m<p; m++)
		{
			for(int j=0; j<p; j++)
			{
				
				for(int k=0; k<p; k++)
				{
					 x=(int) (Math.random()*6);
		 	   		  y=(int) (Math.random()*6);
		 	   		 
				
					if(m!=j && j!=k && m!=k)
					{
						ar[x][y]=m;
						ar[x][y]=j;
						ar[x][y]=k;
						
					
					}
					
					
					
				}
			}
		}
	}
	
		
	public static int[] calcula()
	{
		aleatorios();
		//Aqui genera los numero
		int ar2[]=new int[6];
		int x=(int)(Math.random()*6);
		int y=(int)(Math.random()*6);
		
		for(int m=0; m<ar2.length; m++){
		
		if(m<6){
		
		ar2[m]=ar[x][m];
		}
		else{
		ar2[m]=ar[y][m];
		
		
	}
	
	
	}
	
	return ar2;
	}
	}
	////////////SEGUNDO NIVEL
	public static class Aleatorios2{
		public static  int ar[][]=new int[9][9];
		public static  void aleatorios()
		{
			
			int p=9,x1,y1,x,y ,a=0;
			for(int m=0; m<p; m++)
			{
				for(int j=0; j<p; j++)
				{
					
					for(int k=0; k<p; k++)
					{
						 x=(int) (Math.random()*8);
			 	   		  y=(int) (Math.random()*8);
			 	   		 
					
						if(m!=j && j!=k && m!=k)
						{
							ar[x][y]=m;
							ar[x][y]=j;
							ar[x][y]=k;
							
						
						}
						
						
						
					}
				}
			}
		}
		
			
		public static int[] calcula2()
		{
			aleatorios();
			
			int ar2[]=new int[9];
			int x=(int)(Math.random()*8);
			int y=(int)(Math.random()*8);
			
			for(int m=0; m<ar2.length; m++){
			
			if(m<8){
			
			ar2[m]=ar[x][m];
			}
			else{
			ar2[m]=ar[y][m];
			
			
		}
		
		
		}
		
		return ar2;
		}
		}
	//////////////////// TERCER NIVEL
	/////////////////PRIMER NIVEL
	public static class Aleatorios3{
	public static  int arreglo[][]=new int[13][13];
	public static  void aleatorios()
	{
		
		int p=13,x1,y1,x=0,y=0 ,a=0;
		for(int m=0; m<p; m++)
		{
			for(int j=0; j<p; j++)
			{
				
				for(int k=0; k<p; k++)
				{
					
		 	   		 
				
					if(m!=j && j!=k && m!=k )
					{
						
						 x=(int) (Math.random()*13);
			 	   		 y=(int) (Math.random()*13);
			 	   		
						arreglo[x][y]=m;
						arreglo[x][y]=j;
						arreglo[x++][y]=k;
						
					
					}
					
					
					
				}
			}
		}
	}
	
		
	public static int[] calcula3()
	{
		aleatorios();
		
		int ar2[]=new int[13];
		int x=(int)(Math.random()*13);
		int y=(int)(Math.random()*13);
		
		for(int m=0; m<ar2.length; m++){
		
		if(m<13){
		
		ar2[m]=arreglo[x][m];
		}
		else{
		ar2[m]=arreglo[y][m];
		
		
	}
	
	
	}
	
	return ar2;
	}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
			nivel1.add(nivel1);
			nivel2.add(nivel2);
			nivel3.add(nivel3);
			
		/*if(!accion && !suspend)
		{
			crono.start();
			accion = true;
			suspend=true;
		}
		else
			if(accion && suspend)
			{
				crono.suspend();
				accion=false;
				suspend=true;
			}
			else
			{
				crono.resume();
				accion=true;
				suspend=true;
			}*/
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(;;)
			{
				if(segundos==59)
				{
					segundos=0;
					minutos++;
				}else
					if(minutos==59)
					{
						minutos=0;
						horas++;
					}
				
				if(minutos==2 && segundos==30)
				{
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,"PERDISTE JAJAJAJA"); 
					crono.stop();
				}
			
				
				segundos++;
				this.lblReloj.setText(horas+":"+minutos+":"+segundos);
			crono.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
	}
	
	
}
