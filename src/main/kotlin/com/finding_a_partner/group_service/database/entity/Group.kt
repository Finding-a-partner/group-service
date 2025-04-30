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
) : AbstractEntity()
