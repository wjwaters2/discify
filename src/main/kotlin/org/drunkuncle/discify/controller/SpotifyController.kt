package org.drunkuncle.discify.controller

import org.drunkuncle.discify.service.SpotifyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.drunkuncle.discify.model.Album

@RestController
class SpotifyController(private val spotifyService: SpotifyService) {

    @GetMapping("/getAlbum")
    fun getAlbum(@RequestParam(value = "id") id: String) {
        val spotifyData = spotifyService.getAlbum(id)
        val album = Album(id)

        album.country = "US"
        album.title = spotifyData["name"] as String?
    }
}