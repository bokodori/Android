package com.thomasvansevenant.daoModels;

import java.util.Date;
import java.util.UUID;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "CRIME".
 */
public class Crime {

    private UUID id;
    private java.util.Date date;
    private String photopath;
    private Boolean solved;
    private String suspect;
    private String title;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        this.id = id;
        this.date = new Date();
    }

    public Crime(UUID id, java.util.Date date, String photopath, Boolean solved, String suspect, String title) {
        this.id = id;
        this.date = date;
        this.photopath = photopath;
        this.solved = solved;
        this.suspect = suspect;
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }

    public Boolean getSolved() {
        return solved;
    }

    public void setSolved(Boolean solved) {
        this.solved = solved;
    }

    public String getSuspect() {
        return suspect;
    }

    public void setSuspect(String suspect) {
        this.suspect = suspect;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean isSolved() {
        if (solved == null) {
            return false;
        }
        return solved;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }


    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}