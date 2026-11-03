package com.getmaya.android.ui;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import defpackage.C2763dY0;
import defpackage.C6447vL1;
import defpackage.D62;
import defpackage.HD;
import defpackage.ID;
import defpackage.L5;
import defpackage.RL1;
import defpackage.RunnableC4134k91;
import defpackage.SP0;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/getmaya/android/ui/UnlockActivity;", "Landroid/app/Activity;", "<init>", "()V", "dY0", "app_release"}, k = 1, mv = {1, 9, 0})
public final class UnlockActivity extends Activity {
    public static volatile HD P;
    public static volatile boolean R;
    public HD N;
    public static final C2763dY0 O = new C2763dY0(9);
    public static final SP0 Q = D62.a();

    public final void a(String str) {
        boolean z;
        if (isFinishing()) {
            return;
        }
        try {
            Object systemService = getSystemService("keyguard");
            KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
            z = keyguardManager != null && keyguardManager.isKeyguardLocked();
        } catch (Exception unused) {
        }
        boolean z2 = true ^ z;
        File file = L5.a;
        L5.c("UNLOCK result=" + z2 + " (" + str + ")");
        HD hd = this.N;
        if (hd != null) {
            ((ID) hd).h0(Boolean.valueOf(z2));
        }
        if (P == this.N) {
            P = null;
        }
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(C6447vL1.h(context));
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.N = P;
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        }
        getWindow().addFlags(2621568);
        try {
            PowerManager powerManager = (PowerManager) getSystemService("power");
            if (!powerManager.isInteractive()) {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(805306394, "maya:unlock");
                wakeLockNewWakeLock.acquire(10000L);
                wakeLockNewWakeLock.release();
            }
        } catch (Throwable unused) {
        }
        Object systemService = getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        if (keyguardManager == null || !keyguardManager.isKeyguardLocked()) {
            a("already unlocked");
            return;
        }
        boolean z = R;
        File file = L5.a;
        L5.c("UNLOCK requested (secure=" + keyguardManager.isDeviceSecure() + ", standAside=" + z + ")");
        keyguardManager.requestDismissKeyguard(this, new RL1(this));
        if (z) {
            getWindow().getDecorView().postDelayed(new RunnableC4134k91(this, 14), 600L);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        boolean z = false;
        try {
            Object systemService = getSystemService("keyguard");
            KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
            if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                z = true;
            }
        } catch (Exception unused) {
        }
        boolean z2 = true ^ z;
        HD hd = this.N;
        if (hd != null) {
            ((ID) hd).h0(Boolean.valueOf(z2));
        }
        if (P == this.N) {
            P = null;
        }
        super.onDestroy();
    }
}
