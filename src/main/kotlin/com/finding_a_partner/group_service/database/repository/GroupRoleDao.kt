package com.finding_a_partner.group_service.database.repository

import com.finding_a_partner.group_service.database.entity.GroupRole
import org.springframework.data.repository.CrudRepository

interface GroupRoleDao : CrudRepository<GroupRole, Long> {
}