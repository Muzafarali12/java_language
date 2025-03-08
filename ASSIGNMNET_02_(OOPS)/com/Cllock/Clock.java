package com.Student.Cllock;

public class Clock {
        private int hour;
        private int minutes;
        private int seconds;
        private String time;


        public void setHour(int hour){
            this.hour = hour;
        }
        public int getHour(){
            return hour;
        }
        public void setMinutes(int minutes){
            this.minutes = minutes;
        }
        public int getMinutes(){
            return minutes;
        }
        public void setSeconds(int seconds){
            this.seconds = seconds;
        }
        public int getSeconds(){
            return seconds;
        }
        public void setTime(String time){this.time = time;}
    public String getTime(){return time;}
        public static void main(String [] args){
            Clock clock = new Clock();
            clock.setHour(12);
            clock.setMinutes(00);
            clock.setSeconds(00);
            String hello = clock.getHour() + ":" + clock.getMinutes() + ":" + clock.getSeconds();
            clock.setTime(hello);


            System.out.print(clock.getHour()+":");
            System.out.print(clock.getMinutes()+":");
            System.out.print(clock.getSeconds());
            System.out.println();
            System.out.println(clock.getTime());
        }
    }

