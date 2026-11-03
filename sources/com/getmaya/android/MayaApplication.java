package com.getmaya.android;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import defpackage.AbstractC1323Qy1;
import defpackage.AbstractC1619Ut0;
import defpackage.AbstractC2045a32;
import defpackage.AbstractC2163ad2;
import defpackage.AbstractC4643md2;
import defpackage.AbstractC5669rb2;
import defpackage.AbstractC6250uP;
import defpackage.AbstractC7378zq1;
import defpackage.C1307Qt0;
import defpackage.C1541Tt0;
import defpackage.C1572Ud1;
import defpackage.C2103aL;
import defpackage.C2259b51;
import defpackage.C2723dL;
import defpackage.C3479h01;
import defpackage.C5004oN0;
import defpackage.C5211pN0;
import defpackage.C5418qN0;
import defpackage.C5493qj0;
import defpackage.C5831sN0;
import defpackage.C6240uL1;
import defpackage.C6447vL1;
import defpackage.C6541vn1;
import defpackage.HK1;
import defpackage.IA0;
import defpackage.JA0;
import defpackage.L5;
import defpackage.OS1;
import defpackage.P40;
import defpackage.SM;
import defpackage.Si2;
import defpackage.U72;
import defpackage.Ui2;
import defpackage.W12;
import defpackage.Wd2;
import defpackage.Xi2;
import defpackage.Zi2;
import java.io.File;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/MayaApplication;", "Landroid/app/Application;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MayaApplication extends Application {
    public static volatile Context N;

    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    @Override // android.app.Application
    public final void onCreate() {
        Object c1572Ud1;
        Object c1572Ud2;
        String string;
        String string2;
        long j;
        String strA;
        String str;
        String str2;
        super.onCreate();
        N = getApplicationContext();
        if (!Ui2.a) {
            Ui2.a = true;
            final Context applicationContext = getApplicationContext();
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: YX0
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    try {
                        Ui2.c(applicationContext, thread.getName(), th);
                    } catch (Throwable unused) {
                    }
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
        }
        try {
            L5.b(this);
        } catch (Throwable unused) {
        }
        Object obj = C6447vL1.a;
        if (!C6447vL1.b) {
            synchronized (C6447vL1.a) {
                C6447vL1.c(this);
            }
        }
        Wd2.d(Xi2.a(Si2.b(AbstractC2163ad2.b(), AbstractC6250uP.b)), null, 0, new C6240uL1(this, null), 3);
        try {
            Context applicationContext2 = getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext2.getSharedPreferences("maya_wake_comeback", 0);
            if (!sharedPreferences.getBoolean("done_5_2_35", false)) {
                boolean z = AbstractC4643md2.b(applicationContext2).b;
                if (!z) {
                    AbstractC4643md2.d(applicationContext2, "keep_wake_word", true);
                }
                Wd2.d(Xi2.a(AbstractC6250uP.b), null, 0, new OS1(applicationContext2, sharedPreferences, z, null), 3);
            }
        } catch (Exception unused2) {
        }
        C5831sN0 c5831sN0 = C5831sN0.a;
        try {
            C5831sN0.h = getApplicationContext();
            SharedPreferences sharedPreferences2 = getApplicationContext().getSharedPreferences("maya_model_runtime", 0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C5211pN0 c5211pN0 = !sharedPreferences2.contains("stage") ? null : new C5211pN0(sharedPreferences2.getLong("handled", 0L), sharedPreferences2.getInt("stage", 0), sharedPreferences2.getInt("generation", 0));
            if (c5211pN0 == null) {
                j = 0;
            } else if (c5211pN0.c == 2) {
                j = c5211pN0.b;
            } else if (c5211pN0.a > 0) {
                j = jCurrentTimeMillis;
            } else {
                j = 0;
            }
            C5418qN0 c5418qN0C = AbstractC2045a32.c(c5211pN0, C5831sN0.b(j, this), jCurrentTimeMillis);
            C5831sN0.b = c5418qN0C.a.a;
            if (!AbstractC5669rb2.d(c5211pN0, c5418qN0C.a)) {
                sharedPreferences2.edit().putInt("stage", c5418qN0C.a.a).putLong("handled", c5418qN0C.a.b).putInt("generation", c5418qN0C.a.c).apply();
            }
            C5004oN0 c5004oN0 = c5418qN0C.b;
            C2103aL c2103aLA = (c5004oN0 != null || C5831sN0.b > 0) ? C5831sN0.a() : null;
            if (c2103aLA == null || (strA = c2103aLA.a()) == null) {
                strA = "not reported";
            }
            String str3 = "?";
            if (c5004oN0 != null && C5831sN0.b >= 2) {
                C5831sN0.c = true;
                File file = L5.a;
                String str4 = c5004oN0.c;
                if (str4.length() != 0) {
                    str3 = str4;
                }
                L5.c("MODELS guard — stage 2 (off): the model runtime crashed again on the careful rung, thread " + ((Object) str3) + "; cores online " + strA + ". Wake word and every on-device model are off on this phone");
            } else if (c5004oN0 != null) {
                File file2 = L5.a;
                String str5 = c5004oN0.c;
                if (str5.length() != 0) {
                    str3 = str5;
                }
                L5.c("MODELS guard — stage 1 (careful): the last native crash was in the model runtime, thread " + ((Object) str3) + "; cores online " + strA);
            } else if (c5211pN0 != null && c5211pN0.c != 2 && C5831sN0.b > 0) {
                File file3 = L5.a;
                int i = C5831sN0.b;
                int i2 = C5831sN0.b;
                if (i2 != 0) {
                    str2 = i2 != 1 ? "off" : "careful";
                } else {
                    str2 = "normal";
                }
                L5.c("MODELS guard — stage " + i + " (" + str2 + "): carried over from stage " + c5211pN0.a + " of the earlier ladder; cores online " + strA);
            } else if (C5831sN0.b > 0) {
                File file4 = L5.a;
                int i3 = C5831sN0.b;
                int i4 = C5831sN0.b;
                if (i4 != 0) {
                    str = i4 != 1 ? "off" : "careful";
                } else {
                    str = "normal";
                }
                L5.c("MODELS guard — holding stage " + i3 + " (" + str + "); cores online " + strA);
            }
            C5831sN0.g();
        } catch (Throwable unused3) {
        }
        try {
            SharedPreferences sharedPreferences3 = getApplicationContext().getSharedPreferences("maya_safe_start", 0);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j2 = sharedPreferences3.getLong("until", 0L);
            int i5 = sharedPreferences3.getInt("version", 0);
            if (j2 <= jCurrentTimeMillis2 || i5 != 237) {
                C2723dL c2723dLB = Zi2.b(U72.b(this), jCurrentTimeMillis2, sharedPreferences3.getLong("ignore_before", 0L));
                if (c2723dLB.a) {
                    U72.O = true;
                    U72.P = true;
                    sharedPreferences3.edit().putLong("until", jCurrentTimeMillis2 + 43200000).putInt("version", 237).apply();
                    File file5 = L5.a;
                    long j3 = 1000;
                    L5.c("SAFE start — 3 native crashes in " + (c2723dLB.b / j3) + "s, the last " + (c2723dLB.c / j3) + "s ago: wake word, 3D character and wallpaper player off for 12h");
                }
            } else {
                U72.O = true;
                L5.c("SAFE start — light mode still held (wake word, 3D character and wallpaper player off)");
            }
        } catch (Throwable unused4) {
        }
        int[] iArr = C5493qj0.a;
        String strD = C5493qj0.d(this);
        if (strD != null && !strD.equalsIgnoreCase((String) C5493qj0.b.getValue())) {
            C5493qj0.c = true;
        }
        C5493qj0.b(this);
        try {
            C6541vn1 c6541vn1D = C6541vn1.f.d(this);
            String str6 = "";
            if (c6541vn1D.w() && (string2 = c6541vn1D.o().getString("prompt_bundle_json", null)) != null) {
                str6 = string2;
            }
            if (str6.length() > 0) {
                W12.a(str6);
            }
        } catch (Throwable unused5) {
        }
        try {
            String str7 = AbstractC7378zq1.a;
            C6541vn1 c6541vn1D2 = C6541vn1.f.d(this);
            String str8 = "";
            if (c6541vn1D2.w() && (string = c6541vn1D2.o().getString("skill_bundle_json", null)) != null) {
                str8 = string;
            }
            AbstractC7378zq1.a(str8);
        } catch (Throwable unused6) {
        }
        try {
            Set set = P40.a;
            try {
                c1572Ud2 = getApplicationContext().getSharedPreferences("maya_free_tools", 0).getString("names", null);
            } catch (Throwable th) {
                c1572Ud2 = new C1572Ud1(th);
            }
            if (c1572Ud2 instanceof C1572Ud1) {
                c1572Ud2 = null;
            }
            String str9 = (String) c1572Ud2;
            if (str9 != null) {
                P40.b = P40.a(AbstractC1323Qy1.X(str9, new char[]{','}, 0, 6));
            }
        } catch (Throwable unused7) {
        }
        C1541Tt0 c1541Tt0 = AbstractC1619Ut0.a;
        try {
            c1572Ud1 = getApplicationContext().getSharedPreferences("maya_live_remote", 0).getString("config", null);
        } catch (Throwable th2) {
            c1572Ud1 = new C1572Ud1(th2);
        }
        if (c1572Ud1 instanceof C1572Ud1) {
            c1572Ud1 = null;
        }
        String str10 = (String) c1572Ud1;
        if (str10 != null) {
            try {
                AbstractC1619Ut0.a = AbstractC1619Ut0.c(new JSONObject(str10));
            } catch (Throwable unused8) {
            }
        }
        C3479h01 c3479h01B = AbstractC1619Ut0.b(this);
        long jLongValue = ((Number) c3479h01B.N).longValue();
        long jLongValue2 = ((Number) c3479h01B.O).longValue();
        C1307Qt0 c1307Qt0 = C1307Qt0.j;
        synchronized (c1307Qt0) {
            c1307Qt0.b = jLongValue;
            c1307Qt0.c = jLongValue2;
        }
        try {
            HK1.c(this);
        } catch (Throwable unused9) {
        }
        SM sm = AbstractC6250uP.b;
        Wd2.d(Xi2.a(sm), null, 0, new IA0(this, null), 3);
        Wd2.d(Xi2.a(sm), null, 0, new JA0(this, null), 3);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        try {
            C2259b51 c2259b51 = C2259b51.a;
            C2259b51.f("low-memory");
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i == 10 || i == 15 || i >= 40) {
            try {
                C2259b51 c2259b51 = C2259b51.a;
                C2259b51.f("level=" + i);
            } catch (Throwable unused) {
            }
        }
        if (i < 15) {
            return;
        }
        try {
            File file = L5.a;
            L5.c("MEM trim level=" + i + " — avatar GL released");
        } catch (Throwable unused2) {
        }
    }
}
