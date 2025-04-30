package com.finding_a_partner.group_service.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

class User(val id: Long, val name: String)

@FeignClient(name = "user-service", path = "/user")
interface UserService {
    @GetMapping(value = ["/{id}"])
    fun getById(@PathVariable id: Long): User

    fun getAll(): List<User>
}
