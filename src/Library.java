import java.util.ArrayList;

public class Library {
    private ArrayList<Publication> Pubications;

    protected void GiveBook(Publication publication){
        this.Pubications.remove(publication);
    }

    public Library(ArrayList<Publication> pubications) {
        Pubications = pubications;
    }

    public void AddToDB(Publication Item){
        this.Pubications.add(Item);
    }
    public void DeleteFromDB(Publication Item){
        this.Pubications.remove(Item);
    }
    public void ShowDB(){
        System.out.println(this.Pubications);
    }

    public ArrayList<Publication> getPubications() {
        return Pubications;
    }

}
