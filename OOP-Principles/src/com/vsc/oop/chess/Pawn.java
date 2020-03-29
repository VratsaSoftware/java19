package com.vsc.oop.chess;

public class Pawn extends PlayingPiece {

    private boolean hasMoved;

    @Override
    public void move(int newX, int newY) {
        if (moveIsLegal(newX, newY)) {
            this.setX(newX);
            this.setY(newY);
            hasMoved = true;
            System.out.println("move is legal");
        } else {
            System.out.println("move is illegal");
        }
    }

    @Override
    public boolean moveIsLegal(int newX, int newY) {
        int xDiff = (this.getX() + newX) - this.getX();
        int yDiff = (this.getY() + newY) - this.getY();
        if ((xDiff > 1 && yDiff > 1 && hasMoved) || (xDiff < 0 && yDiff < 0)) {
            return false;
        }

        return true;
    }
}
