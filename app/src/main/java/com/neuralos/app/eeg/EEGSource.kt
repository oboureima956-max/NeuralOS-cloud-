package com.neuralos.app.eeg

interface EEGSource {
    fun start(callback: (FloatArray) -> Unit)
}