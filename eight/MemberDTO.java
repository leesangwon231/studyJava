package eight;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO(){

    }

    public MemberDTO(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public MemberDTO(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public MemberDTO getMeberDTO(){
        MemberDTO dto = new MemberDTO();
        return dto;
    }
}
