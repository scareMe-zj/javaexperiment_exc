package homeworl05;

public class Person implements MagicHouseVip{
    private String name;
    private int height;
    private boolean vipflag=false;
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

    public void eatBread(Bread b) {
        b.numPieces--;
        height++;
    }
    public void magic(Magicroom m){
        height+=50;
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
}
