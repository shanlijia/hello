package com.company;
/**
 * @author slj
 * @create 2020/11/18
 */
public class Hero1 {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Hero1() {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
