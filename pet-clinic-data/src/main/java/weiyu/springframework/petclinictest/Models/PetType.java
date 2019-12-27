package weiyu.springframework.petclinictest.Models;

public class PetType extends BaseEntity{
    private String type;
    private int test;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
