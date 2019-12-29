package weiyu.springframework.petclinictest.Services;


import weiyu.springframework.petclinictest.Models.Owner;


public interface OwnerService extends CrudService <Owner, Long> {
    Owner findByLastName(String lastName);

}
