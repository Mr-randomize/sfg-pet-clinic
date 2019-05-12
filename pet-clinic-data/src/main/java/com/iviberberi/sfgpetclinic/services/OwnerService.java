package com.iviberberi.sfgpetclinic.services;

import com.iviberberi.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
