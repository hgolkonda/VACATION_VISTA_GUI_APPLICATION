/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.RecreationEvents.GameRoom;

/**
 *
 * @author saneeth
 */
public class GameRoom {
    String gameId;
    String gameCategory;
    String gameName;
    Float gameprice;

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Float getGameprice() {
        return gameprice;
    }

    public void setGameprice(Float gameprice) {
        this.gameprice = gameprice;
    }

   
    
    
    @Override
    public String toString(){
        return gameName;
    }
    
    
}
