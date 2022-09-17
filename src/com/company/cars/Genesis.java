package com.company.cars;

import com.company.Car;
import com.company.beepers.Beeper;
import com.company.brake.Brake;
import com.company.brake.ElectroBrake;
import com.company.engines.Engine;
import com.company.wheel.PassengerCarWheelLambo;
import com.company.wheel.Wheel;

public class Genesis extends Car {
    public Engine engineV12;
    public Beeper horn;
    public ElectroBrake electrobrake;
    public PassengerCarWheelLambo passengerCarWheelLambo;

    public Genesis(Beeper beeper, Engine engine, Brake brake, Wheel wheel) {
        super(beeper, engine, brake, wheel);
    }
}
