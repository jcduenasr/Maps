package com.jduenas.maps.pojo;

/**
 * Created by jduenas on 10/01/2017.
 */

public class OptionApp {
    private int id;
    private String optionName;
    private int imageOption;

    public OptionApp(String optionName, int imageOption){
        this.optionName = optionName;
        this.imageOption = imageOption;
    }

    public OptionApp(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public int getImageOption() {
        return imageOption;
    }

    public void setImageOption(int imageOption) {
        this.imageOption = imageOption;
    }
}
