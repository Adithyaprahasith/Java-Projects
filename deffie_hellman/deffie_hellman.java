package crypto;

import java.util.*;
import javax.swing.*;  
import java.awt.event.*;  

public class deffie_hellman implements ActionListener{
	static Scanner sc=new Scanner(System.in);
	public static char p[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z' };
    public static char ch[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O',
            'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C',
            'V', 'B', 'N', 'M' };
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12;
    JTextField m1,m2,m3,re1,re2,re3,re4,re5,rec1,rec2,re6,ty1;
    JTextArea a,b;
    JFrame M,j,h;
    JButton b1,b2,bb1,bb2,b4,ss1,ss2,ss3;  
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    DFH_KE(){  
    	  JLabel l1,l2,l5,l6,l7,l8;
    	  JFrame M=new JFrame();
          M.setSize(600,600);
        l8=new JLabel("Deffie Hellman Key Exchange Algorithm");
        l8.setBounds(250,10,500,50);
        //b4=new JButton("implement");b4.setBounds(400,60,110,20);
        		JFrame f= new JFrame("Key_Agreement");  
          		j= new JFrame("reciever"); 
          		h=new JFrame("chat"); //re4 5 6 rec12
          		f.add(l8);//f.add(b4);
        
        l1=new JLabel("Choose a  prime number p (public)");
        l1.setBounds(250,100,400,20);
        tf1=new JTextField();  
        tf1.setBounds(300,125,80,16);  
        l2=new JLabel("Choose another prime number g (public)");
        l2.setBounds(250,150,250,20);
        tf2=new JTextField();  
        tf2.setBounds(300,180,80,16);  
        l3=new JLabel("choose a random number x (private) ");
        l3.setBounds(250,230,250,16);
        tf3=new JTextField();  
        tf3.setBounds(300,255,80,16);  
        l4=new JLabel("choose a random number y (private)");
        l4.setBounds(250,310,250,16);
        tf4=new JTextField();  
       tf4.setBounds(300,335,80,16);
     
       b1=new JButton("check");  
       b1.setBounds(250,400,80,20);  
     //  b2=new JButton("show key");  b2.setBounds(400,400,90,20); b2.addActionListener(this); 
     
       JLabel kt=new JLabel("key status ");
      kt.setBounds(150,470, 200,30);
      f.add(kt);
        tf5=new JTextField();  
        tf5.setBounds(250,480,150,18);
        tf5.setEditable(false);
        JLabel st=new JLabel("condition");
        st.setBounds(150,510 ,150,30);
        f.add(st);
        tf12=new JTextField();
        tf12.setBounds(250,510 ,300, 30);
        tf12.setEditable(false);
        
      
      
        tf6=new JTextField();  
        tf6.setBounds(50,300,150,20);  
        
        tf7=new JTextField();  
        tf7.setBounds(50,50,150,20); 
        tf7.setEditable(false);
        
        tf10=new JTextField();  
        tf10.setBounds(50,650,200,20); 
        tf10.setEditable(false);
        b1.addActionListener(this);  
     //   l5=new JLabel("enter the message ");l5.setBounds(50,50,200,20); a=new JTextArea(); a.setBounds(50, 100,300, 200);
        m1=new JTextField();
        m1.setBounds(340,200,150,18);
        ss1=new JButton("send1");//chat
        ss1.setBounds(420,220,69,16);
        re1=new JTextField();
        re1.setBounds(150,240,150,18);
        m2=new JTextField();
        m2.setBounds(340,260,150,18);
        ss2=new JButton("send2");
        ss2.setBounds(420,280,69,16);
        re2=new JTextField();
        re2.setBounds(150,290,150,18);
        m3=new JTextField();
        m3.setBounds(340,310,150,18);
        ss3=new JButton("send3");
        ss3.setBounds(420,340,69,16);
        //re3=new JTextField();re3.setBounds(150,320,200,20);s4=new JButton("send4");s4.setBounds(300,370,100,30);
     
        bb1=new JButton("send");
        bb1.setBounds(450,210,100,20);
        bb1.addActionListener(this);
        
        re4=new JTextField();//reciver
        re4.setBounds(180,150,200,20);
      
        re5=new JTextField();
        re5.setBounds(180,210,200,20);
        re6=new JTextField();
        
        re6.setBounds(180,270,200,20);
        rec1=new JTextField();
        rec1.setBounds(400,180,200,20);
        
        rec2=new JTextField();
        rec2.setBounds(400,240,200,20);
       
        bb2=new JButton("send");
        bb2.setBounds(450,270,100,20);
        bb2.addActionListener(this);//reciever
        

        l6=new JLabel("Recieved  message is ");
        l6.setBounds(50,620,200,20);
        
        tf9=new JTextField();
        tf9.setBounds(50,400,200,20);
        tf9.setEditable(false);
        tf11=new JTextField();
        tf11.setBounds(50,400,200,20);
        tf11.setEditable(false);
        
       
      h.add(tf9);// h.add(l5); h.add(b3);
        h.setSize(800,800);
        h.setLayout(null);
        //h.setVisible(true);
        f.add(l1); f.add(tf1);f.add(tf4);f.add(tf3); f.add(tf5);f.add(b1);f.add(l2);f.add(tf2); f.add(tf12); f.add(l3);f.add(l4);
        f.setSize(950,950);  
        f.setLayout(null);  
     j.add(bb1);   j.add(tf7); j.add(tf10);j.add(l6); j.add(re4);j.add(bb2);
     j.add(re5);j.add(rec1);j.add(rec2);j.add(re6);
        h.add(m1); h.add(m2);h.add(m3);h.add(re1);
        h.add(ss1); h.add(ss2);h.add(ss3);h.add(re2);
        j.setSize(800,800);  //h.add(re3);
        j.setLayout(null); 
        f.setVisible(true); 
        ty1=new JTextField();
        ty1.setBounds(50,100,70, 30);
      //  h.add(ty1);      //  b4.addActionListener(this);
        ss1.addActionListener(this);
        ss2.addActionListener(this);
        ss3.addActionListener(this);

    }         
    private static String  enc(String s) {
    	char c[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (p[j] == s.charAt(i)){
                    c[i] = ch[j];
                    break;
                }
            }        	
        }
        return (new String(c));
    }
    private static String dec(String s) {
        char p1[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < 26; j++) {
                if (ch[j] == s.charAt(i)){
                    p1[i] = p[j];
                    break;
                }
            }
        }
        return (new String(p1));
    }
        
    public void actionPerformed(ActionEvent e) {  
    	String s1=tf1.getText();  
          String s2=tf2.getText(); 
          String s3=tf3.getText();  
          String s4=tf4.getText(); 
   //       String m=a.getText();
          String ms1=m1.getText();
          String ms2=m2.getText();
          String ms3=m3.getText();
          String ree1=rec1.getText();
          String ree2=rec2.getText();
     //     String m_4=m4.getText();
          int p=Integer.parseInt(s1);  
          int g=Integer.parseInt(s2); 
          int x=Integer.parseInt(s3);
          int y=Integer.parseInt(s4);
          int k1,k2,K,r1,r2;
          String en="",de="",cip="";
        String rr2="keys shared are equal ";
        Random r=new Random();
      /*  int x1=(int)(r.nextInt(10));
        int y1=(int) (r.nextInt(10));
            if((isPrime(p) &&isPrime(g))  && ((x1<p) && (y1<p))){
        int p1=x1*y1;
         		r1=(int)(Math.pow(g,x1)%p);
         		r2=(int)(Math.pow(g,y1)%p);
         		
         		k2=(int)(Math.pow(r1, y1)%p);
         		k1=(int)(Math.pow(r2, x1)%p);
         		K=(int)(Math.pow(g,p1)%p);
        */ 
       
         if((isPrime(p) &&isPrime(g))  && ((x<p) && (y<p))){
            	 int p1=x*y;//e
          		r1=(int)(Math.pow(g,x)%p);
         		r2=(int)(Math.pow(g,y)%p); //shares r1 and r2 eachother//d
         		k2=(int)(Math.pow(r1, y)%p);
         		k1=(int)(Math.pow(r2, x)%p);
         		K=(int)(Math.pow(g,p1)%p);
         		System.out.println(K);
         		if(e.getSource()==ss1) {
       			 en=enc(ms1.toLowerCase());
       			 System.out.println("entered message is "+ms1);
       			 System.out.println("encryption (cipher text) for message " +ms1+ " is " +en);
       			de=dec(en);
       			 System.out.println("decrypted message for cipher " +en+ " is " +de);
       			 
       			String ms="message encrypted and sent ";
       			tf9.setText(ms);
       			m1.setEditable(false);
       			j.setVisible(true);
       			re4.setText(ms1);
       			re4.setEditable(false);
       		}
         		else if(e.getSource()==ss2) {
          			 en=enc(ms2.toLowerCase());
          			String ms="message encrypted and sent ";
          			tf9.setText(ms);
          			m2.setEditable(false);
          			j.setVisible(true);
          			re5.setText(ms2);
           			re5.setEditable(false);
          		}
         		else if(e.getSource()==ss3) {
          			 en=enc(ms3.toLowerCase());
          			String ms="message encrypted and sent ";
          			tf9.setText(ms);
          			m3.setEditable(false);
          			j.setVisible(true);
          			re6.setText(ms3);
           			re6.setEditable(false);
          		}
         		else if(e.getSource()==bb1) {
         			 en=enc(ree1.toLowerCase());
         			String ms="message encrypted and sent ";
         			tf9.setText(ms);
         			rec1.setEditable(false);
         			j.setVisible(true);
         			re1.setText(ree1);
          			re1.setEditable(false);
         		}
         		else if(e.getSource()==bb2) {
        			 en=enc(ree2.toLowerCase());
        			String ms="message encrypted and sent ";
        			tf9.setText(ms);
        			rec2.setEditable(false);
        			j.setVisible(true);
        			re2.setText(ree2);
         			re2.setEditable(false);
        		}
       		else if(e.getSource()==b1){   
       			//M.setVisible(true);
       			tf5.setText("keys shared are equal "+k1);
                //   tf5.setText(String.valueOf(k1)); 
               }
       		//else if(e.getSource()==b2){  
              // 	tf5.setText(String.valueOf(k2)); }  
               String result=String.valueOf(x);  
          //     tf11.setText(result); 
               
               if(k1==k2) {
            //	   j.setVisible(false);
               	   h.setVisible(true);
               	   tf7.setText(rr2);
               	String d =dec(en);
               	tf10.setText(d);
               }
               else {
               	tf5.setText("keys are not equal");
               	tf12.setText("cannot generate keys");
               }
         }       
             else {
            	 String v=String.valueOf(y);
            tf12.setText("one of the condition has failed check again !! ");	 
             }
        
}
    private static boolean isPrime(int n) {
	       int i;
	       for(i=2;i<=Math.sqrt(n);i++){
	           if(n % i == 0){
	               return false;
	           }
	       }
	       return true;
	    }
public static void main(String[] args) {  
    new deffie_hellman();     
} 
}  
