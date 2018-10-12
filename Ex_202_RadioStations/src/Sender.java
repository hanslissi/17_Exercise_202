/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johannesriedmueller
 */
public class Sender {
    private String sender;
    private double frequency;
    private String band;

    public Sender(String sender, double frequency, String band) {
        this.sender = sender;
        this.frequency = frequency;
        this.band = band;
    }

    public String getSender() {
        return sender;
    }

    public double getFrequency() {
        return frequency;
    }

    public String getBand() {
        return band;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setBand(String band) {
        this.band = band;
    }
    
    
}
