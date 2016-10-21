package com.rohitiskul.testparcels.model;

import org.parceler.Parcel;

/**
 * Created by Rohit Kulkarni on 9/14/16.
 */
@Parcel
public class Merchant {
    public int merchantId;
    public String name;
    public String address1;
    public String address2;
    public String city;
    public String state;
    public String zip;
    public String phone1;
    public String phone2;
    public String fax;

    public Merchant() {
    }
}
