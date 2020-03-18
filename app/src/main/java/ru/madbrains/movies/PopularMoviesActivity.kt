package ru.madbrains.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PopularMoviesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popular_movies)

        title = "Популярные фильмы" // задаем заголовок
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // говорим экрану, что бы он отобразил кнопку "Назад"
    }

    override fun onSupportNavigateUp(): Boolean { // назначаем действие на кнопку "Назад"
        onBackPressed() // действие, которые мы хотим выполнить (вернутся назад)
        return super.onSupportNavigateUp()
    }
}
