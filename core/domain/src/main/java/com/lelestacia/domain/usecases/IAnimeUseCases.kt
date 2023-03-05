package com.lelestacia.domain.usecases

import androidx.paging.PagingData
import com.lelestacia.model.Anime
import kotlinx.coroutines.flow.Flow

interface IAnimeUseCases {
    fun getAiringAnime(): Flow<PagingData<Anime>>
}