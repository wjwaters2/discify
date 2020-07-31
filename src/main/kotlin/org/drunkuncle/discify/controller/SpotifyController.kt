package org.drunkuncle.discify.controller

import org.drunkuncle.discify.model.Album
import org.drunkuncle.discify.model.Artist
import org.drunkuncle.discify.model.Release
import org.drunkuncle.discify.service.SpotifyService
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
class SpotifyController(private val spotifyService: SpotifyService) {

    @GetMapping("/getAlbum")
    fun getAlbum(@RequestParam(value = "id") id: String, model: ModelMap): Release {
        val spotifyData = spotifyService.getAlbum(id)
        val album = Album(id)

        album.country = "US"
        album.title = spotifyData["name"] as String?
        val artistList: ArrayList<*>
        artistList = spotifyData["artists"] as ArrayList<*>
        val artist: LinkedHashMap<*, *>
        artist = artistList[0] as LinkedHashMap<*, *>
        val release = Release(null, null)
        val releaseArtist = Artist(artist["name"] as String)
        release.artist = releaseArtist
        release.album = album
//        return ModelAndView("discify", model)
        return release
    }
}