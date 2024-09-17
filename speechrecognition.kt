val speechRecognizer = SpeechRecognizer.createSpeechRecognizer(context)
val speechRecognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
    putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
    putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault())
}

speechRecognizer.setRecognitionListener(object : RecognitionListener {
    // ... other RecognitionListener methods

    override fun onResults(results: Bundle?) {
        val matches = results?.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
        if (matches != null) {
            for (result in matches) {
                if (result.contains("help") || result.contains("emergency")) {
                    // Trigger SOS actions (send alerts, share location, etc.)
                    break 
                }
            }
        }
    }
})

// Start listening when appropriate (e.g., button press)
speechRecognizer.startListening(speechRecognizerIntent)