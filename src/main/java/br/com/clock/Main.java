package br.com.clock;

public class Main {
    public static void main(String[] args) {

        Clock brClock = new BRClock();
        brClock.setHour(20);
        brClock.setMinute(35);
        brClock.setSecond(20);

        System.out.println(brClock.getTime());
        System.out.println(new USClock().convert(brClock).getTime());

    }
}