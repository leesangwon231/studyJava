package eleven;

import eight.MemberDTO;

public class Doit11Controller {
   
    public static void main(String[] args) {
        Doit11 doIt = new Doit11Abstract();
        MemberDTO dto = new MemberDTO();
        dto.name = "sang";
        doIt.add();
        doIt.delete(1);
        doIt.update(1, dto);
        doIt.select(2);
    }
}
