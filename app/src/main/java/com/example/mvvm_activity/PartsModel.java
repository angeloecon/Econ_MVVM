package com.example.mvvm_activity;

public class PartsModel {
    private String partsName;
    private String part;
    private int partImage;

    public PartsModel(String part, String partsName, int partImage) {
        this.partsName = partsName;
        this.part = part;
        this.partImage = partImage;
    }

    public String getPartsName() {
        return partsName;
    }

    public int getPartImage() {
        return partImage;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public void setPartImage(int partImage) {
        this.partImage = partImage;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }
}
