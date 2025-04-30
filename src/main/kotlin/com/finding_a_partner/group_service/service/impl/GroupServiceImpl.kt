package com.finding_a_partner.group_service.service.impl

import com.finding_a_partner.group_service.database.entity.Group
import com.finding_a_partner.group_service.database.repository.GroupDao
import com.finding_a_partner.group_service.errors.ResourceNotFoundException
import com.finding_a_partner.group_service.model.request.GroupRequest
import com.finding_a_partner.group_service.model.response.GroupResponse
import com.finding_a_partner.group_service.service.GroupService
import com.finding_a_partner.group_service.util.GroupMapper
import org.springframework.stereotype.Service

@Service
class GroupServiceImpl(
    val dao: GroupDao,
    val mapper: GroupMapper,
) : GroupService {
    override fun getAll(): List<GroupResponse> {
        println("get method")
        return dao.findAll().map { mapper.entityToResponse(it) }
    }

    override fun getById(id: Long): GroupResponse =
        mapper.entityToResponse(dao.findById(id).orElseThrow { throw ResourceNotFoundException(id) })

    override fun update(id: Long, request: GroupRequest): GroupResponse {
        println("------------------------------update method")
        val entity = dao.findById(id).orElseThrow { throw ResourceNotFoundException(id) }
            .apply {
                name = request.name
                description = request.description
            }
        return mapper.entityToResponse(dao.save(entity))
    }

    override fun create(request: GroupRequest): GroupResponse {
        println("------------------------------create method")
        val entity = Group(
            name = request.name,
            description = request.description,
        )
        return mapper.entityToResponse(dao.save(entity))
    }

    override fun delete(id: Long) {
        println("------------------------------delete method")
        val entity = dao.findById(id).orElseThrow { throw ResourceNotFoundException(id) }
        dao.delete(entity)
    }
}
