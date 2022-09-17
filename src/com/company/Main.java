package com.company;

import com.company.beepers.Beeper;
import com.company.beepers.Horn;
import com.company.beepers.HornSuperZIL;
import com.company.beepers.MagicSound;
import com.company.brake.Brake;
import com.company.brake.ElectroBrake;
import com.company.brake.ManualBrake;
import com.company.cars.Genesis;
import com.company.cars.Lambo;
import com.company.cars.Priora;
import com.company.cars.ZIL_66;
import com.company.engines.EnginZIL_66;
import com.company.engines.Engine;
import com.company.engines.EngineV12;
import com.company.engines.EngineV6;
import com.company.wheel.*;

import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {
        // создаем машину

        Beeper horn = new Horn();
        EngineV12 engineV12 = new EngineV12();
        Brake electroBrake = new ElectroBrake();
        Wheel passengerCarWheelLambo = new PassengerCarWheelLambo();
        Lambo lambo = new Lambo(horn, engineV12,electroBrake, passengerCarWheelLambo);

        Beeper magicSound = new MagicSound();
        Engine engineV6 = new EngineV6();
        Brake manualBrake = new ManualBrake();
        Wheel passengerCarWheelPriora = new PassengerCarWheelPriora();
        Priora priora  = new Priora(magicSound, engineV6, manualBrake, passengerCarWheelPriora);

        Beeper hornSuperZIL = new HornSuperZIL();
        Engine engineZIL_66 = new EnginZIL_66();
        Brake manualSuperBrake = new ManualBrake();
        Wheel truckWheel = new TruckWheel();
        ZIL_66 zil_66 = new ZIL_66( hornSuperZIL, engineZIL_66, manualSuperBrake, truckWheel);

        Beeper horn1 = new Horn();
        EngineV12 engineV121 = new EngineV12();
        Brake electroBrake1 = new ElectroBrake();
        Wheel passengerCarWheel = new PassengerCarWheel();
        Genesis genesis = new Genesis(horn1, engineV12, electroBrake,passengerCarWheel);

    /*    System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.engine.getSpeed());
        System.out.println(lambo.brake.getBrake());
        System.out.println(lambo.wheel.getWheels()); */
        System.out.println(lambo.getCost());

        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpeed());
        System.out.println(priora.brake.getBrake());
        System.out.println(priora.wheel.getWheels());
      //  System.out.println(priora.downShifting());


       ArrayList<Car> transporter = new ArrayList<>();
        transporter.add(lambo);
        transporter.add(priora);
        transporter.add(zil_66);
        transporter.add(genesis);

        transporter.forEach((Car car)  -> {
            System.out.println(car.beeper.makeSound());
            System.out.println(car.engine.getSpeed());
            System.out.println(car.brake.getBrake());
            System.out.println(car.wheel.getWheels());
        });
    }
}
