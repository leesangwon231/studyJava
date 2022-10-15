package JavaSin2.Jeneric;

public class genericSample {
    
    public static void main(String[] args) {
        genericSample sample = new genericSample();
        sample.checkCastingDTO();
    }
    
    public void checkCastingDTO(){
        CastingDTO<String> dto1 = new CastingDTO<String>();
        dto1.setObject(new String());

        CastingDTO <StringBuffer>dto2 = new CastingDTO<StringBuffer>();
        dto2.setObject(new StringBuffer());

        CastingDTO<StringBuilder> dto3 = new CastingDTO<StringBuilder>();
        dto3.setObject(new StringBuilder());
    }

    
}
