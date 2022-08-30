package twelve;


public class MyPage {
    static InputBox input;
    
   public void setUI(){
        input = new InputBox();
        
        KeyEventListener k = new KeyEventListener() {
            public void onKeyUp(){
                System.out.println("onKeyUP !!!!");
            }
            public void onKeyDown(){
                System.out.println("on KEY DOWN !!!");
            }
        };

        input.setKeyListener(k);
    }

    public void pressKey(){
        InputBox is = new InputBox();
        input.listenerCalled(is.KEY_DOWN);
        input.listenerCalled(is.KEY_UP);
    }

   public static void main(String[] args) {
    MyPage m = new MyPage();
   
    m.setUI();
    m.pressKey();        
        
    
    }
    
}
