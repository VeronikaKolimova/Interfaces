package com.company.cars;

import com.company.Car;
import com.company.beepers.Beeper;
import com.company.brake.Brake;
import com.company.engines.Engine;
import com.company.wheel.Wheel;


public class Priora extends Car {
    public Engine engineV6;
    public Wheel passengerCarWheelPriora;
    public Brake manualbrake;
    private Beeper magicSound;

    public Priora(Beeper beeper, Engine engine, Brake brake, Wheel wheel) {
        super(beeper, engine, brake, wheel);
    }
    String downShifting(){
        return "Занижена";
    }


}
