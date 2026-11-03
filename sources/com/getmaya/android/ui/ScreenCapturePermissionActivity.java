package com.getmaya.android.ui;

import android.content.Context;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import defpackage.C6447vL1;
import defpackage.E2;
import defpackage.J2;
import defpackage.K2;
import defpackage.ZD;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/ui/ScreenCapturePermissionActivity;", "LZD;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ScreenCapturePermissionActivity extends ZD {
    public static final /* synthetic */ int i0 = 0;
    public final J2 h0 = k(new E2(7), new K2(this, 22));

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(C6447vL1.h(context));
    }

    @Override // defpackage.ZD, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        f(((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent());
    }
}
