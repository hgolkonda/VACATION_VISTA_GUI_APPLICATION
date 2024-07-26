/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.InhouseShoppingMall;

/**
 *
 * @author anjana
 */
public class Giftware {

    String giftwareID;
    String giftwareName;
    Double giftprice;

    public String getGiftwareID() {
        return giftwareID;
    }

    public void setGiftwareID(String giftwareID) {
        this.giftwareID = giftwareID;
    }

    public String getGiftwareName() {
        return giftwareName;
    }

    public void setGiftwareName(String giftwareName) {
        this.giftwareName = giftwareName;
    }

    public Double getGiftprice() {
        return giftprice;
    }

    public void setGiftprice(Double giftprice) {
        this.giftprice = giftprice;
    }

   
    @Override
    public String toString() {
        return giftwareID;
    }
}
