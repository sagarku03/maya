package com.getmaya.android.assistant;

import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.service.voice.VoiceInteractionSessionService;
import defpackage.C6440vJ0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/assistant/MayaVoiceInteractionSessionService;", "Landroid/service/voice/VoiceInteractionSessionService;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MayaVoiceInteractionSessionService extends VoiceInteractionSessionService {
    @Override // android.service.voice.VoiceInteractionSessionService
    public final VoiceInteractionSession onNewSession(Bundle bundle) {
        return new C6440vJ0(this);
    }
}
