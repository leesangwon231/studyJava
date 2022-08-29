package eleven;

import eight.MemberDTO;

public interface MemberMangerInterface {
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
