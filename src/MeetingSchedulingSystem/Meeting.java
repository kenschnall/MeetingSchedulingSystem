/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeetingSchedulingSystem;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author kensch
 */
public class Meeting extends javax.swing.JPanel implements Serializable {

    private String name;    // name of meeting
    private int time;   // 24-hour clock
    private ArrayList<Person> people = new ArrayList<>();   // people in the meeting

    /**
     * Creates new form Meeting
     */
    public Meeting(String name, int time) { // constructor
        initComponents();
        this.name = name;
        this.time = time;
        meetingLabel.setText("Meeting");
        meetingName.setText(getName());
        meetingTime.setText("at " + getTime() + "h");
        
        this.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        meetingLabel = new javax.swing.JLabel();
        meetingName = new javax.swing.JLabel();
        meetingTime = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        meetingLabel.setText("Meeting");
        add(meetingLabel, new java.awt.GridBagConstraints());

        meetingName.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(meetingName, gridBagConstraints);

        meetingTime.setText("at Time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(meetingTime, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel meetingLabel;
    private javax.swing.JLabel meetingName;
    private javax.swing.JLabel meetingTime;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the people
     */
    public ArrayList<Person> getPeople() {
        return people;
    }

    /**
     * @param people the people to set
     */
    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    /**
     * @return the meetingLabel
     */
    public javax.swing.JLabel getMeetingLabel() {
        return meetingLabel;
    }

    /**
     * @param meetingLabel the meetingLabel to set
     */
    public void setMeetingLabel(javax.swing.JLabel meetingLabel) {
        this.meetingLabel = meetingLabel;
    }
}
