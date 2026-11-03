package com.getmaya.android.ui.facelock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.AbstractC1947Yy1;
import defpackage.AbstractC2082aE;
import defpackage.AbstractC5669rb2;
import defpackage.AbstractC6911xb2;
import defpackage.AbstractC7338zf;
import defpackage.C3529hE;
import defpackage.C5960t01;
import defpackage.C6447vL1;
import defpackage.C6484vY;
import defpackage.C6898xY;
import defpackage.FO0;
import defpackage.ZD;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/ui/facelock/FaceLockActivity;", "LZD;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class FaceLockActivity extends ZD {
    public static final /* synthetic */ int k0 = 0;
    public final C5960t01 h0;
    public final C5960t01 i0;
    public boolean j0;

    public FaceLockActivity() {
        FO0 fo0 = FO0.X;
        this.h0 = AbstractC6911xb2.g("", fo0);
        this.i0 = AbstractC6911xb2.g("", fo0);
    }

    public static final void l(FaceLockActivity faceLockActivity) {
        faceLockActivity.getClass();
        try {
            faceLockActivity.startActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME").addFlags(268435456));
        } catch (Throwable unused) {
        }
        faceLockActivity.finish();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(C6447vL1.h(context));
    }

    public final String m() {
        return (String) getValue();
    }

    public final void n(Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("pkg") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        setValue(stringExtra);
        String stringExtra2 = intent != null ? intent.getStringExtra("label") : null;
        setValue(stringExtra2 != null ? stringExtra2 : "");
        if (AbstractC1947Yy1.n(m())) {
            finish();
        }
    }

    @Override // defpackage.ZD, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n(getIntent());
        a().a(this, new C6484vY(this));
        AbstractC2082aE.a(this, new C3529hE(-811746688, new C6898xY(this, 1), true));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (!this.j0) {
            String str = AbstractC7338zf.a;
            AbstractC7338zf.b = null;
            AbstractC7338zf.d = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.ZD, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        n(intent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        String str = AbstractC7338zf.a;
        if (AbstractC5669rb2.d(AbstractC7338zf.d, m())) {
            AbstractC7338zf.d = null;
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = AbstractC7338zf.a;
        AbstractC7338zf.d = m();
    }

    @Override // android.app.Activity
    public final void onStop() {
        if (!this.j0) {
            String str = AbstractC7338zf.a;
            AbstractC7338zf.b = null;
            AbstractC7338zf.d = null;
        }
        super.onStop();
    }
}
