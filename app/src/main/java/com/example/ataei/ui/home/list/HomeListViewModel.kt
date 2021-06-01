package com.example.ataei.ui.home.list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import arrow.core.Either.Left
import arrow.core.Either.Right
import com.example.ataei.ui.base.BaseViewModel
import com.example.data.model.Error
import com.example.data.model.game.Game
import com.example.data.repository.GameRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeListViewModel @Inject constructor(
    private val gameRepository: GameRepository
) : BaseViewModel() {

    val _games = MutableLiveData<List<Game>>(emptyList())
    val games: LiveData<List<Game>>
        get() = _games


    private fun getGames() {
        viewModelScope.launch {
            when (val result = gameRepository.getGames()) {
                is Right -> _games.value = result.b
                is Left -> showError(result.a)
            }
        }
    }

    private fun showError(error: Error) {
        Log.d(TAG, "showError() called  with: error = [$error]")
    }

    companion object {
        private const val TAG = "HomeListViewModel"
    }
}