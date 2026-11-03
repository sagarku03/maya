package com.getmaya.android.termux;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import defpackage.C3324gE1;
import defpackage.C3738iE1;
import defpackage.C6447vL1;
import defpackage.ID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/termux/TermuxPermissionActivity;", "Landroid/app/Activity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TermuxPermissionActivity extends Activity {
    public boolean N;
    public long O;
    public boolean P;

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(C6447vL1.h(context));
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (checkSelfPermission("com.termux.permission.RUN_COMMAND") != 0) {
            C3324gE1 c3324gE1 = C3324gE1.a;
            this.P = C3324gE1.d(this);
            this.O = SystemClock.elapsedRealtime();
            requestPermissions(new String[]{"com.termux.permission.RUN_COMMAND"}, 4107);
            return;
        }
        C3738iE1 c3738iE1 = new C3738iE1(true, 0L, false, false, 0);
        this.N = true;
        C3324gE1 c3324gE2 = C3324gE1.a;
        ID id = C3324gE1.c;
        if (id != null) {
            id.h0(c3738iE1);
        }
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (!this.N) {
            C3324gE1 c3324gE1 = C3324gE1.a;
            ID id = C3324gE1.c;
            if (id != null) {
                id.h0(null);
            }
        }
        super.onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 4107) {
            return;
        }
        if (iArr.length == 0) {
            this.N = true;
            C3324gE1 c3324gE1 = C3324gE1.a;
            ID id = C3324gE1.c;
            if (id != null) {
                id.h0(null);
            }
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        boolean z2 = iArr[0] == 0;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.O;
        boolean z3 = this.P;
        if (z2) {
            z = false;
        } else {
            C3324gE1 c3324gE2 = C3324gE1.a;
            if (C3324gE1.d(this)) {
                z = true;
            } else {
                z = false;
            }
        }
        C3738iE1 c3738iE1 = new C3738iE1(z2, jElapsedRealtime, z3, z, 0);
        this.N = true;
        C3324gE1 c3324gE3 = C3324gE1.a;
        ID id2 = C3324gE1.c;
        if (id2 != null) {
            id2.h0(c3738iE1);
        }
        finish();
        overridePendingTransition(0, 0);
    }
}
