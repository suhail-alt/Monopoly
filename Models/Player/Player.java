package Models.Player;

import Models.Properties.Property;

import java.util.ArrayList;

public class Player {
    private String name;
    private int money;
    private ArrayList<Property>[] properties;
    private boolean isJailed;
    private GamePiece gamePiece;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Property>[] getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property>[] properties) {
        this.properties = properties;
    }

    public boolean isIsJailed() {
        return isJailed;
    }

    public void setIsJailed(boolean isJailed) {
        this.isJailed = isJailed;
    }

    public GamePiece getGamePiece() {
        return gamePiece;
    }

    public void setGamePiece(GamePiece gamePiece) {
        this.gamePiece = gamePiece;
    }
}
