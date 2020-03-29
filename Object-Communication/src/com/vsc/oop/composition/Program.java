package com.vsc.oop.composition;

import com.vsc.oop.composition.chassis.Chassis;
import com.vsc.oop.composition.chassis.SteelChassis;
import com.vsc.oop.composition.engine.Engine;
import com.vsc.oop.composition.engine.FourCylinderEngine;
import com.vsc.oop.composition.gearbox.Gearbox;
import com.vsc.oop.composition.gearbox.GearboxAutomatic;
import com.vsc.oop.composition.lottery.Lottery;
import com.vsc.oop.composition.lottery.LotteryCallback;
import com.vsc.oop.composition.lottery.Participant;
import com.vsc.oop.composition.wheel.*;

import java.util.Random;

public class Program {

    public static void main(String[] args) {
        Car lotteryPrize = createCar();
        Lottery lottery = new Lottery(new Random());
        Participant[] participants = createParticipants();

        lottery.drawWinner(participants, new LotteryCallback() {
            @Override
            public void onWinnerDrawn(Participant participant) {
                System.out.println(participant.getName() + " just won " + lotteryPrize.getCarName());
                participant.takePrize(lotteryPrize);
            }
        });

        lottery.drawWinner(participants, new LotteryCallback() {
            @Override
            public void onWinnerDrawn(Participant participant) {
                System.out.println(participant.getName() + " just won " + lotteryPrize.getCarName());
            }
        });
    }

    private static Car createCar() {
        String season = "winter";

        Engine engine = new FourCylinderEngine();
        Chassis chassis = new SteelChassis();

        Tire tire = new WinterTire();
        Rim rim = new GenericRim();
        Wheel[] wheels = {new Wheel16(tire, rim), new Wheel16(tire, rim), new Wheel16(tire, rim)};

        Gearbox gearbox = new GearboxAutomatic();

        return new Car(engine, chassis, wheels, gearbox, "Opel", "Astra");
    }

    private static Participant[] createParticipants() {
        return new Participant[] { new Participant("Gosho"), new Participant("Maria"), new Participant("Pesho") };
    }
}
