package com.getmaya.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.Window;
import com.getmaya.android.core.MayaForegroundService;
import defpackage.AbstractC1323Qy1;
import defpackage.AbstractC2082aE;
import defpackage.AbstractC5669rb2;
import defpackage.AbstractC6250uP;
import defpackage.C0066Av0;
import defpackage.C0144Bv0;
import defpackage.C0222Cv0;
import defpackage.C0300Dv0;
import defpackage.C0456Fv0;
import defpackage.C1320Qx1;
import defpackage.C1572Ud1;
import defpackage.C1650Vd1;
import defpackage.C2411bp0;
import defpackage.C3529hE;
import defpackage.C4486ls0;
import defpackage.C4610mU;
import defpackage.C5493qj0;
import defpackage.C5783s8;
import defpackage.C6033tL1;
import defpackage.C6447vL1;
import defpackage.C6541vn1;
import defpackage.CX1;
import defpackage.Cd2;
import defpackage.DX1;
import defpackage.E2;
import defpackage.Ei2;
import defpackage.EnumC4693ms0;
import defpackage.EnumC5413qL1;
import defpackage.FO0;
import defpackage.J2;
import defpackage.K2;
import defpackage.NC;
import defpackage.OC;
import defpackage.Oi2;
import defpackage.PY;
import defpackage.QY;
import defpackage.RY;
import defpackage.SY;
import defpackage.Si2;
import defpackage.TY;
import defpackage.Wd2;
import defpackage.Z72;
import defpackage.ZD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/MainActivity;", "LZD;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MainActivity extends ZD {
    public static volatile boolean k0;
    public static final C1320Qx1 l0;
    public static final C1320Qx1 m0;
    public static volatile String n0;
    public C4486ls0 h0;
    public EnumC5413qL1 i0 = EnumC5413qL1.HINGLISH;
    public final J2 j0 = k(new E2(5), new K2(this, 15));

    static {
        C1320Qx1 c1320Qx1A = Z72.a(null);
        l0 = c1320Qx1A;
        m0 = c1320Qx1A;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Object c1572Ud1;
        Object obj = C6447vL1.a;
        EnumC5413qL1 enumC5413qL1B = C6447vL1.b(context);
        this.i0 = enumC5413qL1B;
        try {
            Locale localeForLanguageTag = Locale.forLanguageTag(enumC5413qL1B.N);
            Configuration configuration = new Configuration();
            configuration.setLocale(localeForLanguageTag);
            configuration.setLayoutDirection(localeForLanguageTag);
            c1572Ud1 = context.createConfigurationContext(configuration);
        } catch (Throwable th) {
            c1572Ud1 = new C1572Ud1(th);
        }
        Object obj2 = context;
        if (C1650Vd1.a(c1572Ud1) == null) {
            obj2 = c1572Ud1;
        }
        super.attachBaseContext((Context) obj2);
    }

    public final void l(Intent intent) {
        List listD;
        Object c1572Ud1;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (AbstractC5669rb2.d(action, "android.intent.action.SEND") || AbstractC5669rb2.d(action, "android.intent.action.SEND_MULTIPLE")) {
            if (AbstractC5669rb2.d(action, "android.intent.action.SEND")) {
                listD = OC.j(intent.getParcelableExtra("android.intent.extra.STREAM"));
            } else {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                listD = parcelableArrayListExtra != null ? NC.D(parcelableArrayListExtra) : null;
                if (listD == null) {
                    listD = C4610mU.N;
                }
            }
            List list = listD;
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            String string = stringExtra != null ? AbstractC1323Qy1.l0(stringExtra).toString() : null;
            if (string == null) {
                string = "";
            }
            String str = string;
            intent.setAction("android.intent.action.MAIN");
            intent.removeExtra("android.intent.extra.STREAM");
            if (list.isEmpty()) {
                return;
            }
            try {
                Uri referrer = getReferrer();
                c1572Ud1 = referrer != null ? referrer.getHost() : null;
            } catch (Throwable th) {
                c1572Ud1 = new C1572Ud1(th);
            }
            if (c1572Ud1 instanceof C1572Ud1) {
                c1572Ud1 = null;
            }
            String str2 = (String) c1572Ud1;
            C1320Qx1 c1320Qx1 = l0;
            c1320Qx1.getClass();
            c1320Qx1.j(null, "chat");
            Wd2.d(Cd2.a(this), null, 0, new C0066Av0(this, str, str2, list, null), 3);
        }
    }

    public final void m() throws Exception {
        if (Ei2.b(this, "android.permission.RECORD_AUDIO") == 0) {
            Wd2.d(Cd2.a(this), null, 0, new C0456Fv0(this, null), 3);
            return;
        }
        ArrayList arrayListK = OC.k("android.permission.RECORD_AUDIO");
        if (Build.VERSION.SDK_INT >= 33) {
            arrayListK.add("android.permission.POST_NOTIFICATIONS");
        }
        f(arrayListK.toArray(new String[0]));
    }

    @Override // defpackage.ZD, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        byte[] bArr;
        super.onCreate(bundle);
        Oi2.b(getWindow(), false);
        Window window = getWindow();
        C2411bp0 c2411bp0 = new C2411bp0(getWindow().getDecorView());
        Si2 dx1 = Build.VERSION.SDK_INT >= 30 ? new DX1(window, c2411bp0) : new CX1(window, c2411bp0);
        dx1.a();
        dx1.e();
        C6541vn1 c6541vn1D = C6541vn1.f.d(getApplicationContext());
        this.h0 = C4486ls0.u.s(getApplicationContext());
        int[] iArr = C5493qj0.a;
        List listE = C5493qj0.e(this);
        if (!listE.isEmpty()) {
            String str = (String) C5493qj0.b.getValue();
            int length = str.length() / 2;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr2[i] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
            }
            String strF = C5493qj0.f(C5493qj0.c(bArr2));
            if (listE.isEmpty()) {
                C5493qj0.c = true;
                break;
            }
            Iterator it = listE.iterator();
            do {
                if (!it.hasNext()) {
                    C5493qj0.c = true;
                    break;
                } else {
                    bArr = (byte[]) it.next();
                    int[] iArr2 = C5493qj0.a;
                }
            } while (!C5493qj0.f(C5493qj0.c(C5493qj0.c(bArr))).equalsIgnoreCase(strF));
        }
        Wd2.d(Cd2.a(this), AbstractC6250uP.b, 0, new C0144Bv0(this, null), 2);
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("open_route")) != null) {
            C1320Qx1 c1320Qx1 = l0;
            c1320Qx1.getClass();
            c1320Qx1.j(null, stringExtra);
            intent.removeExtra("open_route");
        }
        l(getIntent());
        Wd2.d(Cd2.a(this), null, 0, new C0222Cv0(this, null), 3);
        Object obj = C6447vL1.a;
        Wd2.d(Cd2.a(this), null, 0, new C6033tL1(this, null, this.i0), 3);
        AbstractC2082aE.a(this, new C3529hE(-124920430, new C5783s8(18, c6541vn1D, this), true));
    }

    @Override // defpackage.ZD, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        String stringExtra = intent.getStringExtra("open_route");
        if (stringExtra != null) {
            C1320Qx1 c1320Qx1 = l0;
            c1320Qx1.getClass();
            c1320Qx1.j(null, stringExtra);
            intent.removeExtra("open_route");
        }
        l(intent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        k0 = false;
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        k0 = true;
        if (this.h0 != null) {
            Wd2.d(Cd2.a(this), null, 0, new C0300Dv0(this, null), 3);
        }
        C4486ls0 c4486ls0 = this.h0;
        if ((c4486ls0 != null ? c4486ls0 : null).g.getValue() == EnumC4693ms0.P && Ei2.b(this, "android.permission.RECORD_AUDIO") == 0) {
            FO0 fo0 = MayaForegroundService.x4;
            FO0.y(this);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        C1320Qx1 c1320Qx1 = TY.c;
        c1320Qx1.j(null, Integer.valueOf(((Number) c1320Qx1.getValue()).intValue() + 1));
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        PowerManager powerManager = (PowerManager) getSystemService(PowerManager.class);
        if (powerManager != null && !powerManager.isInteractive()) {
            TY.a.d();
            return;
        }
        TY ty = TY.a;
        QY qyB = SY.b.w(this).b();
        synchronized (ty) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (PY py : OC.i(PY.SETTINGS, PY.CHATS, PY.MEMORIES)) {
                Long l = (Long) TY.b.get(py.N);
                if (l != null) {
                    long jLongValue = l.longValue();
                    String str = py.N;
                    Set set = RY.a;
                    long jMin = 0;
                    if (jLongValue > jElapsedRealtime) {
                        long j = qyB.O;
                        if (j > 0) {
                            jMin = Math.min(jLongValue, j + jElapsedRealtime);
                        }
                    }
                    TY.e(jMin, str);
                }
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            Window window = getWindow();
            C2411bp0 c2411bp0 = new C2411bp0(getWindow().getDecorView());
            Si2 dx1 = Build.VERSION.SDK_INT >= 30 ? new DX1(window, c2411bp0) : new CX1(window, c2411bp0);
            dx1.a();
            dx1.e();
        }
    }
}
