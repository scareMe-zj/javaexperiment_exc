package homework06;

import homeworl05.Bread;
import homeworl05.MagicHouseVip;
import homeworl05.Magicroom;

public class Person implements MagicHouseVip,MagicHouseSVip{
    private String name;
    private int height;
    private boolean vipflag=false;
    private boolean svipflag=false;
    private boolean sex=true;

    public Person(String name, int height,  boolean sex) {
        this.name = name;
        this.height = height;
        this.sex = sex;
    }

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isSvipflag() {
        return svipflag;
    }

    public void setSvipflag(boolean svipflag) {
        this.svipflag = svipflag;
    }

    public boolean isVipflag() {
        return vipflag;
    }

    public boolean isSex() {
        return sex;
    }

    @Override
    public void vip(){
        vipflag=true;
    }

    @Override
    public void svip(){svipflag=true;}
}
