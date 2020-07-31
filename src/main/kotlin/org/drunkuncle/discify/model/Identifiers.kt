package org.drunkuncle.discify.model

data class Identifiers(val barcode: String,
                       val labelCode: String,
                       val matrixRunout: String,
                       val masteringSIDCode: String,
                       val mouldSIDCode: String,
                       val pressingPlantID: String,
                       val distributionCode: String,
                       val priceCode: String,
                       val sparsCode: String,
                       val legal: String,
                       val asin: String,
                       val isrc: String,
                       val rightsSociety: String,
                       val other: String)