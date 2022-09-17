package com.company.cars;

import com.company.Car;
import com.company.beepers.Beeper;
import com.company.brake.Brake;
import com.company.engines.Engine;
import com.company.wheel.Wheel;

public class ZIL_66 extends Car {

    public  Engine engineZIL_66;
    public  Beeper hornSuperZIL;
    public Brake ZIL_66superBrake;
    public Wheel truckWheel;


    public ZIL_66(Beeper beeper, Engine engine, Brake brake, Wheel wheel) {
        super(beeper, engine, brake, wheel);
    }
}
