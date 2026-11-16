package br.com.clock;

public class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }



    public void setHour(int hour) {
        this.periodIndicator = "AM";

        if ((hour >= 12) && (hour <= 23)) {
            this.periodIndicator = "PM";
            this.hour = hour - 12;
        } else if (hour >= 24) {
            this.hour = 0;
            
        } else {
            this.hour = hour;
        }
    }

    @Override
    Clock convert (Clock clock){
        return null;
    }
}
