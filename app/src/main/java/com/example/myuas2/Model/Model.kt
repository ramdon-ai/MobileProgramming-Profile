package com.example.myuas2.Model

class Model (
    val db_rumahsakit: List<Data>
) {
    data class Data (val nama:String?, val alamat:String?)
    }
