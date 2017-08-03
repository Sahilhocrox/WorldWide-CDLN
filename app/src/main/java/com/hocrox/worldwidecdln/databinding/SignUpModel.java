package com.hocrox.worldwidecdln.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.hocrox.worldwidecdln.BR;

/**
 * Created by sahilgoyal on 31/7/17.
 */

public class SignUpModel extends BaseObservable {

    public String name;
    public String lastName;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }


    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
        notifyPropertyChanged(BR.city);
    }


    @Bindable
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
        notifyPropertyChanged(BR.country);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
        notifyPropertyChanged(BR.refNo);
    }

    public String city;
    public String country;
    public String email;
    public String refNo;
}
