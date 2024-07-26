/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.RecreationEvents.GameRoom;

import java.util.ArrayList;

/**
 *
 * @author saneeth
 */
public class GameRoomList {

    ArrayList<GameRoom> gameRoomList;

    public GameRoomList() {
        this.gameRoomList = new ArrayList<>();
    }

    public ArrayList<GameRoom> getGameDirectory() {
        return gameRoomList;
    }

    public void setGameDirectory(ArrayList<GameRoom> gameRoomList) {
        this.gameRoomList = gameRoomList;
    }
    
     public GameRoom getGames(int index){
        GameRoom newGame = new GameRoom();
        newGame = gameRoomList.get(index);
        return newGame;
    }
    
    public GameRoom addGameDetails(){
        GameRoom newGame = new GameRoom();
        gameRoomList.add(newGame);
        
        return newGame;
    }

    public GameRoom getGameByName(String gameName) {

        GameRoom selectedGame = new GameRoom();
        for (GameRoom game : gameRoomList) {
            if (game.getGameName().equals(gameName)) {
                selectedGame = game;
                break;
            }
        }
        return selectedGame;
    }
    
    public void deleteGame(GameRoom game){
        gameRoomList.remove(game);
    }

}
