package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Date;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        Date now = new Date(month+"1 2014");
        Integer day =(int)now.getMonth()+1;
        System.out.println(month+" is "+day+ " month");
        //add your code here - напиши код тут
    }

}
