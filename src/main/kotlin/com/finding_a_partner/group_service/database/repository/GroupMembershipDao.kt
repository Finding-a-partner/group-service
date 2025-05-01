package com.finding_a_partner.group_service.database.repository

import com.finding_a_partner.group_service.database.entity.GroupMembership
import com.finding_a_partner.group_service.database.entity.GroupMembershipId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GroupMembershipDao : JpaRepository<GroupMembership, GroupMembershipId> {
    fun findAllByIdGroupId(groupId: Long): List<GroupMembership>
}