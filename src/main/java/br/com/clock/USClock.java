package br.com.clock;

public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setPM(){
        this.periodIndicator = "PM";
    }

    public void setAM(){
        this.periodIndicator = "AM";
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hora inválida");
        }

        if (hour >= 12) {
            setPM();
            this.hour = hour % 12;
        } else {
            setAM();
            this.hour = hour;
        }

        if (this.hour == 0) {
            this.hour = 12;
        }
    }

    @Override
    Clock convert (Clock clock){

        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock){
            case USClock usClock -> {
                    this.hour = usClock.getHour();
                    this.periodIndicator = usClock.getPeriodIndicator();
            }

            case BRClock brClock -> this.setHour(brClock.getHour());

            default -> {

            }
        }

        return this;
    }
}
