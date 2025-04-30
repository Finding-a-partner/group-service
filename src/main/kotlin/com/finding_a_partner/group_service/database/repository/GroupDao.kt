package com.finding_a_partner.group_service.database.repository

import com.finding_a_partner.group_service.database.entity.Group
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GroupDao : CrudRepository<Group, Long>
