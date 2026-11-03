package com.getmaya.android.automation;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import defpackage.AbstractC1323Qy1;
import defpackage.AbstractC1947Yy1;
import defpackage.AbstractC4204kW1;
import defpackage.AbstractC4238kg;
import defpackage.AbstractC5669rb2;
import defpackage.AbstractC6002tB0;
import defpackage.AbstractC6500vc1;
import defpackage.AbstractC7363zl1;
import defpackage.C0257Dh;
import defpackage.C0641If;
import defpackage.C0647Ih;
import defpackage.C0939Ma1;
import defpackage.C1572Ud1;
import defpackage.C2379bg;
import defpackage.C2577ce;
import defpackage.C3479h01;
import defpackage.C3508h72;
import defpackage.C3997jW1;
import defpackage.C4138kA1;
import defpackage.C4841nb1;
import defpackage.C5064of1;
import defpackage.C5249pa;
import defpackage.C6293uc1;
import defpackage.C6434vH0;
import defpackage.NC;
import defpackage.OC;
import defpackage.T40;
import defpackage.TC;
import defpackage.Wd2;
import defpackage.Z40;
import defpackage.ZX;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/getmaya/android/automation/MayaNotificationListener;", "Landroid/service/notification/NotificationListenerService;", "<init>", "()V", "h72", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MayaNotificationListener extends NotificationListenerService {
    public static volatile T40 N;
    public static volatile Z40 O;
    public static volatile T40 P;
    public static volatile C3479h01 R;
    public static volatile MayaNotificationListener Y;
    public static volatile boolean Z;
    public static volatile long a0;
    public static final Set Q = AbstractC7363zl1.h("com.whatsapp", "com.whatsapp.w4b", "org.telegram.messenger", "com.google.android.apps.messaging", "com.android.mms", "com.google.android.dialer", "com.android.dialer", "com.samsung.android.dialer", "com.instagram.android", "org.thoughtcrime.securesms");
    public static final List S = OC.i("incoming call", "ongoing call", "call in progress", "calling", "missed call", "dialing", "unknown", "private number", "no caller id", "tap to return to call", "voice call", "video call");
    public static final C2379bg T = new C2379bg();
    public static final C2379bg U = new C2379bg();
    public static final C2379bg V = new C2379bg();
    public static final LinkedHashMap W = new LinkedHashMap();
    public static final LinkedHashMap X = new LinkedHashMap();
    public static final Set b0 = AbstractC7363zl1.h("new message", "new messages", "message", "messages", "checking for new messages", "you may have new messages", "sending message", "waiting for messages", "waiting for message", "naya message", "naye message");

    public final C2577ce a(StatusBarNotification statusBarNotification, String str, String str2, String str3) {
        Object c1572Ud1;
        Notification notification = statusBarNotification.getNotification();
        try {
            NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
            c1572Ud1 = Boolean.valueOf(getCurrentRanking().getRanking(statusBarNotification.getKey(), ranking) && ranking.getImportance() < 3);
        } catch (Throwable th) {
            c1572Ud1 = new C1572Ud1(th);
        }
        Object obj = Boolean.FALSE;
        if (c1572Ud1 instanceof C1572Ud1) {
            c1572Ud1 = obj;
        }
        return new C2577ce(statusBarNotification.getPackageName(), str, str2, str3, statusBarNotification.getPostTime(), statusBarNotification.isOngoing(), (notification.flags & 512) != 0, ((Boolean) c1572Ud1).booleanValue(), notification.category);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x022e  */
    /* JADX WARN: Code duplicated, block: B:233:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:252:0x041e  */
    /* JADX WARN: Code duplicated, block: B:256:0x0424  */
    /* JADX WARN: Code duplicated, block: B:262:0x0434  */
    /* JADX WARN: Code duplicated, block: B:305:0x04b7 A[Catch: all -> 0x048f, TryCatch #7 {all -> 0x048f, blocks: (B:280:0x0468, B:281:0x0470, B:283:0x0476, B:285:0x0485, B:295:0x049a, B:305:0x04b7, B:307:0x04bb, B:309:0x04c2, B:300:0x04a4), top: B:389:0x0468 }] */
    /* JADX WARN: Code duplicated, block: B:307:0x04bb A[Catch: all -> 0x048f, TryCatch #7 {all -> 0x048f, blocks: (B:280:0x0468, B:281:0x0470, B:283:0x0476, B:285:0x0485, B:295:0x049a, B:305:0x04b7, B:307:0x04bb, B:309:0x04c2, B:300:0x04a4), top: B:389:0x0468 }] */
    /* JADX WARN: Code duplicated, block: B:309:0x04c2 A[Catch: all -> 0x048f, TRY_LEAVE, TryCatch #7 {all -> 0x048f, blocks: (B:280:0x0468, B:281:0x0470, B:283:0x0476, B:285:0x0485, B:295:0x049a, B:305:0x04b7, B:307:0x04bb, B:309:0x04c2, B:300:0x04a4), top: B:389:0x0468 }] */
    /* JADX WARN: Code duplicated, block: B:315:0x04dc A[Catch: all -> 0x04e0, LOOP:7: B:313:0x04d6->B:315:0x04dc, LOOP_END, TryCatch #0 {all -> 0x04e0, blocks: (B:312:0x04ce, B:313:0x04d6, B:315:0x04dc, B:319:0x04e5, B:324:0x04ef), top: B:376:0x04b5 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x04e5 A[Catch: all -> 0x04e0, TryCatch #0 {all -> 0x04e0, blocks: (B:312:0x04ce, B:313:0x04d6, B:315:0x04dc, B:319:0x04e5, B:324:0x04ef), top: B:376:0x04b5 }] */
    /* JADX WARN: Code duplicated, block: B:321:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:323:0x04ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:327:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:330:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:332:0x0502  */
    /* JADX WARN: Code duplicated, block: B:337:0x0513 A[EDGE_INSN: B:337:0x0513->B:349:0x0539 BREAK  A[LOOP:8: B:344:0x0526->B:425:?]] */
    /* JADX WARN: Code duplicated, block: B:350:0x053b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:422:0x04e3 A[EDGE_INSN: B:422:0x04e3->B:318:0x04e3 BREAK  A[LOOP:7: B:313:0x04d6->B:315:0x04dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    public final void b(StatusBarNotification statusBarNotification, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        Object c1572Ud1;
        Object obj;
        Object objPrevious;
        Bundle bundle;
        boolean z4;
        Bundle bundle2;
        Bundle bundle3;
        C2379bg c2379bg;
        boolean z5;
        String string;
        C3997jW1 c3997jW1;
        long postTime;
        C2379bg c2379bg2;
        Bundle bundle4;
        C3997jW1 c3997jW2;
        boolean z6;
        String string2;
        CharSequence name;
        Notification.Action action;
        String string3;
        C6293uc1 c6293uc1;
        boolean z7;
        boolean z8;
        boolean z9;
        Object next;
        String str;
        Bundle bundle5 = statusBarNotification.getNotification().extras;
        CharSequence charSequence = bundle5.getCharSequence("android.title");
        String string4 = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence2 = bundle5.getCharSequence("android.text");
        String string5 = charSequence2 != null ? charSequence2.toString() : null;
        if (AbstractC5669rb2.d(statusBarNotification.getNotification().category, "call")) {
            Iterator it = OC.i(string4, string5).iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str2 = (String) next;
                if (str2 != null && !AbstractC1947Yy1.n(str2)) {
                    String lowerCase = AbstractC1323Qy1.l0(str2).toString().toLowerCase(Locale.ROOT);
                    if (lowerCase.length() != 0) {
                        List list = S;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    break loop0;
                                }
                                str = (String) it2.next();
                                if (lowerCase.equals(str)) {
                                    break;
                                }
                            } while (!AbstractC1323Qy1.u(lowerCase, str, false));
                        } else {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            String str3 = (String) next;
            if (str3 != null) {
                R = new C3479h01(AbstractC1323Qy1.l0(str3).toString(), Long.valueOf(statusBarNotification.getPostTime()));
            }
        }
        if (string4 != null && !AbstractC1947Yy1.n(string4) && string5 != null && !AbstractC1947Yy1.n(string5) && !statusBarNotification.isOngoing()) {
            String packageName = statusBarNotification.getPackageName();
            try {
                PackageManager packageManager = getPackageManager();
                packageName = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString();
            } catch (Exception unused) {
            }
            String str4 = packageName;
            C2379bg c2379bg3 = U;
            synchronized (c2379bg3) {
                try {
                    if (!c2379bg3.isEmpty()) {
                        Iterator it3 = c2379bg3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                C0641If c0641If = (C0641If) it3.next();
                                if (AbstractC5669rb2.d(c0641If.b, string4) && AbstractC5669rb2.d(c0641If.c, string5)) {
                                    z9 = false;
                                }
                            }
                        }
                    }
                    U.h(new C0641If(statusBarNotification.getPostTime(), str4, string4, string5));
                    while (true) {
                        C2379bg c2379bg4 = U;
                        if (c2379bg4.P <= 60) {
                            break;
                        } else {
                            c2379bg4.o();
                        }
                    }
                    z9 = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z9 && z) {
                Z40 z40 = O;
                if (z40 != null) {
                    try {
                        z40.q(statusBarNotification.getPackageName(), str4, string4, string5);
                    } catch (Throwable unused2) {
                    }
                }
                T40 t40 = P;
                if (t40 != null) {
                    try {
                        t40.l(a(statusBarNotification, str4, string4, string5));
                    } catch (Throwable unused3) {
                    }
                }
            }
            if (z9 && Q.contains(statusBarNotification.getPackageName())) {
                try {
                    C4841nb1.S.i(getApplicationContext()).k(str4, string4, string5);
                } catch (Exception unused4) {
                }
            }
        }
        if ((!AbstractC5669rb2.d(statusBarNotification.getPackageName(), "com.whatsapp") && !AbstractC5669rb2.d(statusBarNotification.getPackageName(), "com.whatsapp.w4b")) || string4 == null || AbstractC1947Yy1.n(string4) || string5 == null || AbstractC1947Yy1.n(string5) || string4.equalsIgnoreCase("WhatsApp") || string4.equalsIgnoreCase("WhatsApp Business")) {
            return;
        }
        String lowerCase2 = AbstractC1323Qy1.o0(AbstractC1323Qy1.l0(string5).toString(), '.', 8230).toLowerCase(Locale.ROOT);
        if ((lowerCase2.length() == 0 || b0.contains(lowerCase2)) ? true : Pattern.compile("^\\d+\\s+(new\\s+)?messages?\\b").matcher(lowerCase2).find()) {
            a0 = Math.max(a0, statusBarNotification.getPostTime());
            return;
        }
        boolean zD = AbstractC5669rb2.d(statusBarNotification.getPackageName(), "com.whatsapp.w4b");
        Notification.Action[] actionArr = statusBarNotification.getNotification().actions;
        if (actionArr != null) {
            int length = actionArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    action = null;
                    break;
                }
                action = actionArr[i];
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null) {
                    int length2 = remoteInputs.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            z8 = false;
                            break;
                        } else {
                            if (remoteInputs[i2].getAllowFreeFormInput()) {
                                z8 = true;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (z8) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                if (z7) {
                    break;
                } else {
                    i++;
                }
            }
            if (action != null) {
                C0939Ma1 c0939Ma1 = AbstractC6500vc1.a;
                CharSequence charSequence3 = bundle5.getCharSequence("android.conversationTitle");
                String string6 = charSequence3 != null ? charSequence3.toString() : null;
                boolean z10 = bundle5.getBoolean("android.isGroupConversation", false);
                long postTime2 = statusBarNotification.getPostTime();
                String string7 = AbstractC1323Qy1.l0(string4).toString();
                C0939Ma1 c0939Ma2 = AbstractC6500vc1.a;
                String string8 = AbstractC1323Qy1.l0(c0939Ma2.g(string7, "")).toString();
                if (string6 == null || (string3 = AbstractC1323Qy1.l0(c0939Ma2.g(AbstractC1323Qy1.l0(string6).toString(), "")).toString()) == null || string3.length() <= 0) {
                    string3 = null;
                }
                if (AbstractC1323Qy1.u(string7, " @ ", false)) {
                    if (string3 == null) {
                        string3 = AbstractC1323Qy1.l0(c0939Ma2.g(AbstractC1323Qy1.l0(AbstractC1323Qy1.e0(string7, " @ ")).toString(), "")).toString();
                    }
                    c6293uc1 = new C6293uc1(string7, string3, true, postTime2);
                } else if (string3 == null || (!z10 && AbstractC6500vc1.a(string3).equals(AbstractC6500vc1.a(string8)))) {
                    c6293uc1 = (z10 || AbstractC1323Qy1.u(string7, ": ", false)) ? new C6293uc1(string7, string7, true, postTime2) : new C6293uc1(string7, string8, false, postTime2);
                } else {
                    c6293uc1 = new C6293uc1(string7, string3, true, postTime2);
                }
                LinkedHashMap linkedHashMap = X;
                synchronized (linkedHashMap) {
                    linkedHashMap.put(AbstractC1323Qy1.l0(string4).toString(), new C6434vH0(action, c6293uc1));
                    while (true) {
                        LinkedHashMap linkedHashMap2 = X;
                        if (linkedHashMap2.size() <= 60) {
                            break;
                        } else {
                            linkedHashMap2.remove(NC.E(linkedHashMap2.keySet()));
                        }
                    }
                }
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string9 = AbstractC1323Qy1.l0(string5).toString();
        C2379bg c2379bg5 = V;
        synchronized (c2379bg5) {
            TC.t(c2379bg5, new C5249pa(5, jCurrentTimeMillis));
            String strJ = C3508h72.J(string9);
            if (c2379bg5.isEmpty()) {
                z2 = false;
            } else {
                Iterator it4 = c2379bg5.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        C3479h01 c3479h01 = (C3479h01) it4.next();
                        if (AbstractC1947Yy1.m(string9, (String) c3479h01.N) || AbstractC1947Yy1.m(strJ, (String) c3479h01.N)) {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        if (z2) {
            z3 = true;
        } else {
            String string10 = AbstractC1323Qy1.l0(string5).toString();
            if (AbstractC1947Yy1.r(string10, "You:", true) || AbstractC1947Yy1.r(string10, "Aap:", true)) {
                z6 = true;
            } else {
                Parcelable[] parcelableArray = bundle5.getParcelableArray("android.messages");
                if (parcelableArray != null) {
                    Object objZ = AbstractC4238kg.z(parcelableArray);
                    Bundle bundle6 = objZ instanceof Bundle ? (Bundle) objZ : null;
                    if (bundle6 != null) {
                        CharSequence charSequence4 = bundle6.getCharSequence("sender");
                        if (charSequence4 == null || (string2 = charSequence4.toString()) == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Parcelable parcelable = bundle6.getParcelable("sender_person");
                                Person personB = AbstractC6002tB0.t(parcelable) ? AbstractC6002tB0.b(parcelable) : null;
                                if (personB == null || (name = personB.getName()) == null) {
                                    string2 = null;
                                } else {
                                    string2 = name.toString();
                                }
                            } else {
                                string2 = null;
                            }
                        }
                        if (string2 != null && !AbstractC1947Yy1.n(string2)) {
                            CharSequence charSequence5 = bundle5.getCharSequence("android.selfDisplayName");
                            String string11 = charSequence5 != null ? charSequence5.toString() : null;
                            if (string2.equalsIgnoreCase("You") || string2.equalsIgnoreCase("Aap") || (string11 != null && !AbstractC1947Yy1.n(string11) && string2.equalsIgnoreCase(string11))) {
                                z6 = true;
                            }
                        }
                    }
                }
                z6 = false;
            }
            if (z6) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (z3) {
            string5 = C3508h72.J(string5);
        }
        String str5 = string5;
        try {
            Parcelable[] parcelableArray2 = bundle5.getParcelableArray("android.messages");
            if (parcelableArray2 == null) {
                c1572Ud1 = null;
            } else {
                Object objZ2 = AbstractC4238kg.z(parcelableArray2);
                Bundle bundle7 = objZ2 instanceof Bundle ? (Bundle) objZ2 : null;
                if (bundle7 != null) {
                    long j = bundle7.getLong("time", 0L);
                    c1572Ud1 = Long.valueOf(j);
                    if (j <= 0) {
                        c1572Ud1 = null;
                    }
                } else {
                    c1572Ud1 = null;
                }
            }
        } catch (Throwable th2) {
            c1572Ud1 = new C1572Ud1(th2);
        }
        if (c1572Ud1 instanceof C1572Ud1) {
            c1572Ud1 = null;
        }
        Long l = (Long) c1572Ud1;
        C2379bg c2379bg6 = T;
        synchronized (c2379bg6) {
            try {
                ListIterator listIterator = c2379bg6.listIterator(c2379bg6.d());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        c3997jW2 = (C3997jW1) objPrevious;
                    }
                } while (!(AbstractC5669rb2.d(c3997jW2.a, string4) && AbstractC5669rb2.d(c3997jW2.b, str5)));
                C3997jW1 c3997jW3 = (C3997jW1) objPrevious;
                try {
                    if (c3997jW3 != null) {
                        if (l != null) {
                            bundle2 = bundle5;
                            if (c3997jW3.c == l.longValue()) {
                            }
                            if (z4) {
                                c2379bg = c2379bg6;
                                if (z || c3997jW3 == null || !C3508h72.m(c3997jW3, System.currentTimeMillis())) {
                                    c3997jW3 = null;
                                }
                            } else {
                                if (l != null) {
                                    postTime = l.longValue();
                                } else {
                                    postTime = statusBarNotification.getPostTime();
                                }
                                c2379bg = c2379bg6;
                                c3997jW1 = new C3997jW1(string4, str5, postTime, zD, z3, z2);
                                T.h(c3997jW1);
                                while (true) {
                                    c2379bg2 = T;
                                    if (c2379bg2.P <= 60) {
                                        break;
                                    } else {
                                        c2379bg2.o();
                                    }
                                }
                                if (!z) {
                                    C3508h72.j(c3997jW1);
                                }
                                c3997jW3 = c3997jW1;
                            }
                            if (z) {
                                List list2 = AbstractC4204kW1.a;
                                if (str5 == null && (string = AbstractC1323Qy1.l0(str5).toString()) != null && string.length() != 0) {
                                    List list3 = AbstractC4204kW1.a;
                                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                        Iterator it5 = list3.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                z5 = false;
                                                break;
                                            } else if (((C0939Ma1) it5.next()).a(string)) {
                                                z5 = true;
                                                break;
                                            }
                                        }
                                    } else {
                                        z5 = false;
                                        break;
                                    }
                                } else {
                                    z5 = false;
                                    break;
                                }
                                if (!z5 || c3997jW3 == null) {
                                    return;
                                }
                                if (!(!c3997jW3.e)) {
                                    c3997jW3 = null;
                                }
                                if (c3997jW3 != null) {
                                    try {
                                        T40 t41 = N;
                                        if (t41 != null) {
                                            t41.l(c3997jW3);
                                        }
                                    } catch (Throwable unused5) {
                                    }
                                    try {
                                        C5064of1 c5064of1K = C3508h72.k(bundle3);
                                        if (c5064of1K != null) {
                                            C4138kA1 c4138kA1 = C4138kA1.a;
                                            C4138kA1.b(getApplicationContext(), c3997jW3.a, c3997jW3.b, c5064of1K);
                                        }
                                    } catch (Throwable unused6) {
                                    }
                                    try {
                                        C0647Ih c0647Ih = C0647Ih.a;
                                        Wd2.d(C0647Ih.b, null, 0, new C0257Dh(getApplicationContext().getApplicationContext(), c3997jW3, null), 3);
                                        return;
                                    } catch (Throwable unused7) {
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        bundle = bundle5;
                        bundle4 = bundle2;
                        bundle = bundle2;
                        z4 = true;
                        bundle3 = bundle;
                        if (z4) {
                            if (l != null) {
                                postTime = l.longValue();
                            } else {
                                postTime = statusBarNotification.getPostTime();
                            }
                            c2379bg = c2379bg6;
                            c3997jW1 = new C3997jW1(string4, str5, postTime, zD, z3, z2);
                            T.h(c3997jW1);
                            while (true) {
                                c2379bg2 = T;
                                if (c2379bg2.P <= 60) {
                                    break;
                                    break;
                                }
                                c2379bg2.o();
                            }
                            if (!z) {
                                C3508h72.j(c3997jW1);
                            }
                            c3997jW3 = c3997jW1;
                        } else {
                            c2379bg = c2379bg6;
                            if (z) {
                                c3997jW3 = null;
                            } else {
                                c3997jW3 = null;
                            }
                        }
                        if (z) {
                            List list4 = AbstractC4204kW1.a;
                            if (str5 == null) {
                                z5 = false;
                                break;
                            } else {
                                z5 = false;
                                break;
                            }
                            if (z5) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    bundle4 = bundle5;
                    if (z4) {
                        if (l != null) {
                            postTime = l.longValue();
                        } else {
                            postTime = statusBarNotification.getPostTime();
                        }
                        c2379bg = c2379bg6;
                        c3997jW1 = new C3997jW1(string4, str5, postTime, zD, z3, z2);
                        T.h(c3997jW1);
                        while (true) {
                            c2379bg2 = T;
                            if (c2379bg2.P <= 60) {
                                break;
                                break;
                            }
                            c2379bg2.o();
                        }
                        if (!z) {
                            C3508h72.j(c3997jW1);
                        }
                        c3997jW3 = c3997jW1;
                    } else {
                        c2379bg = c2379bg6;
                        if (z) {
                            c3997jW3 = null;
                        } else {
                            c3997jW3 = null;
                        }
                    }
                    if (z) {
                        List list5 = AbstractC4204kW1.a;
                        if (str5 == null) {
                            z5 = false;
                            break;
                        } else {
                            z5 = false;
                            break;
                        }
                        if (z5) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    obj = bundle5;
                    throw th;
                }
                bundle4 = bundle2;
                bundle = bundle2;
                z4 = false;
                bundle3 = bundle4;
            } catch (Throwable th4) {
                th = th4;
                obj = c2379bg6;
            }
        }
    }

    public final void c() {
        StatusBarNotification[] activeNotifications;
        try {
            activeNotifications = getActiveNotifications();
        } catch (Exception e) {
            e.getMessage();
            activeNotifications = null;
        }
        if (activeNotifications == null) {
            return;
        }
        Iterator it = AbstractC4238kg.B(activeNotifications, new ZX(21)).iterator();
        while (it.hasNext()) {
            b((StatusBarNotification) it.next(), false);
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public final void onDestroy() {
        Z = false;
        if (Y == this) {
            Y = null;
        }
        super.onDestroy();
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerConnected() {
        Y = this;
        Z = true;
        c();
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerDisconnected() {
        Z = false;
        if (Y == this) {
            Y = null;
        }
        try {
            NotificationListenerService.requestRebind(new ComponentName(this, (Class<?>) MayaNotificationListener.class));
        } catch (Throwable unused) {
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationPosted(StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null) {
            return;
        }
        try {
            b(statusBarNotification, true);
        } catch (Throwable th) {
            statusBarNotification.getPackageName();
            th.getMessage();
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null) {
            return;
        }
        try {
            Notification notification = statusBarNotification.getNotification();
            if (AbstractC5669rb2.d(notification != null ? notification.category : null, "call")) {
                R = null;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
