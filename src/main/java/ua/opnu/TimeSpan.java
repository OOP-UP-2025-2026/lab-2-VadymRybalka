package ua.opnu;

public class TimeSpan {

    int hours;
    int minutes;

    TimeSpan(int hours, int minutes) {
        if (hours >= 0 && minutes >= 0 && minutes < 60) {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    int getHours() {
        return this.hours;
    }

    int getMinutes() {
        return this.minutes;
    }

    void add(int hours, int minutes) {
        if (!(hours < 0 || minutes < 0 || minutes > 59)) {
            if (this.minutes + minutes >= 60) {
                ++hours;
                minutes -= 60;
            }
            this.hours += hours;
            this.minutes += minutes;
        }
    }

    void addTimeSpan(TimeSpan timespan) {
        if (getMinutes() + timespan.getMinutes() >= 60) {
            ++timespan.hours;
            timespan.minutes -= 60;
        }
        this.hours += timespan.getHours();
        this.minutes += timespan.getMinutes();
    }

    double getTotalHours() {
        return getHours() + (double) getMinutes() / 60;
    }

    int getTotalMinutes() {
        return getMinutes() + getHours() * 60;
    }

    void subtract(TimeSpan span) {
        if ((getHours() - span.getHours() > 0) || ((getHours() - span.getHours() == 0) && (getMinutes() - span.getMinutes() > -1))) {
            if (getMinutes() - span.getMinutes() < 0) {
                --this.hours;
                this.minutes += 60;
            }
            this.hours -= span.getHours();
            this.minutes -= span.getMinutes();
        }
    }

    void scale(int factor) {
        if (factor > 0) {
            long newTotalMinutes = (long) getTotalMinutes() * factor;
            this.hours = (int) newTotalMinutes / 60;
            this.minutes = (int) newTotalMinutes % 60;
        }
    }
}