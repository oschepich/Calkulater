package com.company;

public enum Dei {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);

    public int translation;


    Dei(int translation) {

        this.translation = translation;
    }


    public int getTranslation() {
        return translation;
    }

    public String toString() {
        return String.valueOf(getTranslation());
    }

}
