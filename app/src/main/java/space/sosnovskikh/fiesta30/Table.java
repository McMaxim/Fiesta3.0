package space.sosnovskikh.fiesta30;

import androidx.core.app.Person;

public class Table {
    private long id;
    private int stat;
    private int point;
    private int number;

    public Table (long id,  int gh,int gg,int hh) {
        this.id = id;
        this.stat = gh;
        this.point=gg;
        this.number = hh;
    }

    public Table() {

    }


    public long getId() {
        return id;
    }
    public int getStat() {
        return stat;
    }
    public int getNumber() {
        return number;
    }
    public int getPoint() {
        return point;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

