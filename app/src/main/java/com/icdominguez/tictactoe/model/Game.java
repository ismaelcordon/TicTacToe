package com.icdominguez.tictactoe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game {
    private String playerOneId;
    private String playerTwoId;
    private List<Integer> selectedCells;
    private boolean turnPlayerOne;
    private String winnerId;
    private Date created;
    private String abandonmentId;

    public Game() {
    }

    public Game(String playerOneId) {
        this.playerOneId = playerOneId;
        this.playerTwoId = "";
        this.selectedCells = new ArrayList<>();
        for(int i=0; i < 9; i++){
            this.selectedCells.add(new Integer(0));
        }
        this.turnPlayerOne = true;
        this.created = new Date();
        this.winnerId = "";
        this.abandonmentId = "";
    }

    public String getPlayerOneId() {
        return playerOneId;
    }

    public void setPlayerOneId(String playerOneId) {
        this.playerOneId = playerOneId;
    }

    public String getPlayerTwoId() {
        return playerTwoId;
    }

    public void setPlayerTwoId(String playerTwoId) {
        this.playerTwoId = playerTwoId;
    }

    public List<Integer> getSelectedCells() {
        return selectedCells;
    }

    public void setSelectedCells(List<Integer> selectedCells) {
        this.selectedCells = selectedCells;
    }

    public boolean isTurnPlayerOne() {
        return turnPlayerOne;
    }

    public void setTurnPlayerOne(boolean turnPlayerOne) {
        this.turnPlayerOne = turnPlayerOne;
    }

    public String getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(String winnerId) {
        this.winnerId = winnerId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAbandonmentId() {
        return abandonmentId;
    }

    public void setAbandonmentId(String abandonmentId) {
        this.abandonmentId = abandonmentId;
    }
}