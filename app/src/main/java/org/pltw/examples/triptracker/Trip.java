package org.pltw.examples.triptracker;

import android.util.Log;

import java.util.Comparator;
import java.util.Date;

/**
 * Created by jlinburg on 3/28/17.
 */
public class Trip implements IntentData, Comparable{

    private String objectId;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private boolean shared;
    private String ownerId;


    public Trip(){
        this.setStartDate(new Date());
        this.setEndDate(new Date());
    }


    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo(((Trip)o).getName());
    }
}
