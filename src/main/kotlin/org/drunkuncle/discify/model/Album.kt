package org.drunkuncle.discify.model

import java.util.*

class Album(var id: String) {
    var title: String? = null
    var label: Label? = null
    var country: String? = null
    var released: Date? = null
    var tracks: Array<Track>? = null
    var credits: Credits? = null
    var genres: Genres? = null
    var notes: String? = null
    var identifiers: Identifiers? = null
}
