package com.rohitiskul.testparcels.model;

import org.parceler.Parcel;

/**
 * Created by Rohit Kulkarni on 9/22/16.
 */
@Parcel
public class OrderDetails {
    public int categoryId;
    public Merchant merchant;
    public String fromName;
    public String fromPhone;
    public String fromEmail;
    public String toName;
    public String toPhone;
    public String toNote;
    public int amount;

    public OrderDetails() {
    }
}
