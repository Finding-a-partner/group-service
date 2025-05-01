package com.finding_a_partner.group_service.database.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Lob
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "groups")
class Group(
    @Column(nullable = false)
    var name: String,

    @Column
    @Lob
    var description: String?,

    @Column(name = "creator_user_id", nullable = false)
    val creatorUserId: Long,
) : AbstractEntity()
