package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float newVal = this.getValue() * 9 / 5 + 32;
        Fahrenheit newTem = new Fahrenheit(newVal);
        return newTem;
    }

    public String toString()
    {
        return ""+String.format("%.2f", this.getValue()) +" C";
    }
}