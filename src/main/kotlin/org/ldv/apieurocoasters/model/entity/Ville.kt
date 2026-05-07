package org.ldv.apieurocoasters.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "villes")
class Ville(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val villeId: Long,
    val nom: String,

    @ManyToOne
    @JoinColumn(name= "fk_pays_id")
    val pays: Pays?
) {
}