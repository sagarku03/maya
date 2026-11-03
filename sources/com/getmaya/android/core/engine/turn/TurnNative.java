package com.getmaya.android.core.engine.turn;

import defpackage.C6855xJ1;
import defpackage.InterfaceC0045Ao0;
import defpackage.YB1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/getmaya/android/core/engine/turn/TurnNative;", "", "<init>", "()V", "", "path", "", "threads", "", "nativeOpen", "(Ljava/lang/String;I)J", "handle", "", "ids", "", "nativeScore", "(J[J)F", "LGL1;", "nativeClose", "(J)V", "", "available$delegate", "LAo0;", "getAvailable", "()Z", "available", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TurnNative {
    public static final TurnNative INSTANCE = new TurnNative();

    /* JADX INFO: renamed from: available$delegate, reason: from kotlin metadata */
    private static final InterfaceC0045Ao0 available = new YB1(C6855xJ1.V);
    public static final int $stable = 8;

    private TurnNative() {
    }

    public static final native void nativeClose(long handle);

    public static final native long nativeOpen(String path, int threads);

    public static final native float nativeScore(long handle, long[] ids);

    public final boolean getAvailable() {
        return ((Boolean) available.getValue()).booleanValue();
    }
}
