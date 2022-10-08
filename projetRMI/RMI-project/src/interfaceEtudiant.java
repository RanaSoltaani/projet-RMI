import java.rmi.Remote;

import java.rmi.RemoteException;
public interface interfaceEtudiant extends Remote{
public String AjouterEtudiant (Etudiant e)throws RemoteException;
public float RenvoyerMoyenne (int id)throws RemoteException;
public Etudiant RechercherMeilleur()throws RemoteException;
}
