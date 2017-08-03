package com.hocrox.worldwidecdln.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.hocrox.worldwidecdln.BR;

/**
 * Created by sahilgoyal on 31/7/17.
 */

public class LoginModels extends BaseObservable {

    public String email;
    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);

    }

    public String password;

    public LoginModels(String email, String password) {

        this.email = email;
        this.password = password;

    }

}
