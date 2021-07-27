package Model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ManagerLibrary {
    public static List<TheMuon> theMuons = new ArrayList<>();
    public void add(TheMuon themuon){
        theMuons.add(themuon);
    }

    public void showAll(){
        for(TheMuon themuon : theMuons){
            System.out.println(themuon);
        }
    }

    public void showTheMuons(LocalDate ngaySinh){
        for(int i=0; i<theMuons.size();i++){
            if(theMuons.get(i).equals(ngaySinh)){
                System.out.println(theMuons.get(i).toString());
            }
        }
    }
    public void showTheMuons() {
    }
}
