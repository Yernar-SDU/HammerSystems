package com.example.hammer_systems.ui.search

import com.example.hammer_systems.data.prefs.Prefs
import com.example.hammer_systems.core.BaseViewModel
import com.example.hammer_systems.data.cloud.repository.BaseCloudRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    val baseCloudRepository: BaseCloudRepository,
    val prefs: Prefs
) : BaseViewModel() {
}