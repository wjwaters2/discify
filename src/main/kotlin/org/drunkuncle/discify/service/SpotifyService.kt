package org.drunkuncle.discify.service

import org.drunkuncle.discify.client.SpotifyClient
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component
import java.io.IOException

@Component
@Primary
class SpotifyService(private val client: SpotifyClient) {

    @Throws(IOException::class)
    fun getAlbum(id: String?): Map<*, *> {
        return client.getAlbum(id)
    }
}