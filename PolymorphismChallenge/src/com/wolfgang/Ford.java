package com.wolfgang;

class Ford extends Car {
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford engine started";
    }

    @Override
    public String accelerate() {
        return "Ford accelerated";
    }

    @Override
    public String brake() {
        return "Ford brakes pressed";
    }
}

