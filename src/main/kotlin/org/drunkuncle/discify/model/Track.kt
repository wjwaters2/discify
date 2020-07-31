package org.drunkuncle.discify.model

data class Track(val number: String,
                 val featuredArtist: Artist,
                 val title: String,
                 val duration: String)