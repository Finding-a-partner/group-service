package com.finding_a_partner.group_service.controller

import com.finding_a_partner.group_service.model.request.GroupRequest
import com.finding_a_partner.group_service.service.GroupService
import jakarta.servlet.http.HttpServletResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/groups")
class GroupController(
    val groupService: GroupService,
) {
    @GetMapping
    fun getAll() = groupService.getAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Long) = groupService.getById(id)

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: Long, @RequestBody request: GroupRequest) = groupService.update(id, request)

    @PostMapping
    fun create(@RequestBody request: GroupRequest) = groupService.create(request)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long) = groupService.delete(id)//: ResponseEntity<Void> {
//        return try {
//            groupService.delete(id)
//            ResponseEntity.noContent().build()
//        } catch (e: GroupNotFoundException) {
//            ResponseEntity.notFound().build()
//        }
//    }
}
