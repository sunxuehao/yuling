package van.controller;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {
private T data;

    public ResultBean(T data) {
        super();
        this.data = data;
    }
}
