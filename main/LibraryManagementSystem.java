import java.util.*;

class booklib{
String T;String A;boolean isB=false;
booklib(String t,String a){T=t;A=a;}
public String toString(){return T+" by "+A+(isB?" [BORROWED]":"");}
}

class libMan{
ArrayList<booklib> bList=new ArrayList<>();
void aB(String t,String a){bList.add(new booklib(t,a));}
void sB(){for(int i=0;i<bList.size();i++){System.out.println(i+"->"+bList.get(i));}}
void bB(int id){if(id>=0&&id<bList.size()){if(!bList.get(id).isB){bList.get(id).isB=true;System.out.println("yay! u got it");}else System.out.println("nope taken");}else System.out.println("wat?");}
void rB(int id){if(id>=0&&id<bList.size()){if(bList.get(id).isB){bList.get(id).isB=false;System.out.println("ty 4 return");}else System.out.println("it wasn’t out");}else System.out.println("wat?");}
}

public class LibraryManagementSystem {
public static void main(String argz[]){
libMan l=new libMan();
l.aB("1984","George");
l.aB("HP1","Rowling");
l.aB("Sapiens","Harari");
Scanner sc=new Scanner(System.in);int ch=0;
System.out.println("Welcome 2 lib");while(true){
System.out.println("1.show 2.borrow 3.return 9.quit");try{ch=Integer.parseInt(sc.nextLine());}catch(Exception e){System.out.println("num pls");continue;}
if(ch==1)l.sB();else if(ch==2){System.out.print("ID?");int i=Integer.parseInt(sc.nextLine());l.bB(i);}
else if(ch==3){System.out.print("ID?");int i=Integer.parseInt(sc.nextLine());l.rB(i);}
else if(ch==9){System.out.println("bbye");break;}else System.out.println("no idea what u want");}
}
}
