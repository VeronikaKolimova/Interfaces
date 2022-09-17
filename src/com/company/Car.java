package com.company;

import com.company.beepers.Beeper;
import com.company.brake.Brake;
import com.company.engines.Engine;
import com.company.wheel.Wheel;

public abstract class Car {
    public Engine engine;
    public Beeper beeper;
    public Brake brake;
    public Wheel wheel;



    public Car(Beeper beeper, Engine engine, Brake brake, Wheel wheel){
        this.beeper = beeper;
        this.engine = engine;
        this.brake = brake;
        this.wheel = wheel;
    }

}
