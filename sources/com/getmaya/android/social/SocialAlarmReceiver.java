package com.getmaya.android.social;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.getmaya.android.MainActivity;
import com.getmaya.android.R;
import com.getmaya.android.ui.UnlockActivity;
import defpackage.AbstractC0706Ja1;
import defpackage.AbstractC1311Qu1;
import defpackage.AbstractC1323Qy1;
import defpackage.AbstractC1542Tt1;
import defpackage.AbstractC1947Yy1;
import defpackage.AbstractC2163ad2;
import defpackage.AbstractC2862e11;
import defpackage.AbstractC3616hf0;
import defpackage.AbstractC5483qg2;
import defpackage.AbstractC6250uP;
import defpackage.AbstractC6403v72;
import defpackage.AbstractC7119yc;
import defpackage.C0142Bu1;
import defpackage.C0454Fu1;
import defpackage.C0939Ma1;
import defpackage.C1155Ou1;
import defpackage.C1572Ud1;
import defpackage.C1620Ut1;
import defpackage.C1698Vt1;
import defpackage.C1776Wt1;
import defpackage.C2220au1;
import defpackage.C2223av1;
import defpackage.C2427bu1;
import defpackage.C2633cu1;
import defpackage.C2763dY0;
import defpackage.C2839du1;
import defpackage.C2855e;
import defpackage.C3409gf0;
import defpackage.C4442lf0;
import defpackage.C4653mg0;
import defpackage.C5067og0;
import defpackage.C6355uu1;
import defpackage.C6541vn1;
import defpackage.C6550vq1;
import defpackage.C6562vu1;
import defpackage.C6991xz1;
import defpackage.C7183yu1;
import defpackage.C7390zu1;
import defpackage.EnumC1464St1;
import defpackage.EnumC3907j41;
import defpackage.Fb2;
import defpackage.Fh2;
import defpackage.GL1;
import defpackage.H51;
import defpackage.Jb2;
import defpackage.L5;
import defpackage.NC;
import defpackage.OK;
import defpackage.RS0;
import defpackage.Re2;
import defpackage.Si2;
import defpackage.Wd2;
import defpackage.XJ;
import defpackage.Xi2;
import defpackage.Y01;
import defpackage.ZJ;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/getmaya/android/social/SocialAlarmReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "St1", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SocialAlarmReceiver extends BroadcastReceiver {
    public static final XJ a = Xi2.a(Si2.b(AbstractC2163ad2.b(), AbstractC6250uP.b));

    /* JADX WARN: Code duplicated, block: B:46:0x0161  */
    /* JADX WARN: Code duplicated, block: B:47:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public static final Object a(SocialAlarmReceiver socialAlarmReceiver, Context context, C7390zu1 c7390zu1, Uri uri, int i, String str, String str2, String str3, int i2, ZJ zj) throws Throwable {
        C1698Vt1 c1698Vt1;
        Object c1572Ud1;
        Uri uri2;
        C0454Fu1 c0454Fu1;
        int i3;
        Object obj;
        SocialAlarmReceiver socialAlarmReceiver2;
        Context context2;
        String str4;
        String str5;
        Context context3;
        SocialAlarmReceiver socialAlarmReceiver3;
        AbstractC1311Qu1 abstractC1311Qu1;
        String str6 = str2;
        socialAlarmReceiver.getClass();
        if (zj instanceof C1698Vt1) {
            c1698Vt1 = (C1698Vt1) zj;
            int i4 = c1698Vt1.a0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1698Vt1.a0 = i4 - Integer.MIN_VALUE;
            } else {
                c1698Vt1 = new C1698Vt1(socialAlarmReceiver, zj);
            }
        } else {
            c1698Vt1 = new C1698Vt1(socialAlarmReceiver, zj);
        }
        Object objE = c1698Vt1.Y;
        OK ok = OK.N;
        int i5 = c1698Vt1.a0;
        GL1 gl1 = GL1.a;
        if (i5 != 0) {
            if (i5 == 1) {
                i3 = c1698Vt1.X;
                c0454Fu1 = c1698Vt1.W;
                str4 = c1698Vt1.V;
                str6 = (String) c1698Vt1.U;
                str5 = c1698Vt1.T;
                Uri uri3 = (Uri) c1698Vt1.S;
                context2 = c1698Vt1.R;
                socialAlarmReceiver2 = c1698Vt1.Q;
                AbstractC6403v72.e(objE);
                uri2 = uri3;
                obj = objE;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c1698Vt1.X;
                c0454Fu1 = (C0454Fu1) c1698Vt1.U;
                str4 = c1698Vt1.T;
                str6 = (String) c1698Vt1.S;
                context3 = c1698Vt1.R;
                socialAlarmReceiver3 = c1698Vt1.Q;
                AbstractC6403v72.e(objE);
            }
            abstractC1311Qu1 = (AbstractC1311Qu1) objE;
            File file = L5.a;
            AbstractC7119yc.p("SOCIAL auto-post ", c0454Fu1.a(), " -> ", AbstractC0706Ja1.a(abstractC1311Qu1.getClass()).b());
            if (abstractC1311Qu1 instanceof C1155Ou1) {
                String strD = Fh2.d(context3, R.string.system_social_posted, c0454Fu1.a());
                socialAlarmReceiver3.getClass();
                f(i3, context3, strD, str4);
            } else {
                String strD2 = Fh2.d(context3, R.string.system_social_not_posted, str4);
                socialAlarmReceiver3.getClass();
                f(i3, context3, str6, strD2);
            }
            return gl1;
        }
        AbstractC6403v72.e(objE);
        if (c7390zu1.a.getBoolean("daily_auto", false)) {
            try {
                String string = c7390zu1.a.getString("default_platform", "INSTAGRAM");
                if (string == null) {
                    string = "";
                }
                c1572Ud1 = EnumC3907j41.valueOf(string);
            } catch (Throwable th) {
                c1572Ud1 = new C1572Ud1(th);
            }
            Object obj2 = EnumC3907j41.Q;
            if (c1572Ud1 instanceof C1572Ud1) {
                c1572Ud1 = obj2;
            }
            List list = C0454Fu1.j;
            C0454Fu1 c0454Fu1D = Jb2.d((EnumC3907j41) c1572Ud1, i);
            c1698Vt1.Q = socialAlarmReceiver;
            c1698Vt1.R = context;
            uri2 = uri;
            c1698Vt1.S = uri2;
            c1698Vt1.T = str;
            c1698Vt1.U = str6;
            c1698Vt1.V = str3;
            c1698Vt1.W = c0454Fu1D;
            c1698Vt1.X = i2;
            c1698Vt1.a0 = 1;
            Enum enumD = socialAlarmReceiver.d(context, c1698Vt1);
            if (enumD == ok) {
                return ok;
            }
            c0454Fu1 = c0454Fu1D;
            i3 = i2;
            obj = enumD;
            socialAlarmReceiver2 = socialAlarmReceiver;
            context2 = context;
            str4 = str3;
            str5 = str;
        } else {
            f(i2, context, str6, str3);
        }
        return gl1;
        EnumC1464St1 enumC1464St1 = (EnumC1464St1) obj;
        if ((enumC1464St1 == null ? -1 : AbstractC1542Tt1.a[enumC1464St1.ordinal()]) != -1) {
            File file2 = L5.a;
            AbstractC2862e11.j("SOCIAL auto-post blocked: ", enumC1464St1.N);
            String strD3 = Fh2.d(context2, R.string.system_social_post_it_yourself, str4, Fh2.d(context2, enumC1464St1.O, new Object[0]));
            socialAlarmReceiver2.getClass();
            f(i3, context2, str6, strD3);
        } else {
            C2223av1 c2223av1 = new C2223av1(context2);
            c1698Vt1.Q = socialAlarmReceiver2;
            c1698Vt1.R = context2;
            c1698Vt1.S = str6;
            c1698Vt1.T = str4;
            c1698Vt1.U = c0454Fu1;
            c1698Vt1.V = null;
            c1698Vt1.W = null;
            c1698Vt1.X = i3;
            c1698Vt1.a0 = 2;
            objE = C2223av1.e(c2223av1, uri2, c0454Fu1, str5, c1698Vt1, 8);
            if (objE == ok) {
                return ok;
            }
            context3 = context2;
            socialAlarmReceiver3 = socialAlarmReceiver2;
            abstractC1311Qu1 = (AbstractC1311Qu1) objE;
            File file3 = L5.a;
            AbstractC7119yc.p("SOCIAL auto-post ", c0454Fu1.a(), " -> ", AbstractC0706Ja1.a(abstractC1311Qu1.getClass()).b());
            if (abstractC1311Qu1 instanceof C1155Ou1) {
                String strD4 = Fh2.d(context3, R.string.system_social_posted, c0454Fu1.a());
                socialAlarmReceiver3.getClass();
                f(i3, context3, strD4, str4);
            } else {
                String strD5 = Fh2.d(context3, R.string.system_social_not_posted, str4);
                socialAlarmReceiver3.getClass();
                f(i3, context3, str6, strD5);
            }
        }
        return gl1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0130  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0160  */
    /* JADX WARN: Code duplicated, block: B:53:0x0176  */
    /* JADX WARN: Code duplicated, block: B:56:0x0180  */
    /* JADX WARN: Code duplicated, block: B:57:0x019f  */
    /* JADX WARN: Code duplicated, block: B:60:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00c6, please report this as an issue */
    public static final Object b(SocialAlarmReceiver socialAlarmReceiver, Context context, C7390zu1 c7390zu1, C7183yu1 c7183yu1, ZJ zj) throws Throwable {
        C2633cu1 c2633cu1;
        C7390zu1 c7390zu2;
        Uri uri;
        String str;
        EnumC3907j41 enumC3907j41;
        String lowerCase;
        int i;
        C0454Fu1 c0454Fu1D;
        String strD;
        Object objD;
        SocialAlarmReceiver socialAlarmReceiver2;
        Context context2;
        C0454Fu1 c0454Fu1;
        String str2;
        Uri uri2;
        EnumC1464St1 enumC1464St1;
        Context context3;
        SocialAlarmReceiver socialAlarmReceiver3;
        AbstractC1311Qu1 abstractC1311Qu1;
        SocialAlarmReceiver socialAlarmReceiver4 = socialAlarmReceiver;
        Context context4 = context;
        C7183yu1 c7183yu2 = c7183yu1;
        socialAlarmReceiver.getClass();
        if (zj instanceof C2633cu1) {
            c2633cu1 = (C2633cu1) zj;
            int i2 = c2633cu1.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2633cu1.Y = i2 - Integer.MIN_VALUE;
            } else {
                c2633cu1 = new C2633cu1(socialAlarmReceiver4, zj);
            }
        } else {
            c2633cu1 = new C2633cu1(socialAlarmReceiver4, zj);
        }
        C2633cu1 c2633cu2 = c2633cu1;
        Object objE = c2633cu2.W;
        Object obj = OK.N;
        int i3 = c2633cu2.Y;
        GL1 gl1 = GL1.a;
        if (i3 != 0) {
            if (i3 == 1) {
                C7183yu1 c7183yu3 = (C7183yu1) c2633cu2.T;
                C7390zu1 c7390zu3 = (C7390zu1) c2633cu2.S;
                Context context5 = c2633cu2.R;
                SocialAlarmReceiver socialAlarmReceiver5 = c2633cu2.Q;
                AbstractC6403v72.e(objE);
                c7183yu2 = c7183yu3;
                socialAlarmReceiver4 = socialAlarmReceiver5;
                c7390zu2 = c7390zu3;
                context4 = context5;
            } else {
                if (i3 == 2) {
                    str2 = c2633cu2.V;
                    c0454Fu1 = (C0454Fu1) c2633cu2.U;
                    Uri uri3 = (Uri) c2633cu2.T;
                    C7183yu1 c7183yu4 = (C7183yu1) c2633cu2.S;
                    Context context6 = c2633cu2.R;
                    SocialAlarmReceiver socialAlarmReceiver6 = c2633cu2.Q;
                    AbstractC6403v72.e(objE);
                    context2 = context6;
                    socialAlarmReceiver2 = socialAlarmReceiver6;
                    uri2 = uri3;
                    c7183yu2 = c7183yu4;
                    enumC1464St1 = (EnumC1464St1) objE;
                    if (enumC1464St1 != null) {
                        String strD2 = Fh2.d(context2, R.string.system_social_scheduled_blocked, c0454Fu1.a(), Fh2.d(context2, enumC1464St1.O, new Object[0]));
                        socialAlarmReceiver2.getClass();
                        f(90202, context2, str2, strD2);
                    } else {
                        C2223av1 c2223av1 = new C2223av1(context2);
                        String str3 = c7183yu2.g;
                        c2633cu2.Q = socialAlarmReceiver2;
                        c2633cu2.R = context2;
                        c2633cu2.S = c7183yu2;
                        c2633cu2.T = c0454Fu1;
                        c2633cu2.U = str2;
                        c2633cu2.V = null;
                        c2633cu2.Y = 3;
                        objE = C2223av1.e(c2223av1, uri2, c0454Fu1, str3, c2633cu2, 8);
                        if (objE == obj) {
                            return obj;
                        }
                        context3 = context2;
                        socialAlarmReceiver3 = socialAlarmReceiver2;
                    }
                    return gl1;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) c2633cu2.U;
                c0454Fu1 = (C0454Fu1) c2633cu2.T;
                c7183yu2 = (C7183yu1) c2633cu2.S;
                context3 = c2633cu2.R;
                socialAlarmReceiver3 = c2633cu2.Q;
                AbstractC6403v72.e(objE);
            }
            abstractC1311Qu1 = (AbstractC1311Qu1) objE;
            File file = L5.a;
            AbstractC7119yc.p("SOCIAL scheduled ", c0454Fu1.a(), " -> ", AbstractC0706Ja1.a(abstractC1311Qu1.getClass()).b());
            if (abstractC1311Qu1 instanceof C1155Ou1) {
                String strD3 = Fh2.d(context3, R.string.system_social_posted, c0454Fu1.a());
                String strJ0 = AbstractC1323Qy1.j0(80, c7183yu2.g);
                socialAlarmReceiver3.getClass();
                f(90202, context3, strD3, strJ0);
            } else {
                String strD4 = Fh2.d(context3, R.string.system_social_not_posted, c0454Fu1.a());
                socialAlarmReceiver3.getClass();
                f(90202, context3, str2, strD4);
            }
            return gl1;
        }
        AbstractC6403v72.e(objE);
        if (!AbstractC1947Yy1.n(c7183yu2.e)) {
            uri = Uri.parse(c7183yu2.e);
            c7390zu2 = c7390zu1;
        } else {
            String str4 = c7183yu2.f;
            if (!AbstractC1947Yy1.n(str4)) {
                c2633cu2.Q = socialAlarmReceiver4;
                c2633cu2.R = context4;
                c7390zu2 = c7390zu1;
                c2633cu2.S = c7390zu2;
                c2633cu2.T = c7183yu2;
                c2633cu2.Y = 1;
                objE = socialAlarmReceiver4.e(c2633cu2, context4, str4);
                if (objE == obj) {
                    return obj;
                }
            } else {
                c7390zu2 = c7390zu1;
                uri = null;
            }
        }
        if (uri == null) {
            File file2 = L5.a;
            L5.c("SOCIAL queued post " + c7183yu2.a + ": no image");
        } else {
            C5067og0 c5067og0 = C5067og0.a;
            String string = uri.toString();
            str = c7183yu2.f;
            if (AbstractC1947Yy1.n(str)) {
                str = "scheduled post";
            }
            c5067og0.b(string, str, C4653mg0.b);
            EnumC3907j41.P.getClass();
            enumC3907j41 = (EnumC3907j41) NC.H(C2763dY0.k(c7183yu2.c));
            if (enumC3907j41 == null) {
                enumC3907j41 = EnumC3907j41.Q;
            }
            lowerCase = c7183yu2.d.toLowerCase(Locale.ROOT);
            if (!AbstractC1323Qy1.u(lowerCase, "story", false) || AbstractC1323Qy1.u(lowerCase, "stories", false) || AbstractC1323Qy1.u(lowerCase, "status", false)) {
                i = 1;
            } else {
                i = 2;
            }
            List list = C0454Fu1.j;
            c0454Fu1D = Jb2.d(enumC3907j41, i);
            strD = Fh2.d(context4, R.string.system_social_scheduled_ready, new Object[0]);
            if (c7390zu2.a.getBoolean("daily_auto", false)) {
                c2633cu2.Q = socialAlarmReceiver4;
                c2633cu2.R = context4;
                c2633cu2.S = c7183yu2;
                c2633cu2.T = uri;
                c2633cu2.U = c0454Fu1D;
                c2633cu2.V = strD;
                c2633cu2.Y = 2;
                objD = socialAlarmReceiver4.d(context4, c2633cu2);
                if (objD == obj) {
                    return obj;
                }
                socialAlarmReceiver2 = socialAlarmReceiver4;
                context2 = context4;
                c0454Fu1 = c0454Fu1D;
                str2 = strD;
                uri2 = uri;
                objE = objD;
                enumC1464St1 = (EnumC1464St1) objE;
                if (enumC1464St1 != null) {
                    String strD5 = Fh2.d(context2, R.string.system_social_scheduled_blocked, c0454Fu1.a(), Fh2.d(context2, enumC1464St1.O, new Object[0]));
                    socialAlarmReceiver2.getClass();
                    f(90202, context2, str2, strD5);
                } else {
                    C2223av1 c2223av2 = new C2223av1(context2);
                    String str5 = c7183yu2.g;
                    c2633cu2.Q = socialAlarmReceiver2;
                    c2633cu2.R = context2;
                    c2633cu2.S = c7183yu2;
                    c2633cu2.T = c0454Fu1;
                    c2633cu2.U = str2;
                    c2633cu2.V = null;
                    c2633cu2.Y = 3;
                    objE = C2223av1.e(c2223av2, uri2, c0454Fu1, str5, c2633cu2, 8);
                    if (objE == obj) {
                        return obj;
                    }
                    context3 = context2;
                    socialAlarmReceiver3 = socialAlarmReceiver2;
                    abstractC1311Qu1 = (AbstractC1311Qu1) objE;
                    File file3 = L5.a;
                    AbstractC7119yc.p("SOCIAL scheduled ", c0454Fu1.a(), " -> ", AbstractC0706Ja1.a(abstractC1311Qu1.getClass()).b());
                    if (abstractC1311Qu1 instanceof C1155Ou1) {
                        String strD6 = Fh2.d(context3, R.string.system_social_posted, c0454Fu1.a());
                        String strJ1 = AbstractC1323Qy1.j0(80, c7183yu2.g);
                        socialAlarmReceiver3.getClass();
                        f(90202, context3, strD6, strJ1);
                    } else {
                        String strD7 = Fh2.d(context3, R.string.system_social_not_posted, c0454Fu1.a());
                        socialAlarmReceiver3.getClass();
                        f(90202, context3, str2, strD7);
                    }
                }
            } else {
                String strD8 = Fh2.d(context4, R.string.system_social_scheduled_open, c0454Fu1D.a());
                socialAlarmReceiver4.getClass();
                f(90202, context4, strD, strD8);
            }
        }
        return gl1;
        uri = (Uri) objE;
        if (uri == null) {
            File file4 = L5.a;
            L5.c("SOCIAL queued post " + c7183yu2.a + ": no image");
        } else {
            C5067og0 c5067og1 = C5067og0.a;
            String string2 = uri.toString();
            str = c7183yu2.f;
            if (AbstractC1947Yy1.n(str)) {
                str = "scheduled post";
            }
            c5067og1.b(string2, str, C4653mg0.b);
            EnumC3907j41.P.getClass();
            enumC3907j41 = (EnumC3907j41) NC.H(C2763dY0.k(c7183yu2.c));
            if (enumC3907j41 == null) {
                enumC3907j41 = EnumC3907j41.Q;
            }
            lowerCase = c7183yu2.d.toLowerCase(Locale.ROOT);
            if (AbstractC1323Qy1.u(lowerCase, "story", false)) {
                i = 1;
            } else {
                i = 1;
            }
            List list2 = C0454Fu1.j;
            c0454Fu1D = Jb2.d(enumC3907j41, i);
            strD = Fh2.d(context4, R.string.system_social_scheduled_ready, new Object[0]);
            if (c7390zu2.a.getBoolean("daily_auto", false)) {
                String strD9 = Fh2.d(context4, R.string.system_social_scheduled_open, c0454Fu1D.a());
                socialAlarmReceiver4.getClass();
                f(90202, context4, strD, strD9);
            } else {
                c2633cu2.Q = socialAlarmReceiver4;
                c2633cu2.R = context4;
                c2633cu2.S = c7183yu2;
                c2633cu2.T = uri;
                c2633cu2.U = c0454Fu1D;
                c2633cu2.V = strD;
                c2633cu2.Y = 2;
                objD = socialAlarmReceiver4.d(context4, c2633cu2);
                if (objD == obj) {
                    return obj;
                }
                socialAlarmReceiver2 = socialAlarmReceiver4;
                context2 = context4;
                c0454Fu1 = c0454Fu1D;
                str2 = strD;
                uri2 = uri;
                objE = objD;
                enumC1464St1 = (EnumC1464St1) objE;
                if (enumC1464St1 != null) {
                    String strD10 = Fh2.d(context2, R.string.system_social_scheduled_blocked, c0454Fu1.a(), Fh2.d(context2, enumC1464St1.O, new Object[0]));
                    socialAlarmReceiver2.getClass();
                    f(90202, context2, str2, strD10);
                } else {
                    C2223av1 c2223av3 = new C2223av1(context2);
                    String str6 = c7183yu2.g;
                    c2633cu2.Q = socialAlarmReceiver2;
                    c2633cu2.R = context2;
                    c2633cu2.S = c7183yu2;
                    c2633cu2.T = c0454Fu1;
                    c2633cu2.U = str2;
                    c2633cu2.V = null;
                    c2633cu2.Y = 3;
                    objE = C2223av1.e(c2223av3, uri2, c0454Fu1, str6, c2633cu2, 8);
                    if (objE == obj) {
                        return obj;
                    }
                    context3 = context2;
                    socialAlarmReceiver3 = socialAlarmReceiver2;
                    abstractC1311Qu1 = (AbstractC1311Qu1) objE;
                    File file5 = L5.a;
                    AbstractC7119yc.p("SOCIAL scheduled ", c0454Fu1.a(), " -> ", AbstractC0706Ja1.a(abstractC1311Qu1.getClass()).b());
                    if (abstractC1311Qu1 instanceof C1155Ou1) {
                        String strD11 = Fh2.d(context3, R.string.system_social_posted, c0454Fu1.a());
                        String strJ2 = AbstractC1323Qy1.j0(80, c7183yu2.g);
                        socialAlarmReceiver3.getClass();
                        f(90202, context3, strD11, strJ2);
                    } else {
                        String strD12 = Fh2.d(context3, R.string.system_social_not_posted, c0454Fu1.a());
                        socialAlarmReceiver3.getClass();
                        f(90202, context3, str2, strD12);
                    }
                }
            }
        }
        return gl1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object c(SocialAlarmReceiver socialAlarmReceiver, Context context, C6355uu1 c6355uu1, ZJ zj) throws Throwable {
        C2839du1 c2839du1;
        socialAlarmReceiver.getClass();
        if (zj instanceof C2839du1) {
            c2839du1 = (C2839du1) zj;
            int i = c2839du1.S;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2839du1.S = i - Integer.MIN_VALUE;
            } else {
                c2839du1 = new C2839du1(socialAlarmReceiver, zj);
            }
        } else {
            c2839du1 = new C2839du1(socialAlarmReceiver, zj);
        }
        Object objP = c2839du1.Q;
        OK ok = OK.N;
        int i2 = c2839du1.S;
        if (i2 == 0) {
            AbstractC6403v72.e(objP);
            C6541vn1 c6541vn1D = C6541vn1.f.d(context);
            C6991xz1 c6991xz1 = new C6991xz1(c6541vn1D.h(), c6541vn1D.f());
            String strA = C6562vu1.a(c6355uu1);
            c2839du1.S = 1;
            objP = C6991xz1.p(c6991xz1, "You write short original motivational lines. Output ONLY the line.", strA, c2839du1);
            if (objP == ok) {
                return ok;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6403v72.e(objP);
        }
        String str = (String) objP;
        if (str == null) {
            return null;
        }
        String strJ0 = AbstractC1323Qy1.j0(140, AbstractC1323Qy1.m0(AbstractC1323Qy1.l0(str).toString(), '\"'));
        if (!AbstractC1947Yy1.n(strJ0)) {
            return strJ0;
        }
        return null;
    }

    public static void f(int i, Context context, String str, String str2) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.createNotificationChannel(new NotificationChannel("maya_social", Fh2.d(context, R.string.system_channel_social, new Object[0]), 3));
        PendingIntent activity = PendingIntent.getActivity(context, i, new Intent(context, (Class<?>) MainActivity.class).addFlags(335544320), 201326592);
        RS0 rs0 = new RS0(context, "maya_social");
        rs0.r.icon = android.R.drawable.ic_menu_gallery;
        rs0.e = RS0.c(str);
        rs0.f = RS0.c(str2);
        H51 h51 = new H51(10);
        h51.P = RS0.c(str2);
        rs0.e(h51);
        rs0.d(16);
        rs0.g = activity;
        notificationManager.notify(i, rs0.b());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum d(Context context, ZJ zj) throws Throwable {
        C1620Ut1 c1620Ut1;
        if (zj instanceof C1620Ut1) {
            c1620Ut1 = (C1620Ut1) zj;
            int i = c1620Ut1.T;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1620Ut1.T = i - Integer.MIN_VALUE;
            } else {
                c1620Ut1 = new C1620Ut1(this, zj);
            }
        } else {
            c1620Ut1 = new C1620Ut1(this, zj);
        }
        Object objA = c1620Ut1.R;
        OK ok = OK.N;
        int i2 = c1620Ut1.T;
        if (i2 != 0) {
            if (i2 == 1) {
                context = c1620Ut1.Q;
                AbstractC6403v72.e(objA);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6403v72.e(objA);
            }
            if (((Boolean) objA).booleanValue()) {
                return null;
            }
            return EnumC1464St1.R;
        }
        AbstractC6403v72.e(objA);
        C2855e c2855e = C2855e.a;
        c1620Ut1.Q = context;
        c1620Ut1.T = 1;
        objA = C2855e.a.a(2500L, c1620Ut1);
        if (objA == ok) {
            return ok;
        }
        if (objA == null) {
            return EnumC1464St1.P;
        }
        if (AbstractC5483qg2.a(context)) {
            return null;
        }
        if (AbstractC5483qg2.d(context) && !Y01.a.b(context)) {
            return EnumC1464St1.Q;
        }
        C2763dY0 c2763dY0 = UnlockActivity.O;
        c1620Ut1.Q = null;
        c1620Ut1.T = 2;
        objA = UnlockActivity.O.l(context, true, null, c1620Ut1);
        if (objA == ok) {
            return ok;
        }
        if (((Boolean) objA).booleanValue()) {
            return null;
        }
        return EnumC1464St1.R;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable e(ZJ zj, Context context, String str) throws Throwable {
        C1776Wt1 c1776Wt1;
        String strW;
        if (zj instanceof C1776Wt1) {
            c1776Wt1 = (C1776Wt1) zj;
            int i = c1776Wt1.U;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1776Wt1.U = i - Integer.MIN_VALUE;
            } else {
                c1776Wt1 = new C1776Wt1(this, zj);
            }
        } else {
            c1776Wt1 = new C1776Wt1(this, zj);
        }
        Object objI = c1776Wt1.S;
        OK ok = OK.N;
        int i2 = c1776Wt1.U;
        if (i2 == 0) {
            AbstractC6403v72.e(objI);
            C6541vn1 c6541vn1D = C6541vn1.f.d(context);
            C4442lf0 c4442lf0 = new C4442lf0(context, c6541vn1D.e(), c6541vn1D.h());
            C6550vq1 c6550vq1 = C4653mg0.b;
            c1776Wt1.Q = context;
            c1776Wt1.R = str;
            c1776Wt1.U = 1;
            objI = C4442lf0.i(c4442lf0, str, c6550vq1, c1776Wt1);
            if (objI == ok) {
                return ok;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c1776Wt1.R;
            context = c1776Wt1.Q;
            AbstractC6403v72.e(objI);
        }
        AbstractC3616hf0 abstractC3616hf0 = (AbstractC3616hf0) objI;
        if ((abstractC3616hf0 instanceof C3409gf0) && (strW = Re2.w(context, str, ((C3409gf0) abstractC3616hf0).a, null)) != null && AbstractC1947Yy1.r(strW, "content://", false)) {
            return Uri.parse(strW);
        }
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws JSONException {
        Context applicationContext = context.getApplicationContext();
        C7390zu1 c7390zu1K = C7390zu1.b.k(applicationContext);
        Fb2.b(applicationContext);
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            XJ xj = a;
            if (iHashCode != -1761462317) {
                if (iHashCode == -348674314 && action.equals("com.getmaya.android.social.DAILY_STORY")) {
                    SharedPreferences sharedPreferences = c7390zu1K.a;
                    if (sharedPreferences.getBoolean("daily_on", false)) {
                        int iA = C0142Bu1.a();
                        if (sharedPreferences.getInt("daily_last_day", -1) == iA) {
                            L5.c("SOCIAL daily already done today");
                            return;
                        } else {
                            sharedPreferences.edit().putInt("daily_last_day", iA).apply();
                            Wd2.d(xj, null, 0, new C2220au1(this, applicationContext, c7390zu1K, iA, null), 3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (action.equals("com.getmaya.android.social.QUEUED_POST")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                List listB = c7390zu1K.b();
                ArrayList<C7183yu1> arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((C7183yu1) obj).b <= jCurrentTimeMillis) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                for (C7183yu1 c7183yu1 : arrayList) {
                    c7390zu1K.c(c7183yu1.a);
                    C0939Ma1 c0939Ma1 = C0142Bu1.a;
                    if (jCurrentTimeMillis - c7183yu1.b > 10800000) {
                        File file = L5.a;
                        L5.c("SOCIAL queued post " + c7183yu1.a + " dropped as stale");
                    } else {
                        Wd2.d(xj, null, 0, new C2427bu1(this, applicationContext, c7390zu1K, c7183yu1, null), 3);
                    }
                }
                Fb2.b(applicationContext);
            }
        }
    }
}
