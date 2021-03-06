package com.gdgvitvellore.devfest17;

/**
 * Created by abhis on 9/14/2017.
 */

public class Sponsor {
    private String sponsorName;
    private String sponsorType;
    private String sponsorWebsite;
    private int sponsorImage;
    private int id;

    public Sponsor(int it, String sponsorName, String sponsorType, String sponsorWebsite, int sponsorImage) {
        this.id = id;
        this.sponsorName = sponsorName;
        this.sponsorType = sponsorType;
        this.sponsorWebsite = sponsorWebsite;
        this.sponsorImage = sponsorImage;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public String getSponsorType() {
        return sponsorType;
    }

    public String getSponsorWebsite() {
        return sponsorWebsite;
    }

    public int getSponsorImage() {
        return sponsorImage;
    }

    public int getId() {
        return id;
    }
}
