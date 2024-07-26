/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.InhouseShoppingMall;

import java.util.ArrayList;

/**
 *
 * @author anjana 
 */
public class GiftwareList {
    ArrayList<Giftware> giftwareList;

    public GiftwareList() {
        this.giftwareList = new ArrayList<Giftware>();
    }

    public ArrayList<Giftware> getGiftwareList() {
        return giftwareList;
    }

    public void setGiftwareList(ArrayList<Giftware> giftwareList) {
        this.giftwareList = giftwareList;
    }
         
    public void addNewSouvenirData(Giftware sv) {
        this.giftwareList.add(sv);
    }
    
    public void deleteSouvenirData(Giftware sv) {
        this.giftwareList.remove(sv);
    }
    
    public void updateExistingSouvenirData(Giftware sv, int index) {
        this.giftwareList.set(index, sv);
    }
    
    public Giftware getGiftwareByName(String giftwareName) {

        Giftware selectedGiftware = new Giftware();
        for (Giftware giftware : giftwareList) {
            if (giftware.getGiftwareName().equals(giftwareName)) {
                selectedGiftware = giftware;
                break;
            }
        }
        return selectedGiftware;
    }
}
