import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class ServeurMain {
public static void main(String []args)
{
try {
LocateRegistry.createRegistry(1099);
ServeurEtudiant e=new ServeurEtudiant();
Naming.rebind("MyObject", e);
} catch (Exception e) {
e.printStackTrace();
}}

}