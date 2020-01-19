package weiyu.springframework.petclinictest.Models;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {
    private Set<Pet> pets = new HashSet<>();
    private String address;
    private String city;
    private String cellphone;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }



    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
