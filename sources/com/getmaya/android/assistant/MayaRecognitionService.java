package com.getmaya.android.assistant;

import android.content.Intent;
import android.speech.RecognitionService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/assistant/MayaRecognitionService;", "Landroid/speech/RecognitionService;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MayaRecognitionService extends RecognitionService {
    @Override // android.speech.RecognitionService
    public final void onCancel(RecognitionService.Callback callback) {
    }

    @Override // android.speech.RecognitionService
    public final void onStartListening(Intent intent, RecognitionService.Callback callback) {
        if (callback != null) {
            try {
                callback.error(8);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.speech.RecognitionService
    public final void onStopListening(RecognitionService.Callback callback) {
    }
}
