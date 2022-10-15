package JavaSin2.Jeneric;

import java.io.Serializable;

public class CastingDTO<T> implements Serializable{

    private T object;
    public void setObject(T object){
        this.object = object;
    }

    public T getObject(){
        return object;
    }
}
