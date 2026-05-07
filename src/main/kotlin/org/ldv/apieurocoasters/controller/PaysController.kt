package org.ldv.apieurocoasters.controller

import org.ldv.apieurocoasters.DAO.PaysDAO
import org.ldv.apieurocoasters.model.entity.Pays
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
@RequestMapping("/pays")
class PaysController(val paysDAO: PaysDAO) {

    @GetMapping
    fun getAllPays(): List<Pays> = paysDAO.findAll()

    @GetMapping("/id")
    fun getPaysById(@PathVariable id: Long): Optional<Pays> = paysDAO.findById(id)
}

