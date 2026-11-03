package com.getmaya.android.ui.facelock;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.getmaya.android.R;
import defpackage.AbstractC0200Co;
import defpackage.AbstractC1228Pt;
import defpackage.AbstractC1661Vh0;
import defpackage.AbstractC1731We1;
import defpackage.AbstractC1947Yy1;
import defpackage.AbstractC1966Zf;
import defpackage.AbstractC2082aE;
import defpackage.AbstractC2163ad2;
import defpackage.AbstractC2454c22;
import defpackage.AbstractC2803di2;
import defpackage.AbstractC2959eV;
import defpackage.AbstractC3009ei2;
import defpackage.AbstractC3203ff1;
import defpackage.AbstractC3242fr;
import defpackage.AbstractC4766nD;
import defpackage.AbstractC5669rb2;
import defpackage.AbstractC5740rw1;
import defpackage.AbstractC5782s72;
import defpackage.AbstractC5900sh2;
import defpackage.AbstractC6225uG1;
import defpackage.AbstractC6250uP;
import defpackage.AbstractC6403v72;
import defpackage.AbstractC7119yc;
import defpackage.AbstractC7193yy;
import defpackage.BF;
import defpackage.C0356Eo;
import defpackage.C1108Of;
import defpackage.C1320Qx1;
import defpackage.C1572Ud1;
import defpackage.C1810Xf;
import defpackage.C2132aU1;
import defpackage.C2339bU1;
import defpackage.C2529cP0;
import defpackage.C2532cQ0;
import defpackage.C2545cU1;
import defpackage.C2752dU1;
import defpackage.C2763dY0;
import defpackage.C2809dk0;
import defpackage.C2958eU1;
import defpackage.C3328gG;
import defpackage.C3372gU1;
import defpackage.C3410gf1;
import defpackage.C3529hE;
import defpackage.C4361lG;
import defpackage.C4610mU;
import defpackage.C4797nN0;
import defpackage.C5180pD;
import defpackage.C5396qG;
import defpackage.C5882sd0;
import defpackage.C5987t70;
import defpackage.C61;
import defpackage.C6222uF1;
import defpackage.C6245uN0;
import defpackage.C6447vL1;
import defpackage.C6802x4;
import defpackage.E61;
import defpackage.Fh2;
import defpackage.GL1;
import defpackage.I22;
import defpackage.IX;
import defpackage.InterfaceC0213Cs0;
import defpackage.InterfaceC1186Pf;
import defpackage.InterfaceC3535hG;
import defpackage.InterfaceC6866xN0;
import defpackage.J11;
import defpackage.Kc2;
import defpackage.L5;
import defpackage.N30;
import defpackage.NC;
import defpackage.OF;
import defpackage.OK;
import defpackage.Pb2;
import defpackage.Ph2;
import defpackage.RS0;
import defpackage.RZ0;
import defpackage.Re2;
import defpackage.S40;
import defpackage.SY;
import defpackage.Si2;
import defpackage.UC;
import defpackage.UT1;
import defpackage.Vh2;
import defpackage.WD1;
import defpackage.Wd2;
import defpackage.XJ;
import defpackage.XT1;
import defpackage.Xi2;
import defpackage.Y81;
import defpackage.YT1;
import defpackage.Z72;
import defpackage.ZD;
import defpackage.ZJ;
import defpackage.ZJ0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/getmaya/android/ui/facelock/WatchmanActivity;", "LZD;", "<init>", "()V", "UT1", "s", "app_release"}, k = 1, mv = {1, 9, 0})
public final class WatchmanActivity extends ZD {
    public static volatile WatchmanActivity o0;
    public final C1320Qx1 h0 = Z72.a(new UT1(R.string.settings_safety_watchman_starting, 0, "", 0, null));
    public final XJ i0 = Xi2.a(Si2.b(AbstractC2163ad2.b(), AbstractC6250uP.a));
    public final C3372gU1 j0 = new C3372gU1();
    public volatile List k0 = C4610mU.N;
    public volatile long l0;
    public volatile long m0;
    public volatile boolean n0;

