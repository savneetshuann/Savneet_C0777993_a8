package com.savneet;

import javax.swing.*;

public class Temperature {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome!");
        String day= JOptionPane.showInputDialog("Please Enter day of the week: ");
        double temperature= Double.parseDouble(JOptionPane.showInputDialog("Please Enter temperature: "));
        double windSpeed= 1.2;
        TempConversion temp=new TempConversion(windSpeed,temperature);
        double feelsTemp=temp.feelsLikeTemperature();

         StringBuilder str=new StringBuilder("Temperature feels like ");
         str.append(String.format("%.02f", feelsTemp));
        JOptionPane.showMessageDialog(null,str);
         System.out.println(str);




    }
}
