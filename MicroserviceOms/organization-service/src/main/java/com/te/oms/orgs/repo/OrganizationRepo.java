package com.te.oms.orgs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.te.oms.orgs.entity.Organization;

public interface OrganizationRepo extends JpaRepository<Organization, Integer> {

}
