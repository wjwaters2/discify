package org.drunkuncle.discify.controller

import org.drunkuncle.discify.service.SpotifyService
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
class SpotifyController(private val spotifyService: SpotifyService) {

    @GetMapping("/getAlbum")
    fun getAlbum(@RequestParam(value = "id") id: String, model: ModelMap): ModelAndView {
        val spotifyData = spotifyService.getAlbum(id)
        model.addAttribute("spotifyData", spotifyData)
        return ModelAndView("discify", model)
    }
}