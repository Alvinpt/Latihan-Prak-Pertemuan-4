public class Latihan06_praktek03{
public static void main(String args[]){ 
char hurufAwal = 'a';
System.out.print("Masukkan huruf awal nama Anda : ");
try{
hurufAwal = (char)System.in.read();
}catch(Exception e) { 
System.out.println("Salah ko menginput cess..!");

} 
switch(hurufAwal){
case (char)-1 : System.out.println("bukan huruf depan !!!");break;
case 'a' : System.out.println("apa namamu amin ?");break; 
case 'b' : System.out.println("apa namanu bambang ?");break; 
case 'c' : System.out.println("apa namamu ceceo ?");break;
case 'd' : System.out.println("apa namamu daud ?");break;
case 'e' : System.out.println("apa namamu endang ?");break;
default : System.out.println("aku tidak bisa menebak"); 
}
}
}