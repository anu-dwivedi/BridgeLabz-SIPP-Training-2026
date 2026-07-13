import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);AddressBook b=new AddressBook();
while(true){
System.out.println("1.Add 2.Search 3.Delete 4.Display 5.Exit");
int ch=sc.nextInt();sc.nextLine();
switch(ch){
case 1:System.out.print("Name: ");String n=sc.nextLine();System.out.print("Phone: ");String p=sc.nextLine();System.out.print("Email: ");String e=sc.nextLine();System.out.println(b.add(new Contact(n,p,e))?"Added":"Duplicate Phone");break;
case 2:System.out.println(b.search(sc.nextLine()));break;
case 3:System.out.println(b.delete(sc.nextLine())?"Deleted":"Not Found");break;
case 4:b.display();break;
default:return;}}}}