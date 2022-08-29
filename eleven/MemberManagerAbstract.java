package eleven;

import eight.MemberDTO;

public abstract class MemberManagerAbstract {
    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMember(String name, String phone);
    public abstract boolean updateMember(MemberDTO member);
    public final void printLog(String data){
        System.out.println("Data="+data);
    }
}
