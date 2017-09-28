package com.lim.limquiz1.Model;

/**
 * Created by Christian Carl on 28/09/2017.
 */

public class AndroidVersion {
    private int logo;
    private String codename;

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public AndroidVersion(int logo, String codename) {
        this.logo = logo;
        this.codename = codename;
    }
}
