package com.getmaya.android.assistant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.getmaya.android.core.MayaForegroundService;
import defpackage.C6447vL1;
import defpackage.FO0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/assistant/MayaAssistActivity;", "Landroid/app/Activity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MayaAssistActivity extends Activity {
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(C6447vL1.h(context));
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FO0 fo0 = MayaForegroundService.x4;
        FO0.V(this, new Intent(this, (Class<?>) MayaForegroundService.class).setAction("com.getmaya.android.ASSIST_WAKE").putExtra("extra_text", (String) null));
        finish();
    }
}
