package com.abstraction2.parent;

public abstract class University {
    private String DpName;
    public abstract void dpCode();

    public String getDpName() {
        return DpName;
    }

    public void setDpName(String dpName) {
        DpName = dpName;
    }
}
