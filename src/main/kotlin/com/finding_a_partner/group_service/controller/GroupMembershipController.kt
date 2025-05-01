package com.finding_a_partner.group_service.controller

import com.finding_a_partner.group_service.model.request.GroupMembershipRequest
import com.finding_a_partner.group_service.service.GroupMembershipService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/groups/{groupId}/member")
class GroupMembershipController(
    val service: GroupMembershipService,
) {
    @GetMapping()
    fun getById(@PathVariable("groupId") groupId: Long) = service.getAllByGroupId(groupId)

    @PutMapping()
    fun update(
        @PathVariable("groupId") groupId: Long,
        @RequestHeader("X-User-Id") userId: Long,
        @RequestBody request: GroupMembershipRequest,
    ) = service.update(groupId, userId, request)

    @PostMapping
    fun create(
        @PathVariable("groupId") groupId: Long,
        @RequestHeader("X-User-Id") userId: Long,
        @RequestBody request: GroupMembershipRequest,
    ) = service.create(groupId, userId, request)

    @DeleteMapping()
    fun delete(
        @PathVariable("groupId") groupId: Long,
        @RequestHeader("X-User-Id") userId: Long,
    ) = service.delete(groupId, userId)
}
