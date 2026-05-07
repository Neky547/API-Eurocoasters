package org.ldv.apieurocoasters.controller

import org.ldv.apieurocoasters.DAO.ConstructeurDAO
import org.ldv.apieurocoasters.model.entity.Constructeur
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
@RequestMapping("/constructeurs")
class ConstructeurController(val contructeurDAO: ConstructeurDAO, private val constructeurDAO: ConstructeurDAO) {

    @GetMapping
    fun getAllConstructeurs(): List<Constructeur> = contructeurDAO.findAll()

    @GetMapping
    fun getConstructeurById(@PathVariable id: Long): Optional<Constructeur> = constructeurDAO.findById(id)
}