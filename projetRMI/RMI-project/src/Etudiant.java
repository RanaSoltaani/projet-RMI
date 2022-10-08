import java.io.Serializable;
public class Etudiant implements Serializable{
int id;
String nom, prenom;
float note1 , note2;
public Etudiant(int id, String nom, String prenom, float note1, float note2)
{

this.id = id;
this.nom = nom;
this.prenom = prenom;
this.note1 = note1;
this.note2 = note2;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getNom() {
return nom;
}
public void setNom(String nom) {
this.nom = nom;
}
public String getPrenom() {
return prenom;
}
public void setPrenom(String prenom) {
this.prenom = prenom;
}
public float getNote1() {
return note1;
}
public void setNote1(float note1) {
this.note1 = note1;
}
public float getNote2() {
return note2;
}
public void setNote2(float note2) {
this.note2 = note2;
}

}