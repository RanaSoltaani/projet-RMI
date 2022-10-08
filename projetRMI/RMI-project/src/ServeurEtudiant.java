import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
public class ServeurEtudiant extends UnicastRemoteObject implements
interfaceEtudiant{
	

	private static final long serialVersionUID = 1L;
List <Etudiant>Classe;

protected ServeurEtudiant() throws RemoteException {
super();
}

public String AjouterEtudiant(Etudiant e) throws RemoteException {
if (Classe==null)
Classe=new ArrayList<Etudiant>();
Classe.add(e);
return("Vous avez ajouté"+ Classe.size()+"étudiants");
}

public float RenvoyerMoyenne(int id) throws RemoteException {
for (int i=0; i<Classe.size(); i++)
   { if(Classe.get(i).getId()==id)
           { return (Classe.get(i).getNote1()+Classe.get(i).getNote2())/2;}}

             return 0;
             }


public Etudiant RechercherMeilleur() throws RemoteException {
float moy=0;
int idm=0;
for (int i=0; i<Classe.size(); i++)
    { if((Classe.get(i).getNote1()+Classe.get(i).getNote2())/2>moy)
    
         { moy=(Classe.get(i).getNote1()+Classe.get(i).getNote2())/2;
          idm=i;}}
    
           return Classe.get(idm);
}}
