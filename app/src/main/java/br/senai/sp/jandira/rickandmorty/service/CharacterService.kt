package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET

interface CharacterService {

//    https://rickandmortyapi.com/api/

    @GET("character")
    fun getCharacters(): Call<CharacterList>

    @GET("character/{id}")
    fun getCharacter(): Call<br.senai.sp.jandira.rickandmorty.model.Character>

}
