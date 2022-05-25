package br.senac.lojaretrofit.services

import br.senac.lojaretrofit.model.Produto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface ProdutoService {

    @GET("/android/rest/produto")
    fun listar(): Call<List<Produto>>

    //
    //@GET("/android/rest/produto")
    //fun listar(@Header("Cookie") token: String): Call<List<Produto>>
}