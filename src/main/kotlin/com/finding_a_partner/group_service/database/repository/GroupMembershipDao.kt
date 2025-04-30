package com.finding_a_partner.group_service.database.repository

import com.finding_a_partner.group_service.database.entity.GroupMembership
import com.finding_a_partner.group_service.database.entity.GroupMembershipId
import org.springframework.data.repository.CrudRepository

interface GroupMembershipDao : CrudRepository<GroupMembership, GroupMembershipId> {
}