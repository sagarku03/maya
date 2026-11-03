package com.getmaya.android.termux;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import defpackage.AE1;
import defpackage.AbstractC0916Lt;
import defpackage.BE1;
import defpackage.L5;
import defpackage.VE1;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/termux/TermuxResultReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TermuxResultReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        BE1 be1;
        int intExtra = intent.getIntExtra("maya_exec_id", -1);
        if (intExtra < 0) {
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("result");
        LinkedHashMap linkedHashMap = VE1.d;
        synchronized (linkedHashMap) {
            be1 = (BE1) linkedHashMap.get(Integer.valueOf(intExtra));
        }
        if (be1 == null) {
            File file = L5.a;
            AbstractC0916Lt.t("TERMUX result for ", intExtra, " with nobody waiting");
        } else {
            be1.f = SystemClock.elapsedRealtime();
            be1.e.h0(new AE1(bundleExtra));
        }
    }
}
