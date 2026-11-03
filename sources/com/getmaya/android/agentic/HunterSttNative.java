package com.getmaya.android.agentic;

import defpackage.InterfaceC0045Ao0;
import defpackage.VK;
import defpackage.YB1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/getmaya/android/agentic/HunterSttNative;", "", "<init>", "()V", "", "path", "", "threads", "", "nativeOpen", "(Ljava/lang/String;I)J", "handle", "", "audio", "blank", "", "nativeRun", "(J[FI)[I", "", "nativeLastConfidence", "(J)F", "", "nativeHasLogprobs", "(J)Z", "nativeRunLogprobs", "(J[F)[F", "LGL1;", "nativeClose", "(J)V", "available$delegate", "LAo0;", "getAvailable", "()Z", "available", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HunterSttNative {
    public static final HunterSttNative INSTANCE = new HunterSttNative();

    /* JADX INFO: renamed from: available$delegate, reason: from kotlin metadata */
    private static final InterfaceC0045Ao0 available = new YB1(VK.r0);
    public static final int $stable = 8;

    private HunterSttNative() {
    }

    public static final native void nativeClose(long handle);

    public static final native boolean nativeHasLogprobs(long handle);

    public static final native float nativeLastConfidence(long handle);

    public static final native long nativeOpen(String path, int threads);

    public static final native int[] nativeRun(long handle, float[] audio, int blank);

    public static final native float[] nativeRunLogprobs(long handle, float[] audio);

    public final boolean getAvailable() {
        return ((Boolean) available.getValue()).booleanValue();
    }
}
