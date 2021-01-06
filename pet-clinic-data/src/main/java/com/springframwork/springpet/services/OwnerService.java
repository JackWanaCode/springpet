package com.springframwork.springpet.services;

import com.springframwork.springpet.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
