package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float newVal = (this.getValue() - 32)*5/9;
        Celsius newTem = new Celsius(newVal);
        return newTem;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        return ""+String.format("%.2f", this.getValue()) +" F";
    }
}