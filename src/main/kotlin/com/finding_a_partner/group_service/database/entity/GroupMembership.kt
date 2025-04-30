package com.finding_a_partner.group_service.database.entity

import jakarta.persistence.*
import java.time.OffsetDateTime

@Entity
@Table(name = "group_memberships")
data class GroupMembership(
    @EmbeddedId
    val id: GroupMembershipId,

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("groupId")
    @JoinColumn(name = "group_id")
    val group: Group,

    @Column(name = "user_id", insertable = false, updatable = false)
    val userId: Long,

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    var roleId: GroupRole,

    @Column(name = "created_at")
    val createdAt: OffsetDateTime = OffsetDateTime.now(),

)
