package com.ts.library.entity;

/**
 * Created by ASpiralMoon on 2017/1/6.
 * 图书类别实体类
 */
public class BookType {

    private Byte typeId;
    private String type;

    public Byte getTypeId() {
        return typeId;
    }

    public void setTypeId(Byte typeId) {
        this.typeId = typeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "typeId=" + typeId +
                ", type='" + type + '\'' +
                '}';
    }
}
