import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;
public class Notepad extends Frame implements KeyListener,MouseMotionListener,TextListener,ActionListener{
TextArea a;
TextField t2=new TextField();
Label l1;
TextField t1=new TextField();
TextField M=new TextField();
Label l2=new Label();
Menu menu;
public Notepad() {
	addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent windowEvent){
           System.exit(0);
        }        
     });
setTitle("NotePad");
int X=0,Y=0;
setSize(800,800);
a=new TextArea();
a.setBounds(40,90,600,525);
add(a);
l1=new Label();  
t1.setBounds(100,700,150,30);
   add(t2);
   t2.setBounds(240,650,60,20);
add(t1);
TextField t3=new TextField();
t3.setBounds(100,650,30,30);
//add(t3);
l2.setBounds(450,300,100,100);
M.setBounds(300,700,130,30);
add(M);
MenuBar m=new MenuBar();

menu=new Menu("File");
Menu menu2=new Menu("View");
Menu menu3=new Menu("Edit");
Menu menu4=new Menu("Format");
MenuItem i1=new MenuItem("New");  
menu.add(i1);
m.add(menu);
MenuItem i2=new MenuItem("Edit");
menu.add(i2);
m.add(menu);
MenuItem i3=new MenuItem("Save ");  
menu.add(i3);
m.add(menu);
MenuItem i4=new MenuItem("Save as");
menu.add(i4);

MenuItem i5=new MenuItem("Large");  
menu2.add(i5);
m.add(menu2);
MenuItem i6=new MenuItem("Small");  
menu2.add(i6);
m.add(menu2);
MenuItem i13=new MenuItem("Background");  
menu2.add(i13);
m.add(menu2);

MenuItem i7=new MenuItem("Replace all");  
menu3.add(i7);
m.add(menu3);
MenuItem i8=new MenuItem("LowerCase");  
menu3.add(i8);
m.add(menu3);
MenuItem i9=new MenuItem("UpperCase");  
menu3.add(i9);
m.add(menu3);

MenuItem i10=new MenuItem("Italic");  
menu4.add(i10);
m.add(menu4);
MenuItem i11=new MenuItem("Bold");  
menu4.add(i11);
m.add(menu4);
MenuItem i12=new MenuItem("Times New Roman");  
menu4.add(i12);
m.add(menu4);

m.add(menu);
    m.add(menu2);
    m.add(menu3);
    m.add(menu4);
    setMenuBar(m);
    a.addTextListener(this);
    a.addKeyListener(this);
    addMouseMotionListener(this);
    i1.addActionListener(this);
    i2.addActionListener(this);
    i3.addActionListener(this);
    i4.addActionListener(this);
    i5.addActionListener(this);
    i6.addActionListener(this);
    i7.addActionListener(this);
    i8.addActionListener(this);
    i9.addActionListener(this);
    i10.addActionListener(this);
    i11.addActionListener(this);
    i12.addActionListener(this);
    i13.addActionListener(this);
    setLayout(null);
    setVisible(true);  
    }
    public void mouseDragged(MouseEvent e) { }  
    public void mouseMoved(MouseEvent e) {
    	  t1.setText(" coordinates are ("+e.getX()+","+e.getY()+")");
    }  
    public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().contentEquals("New")) {
    M.setText("New menu");
    }
    if (e.getActionCommand().contentEquals("Edit")) {
    M.setText("Edit menu");
    }
    if (e.getActionCommand().contentEquals("Save ")) {
    	M.setText("Save");
    	}
    	if (e.getActionCommand().contentEquals("Save as")) {
    	M.setText("Save as");
    	}
    	 if (e.getActionCommand().contentEquals("Large")) {
    		 Font LFont = new Font("Serif", Font.PLAIN,48);
    		 a.setFont(LFont);
    			M.setText("Large Text");
    	    	}
    	    	if (e.getActionCommand().contentEquals("Small")) {
    	    		Font SFont = new Font("Serif", Font.PLAIN,10);
    	    		 a.setFont(SFont);
    	    	M.setText("Small Text");
    	    	}
    	    	 if (e.getActionCommand().contentEquals("Replace all")) {
    	    		 String text=a.getText(); 
    	    		 a.setText(text.replaceAll(text,"Text Replaced"));
    	    		 M.setText("Replaced");
    	    	    	}
    	    	    	if (e.getActionCommand().contentEquals("UpperCase")) {
    	    	    		 String text=a.getText(); 
    	    	    		 a.setText(text.toUpperCase());
    	    	    	M.setText("UpperCased");
    	    	    	}
    	    	    	 if (e.getActionCommand().contentEquals("LowerCase")) {
    	    	    		 String text=a.getText(); 
    	    	    		 a.setText(text.toLowerCase());
    	    	    	M.setText("LowerCased");
    	    	    	    	}
    	    	    	    	if (e.getActionCommand().contentEquals("Italic")) {
    	    	    	    		 Font italicFont = new Font("Serif", Font.ITALIC, 24);
    	    	    	    		 a.setFont(italicFont);
    	    	    	    	M.setText("Italic Styled");
    	    	    	    	}
    	    	    	    	 if (e.getActionCommand().contentEquals("Bold")) {
    	    	    	    		 Font BFont = new Font("Serif", Font.BOLD, 24);
    	    	    	    		 a.setFont(BFont);
    	    	    	    	    	M.setText("Bold Styled");
    	    	    	    	    	add(l2);
    	    	    	    	    	}
    	    	    	    	    	if (e.getActionCommand().contentEquals("Times New Roman")) {
    	    	    	    	    		Font PFont = new Font("Times New Roman", Font.PLAIN, 24);
    	    	    	    	    		 a.setFont(PFont);
    	    	    	    	    	M.setText("Times New Roman");
    	    	    	    	    	}
    	    	    	    	    	if (e.getActionCommand().contentEquals("Background")) {
    	    	    	    	    		a.setBackground(Color.cyan);
    	    	    	    	    		setBackground(Color.ORANGE);
    	    	    	    	        	M.setText("Background Changed");
    	                    }
    	}
    	public void textValueChanged(TextEvent e) {
    	String text=a.getText();  
    	   String words[]=text.split("\\s");  
    	   l1.setText("Word count: "+words.length+" Characters length: "+text.length());
    	   l1.setBounds(150,700,250,100);  
    	   add(l1);
    	   }
    	public void keyPressed(KeyEvent e) {  
    	t2.setText("Typing..");
    	    }  
    	   public void keyTyped(KeyEvent e) {  
    	    }  
    	    public void keyReleased(KeyEvent e) {  
    	      t2.setText("");
    	    }  
    	    public static void main(String args[]) {
    	    	 new Notepad();
   }
}