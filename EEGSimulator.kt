package com.neuralos.app.eeg

import kotlin.random.Random

class EEGSimulator : EEGSource {

    override fun start(callback: (FloatArray) -> Unit) {
        Thread {
            while (true) {
                val eeg = FloatArray(128) { Random.nextFloat() }
                callback(eeg)
                Thread.sleep(1000)
            }
        }.start()
    }
}