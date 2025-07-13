package com.example.mydemoapplication.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mydemoapplication.data.model.Estatus
import com.example.mydemoapplication.data.repository.EstatusRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val estatusRepo: EstatusRepo
) : ViewModel() {

    private val _state = MutableStateFlow(emptyList<Estatus>())
    val state: StateFlow<List<Estatus>>
        get() = _state


    init {

        viewModelScope.launch {
            val esatus = estatusRepo.getEstatus()
            _state.value = esatus
        }
    }

}