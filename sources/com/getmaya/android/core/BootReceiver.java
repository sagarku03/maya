package com.getmaya.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC2437by0;
import defpackage.FO0;
import defpackage.Fb2;
import defpackage.G62;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/core/BootReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class BootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1787487905) {
                if (iHashCode != 798292259) {
                    if (iHashCode != 1737074039 || !action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                        return;
                    }
                } else if (!action.equals("android.intent.action.BOOT_COMPLETED")) {
                    return;
                }
            } else if (!action.equals("android.intent.action.QUICKBOOT_POWERON")) {
                return;
            }
            try {
                Fb2.b(context);
            } catch (Exception unused) {
            }
            try {
                AbstractC2437by0.a(context);
            } catch (Exception unused2) {
            }
            try {
                G62.c(context);
            } catch (Exception unused3) {
            }
            try {
                FO0 fo0 = MayaForegroundService.x4;
                FO0.V(context, new Intent(context, (Class<?>) MayaForegroundService.class).setAction("com.getmaya.android.BOOT_STANDBY"));
            } catch (Exception unused4) {
            }
        }
    }
}
