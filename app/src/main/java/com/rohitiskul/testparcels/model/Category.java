package com.rohitiskul.testparcels.model;

import org.parceler.Parcel;

/**
 * Created by Rohit Kulkarni on 9/14/16.
 */
@Parcel
public class Category {
    public int categoryId;
    public String name;
    public String categoryCode;
    public boolean isActive;
    public String appImage;

    public Category() {
    }
}
