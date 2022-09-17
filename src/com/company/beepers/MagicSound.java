package com.company.beepers;

public class MagicSound implements Beeper{
    @Override
    public String makeSound() {
        return "WOOOOW!";
    }
}
