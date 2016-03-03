package com.javarush.test.level14.lesson06.home01;

/**
 * Created by npolovnikov on 03.03.16.
 */
public class RussianHen extends Hen{
    private String country = Country.RUSSIA;
    private int countOfEggsPerMonth = 1;

    @Override
    public int getCountOfEggsPerMonth()
    {
        return countOfEggsPerMonth;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", country, countOfEggsPerMonth);
    }
}