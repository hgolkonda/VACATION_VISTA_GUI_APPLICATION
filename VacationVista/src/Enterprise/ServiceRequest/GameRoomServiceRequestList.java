/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.ServiceRequest;

import java.util.ArrayList;

/**
 *
 * @author anjana
 */
public class GameRoomServiceRequestList {
    
    ArrayList<GameRoomServiceRequest> gameRoomServiceRequestList;

    public GameRoomServiceRequestList() {
        this.gameRoomServiceRequestList = new ArrayList<GameRoomServiceRequest>();
    }
    
    public ArrayList<GameRoomServiceRequest> getGameWorkRequestList() {
        return gameRoomServiceRequestList;
    }

    public void setGameWorkRequestList(ArrayList<GameRoomServiceRequest> gameWorkRequestList) {
        this.gameRoomServiceRequestList = gameWorkRequestList;
    }
    
    public void updateGameWorkRequest(GameRoomServiceRequest gameSRequest, int index) {
        this.gameRoomServiceRequestList.set(index, gameSRequest);
    }
    
}
