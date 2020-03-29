package com.vsc.oop.chess;

public abstract class PlayingPiece {

    private int x;
    private int y;
    private boolean isAlive;

    protected abstract void move(int newX, int newY);

    protected abstract boolean moveIsLegal(int newX, int newY);

    protected int getX() {
        return x;
    }

    protected void setX(int x) {
        if (x < 1) return;

        this.x = x;
    }

    protected int getY() {
        return y;
    }

    protected void setY(int y) {
        if (y < 1) return;

        this.y = y;
    }

    protected boolean isAlive() {
        return isAlive;
    }

    protected void setAlive(boolean alive) {
        if (!this.isAlive) throw new IllegalStateException("you are not alive to change your status");

        isAlive = alive;
    }
}
