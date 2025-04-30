package com.finding_a_partner.group_service.database.entity

import jakarta.persistence.*

@Entity
@Table(name = "group_roles")
class GroupRole(
    @Column(nullable = false)
    var name: String,

    @Column
    @Lob
    var description: String,
) : AbstractEntity() {
    @OneToMany(mappedBy = "roleId")
    val memberships: List<GroupMembership>? = null
}
