package eleven;

public  class Doit11Abstract implements Doit11{

    public void add(){
        System.out.println("add");
    }

    public void update(int index, Object value){
        System.out.println("update");
        System.out.println("index =>" + index);
        System.out.println("value =>"+  value);
    }
    
    public void delete(int index){
        System.out.println("delete");
        System.out.println("index => " + index);
    }

    public void select(int index){
        System.out.println("seelect");
    }
}