    public static final void m(WatchmanActivity watchmanActivity, int i, int i2, String str, int i3, Integer num, String str2, boolean z, C2339bU1 c2339bU1, C2339bU1 c2339bU2, C5396qG c5396qG, int i4) {
        C5882sd0 c5882sd0;
        BF bf;
        BF bf2;
        float f;
        String strM;
        String strC;
        int i5;
        watchmanActivity.getClass();
        c5396qG.d0(235029219);
        InterfaceC0213Cs0 interfaceC0213Cs0 = (InterfaceC0213Cs0) c5396qG.l(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        AbstractC2454c22.c(c5396qG, new XT1(watchmanActivity, null), GL1.a);
        C6245uN0 c6245uN0 = C6245uN0.b;
        FillElement fillElement = d.c;
        long j = UC.b;
        C2763dY0 c2763dY0 = AbstractC5782s72.a;
        InterfaceC6866xN0 interfaceC6866xN0B = a.b(fillElement, j, c2763dY0);
        c5396qG.b0(-149200770);
        Object objQ = c5396qG.Q();
        Re2 re2 = C4361lG.a;
        if (objQ == re2) {
            objQ = AbstractC1228Pt.f(c5396qG);
        }
        C2529cP0 c2529cP0 = (C2529cP0) objQ;
        c5396qG.r(false);
        c5396qG.b0(-149198878);
        boolean z2 = (((i4 & 234881024) ^ 100663296) > 67108864 && c5396qG.g(c2339bU2)) || (i4 & 100663296) == 67108864;
        Object objQ2 = c5396qG.Q();
        if (z2 || objQ2 == re2) {
            objQ2 = new C6802x4(c2339bU2, 23);
            c5396qG.l0(objQ2);
        }
        c5396qG.r(false);
        InterfaceC6866xN0 interfaceC6866xN0L = androidx.compose.foundation.layout.a.l(a.d(interfaceC6866xN0B, c2529cP0, null, false, null, null, (S40) objQ2, 28), 18);
        C5180pD c5180pDA = AbstractC4766nD.a(AbstractC1966Zf.c, C4797nN0.b0, c5396qG, 48);
        int i6 = c5396qG.P;
        J11 j11N = c5396qG.n();
        InterfaceC6866xN0 interfaceC6866xN0E = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0L);
        InterfaceC3535hG.f.getClass();
        C5882sd0 c5882sd1 = C3328gG.b;
        boolean z3 = c5396qG.a instanceof InterfaceC1186Pf;
        if (!z3) {
            AbstractC2803di2.c();
            throw null;
        }
        c5396qG.f0();
        if (c5396qG.O) {
            c5396qG.m(c5882sd1);
        } else {
            c5396qG.o0();
        }
        BF bf3 = C3328gG.f;
        Ph2.d(c5396qG, bf3, c5180pDA);
        BF bf4 = C3328gG.e;
        Ph2.d(c5396qG, bf4, j11N);
        BF bf5 = C3328gG.g;
        if (c5396qG.O || !AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i6))) {
            AbstractC7119yc.m(i6, c5396qG, i6, bf5);
        }
        BF bf6 = C3328gG.d;
        Ph2.d(c5396qG, bf6, interfaceC6866xN0E);
        C3410gf1 c3410gf1B = AbstractC3203ff1.b(AbstractC1966Zf.a, C4797nN0.Y, c5396qG, 48);
        int i7 = c5396qG.P;
        J11 j11N2 = c5396qG.n();
        InterfaceC6866xN0 interfaceC6866xN0E2 = AbstractC3009ei2.e(c5396qG, c6245uN0);
        if (!z3) {
            AbstractC2803di2.c();
            throw null;
        }
        c5396qG.f0();
        if (c5396qG.O) {
            c5396qG.m(c5882sd1);
        } else {
            c5396qG.o0();
        }
        Ph2.d(c5396qG, bf3, c3410gf1B);
        Ph2.d(c5396qG, bf4, j11N2);
        if (c5396qG.O || !AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i7))) {
            AbstractC7119yc.m(i7, c5396qG, i7, bf5);
        }
        Ph2.d(c5396qG, bf6, interfaceC6866xN0E2);
        AbstractC0200Co.a(a.b(AbstractC5900sh2.a(d.l(c6245uN0, 10), AbstractC1731We1.a), num == null ? Vh2.d(4293870660L) : UC.c, c2763dY0), c5396qG, 0);
        float f2 = 8;
        Pb2.a(c5396qG, d.p(c6245uN0, f2));
        String strE = Kc2.e(R.string.settings_safety_watchman_header, new Object[]{Kc2.d(i, c5396qG)}, c5396qG);
        long j2 = UC.d;
        AbstractC6225uG1.b(strE, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C5987t70.M(), c5396qG, 384, 0, 65530);
        c5396qG.r(true);
        float f3 = 12;
        float f4 = 24;
        InterfaceC6866xN0 interfaceC6866xN0B2 = a.b(AbstractC5900sh2.a(androidx.compose.foundation.layout.a.e(AbstractC1228Pt.e(c6245uN0, f3, c5396qG, c6245uN0, 1.0f), 0.75f), AbstractC1731We1.b(f4)), Vh2.d(4279046945L), c2763dY0);
        ZJ0 zj0E = AbstractC0200Co.e(C4797nN0.S, false);
        int i8 = c5396qG.P;
        J11 j11N3 = c5396qG.n();
        InterfaceC6866xN0 interfaceC6866xN0E3 = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0B2);
        if (!z3) {
            AbstractC2803di2.c();
            throw null;
        }
        c5396qG.f0();
        if (c5396qG.O) {
            c5882sd0 = c5882sd1;
            c5396qG.m(c5882sd0);
        } else {
            c5882sd0 = c5882sd1;
            c5396qG.o0();
        }
        Ph2.d(c5396qG, bf3, zj0E);
        Ph2.d(c5396qG, bf4, j11N3);
        if (c5396qG.O || !AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i8))) {
            bf = bf5;
            AbstractC7119yc.m(i8, c5396qG, i8, bf);
        } else {
            bf = bf5;
        }
        Ph2.d(c5396qG, bf6, interfaceC6866xN0E3);
        if (num == null) {
            c5396qG.b0(978551300);
            watchmanActivity.l(str2, interfaceC0213Cs0, c5396qG, ((i4 >> 15) & 14) | 576);
            c5396qG.r(false);
            bf2 = bf;
            f = f3;
        } else {
            c5396qG.b0(978633512);
            String strD = Kc2.d(num.intValue(), c5396qG);
            C1108Of.a.a();
            bf2 = bf;
            f = f3;
            AbstractC6225uG1.b(strD, androidx.compose.foundation.layout.a.l(c6245uN0, f4), C1108Of.c().q, 0L, null, null, null, 0L, null, new C6222uF1(3), 0L, 0, false, 0, 0, null, C5987t70.e0(14.0f, 20.0f, N30.R, 0.0f), c5396qG, 48, 0, 65016);
            c5396qG.r(false);
        }
        c5396qG.r(true);
        Pb2.a(c5396qG, d.f(c6245uN0, f));
        if (i3 > 0) {
            c5396qG.b0(14472365);
            strM = Kc2.c(R.plurals.settings_safety_watchman_faces, i3, new Object[]{String.valueOf(i3)}, c5396qG);
            c5396qG.r(false);
        } else {
            strM = AbstractC1661Vh0.m(c5396qG, 14475822, R.string.settings_safety_watchman_nobody, c5396qG, false);
        }
        AbstractC6225uG1.b(strM, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C5987t70.e0(16.0f, 24.0f, N30.R, 0.0f), c5396qG, 384, 0, 65530);
        if (!AbstractC1947Yy1.n(str)) {
            c5396qG.b0(14481883);
            strC = Kc2.c(R.plurals.settings_safety_watchman_alerts_last, i2, new Object[]{String.valueOf(i2), str}, c5396qG);
            c5396qG.r(false);
        } else {
            c5396qG.b0(14485808);
            strC = Kc2.c(R.plurals.settings_safety_watchman_alerts, i2, new Object[]{String.valueOf(i2)}, c5396qG);
            c5396qG.r(false);
        }
        String str3 = strC;
        C1108Of c1108Of = C1108Of.a;
        c1108Of.a();
        AbstractC6225uG1.b(str3, null, C1108Of.c().q, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C5987t70.e0(13.0f, 18.0f, N30.S, 0.0f), c5396qG, 0, 0, 65530);
        c5396qG.b0(14492133);
        if (z) {
            i5 = 6;
        } else {
            String strN = AbstractC1661Vh0.n(c6245uN0, 6, c5396qG, R.string.settings_safety_watchman_plug_in, c5396qG);
            c1108Of.a();
            i5 = 6;
            AbstractC6225uG1.b(strN, null, C1108Of.c().m, 0L, null, null, null, 0L, null, new C6222uF1(3), 0L, 0, false, 0, 0, null, C5987t70.e0(13.0f, 18.0f, N30.S, 0.0f), c5396qG, 0, 0, 65018);
        }
        c5396qG.r(false);
        InterfaceC6866xN0 interfaceC6866xN0E4 = AbstractC1228Pt.e(c6245uN0, 16, c5396qG, c6245uN0, 1.0f);
        C5180pD c5180pDA2 = AbstractC4766nD.a(new C1810Xf(f2), C4797nN0.a0, c5396qG, i5);
        int i9 = c5396qG.P;
        J11 j11N4 = c5396qG.n();
        InterfaceC6866xN0 interfaceC6866xN0E5 = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0E4);
        if (!z3) {
            AbstractC2803di2.c();
            throw null;
        }
        c5396qG.f0();
        if (c5396qG.O) {
            c5396qG.m(c5882sd0);
        } else {
            c5396qG.o0();
        }
        Ph2.d(c5396qG, bf3, c5180pDA2);
        Ph2.d(c5396qG, bf4, j11N4);
        if (c5396qG.O || !AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i9))) {
            AbstractC7119yc.m(i9, c5396qG, i9, bf2);
        }
        Ph2.d(c5396qG, bf6, interfaceC6866xN0E5);
        RZ0 rz0 = AbstractC3242fr.a;
        c1108Of.a();
        AbstractC7193yy.c(c2339bU1, d.d(c6245uN0, 1.0f), false, AbstractC1731We1.b(14), AbstractC3242fr.a(C1108Of.c().o, 0L, 0L, 0L, c5396qG, 14), null, null, null, null, OF.a, c5396qG, (14 & (i4 >> 21)) | 805306416, 484);
        c5396qG.r(true);
        c5396qG.r(true);
        Y81 y81V = c5396qG.v();
        if (y81V != null) {
            y81V.d = new YT1(watchmanActivity, i, i2, str, i3, num, str2, z, c2339bU1, c2339bU2, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x020a  */
    /* JADX WARN: Code duplicated, block: B:79:0x020c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0213  */
    /* JADX WARN: Code duplicated, block: B:85:0x021c  */
    public static final Object n(WatchmanActivity watchmanActivity, C2958eU1 c2958eU1, byte[] bArr, ZJ zj) throws Throwable {
        C2752dU1 c2752dU1;
        Object c1572Ud1;
        Object obj;
        String strM;
        String strD;
        C1320Qx1 c1320Qx1;
        Object value;
        UT1 ut1;
        Object next;
        watchmanActivity.getClass();
        if (zj instanceof C2752dU1) {
            c2752dU1 = (C2752dU1) zj;
            int i = c2752dU1.S;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2752dU1.S = i - Integer.MIN_VALUE;
            } else {
                c2752dU1 = new C2752dU1(watchmanActivity, zj);
            }
        } else {
            c2752dU1 = new C2752dU1(watchmanActivity, zj);
        }
        Object objC = c2752dU1.Q;
        OK ok = OK.N;
        int i2 = c2752dU1.S;
        try {
            if (i2 == 0) {
                AbstractC6403v72.e(objC);
                boolean z = c2958eU1.a;
                List list = c2958eU1.b;
                if (z && (!list.isEmpty())) {
                    strM = "Unknown face + ".concat(NC.M(c2958eU1.b, null, null, null, null, 63));
                } else {
                    strM = z ? "" : NC.M(c2958eU1.b, null, null, null, null, 63);
                }
                String str = AbstractC1947Yy1.n(strM) ? "Unknown face" : strM;
                if (z && (!list.isEmpty())) {
                    strD = Fh2.d(watchmanActivity, R.string.settings_safety_watchman_unknown_plus, NC.M(c2958eU1.b, null, null, null, null, 63));
                } else {
                    strD = z ? Fh2.d(watchmanActivity, R.string.settings_safety_attempts_unknown_face, new Object[0]) : strM;
                }
                long jB = I22.b(watchmanActivity.getApplicationContext(), "watchman", strM, "watchman", bArr);
                do {
                    c1320Qx1 = watchmanActivity.h0;
                    value = c1320Qx1.getValue();
                    ut1 = (UT1) value;
                } while (!c1320Qx1.h(value, UT1.a(ut1, 0, ut1.b + 1, strD, 0, null, 25)));
                File file = L5.a;
                L5.c("WATCHMAN alert stranger=" + z + " known=" + list.size());
                try {
                    NotificationManager notificationManager = (NotificationManager) watchmanActivity.getSystemService(NotificationManager.class);
                    if (notificationManager != null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("maya_watchman", Fh2.d(watchmanActivity, R.string.settings_safety_watchman_channel, new Object[0]), 4));
                        RS0 rs0 = new RS0(watchmanActivity, "maya_watchman");
                        rs0.r.icon = android.R.drawable.ic_menu_camera;
                        rs0.e = RS0.c(Fh2.d(watchmanActivity, R.string.settings_safety_watchman_notif_title, strD));
                        rs0.f = RS0.c(Fh2.d(watchmanActivity, R.string.settings_safety_watchman_notif_text, new Object[0]));
                        rs0.d(16);
                        notificationManager.notify(7343, rs0.b());
                    }
                } catch (Throwable unused) {
                }
                if (SY.b.w(watchmanActivity.getApplicationContext()).a.getBoolean("watch_telegram", true)) {
                    Iterator it = I22.g(watchmanActivity.getApplicationContext()).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((C2809dk0) next).a != jB);
                    C2809dk0 c2809dk0 = (C2809dk0) next;
                    String str2 = c2809dk0 != null ? c2809dk0.f : null;
                    String str3 = str2 != null ? str2 : "";
                    String strH = AbstractC2959eV.h("Maya watchman: ", str, " seen at ", new SimpleDateFormat("h:mm a", Locale.US).format(new Date()));
                    WD1 wd1 = new WD1(watchmanActivity.getApplicationContext());
                    if (!AbstractC1947Yy1.n(str3)) {
                        JSONObject jSONObjectPut = new JSONObject().put("path", str3).put("caption", strH);
                        c2752dU1.S = 1;
                        objC = wd1.c("telegram_send_file", jSONObjectPut, c2752dU1);
                        if (objC == ok) {
                            return ok;
                        }
                        c1572Ud1 = (JSONObject) objC;
                        if (c1572Ud1 instanceof C1572Ud1) {
                            obj = null;
                        } else {
                            obj = c1572Ud1;
                        }
                        JSONObject jSONObject = (JSONObject) obj;
                        File file2 = L5.a;
                        if (jSONObject == null) {
                        }
                        L5.c("WATCHMAN telegram ok=" + (jSONObject == null && jSONObject.optBoolean("success")));
                    } else {
                        JSONObject jSONObjectPut2 = new JSONObject().put("text", strH);
                        c2752dU1.S = 2;
                        objC = wd1.c("telegram_send_message", jSONObjectPut2, c2752dU1);
                        if (objC == ok) {
                            return ok;
                        }
                        c1572Ud1 = (JSONObject) objC;
                        if (c1572Ud1 instanceof C1572Ud1) {
                            obj = null;
                        } else {
                            obj = c1572Ud1;
                        }
                        JSONObject jSONObject2 = (JSONObject) obj;
                        File file3 = L5.a;
                        if (jSONObject2 == null) {
                        }
                        L5.c("WATCHMAN telegram ok=" + (jSONObject2 == null && jSONObject2.optBoolean("success")));
                    }
                }
            } else if (i2 == 1) {
                AbstractC6403v72.e(objC);
                c1572Ud1 = (JSONObject) objC;
                if (c1572Ud1 instanceof C1572Ud1) {
                    obj = null;
                } else {
                    obj = c1572Ud1;
                }
                JSONObject jSONObject3 = (JSONObject) obj;
                File file4 = L5.a;
                if (jSONObject3 == null) {
                }
                L5.c("WATCHMAN telegram ok=" + (jSONObject3 == null && jSONObject3.optBoolean("success")));
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6403v72.e(objC);
                c1572Ud1 = (JSONObject) objC;
                if (c1572Ud1 instanceof C1572Ud1) {
                    obj = null;
                } else {
                    obj = c1572Ud1;
                }
                JSONObject jSONObject4 = (JSONObject) obj;
                File file5 = L5.a;
                L5.c("WATCHMAN telegram ok=" + (jSONObject4 == null && jSONObject4.optBoolean("success")));
            }
        } catch (Throwable th) {
            c1572Ud1 = new C1572Ud1(th);
        }
        return GL1.a;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(C6447vL1.h(context));
    }

    public final void l(String str, InterfaceC0213Cs0 interfaceC0213Cs0, C5396qG c5396qG, int i) {
        c5396qG.d0(-1439956514);
        Context context = (Context) c5396qG.l(AndroidCompositionLocals_androidKt.b);
        c5396qG.b0(1587241965);
        Object objQ = c5396qG.Q();
        Object obj = C4361lG.a;
        Object obj2 = objQ;
        if (objQ == obj) {
            E61 e61 = new E61(context);
            e61.setScaleType(C61.FILL_CENTER);
            c5396qG.l0(e61);
            obj2 = e61;
        }
        E61 e62 = (E61) obj2;
        Object objI = AbstractC5740rw1.i(1587245540, c5396qG, false);
        if (objI == obj) {
            objI = Executors.newSingleThreadExecutor();
            c5396qG.l0(objI);
        }
        c5396qG.r(false);
        AbstractC2454c22.a(GL1.a, new C0356Eo(context, e62, (ExecutorService) objI, str, interfaceC0213Cs0, this, 4), c5396qG);
        androidx.compose.ui.viewinterop.a.a(new IX(e62, 3), d.c, null, c5396qG, 48);
        Y81 y81V = c5396qG.v();
        if (y81V != null) {
            y81V.d = new C2532cQ0(this, str, interfaceC0213Cs0, i, 14);
        }
    }

    @Override // defpackage.ZD, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 1;
        super.onCreate(bundle);
        o0 = this;
        getWindow().addFlags(128);
        String string = SY.b.w(this).a.getString("watch_lens", "back");
        String str = string != null ? string : "back";
        File file = L5.a;
        L5.c("WATCHMAN start lens=".concat(str));
        Wd2.d(this.i0, null, 0, new C2132aU1(this, null), 3);
        AbstractC2082aE.a(this, new C3529hE(1187777146, new C2545cU1(this, str, i), true));
        Window window = getWindow();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        window.setAttributes(attributes);
        this.m0 = SystemClock.elapsedRealtime() + 8000;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        this.n0 = false;
        if (o0 == this) {
            o0 = null;
        }
        Xi2.b(this.i0, null);
        L5.c("WATCHMAN stop");
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        this.n0 = false;
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.n0 = true;
    }
}
