package com.example.sping_portfolio.Minilab.Minilab2;

public class Workouts {
    private static final int oil = 0;
    //protected data
    private String muscle;
    private int reps;
    private int weight;

    //constructor
    public Workouts(String muscle, int reps, int weight)
    {
        this.muscle = muscle;
        this.reps = reps;
        this.weight = weight;
    }

    //get protected data

    public String getMake(String make)
    {
        return make;
    }

    public String getModel(String model)
    {
        return model;
    }

    public int getOil(int oil)
    {
        return oil;
    }

    //method
    public void oilchange()
    {
        if (this.oil >= 3000)
        {
            System.out.println("You Need an Oil Change");
        }
    }

    //call class
    public static void main(String[] args)
    {
        Car myCar = new Car("Porsche", "911", 4000);
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Oil: " + myCar.getOil());
        myCar.oilchange();

    }
}
