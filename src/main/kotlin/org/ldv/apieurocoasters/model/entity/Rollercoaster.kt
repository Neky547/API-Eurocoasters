package org.ldv.apieurocoasters.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "rollercoasters")
class Rollercoaster(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val rollercoasterId: Long,

    val nom: String,
    val structure: String,
    val type: String,
    val dateOuverture: Int?,
    val hauteur: Float?,

    @ManyToOne
    @JoinColumn(name = "fk_constructeur_id")
    val constructeur: Constructeur?,

    @ManyToOne
    @JoinColumn(name = "fk_parc_id")
    val parc: Parc?
) {
}