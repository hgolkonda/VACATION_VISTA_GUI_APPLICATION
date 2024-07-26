/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Maintenance.Laundry;
import java.util.ArrayList;

/**
 *
 * @author saneeth
 */
public class LaundryServiceList {
    ArrayList<LaundryService> laundryDirectory;
    
    public LaundryServiceList(){
        this.laundryDirectory = new ArrayList<>();
    }

    public ArrayList<LaundryService> getLaundryDirectory() {
        return laundryDirectory;
    }

    public void setLaundryDirectory(ArrayList<LaundryService> laundryDirectory) {
        this.laundryDirectory = laundryDirectory;
    }
    
    public LaundryService getLaundries(int index){
        LaundryService newLaundry = new LaundryService();
        newLaundry = laundryDirectory.get(index);
        return newLaundry;
    }
    
    public LaundryService addLaundryDetails(){
        LaundryService newLaundry = new LaundryService();
        laundryDirectory.add(newLaundry);
        
        return newLaundry;
    }
    
    public LaundryService getLaundryByName(String laundryName) {
        
        LaundryService selectedLaundry = new LaundryService();
        for(LaundryService laundry : laundryDirectory) {
            if(laundry.getCategory().equals(laundryName)) {
                selectedLaundry = laundry;
                break;
            }
        }
        return selectedLaundry;
    }
    
    public void deleteLaundry(LaundryService laundry){
        laundryDirectory.remove(laundry);
    }

}
