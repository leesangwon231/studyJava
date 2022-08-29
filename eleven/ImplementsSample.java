package eleven;

import eight.MemberDTO;

public class ImplementsSample {
    
    public static void main(String[] args) {
        MemberMangerInterface manager = new MemberManager();
        MemberDTO mDto = new MemberDTO();
        mDto.email = "qweqwe";
        mDto.name = "sangwon";
        mDto.phone = "sdafads";
        System.out.println(manager.addMember(mDto));
    }
}
