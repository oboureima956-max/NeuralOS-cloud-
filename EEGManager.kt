package com.neuralos.app.eeg

import com.neuralos.app.ai.TFLiteEngine

class EEGManager(
    private val source: EEGSource,
    private val engine: TFLiteEngine
) {
    fun start(callback: (FloatArray) -> Unit) {
        source.start { eeg ->
            val result = engine.infer(eeg)
            callback(result)
        }
    }
}