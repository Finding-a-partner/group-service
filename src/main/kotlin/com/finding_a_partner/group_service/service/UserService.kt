package com.finding_a_partner.group_service.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import java.time.LocalDateTime

class User(
    val id: Long,
    val createdAt: LocalDateTime,
    val login: String,
    val email: String,
    val description: String? = null,
    val name: String,
    val surname: String? = null
)

@FeignClient(name = "user-service", path = "/user")
interface UserService {
    @GetMapping(value = ["/{id}"])
    fun getById(@PathVariable id: Long): User

    fun getAll(): List<User>
}
