package com.getmaya.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.A20;
import defpackage.AbstractC5669rb2;
import defpackage.FO0;
import defpackage.Z00;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/core/MicCaptureReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MicCaptureReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (AbstractC5669rb2.d(intent.getAction(), "com.getmaya.android.CAPTURE_MIC")) {
            if (intent.hasExtra("dumps")) {
                boolean booleanExtra = intent.getBooleanExtra("dumps", false);
                A20.g = booleanExtra;
                try {
                    File externalFilesDir = context.getExternalFilesDir("wakedumps");
                    if (externalFilesDir == null) {
                        externalFilesDir = new File(context.getFilesDir(), "wakedumps");
                    }
                    File file = new File(externalFilesDir, ".enabled");
                    if (booleanExtra) {
                        externalFilesDir.mkdirs();
                        Z00.n(file, "1");
                    } else {
                        file.delete();
                    }
                } catch (Throwable unused) {
                }
                if (!intent.hasExtra("seconds")) {
                    return;
                }
            }
            int intExtra = intent.getIntExtra("seconds", 600);
            try {
                FO0 fo0 = MayaForegroundService.x4;
                FO0.V(context, new Intent(context, (Class<?>) MayaForegroundService.class).setAction("com.getmaya.android.CAPTURE_MIC").putExtra("seconds", intExtra));
            } catch (Exception unused2) {
            }
        }
    }
}
