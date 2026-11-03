package com.getmaya.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import defpackage.AbstractC1947Yy1;
import defpackage.AbstractC5669rb2;
import defpackage.C1768Wr;
import defpackage.C1846Xr;
import defpackage.C1924Yr;
import defpackage.FO0;
import defpackage.OD;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/core/PhoneStateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class PhoneStateReceiver extends BroadcastReceiver {
    public static volatile C1768Wr a = new C1768Wr(null, null);
    public static volatile boolean b;

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        Object c1846Xr;
        C1768Wr c1768Wr;
        if (AbstractC5669rb2.d(intent.getAction(), "android.intent.action.PHONE_STATE") && (stringExtra = intent.getStringExtra("state")) != null) {
            String stringExtra2 = intent.getStringExtra("incoming_number");
            C1768Wr c1768Wr2 = a;
            if (stringExtra2 == null || !(!AbstractC1947Yy1.n(stringExtra2))) {
                stringExtra2 = null;
            }
            if (!stringExtra.equals(c1768Wr2.a)) {
                c1846Xr = new C1924Yr(stringExtra2, new C1768Wr(stringExtra, stringExtra2));
            } else if (stringExtra2 == null) {
                c1846Xr = new C1846Xr(c1768Wr2);
            } else {
                String str = c1768Wr2.b;
                if (!(str == null || AbstractC1947Yy1.n(str))) {
                    c1846Xr = new C1846Xr(c1768Wr2);
                } else {
                    c1846Xr = new C1924Yr(stringExtra2, new C1768Wr(stringExtra, stringExtra2));
                }
            }
            boolean z = c1846Xr instanceof C1924Yr;
            if (z) {
                c1768Wr = ((C1924Yr) c1846Xr).b;
            } else {
                if (!(c1846Xr instanceof C1846Xr)) {
                    throw new OD();
                }
                c1768Wr = ((C1846Xr) c1846Xr).a;
            }
            a = c1768Wr;
            C1924Yr c1924Yr = z ? (C1924Yr) c1846Xr : null;
            if (c1924Yr == null) {
                return;
            }
            String str2 = c1924Yr.a;
            if (stringExtra.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                b = true;
            } else if (stringExtra.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                if (!b) {
                    return;
                }
            } else if (!stringExtra.equals(TelephonyManager.EXTRA_STATE_IDLE) || !b) {
                return;
            } else {
                b = false;
            }
            try {
                FO0 fo0 = MayaForegroundService.x4;
                FO0.V(context, new Intent(context, (Class<?>) MayaForegroundService.class).setAction("com.getmaya.android.INCOMING_CALL").putExtra("extra_call_state", stringExtra).putExtra("extra_call_number", str2));
            } catch (Exception unused) {
            }
        }
    }
}
