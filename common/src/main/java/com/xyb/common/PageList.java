package com.xyb.common;

import java.util.ArrayList;
import java.util.Collection;

public class PageList<E> extends ArrayList<E> {

    private int total;

    public PageList() {
        super();
    }
    public PageList(Collection<? extends E> collection, int total) {
        super(collection);
        this.total = total;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
}
