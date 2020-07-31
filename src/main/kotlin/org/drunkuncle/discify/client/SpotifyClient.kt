package org.drunkuncle.discify.client

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class SpotifyClient {
    @Autowired
    lateinit var restTemplate: RestTemplate

    fun getAlbum(id: String?): Map<*, *> {

        val responseMap: Map<*, *>
        responseMap = restTemplate.getForObject("https://api.spotify.com/v1/albums/$id", Map::class.java)
        return responseMap
    }
}