import java.rmi.Naming;
import java.util.Scanner;
public class Client {
public static void main (String [] args) {
try{
interfaceEtudiant ei = (interfaceEtudiant) Naming.lookup ("rmi://localhost:1099/MyObject");

Scanner sc=new Scanner(System.in);
System.out.println("donner nom");
String nom=sc.nextLine();
System.out.println("donner prenom");
String prenom=sc.nextLine();
Scanner sc1=new Scanner(System.in);
System.out.println("donner id");
int id=sc1.nextInt();
System.out.println("donner note");
float note1=sc.nextFloat();
System.out.println("donner note2");
float note2=sc.nextFloat();
Etudiant e=new Etudiant(id,nom,prenom,note1, note2);
String result = ei.AjouterEtudiant(e);
System.out.println (result);
Etudiant e1=new Etudiant(2,"ali","mohamed",15,17);
String result1 = ei.AjouterEtudiant(e1);
System.out.println (result1);
float moyenne=ei.RenvoyerMoyenne(2);
System.out.println (moyenne );
Etudiant e2=ei.RechercherMeilleur();
System.out.println (e2.getNom()+" "+e2.getPrenom());
}
catch (Exception e) {
System.out.println ("Erreur d’accès à l’objet distant");
System.out.println (e.toString());
}}}