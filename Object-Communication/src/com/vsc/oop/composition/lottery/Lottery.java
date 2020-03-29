package com.vsc.oop.composition.lottery;

import java.util.Random;

public class Lottery {

    private Random random;

    public Lottery(Random random) {
        this.random = random;
    }

    public void drawWinner(Participant[] participants, LotteryCallback callback) {
        int winnerIndex = this.random.nextInt(participants.length + 1);
        Participant winner = participants[winnerIndex];

        callback.onWinnerDrawn(winner);
    }
}
