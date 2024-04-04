import java.util.*;
public class Nestedif{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter your favourite iconic character:");
String act=sc.nextLine();
if(act.equals("Iron Man")){
System.out.println("Great Choice");
System.out.println("enter"+act+"real name");
String reall=sc.nextLine();
if(reall.equalsIgnoreCase("Tony Stark")){
	System.out.println("Cool Actor");
}
}else{
	System.out.println(act);
}
sc.close();
}
}