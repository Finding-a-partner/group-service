package com.finding_a_partner.group_service.service

import com.finding_a_partner.group_service.model.request.GroupMembershipRequest
import com.finding_a_partner.group_service.model.response.GroupMembershipResponse

interface GroupMembershipService {
    fun getAll(): List<GroupMembershipResponse>
    fun getAllByGroupId(groupId: Long): List<GroupMembershipResponse>
    fun update(groupId: Long, userId: Long, request: GroupMembershipRequest): GroupMembershipResponse
    fun create(groupId: Long, userId: Long, request: GroupMembershipRequest): GroupMembershipResponse
    fun delete(groupId: Long, userId: Long)
}