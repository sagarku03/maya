package com.getmaya.android.ui.browser;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.security.crypto.MasterKey;
import com.getmaya.android.R;
import defpackage.AbstractC0200Co;
import defpackage.AbstractC1228Pt;
import defpackage.AbstractC1731We1;
import defpackage.AbstractC1947Yy1;
import defpackage.AbstractC1966Zf;
import defpackage.AbstractC2082aE;
import defpackage.AbstractC2359bb;
import defpackage.AbstractC2454c22;
import defpackage.AbstractC2803di2;
import defpackage.AbstractC3009ei2;
import defpackage.AbstractC3203ff1;
import defpackage.AbstractC3239fq;
import defpackage.AbstractC4387lO1;
import defpackage.AbstractC4766nD;
import defpackage.AbstractC4968oB0;
import defpackage.AbstractC5199pJ0;
import defpackage.AbstractC5669rb2;
import defpackage.AbstractC5740rw1;
import defpackage.AbstractC6225uG1;
import defpackage.AbstractC6383v22;
import defpackage.AbstractC6532vk1;
import defpackage.AbstractC6708wc2;
import defpackage.AbstractC6838xE;
import defpackage.AbstractC6911xb2;
import defpackage.AbstractC7119yc;
import defpackage.AbstractC7193yy;
import defpackage.AbstractC7230z71;
import defpackage.AbstractC7239z92;
import defpackage.AbstractC7258zG;
import defpackage.AbstractC7363zl1;
import defpackage.B1;
import defpackage.B81;
import defpackage.BF;
import defpackage.C0507Gm0;
import defpackage.C0593Hp;
import defpackage.C0659Il;
import defpackage.C0663Im0;
import defpackage.C0671Ip;
import defpackage.C0749Jp;
import defpackage.C0827Kp;
import defpackage.C0905Lp;
import defpackage.C0939Ma1;
import defpackage.C0982Mp;
import defpackage.C1074Nt1;
import defpackage.C1108Of;
import defpackage.C1138Op;
import defpackage.C1216Pp;
import defpackage.C1294Qp;
import defpackage.C1320Qx1;
import defpackage.C1372Rp;
import defpackage.C1450Sp;
import defpackage.C1572Ud1;
import defpackage.C1684Vp;
import defpackage.C1970Zg0;
import defpackage.C2177ah0;
import defpackage.C2206aq;
import defpackage.C2662d3;
import defpackage.C2825dq;
import defpackage.C2860e1;
import defpackage.C3032eq;
import defpackage.C3328gG;
import defpackage.C3410gf1;
import defpackage.C3479h01;
import defpackage.C3529hE;
import defpackage.C3670hv1;
import defpackage.C3721i90;
import defpackage.C3836ii2;
import defpackage.C3901j3;
import defpackage.C4347lB0;
import defpackage.C4361lG;
import defpackage.C4610mU;
import defpackage.C4797nN0;
import defpackage.C5143p3;
import defpackage.C5180pD;
import defpackage.C5306pp1;
import defpackage.C5396qG;
import defpackage.C5576r8;
import defpackage.C5750s;
import defpackage.C5783s8;
import defpackage.C5882sd0;
import defpackage.C5960t01;
import defpackage.C5987t70;
import defpackage.C6122tm;
import defpackage.C6164u;
import defpackage.C6193u7;
import defpackage.C6245uN0;
import defpackage.C6335uo;
import defpackage.C6447vL1;
import defpackage.C6536vm;
import defpackage.C7002y20;
import defpackage.Ca2;
import defpackage.Ci2;
import defpackage.D62;
import defpackage.D90;
import defpackage.E2;
import defpackage.EnumC5316pt;
import defpackage.FO0;
import defpackage.Fh2;
import defpackage.GL1;
import defpackage.Gd2;
import defpackage.HU1;
import defpackage.I;
import defpackage.Ig2;
import defpackage.InterfaceC1186Pf;
import defpackage.InterfaceC3049ev1;
import defpackage.InterfaceC3535hG;
import defpackage.InterfaceC3617hf1;
import defpackage.InterfaceC6866xN0;
import defpackage.InterfaceC7079yP0;
import defpackage.J11;
import defpackage.J2;
import defpackage.K2;
import defpackage.KG1;
import defpackage.Kc2;
import defpackage.L5;
import defpackage.M2;
import defpackage.N30;
import defpackage.NC;
import defpackage.Ng2;
import defpackage.OC;
import defpackage.OD;
import defpackage.PA0;
import defpackage.Ph2;
import defpackage.QA0;
import defpackage.Qh2;
import defpackage.R82;
import defpackage.RA0;
import defpackage.RZ0;
import defpackage.S40;
import defpackage.T40;
import defpackage.TA0;
import defpackage.Ti2;
import defpackage.UC;
import defpackage.V20;
import defpackage.V40;
import defpackage.X40;
import defpackage.XA0;
import defpackage.Y81;
import defpackage.YB1;
import defpackage.Z4;
import defpackage.Z7;
import defpackage.ZD;
import defpackage.ZJ0;
import defpackage.r;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0015²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/getmaya/android/ui/browser/BrowserActivity;", "LZD;", "LTA0;", "<init>", "()V", "Hp", "Ip", "Rp", "LXA0;", "st", "LRA0;", "banner", "", "showTabs", "editing", "", "address", "refused", "menuOpen", "settingsOpen", "confirmCookies", "app_release"}, k = 1, mv = {1, 9, 0})
public final class BrowserActivity extends ZD implements TA0 {
    public static final Set p0 = AbstractC7363zl1.h("http", "https", "about", "data", "blob", "javascript");
    public long h0 = 1;
    public final C1074Nt1 i0 = new C1074Nt1();
    public final C5960t01 j0;
    public final C5960t01 k0;
    public volatile boolean l0;
    public ValueCallback m0;
    public final J2 n0;
    public final YB1 o0;

    public BrowserActivity() {
        FO0 fo0 = FO0.X;
        this.j0 = AbstractC6911xb2.g(0L, fo0);
        this.k0 = AbstractC6911xb2.g(0, fo0);
        this.n0 = k(new E2(7), new K2(this, 2));
        this.o0 = new YB1(new C0982Mp(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void n(BrowserActivity browserActivity, int i, C2177ah0 c2177ah0, boolean z, S40 s40, C5396qG c5396qG, int i2, int i3) {
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        Y81 y81V;
        int i5;
        browserActivity.getClass();
        c5396qG.d0(1392471638);
        if ((i2 & 14) == 0) {
            i4 = (c5396qG.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= c5396qG.g(c2177ah0) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 == 0) {
            if ((i2 & 896) == 0) {
                z2 = z;
                i4 |= c5396qG.h(z2) ? MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE : 128;
            }
            if ((i2 & 7168) == 0) {
                if (c5396qG.i(s40)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            if ((i4 & 5851) == 1170 || !c5396qG.F()) {
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                AbstractC2359bb.b(B81.i(868477478, c5396qG, new C5750s(i, 11)), s40, null, B81.i(-1785729943, c5396qG, new C0749Jp(c2177ah0, 0)), B81.i(1624501546, c5396qG, new C6335uo(1, z3)), false, null, null, null, c5396qG, ((i4 >> 6) & 112) | 27654, 484);
                z4 = z3;
            } else {
                c5396qG.V();
                z4 = z2;
            }
            y81V = c5396qG.v();
            if (y81V != null) {
                y81V.d = new C0827Kp(browserActivity, i, c2177ah0, z4, s40, i2, i3);
            }
        }
        i4 |= 384;
        z2 = z;
        if ((i2 & 7168) == 0) {
            if (c5396qG.i(s40)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
        }
        if ((i4 & 5851) == 1170) {
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            AbstractC2359bb.b(B81.i(868477478, c5396qG, new C5750s(i, 11)), s40, null, B81.i(-1785729943, c5396qG, new C0749Jp(c2177ah0, 0)), B81.i(1624501546, c5396qG, new C6335uo(1, z3)), false, null, null, null, c5396qG, ((i4 >> 6) & 112) | 27654, 484);
            z4 = z3;
        } else {
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            AbstractC2359bb.b(B81.i(868477478, c5396qG, new C5750s(i, 11)), s40, null, B81.i(-1785729943, c5396qG, new C0749Jp(c2177ah0, 0)), B81.i(1624501546, c5396qG, new C6335uo(1, z3)), false, null, null, null, c5396qG, ((i4 >> 6) & 112) | 27654, 484);
            z4 = z3;
        }
        y81V = c5396qG.v();
        if (y81V != null) {
            y81V.d = new C0827Kp(browserActivity, i, c2177ah0, z4, s40, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0494  */
    /* JADX WARN: Code duplicated, block: B:104:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:107:0x054d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x054f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0577  */
    /* JADX WARN: Code duplicated, block: B:113:0x057e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0584  */
    /* JADX WARN: Code duplicated, block: B:117:0x0593  */
    /* JADX WARN: Code duplicated, block: B:119:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:123:0x05af  */
    /* JADX WARN: Code duplicated, block: B:126:0x0654  */
    /* JADX WARN: Code duplicated, block: B:127:0x0661  */
    /* JADX WARN: Code duplicated, block: B:130:0x0696  */
    /* JADX WARN: Code duplicated, block: B:131:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:138:0x070d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0742  */
    /* JADX WARN: Code duplicated, block: B:143:0x0755  */
    /* JADX WARN: Code duplicated, block: B:144:0x075e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0762  */
    /* JADX WARN: Code duplicated, block: B:147:0x0782  */
    /* JADX WARN: Code duplicated, block: B:149:0x0786  */
    /* JADX WARN: Code duplicated, block: B:153:0x0800  */
    /* JADX WARN: Code duplicated, block: B:154:0x0803  */
    /* JADX WARN: Code duplicated, block: B:156:0x0806  */
    /* JADX WARN: Code duplicated, block: B:158:0x0818  */
    /* JADX WARN: Code duplicated, block: B:159:0x082c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0853  */
    /* JADX WARN: Code duplicated, block: B:166:0x0865  */
    /* JADX WARN: Code duplicated, block: B:167:0x0872  */
    /* JADX WARN: Code duplicated, block: B:169:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:172:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:174:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:178:0x0929  */
    /* JADX WARN: Code duplicated, block: B:180:0x0934  */
    /* JADX WARN: Code duplicated, block: B:182:0x0945  */
    /* JADX WARN: Code duplicated, block: B:184:0x094a  */
    /* JADX WARN: Code duplicated, block: B:186:0x094f  */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0184  */
    /* JADX WARN: Code duplicated, block: B:42:0x019c  */
    /* JADX WARN: Code duplicated, block: B:44:0x01be  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0212  */
    /* JADX WARN: Code duplicated, block: B:57:0x0224  */
    /* JADX WARN: Code duplicated, block: B:60:0x0294  */
    /* JADX WARN: Code duplicated, block: B:63:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0306  */
    /* JADX WARN: Code duplicated, block: B:70:0x0339  */
    /* JADX WARN: Code duplicated, block: B:72:0x036f  */
    /* JADX WARN: Code duplicated, block: B:74:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x042e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0435  */
    /* JADX WARN: Code duplicated, block: B:84:0x043b  */
    /* JADX WARN: Code duplicated, block: B:87:0x044c  */
    /* JADX WARN: Code duplicated, block: B:89:0x045a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0472  */
    /* JADX WARN: Code duplicated, block: B:96:0x047b  */
    /* JADX WARN: Code duplicated, block: B:99:0x048b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v69 */
    public static final void o(BrowserActivity browserActivity, C5396qG c5396qG, int i) {
        String strA;
        V20 v20;
        BF bf;
        float f;
        C3410gf1 c3410gf1B;
        int i2;
        J11 j11N;
        InterfaceC6866xN0 interfaceC6866xN0E;
        InterfaceC7079yP0 interfaceC7079yP0;
        C1372Rp c1372Rp;
        boolean zG;
        Object objQ;
        Object obj;
        C5180pD c5180pDA;
        int i3;
        J11 j11N2;
        InterfaceC6866xN0 interfaceC6866xN0E2;
        S40 s40;
        BF bf2;
        String strD;
        long j;
        S40 s41;
        BF bf3;
        Object obj2;
        boolean zG2;
        Object objQ2;
        ZJ0 zj0E;
        int i4;
        J11 j11N3;
        InterfaceC6866xN0 interfaceC6866xN0E3;
        C2177ah0 c2177ah0B;
        Object objQ3;
        InterfaceC7079yP0 interfaceC7079yP1;
        C6245uN0 c6245uN0;
        InterfaceC7079yP0 interfaceC7079yP2;
        Object objQ4;
        float f2;
        InterfaceC7079yP0 interfaceC7079yP3;
        Object obj3;
        InterfaceC7079yP0 interfaceC7079yP4;
        char c;
        boolean z;
        boolean z2;
        C5396qG c5396qG2;
        C6245uN0 c6245uN1;
        RA0 ra0;
        C3479h01 c3479h01;
        T40 t40;
        C1372Rp c1372Rp2;
        Object obj4;
        I i5;
        InterfaceC6866xN0 interfaceC6866xN0D;
        boolean zG3;
        Object objQ5;
        V20 v21;
        boolean zG4;
        Object objQ6;
        Object objQ7;
        Object obj5;
        boolean zG5;
        Object objQ8;
        boolean z3;
        C5396qG c5396qG3;
        Y81 y81V;
        Object objQ9;
        Object objQ10;
        InterfaceC7079yP0 interfaceC7079yP5;
        boolean zG6;
        Object objQ11;
        browserActivity.getClass();
        c5396qG.d0(-791949226);
        InterfaceC7079yP0 interfaceC7079yP0B = AbstractC6911xb2.b(C4347lB0.c, c5396qG);
        InterfaceC7079yP0 interfaceC7079yP0B2 = AbstractC6911xb2.b(C4347lB0.d, c5396qG);
        InterfaceC7079yP0 interfaceC7079yP6 = (InterfaceC7079yP0) D62.d(new Object[0], null, C1294Qp.Q, c5396qG, 3080, 6);
        InterfaceC7079yP0 interfaceC7079yP7 = (InterfaceC7079yP0) D62.d(new Object[0], null, C1294Qp.P, c5396qG, 3080, 6);
        InterfaceC7079yP0 interfaceC7079yP8 = (InterfaceC7079yP0) D62.d(new Object[0], null, C6164u.s0, c5396qG, 3080, 6);
        c5396qG.b0(1569344381);
        Object objQ12 = c5396qG.Q();
        Object obj6 = C4361lG.a;
        FO0 fo0 = FO0.X;
        if (objQ12 == obj6) {
            objQ12 = AbstractC6911xb2.g(Boolean.FALSE, fo0);
            c5396qG.l0(objQ12);
        }
        InterfaceC7079yP0 interfaceC7079yP9 = (InterfaceC7079yP0) objQ12;
        Object objI = AbstractC5740rw1.i(1569346269, c5396qG, false);
        if (objI == obj6) {
            objI = AbstractC6911xb2.g(Boolean.FALSE, fo0);
            c5396qG.l0(objI);
        }
        InterfaceC7079yP0 interfaceC7079yP10 = (InterfaceC7079yP0) objI;
        Object objI2 = AbstractC5740rw1.i(1569348285, c5396qG, false);
        if (objI2 == obj6) {
            objI2 = AbstractC6911xb2.g(Boolean.FALSE, fo0);
            c5396qG.l0(objI2);
        }
        InterfaceC7079yP0 interfaceC7079yP11 = (InterfaceC7079yP0) objI2;
        Object objI3 = AbstractC5740rw1.i(1569350365, c5396qG, false);
        if (objI3 == obj6) {
            objI3 = AbstractC6911xb2.g(Boolean.FALSE, fo0);
            c5396qG.l0(objI3);
        }
        InterfaceC7079yP0 interfaceC7079yP12 = (InterfaceC7079yP0) objI3;
        c5396qG.r(false);
        Object obj7 = (InterfaceC3049ev1) c5396qG.l(AbstractC7258zG.n);
        c5396qG.b0(1569354136);
        Object objQ13 = c5396qG.Q();
        if (objQ13 == obj6) {
            objQ13 = new V20();
            c5396qG.l0(objQ13);
        }
        V20 v22 = (V20) objQ13;
        c5396qG.r(false);
        C1372Rp c1372RpU = browserActivity.u();
        C5306pp1 c5306pp1B = Ca2.b(((XA0) interfaceC7079yP0B.getValue()).a);
        if (c5306pp1B == null || (strA = c5306pp1B.a) == null) {
            Set set = HU1.a;
            strA = HU1.a(((XA0) interfaceC7079yP0B.getValue()).a);
        }
        String str = strA;
        C6245uN0 c6245uN2 = C6245uN0.b;
        InterfaceC6866xN0 interfaceC6866xN0B = Ti2.b(AbstractC3009ei2.c(a.a(d.c, Ig2.b(), null, 6), new C7002y20(3, 8)));
        C3836ii2 c3836ii2 = AbstractC1966Zf.c;
        C6122tm c6122tm = C4797nN0.a0;
        C5180pD c5180pDA2 = AbstractC4766nD.a(c3836ii2, c6122tm, c5396qG, 0);
        int i6 = c5396qG.P;
        J11 j11N4 = c5396qG.n();
        InterfaceC6866xN0 interfaceC6866xN0E4 = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0B);
        InterfaceC3535hG.f.getClass();
        S40 s42 = C3328gG.b;
        boolean z4 = c5396qG.a instanceof InterfaceC1186Pf;
        if (!z4) {
            AbstractC2803di2.c();
            throw null;
        }
        c5396qG.f0();
        if (c5396qG.O) {
            c5396qG.m(s42);
        } else {
            c5396qG.o0();
        }
        BF bf4 = C3328gG.f;
        Ph2.d(c5396qG, bf4, c5180pDA2);
        BF bf5 = C3328gG.e;
        Ph2.d(c5396qG, bf5, j11N4);
        BF bf6 = C3328gG.g;
        if (!c5396qG.O) {
            v20 = v22;
            if (!AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i6))) {
            }
            bf = C3328gG.d;
            Ph2.d(c5396qG, bf, interfaceC6866xN0E4);
            if (((Boolean) interfaceC7079yP6.getValue()).booleanValue()) {
                c5396qG.b0(-509146178);
                c5396qG.b0(-1817538194);
                zG6 = c5396qG.g(interfaceC7079yP6);
                objQ11 = c5396qG.Q();
                if (zG6 || objQ11 == obj6) {
                    objQ11 = new r(interfaceC7079yP6, 9);
                    c5396qG.l0(objQ11);
                }
                c5396qG.r(false);
                browserActivity.m((S40) objQ11, c5396qG, 64);
                c5396qG.r(false);
                obj3 = obj6;
                c5396qG3 = c5396qG;
                interfaceC7079yP0 = interfaceC7079yP11;
                interfaceC7079yP3 = interfaceC7079yP12;
                z = true;
                z3 = 0;
            } else {
                c5396qG.b0(-508857568);
                InterfaceC6866xN0 interfaceC6866xN0D2 = d.d(c6245uN2, 1.0f);
                f = AbstractC5199pJ0.b;
                InterfaceC6866xN0 interfaceC6866xN0M = androidx.compose.foundation.layout.a.m(interfaceC6866xN0D2, f, f);
                c3410gf1B = AbstractC3203ff1.b(AbstractC1966Zf.a, C4797nN0.Y, c5396qG, 48);
                i2 = c5396qG.P;
                j11N = c5396qG.n();
                interfaceC6866xN0E = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0M);
                if (z4) {
                    AbstractC2803di2.c();
                    throw null;
                }
                c5396qG.f0();
                if (c5396qG.O) {
                    c5396qG.m(s42);
                } else {
                    c5396qG.o0();
                }
                Ph2.d(c5396qG, bf4, c3410gf1B);
                Ph2.d(c5396qG, bf5, j11N);
                if (c5396qG.O || !AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i2))) {
                    AbstractC7119yc.m(i2, c5396qG, i2, bf6);
                }
                Ph2.d(c5396qG, bf, interfaceC6866xN0E);
                if (((Boolean) interfaceC7079yP7.getValue()).booleanValue()) {
                    c5396qG.b0(995905942);
                    String str2 = (String) interfaceC7079yP8.getValue();
                    boolean zBooleanValue = ((Boolean) interfaceC7079yP9.getValue()).booleanValue();
                    C0663Im0 c0663Im0 = new C0663Im0(0, Boolean.FALSE, 5, 2, 113);
                    C0507Gm0 c0507Gm0 = new C0507Gm0(new M2(browserActivity, obj7, interfaceC7079yP8, interfaceC7079yP7, interfaceC7079yP9, 5), null, 61);
                    v21 = v20;
                    InterfaceC6866xN0 interfaceC6866xN0A = androidx.compose.ui.focus.a.a(androidx.compose.foundation.layout.a.p(InterfaceC3617hf1.a(), f, 0.0f, 0.0f, 0.0f, 14), v21);
                    c5396qG.b0(2110338842);
                    zG4 = c5396qG.g(interfaceC7079yP8);
                    objQ6 = c5396qG.Q();
                    if (zG4 || objQ6 == obj6) {
                        objQ6 = new C3901j3(interfaceC7079yP8, interfaceC7079yP9, 2);
                        c5396qG.l0(objQ6);
                    }
                    c5396qG.r(false);
                    interfaceC7079yP0 = interfaceC7079yP11;
                    c1372Rp = c1372RpU;
                    AbstractC7193yy.h(str2, (T40) objQ6, interfaceC6866xN0A, false, false, null, null, AbstractC6838xE.a, null, null, null, null, null, zBooleanValue, null, c0663Im0, c0507Gm0, true, 0, 0, null, null, c5396qG, 12582912, 12582912, 0, 3956600);
                    GL1 gl1 = GL1.a;
                    c5396qG.b0(2110366769);
                    objQ7 = c5396qG.Q();
                    if (objQ7 == obj6) {
                        obj5 = null;
                        objQ7 = new C0905Lp(v21, null);
                        c5396qG.l0(objQ7);
                    } else {
                        obj5 = null;
                    }
                    c5396qG.r(false);
                    AbstractC2454c22.c(c5396qG, (X40) objQ7, gl1);
                    C2177ah0 c2177ah0O = Ng2.o();
                    String strD2 = Kc2.d(R.string.toolsui_browser_edit_cancel, c5396qG);
                    c5396qG.b0(2110371545);
                    zG5 = c5396qG.g(interfaceC7079yP7) | c5396qG.g(obj7);
                    objQ8 = c5396qG.Q();
                    if (zG5 || objQ8 == obj6) {
                        objQ8 = new C2662d3(obj7, interfaceC7079yP7, interfaceC7079yP9, 7);
                        c5396qG.l0(objQ8);
                    }
                    c5396qG.r(false);
                    AbstractC4968oB0.b(0, 0L, c5396qG, (S40) objQ8, c2177ah0O, null, strD2, false);
                    c5396qG.r(false);
                    z2 = 0;
                    f2 = f;
                    interfaceC7079yP4 = interfaceC7079yP0B;
                    c6245uN0 = c6245uN2;
                    z = true;
                    c5396qG2 = c5396qG;
                    interfaceC7079yP3 = interfaceC7079yP12;
                    obj3 = obj6;
                    c = '\f';
                } else {
                    interfaceC7079yP0 = interfaceC7079yP11;
                    c1372Rp = c1372RpU;
                    c5396qG.b0(997300973);
                    AbstractC4968oB0.b(0, 0L, c5396qG, new C0982Mp(browserActivity, 0), R82.f(), null, Kc2.d(R.string.toolsui_browser_home, c5396qG), false);
                    InterfaceC6866xN0 interfaceC6866xN0A2 = InterfaceC3617hf1.a();
                    c5396qG.b0(2110389997);
                    zG = c5396qG.g(interfaceC7079yP8) | c5396qG.g(c5306pp1B) | c5396qG.g(interfaceC7079yP0B) | c5396qG.g(interfaceC7079yP7);
                    objQ = c5396qG.Q();
                    if (zG) {
                        obj = obj6;
                    } else {
                        obj = obj6;
                        if (objQ == obj) {
                        }
                        c5396qG.r(false);
                        InterfaceC6866xN0 interfaceC6866xN0M2 = androidx.compose.foundation.layout.a.m(a.e(interfaceC6866xN0A2, false, null, (S40) objQ, 7), f, AbstractC5199pJ0.a);
                        c5180pDA = AbstractC4766nD.a(c3836ii2, c6122tm, c5396qG, 0);
                        i3 = c5396qG.P;
                        j11N2 = c5396qG.n();
                        interfaceC6866xN0E2 = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0M2);
                        if (z4) {
                            AbstractC2803di2.c();
                            throw null;
                        }
                        c5396qG.f0();
                        if (c5396qG.O) {
                            s40 = s42;
                            c5396qG.m(s40);
                        } else {
                            s40 = s42;
                            c5396qG.o0();
                        }
                        Ph2.d(c5396qG, bf4, c5180pDA);
                        Ph2.d(c5396qG, bf5, j11N2);
                        if (c5396qG.O && AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i3))) {
                            bf2 = bf6;
                        } else {
                            bf2 = bf6;
                            AbstractC7119yc.m(i3, c5396qG, i3, bf2);
                        }
                        Ph2.d(c5396qG, bf, interfaceC6866xN0E2);
                        c5396qG.b0(1908025);
                        if (AbstractC1947Yy1.n(str)) {
                            strD = Kc2.d(R.string.toolsui_browser_address_hint, c5396qG);
                        } else {
                            strD = str;
                        }
                        c5396qG.r(false);
                        KG1 kg1K = C5987t70.K();
                        if (AbstractC1947Yy1.n(str)) {
                            j = Ig2.c().q;
                        } else {
                            j = Ig2.c().p;
                        }
                        s41 = s40;
                        bf3 = bf2;
                        obj2 = obj;
                        AbstractC6225uG1.b(strD, null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, kg1K, c5396qG, 0, 3120, 55290);
                        c5396qG.b0(1921507);
                        if (!AbstractC1947Yy1.n(((XA0) interfaceC7079yP0B.getValue()).b)) {
                            AbstractC6225uG1.b(((XA0) interfaceC7079yP0B.getValue()).b, null, Ig2.c().q, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, C5987t70.e0(13.0f, 18.0f, N30.S, 0.0f), c5396qG, 0, 3120, 55290);
                        }
                        c5396qG.r(false);
                        c5396qG.r(true);
                        int size = browserActivity.i0.size();
                        c5396qG.b0(2110434124);
                        zG2 = c5396qG.g(interfaceC7079yP6);
                        objQ2 = c5396qG.Q();
                        if (zG2 || objQ2 == obj2) {
                            objQ2 = new r(interfaceC7079yP6, 10);
                            c5396qG.l0(objQ2);
                        }
                        c5396qG.r(false);
                        browserActivity.l(size, (S40) objQ2, c5396qG, 512);
                        zj0E = AbstractC0200Co.e(C4797nN0.O, false);
                        i4 = c5396qG.P;
                        j11N3 = c5396qG.n();
                        interfaceC6866xN0E3 = AbstractC3009ei2.e(c5396qG, c6245uN2);
                        if (z4) {
                            AbstractC2803di2.c();
                            throw null;
                        }
                        c5396qG.f0();
                        if (c5396qG.O) {
                            c5396qG.m(s41);
                        } else {
                            c5396qG.o0();
                        }
                        Ph2.d(c5396qG, bf4, zj0E);
                        Ph2.d(c5396qG, bf5, j11N3);
                        if (c5396qG.O || !AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i4))) {
                            AbstractC7119yc.m(i4, c5396qG, i4, bf3);
                        }
                        Ph2.d(c5396qG, bf, interfaceC6866xN0E3);
                        c2177ah0B = Qh2.a;
                        if (c2177ah0B == null) {
                            C1970Zg0 c1970Zg0 = new C1970Zg0("Rounded.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i7 = AbstractC4387lO1.a;
                            C3670hv1 c3670hv1 = new C3670hv1(UC.b);
                            C3721i90 c3721i90D = AbstractC1228Pt.d(12.0f, 8.0f);
                            c3721i90D.f(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            c3721i90D.o(-0.9f, -2.0f, -2.0f, -2.0f);
                            c3721i90D.o(-2.0f, 0.9f, -2.0f, 2.0f);
                            c3721i90D.o(0.9f, 2.0f, 2.0f, 2.0f);
                            c3721i90D.c();
                            c3721i90D.m(12.0f, 10.0f);
                            c3721i90D.f(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            c3721i90D.o(0.9f, 2.0f, 2.0f, 2.0f);
                            c3721i90D.o(2.0f, -0.9f, 2.0f, -2.0f);
                            c3721i90D.o(-0.9f, -2.0f, -2.0f, -2.0f);
                            c3721i90D.c();
                            c3721i90D.m(12.0f, 16.0f);
                            c3721i90D.f(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            c3721i90D.o(0.9f, 2.0f, 2.0f, 2.0f);
                            c3721i90D.o(2.0f, -0.9f, 2.0f, -2.0f);
                            c3721i90D.o(-0.9f, -2.0f, -2.0f, -2.0f);
                            c3721i90D.c();
                            C1970Zg0.a(c1970Zg0, c3721i90D.N, c3670hv1);
                            c2177ah0B = c1970Zg0.b();
                            Qh2.a = c2177ah0B;
                        }
                        String strD3 = Kc2.d(R.string.toolsui_browser_menu_more, c5396qG);
                        c5396qG.b0(1942859);
                        objQ3 = c5396qG.Q();
                        if (objQ3 == obj2) {
                            interfaceC7079yP1 = interfaceC7079yP10;
                            objQ3 = new r(interfaceC7079yP1, 11);
                            c5396qG.l0(objQ3);
                        } else {
                            interfaceC7079yP1 = interfaceC7079yP10;
                        }
                        c5396qG.r(false);
                        c6245uN0 = c6245uN2;
                        C2177ah0 c2177ah0 = c2177ah0B;
                        interfaceC7079yP2 = interfaceC7079yP1;
                        AbstractC4968oB0.b(384, 0L, c5396qG, (S40) objQ3, c2177ah0, null, strD3, false);
                        boolean zBooleanValue2 = ((Boolean) interfaceC7079yP2.getValue()).booleanValue();
                        c5396qG.b0(1946124);
                        objQ4 = c5396qG.Q();
                        if (objQ4 == obj2) {
                            objQ4 = new r(interfaceC7079yP2, 12);
                            c5396qG.l0(objQ4);
                        }
                        c5396qG.r(false);
                        f2 = f;
                        C3529hE c3529hEI = B81.i(-689598429, c5396qG, new C1138Op(browserActivity, c1372Rp, c5306pp1B, interfaceC7079yP2, interfaceC7079yP0, 0));
                        interfaceC7079yP3 = interfaceC7079yP12;
                        obj3 = obj2;
                        interfaceC7079yP4 = interfaceC7079yP0B;
                        C5396qG c5396qG4 = c5396qG;
                        c = '\f';
                        AbstractC2359bb.a(zBooleanValue2, (S40) objQ4, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, c3529hEI, c5396qG, 48, 48);
                        z = true;
                        c5396qG4.r(true);
                        z2 = 0;
                        c5396qG4.r(false);
                        c5396qG2 = c5396qG4;
                    }
                    objQ = new Z7(5, c5306pp1B, interfaceC7079yP0B, interfaceC7079yP8, interfaceC7079yP7, false);
                    c5396qG.l0(objQ);
                    c5396qG.r(false);
                    InterfaceC6866xN0 interfaceC6866xN0M3 = androidx.compose.foundation.layout.a.m(a.e(interfaceC6866xN0A2, false, null, (S40) objQ, 7), f, AbstractC5199pJ0.a);
                    c5180pDA = AbstractC4766nD.a(c3836ii2, c6122tm, c5396qG, 0);
                    i3 = c5396qG.P;
                    j11N2 = c5396qG.n();
                    interfaceC6866xN0E2 = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0M3);
                    if (z4) {
                        AbstractC2803di2.c();
                        throw null;
                    }
                    c5396qG.f0();
                    if (c5396qG.O) {
                        s40 = s42;
                        c5396qG.m(s40);
                    } else {
                        s40 = s42;
                        c5396qG.o0();
                    }
                    Ph2.d(c5396qG, bf4, c5180pDA);
                    Ph2.d(c5396qG, bf5, j11N2);
                    if (c5396qG.O) {
                        bf2 = bf6;
                        AbstractC7119yc.m(i3, c5396qG, i3, bf2);
                    } else {
                        bf2 = bf6;
                        AbstractC7119yc.m(i3, c5396qG, i3, bf2);
                    }
                    Ph2.d(c5396qG, bf, interfaceC6866xN0E2);
                    c5396qG.b0(1908025);
                    if (AbstractC1947Yy1.n(str)) {
                        strD = Kc2.d(R.string.toolsui_browser_address_hint, c5396qG);
                    } else {
                        strD = str;
                    }
                    c5396qG.r(false);
                    KG1 kg1K2 = C5987t70.K();
                    if (AbstractC1947Yy1.n(str)) {
                        j = Ig2.c().q;
                    } else {
                        j = Ig2.c().p;
                    }
                    s41 = s40;
                    bf3 = bf2;
                    obj2 = obj;
                    AbstractC6225uG1.b(strD, null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, kg1K2, c5396qG, 0, 3120, 55290);
                    c5396qG.b0(1921507);
                    if (!AbstractC1947Yy1.n(((XA0) interfaceC7079yP0B.getValue()).b)) {
                        AbstractC6225uG1.b(((XA0) interfaceC7079yP0B.getValue()).b, null, Ig2.c().q, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, C5987t70.e0(13.0f, 18.0f, N30.S, 0.0f), c5396qG, 0, 3120, 55290);
                    }
                    c5396qG.r(false);
                    c5396qG.r(true);
                    int size2 = browserActivity.i0.size();
                    c5396qG.b0(2110434124);
                    zG2 = c5396qG.g(interfaceC7079yP6);
                    objQ2 = c5396qG.Q();
                    if (zG2) {
                        objQ2 = new r(interfaceC7079yP6, 10);
                        c5396qG.l0(objQ2);
                    } else {
                        objQ2 = new r(interfaceC7079yP6, 10);
                        c5396qG.l0(objQ2);
                    }
                    c5396qG.r(false);
                    browserActivity.l(size2, (S40) objQ2, c5396qG, 512);
                    zj0E = AbstractC0200Co.e(C4797nN0.O, false);
                    i4 = c5396qG.P;
                    j11N3 = c5396qG.n();
                    interfaceC6866xN0E3 = AbstractC3009ei2.e(c5396qG, c6245uN2);
                    if (z4) {
                        AbstractC2803di2.c();
                        throw null;
                    }
                    c5396qG.f0();
                    if (c5396qG.O) {
                        c5396qG.m(s41);
                    } else {
                        c5396qG.o0();
                    }
                    Ph2.d(c5396qG, bf4, zj0E);
                    Ph2.d(c5396qG, bf5, j11N3);
                    if (c5396qG.O) {
                        AbstractC7119yc.m(i4, c5396qG, i4, bf3);
                    } else {
                        AbstractC7119yc.m(i4, c5396qG, i4, bf3);
                    }
                    Ph2.d(c5396qG, bf, interfaceC6866xN0E3);
                    c2177ah0B = Qh2.a;
                    if (c2177ah0B == null) {
                        C1970Zg0 c1970Zg1 = new C1970Zg0("Rounded.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i8 = AbstractC4387lO1.a;
                        C3670hv1 c3670hv2 = new C3670hv1(UC.b);
                        C3721i90 c3721i90D2 = AbstractC1228Pt.d(12.0f, 8.0f);
                        c3721i90D2.f(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        c3721i90D2.o(-0.9f, -2.0f, -2.0f, -2.0f);
                        c3721i90D2.o(-2.0f, 0.9f, -2.0f, 2.0f);
                        c3721i90D2.o(0.9f, 2.0f, 2.0f, 2.0f);
                        c3721i90D2.c();
                        c3721i90D2.m(12.0f, 10.0f);
                        c3721i90D2.f(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c3721i90D2.o(0.9f, 2.0f, 2.0f, 2.0f);
                        c3721i90D2.o(2.0f, -0.9f, 2.0f, -2.0f);
                        c3721i90D2.o(-0.9f, -2.0f, -2.0f, -2.0f);
                        c3721i90D2.c();
                        c3721i90D2.m(12.0f, 16.0f);
                        c3721i90D2.f(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c3721i90D2.o(0.9f, 2.0f, 2.0f, 2.0f);
                        c3721i90D2.o(2.0f, -0.9f, 2.0f, -2.0f);
                        c3721i90D2.o(-0.9f, -2.0f, -2.0f, -2.0f);
                        c3721i90D2.c();
                        C1970Zg0.a(c1970Zg1, c3721i90D2.N, c3670hv2);
                        c2177ah0B = c1970Zg1.b();
                        Qh2.a = c2177ah0B;
                    }
                    String strD4 = Kc2.d(R.string.toolsui_browser_menu_more, c5396qG);
                    c5396qG.b0(1942859);
                    objQ3 = c5396qG.Q();
                    if (objQ3 == obj2) {
                        interfaceC7079yP1 = interfaceC7079yP10;
                        objQ3 = new r(interfaceC7079yP1, 11);
                        c5396qG.l0(objQ3);
                    } else {
                        interfaceC7079yP1 = interfaceC7079yP10;
                    }
                    c5396qG.r(false);
                    c6245uN0 = c6245uN2;
                    C2177ah0 c2177ah1 = c2177ah0B;
                    interfaceC7079yP2 = interfaceC7079yP1;
                    AbstractC4968oB0.b(384, 0L, c5396qG, (S40) objQ3, c2177ah1, null, strD4, false);
                    boolean zBooleanValue3 = ((Boolean) interfaceC7079yP2.getValue()).booleanValue();
                    c5396qG.b0(1946124);
                    objQ4 = c5396qG.Q();
                    if (objQ4 == obj2) {
                        objQ4 = new r(interfaceC7079yP2, 12);
                        c5396qG.l0(objQ4);
                    }
                    c5396qG.r(false);
                    f2 = f;
                    C3529hE c3529hEI2 = B81.i(-689598429, c5396qG, new C1138Op(browserActivity, c1372Rp, c5306pp1B, interfaceC7079yP2, interfaceC7079yP0, 0));
                    interfaceC7079yP3 = interfaceC7079yP12;
                    obj3 = obj2;
                    interfaceC7079yP4 = interfaceC7079yP0B;
                    C5396qG c5396qG5 = c5396qG;
                    c = '\f';
                    AbstractC2359bb.a(zBooleanValue3, (S40) objQ4, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, c3529hEI2, c5396qG, 48, 48);
                    z = true;
                    c5396qG5.r(true);
                    z2 = 0;
                    c5396qG5.r(false);
                    c5396qG2 = c5396qG5;
                }
                if (((XA0) AbstractC7119yc.c(c5396qG2, z, -1817369580, interfaceC7079yP4)).c) {
                    c5396qG2.b0(-1817366751);
                    zG3 = c5396qG2.g(interfaceC7079yP4);
                    objQ5 = c5396qG.Q();
                    if (zG3 || objQ5 == obj3) {
                        objQ5 = new C1216Pp(interfaceC7079yP4, z2);
                        c5396qG2.l0(objQ5);
                    }
                    c5396qG2.r(z2);
                    c6245uN1 = c6245uN0;
                    AbstractC7230z71.b((S40) objQ5, d.d(c6245uN1, 1.0f), Ig2.c().k, Ig2.c().j, 0, 0.0f, null, c5396qG, 48, 112);
                } else {
                    c6245uN1 = c6245uN0;
                }
                c5396qG2.r(z2);
                ra0 = (RA0) interfaceC7079yP0B2.getValue();
                c5396qG2.b0(-1817357290);
                if (ra0 == null) {
                    t40 = null;
                } else {
                    if (ra0 instanceof QA0) {
                        c5396qG2.b0(2110508876);
                        c3479h01 = new C3479h01(Kc2.e(R.string.toolsui_browser_fill_yourself, new Object[]{((QA0) ra0).a}, c5396qG2), EnumC5316pt.O);
                        c5396qG2.r(z2);
                    } else {
                        if (ra0 instanceof PA0) {
                            C5396qG c5396qG6 = c5396qG2;
                            c5396qG6.b0(2109549561);
                            c5396qG6.r(z2);
                            throw new OD();
                        }
                        c5396qG2.b0(2110514279);
                        c3479h01 = new C3479h01(Kc2.e(R.string.toolsui_browser_confirm, new Object[]{((PA0) ra0).a}, c5396qG2), EnumC5316pt.N);
                        c5396qG2.r(z2);
                    }
                    t40 = null;
                    AbstractC7239z92.a((String) c3479h01.N, a.e(androidx.compose.foundation.layout.a.m(c6245uN1, AbstractC5199pJ0.d, f2), z2, null, C6164u.r0, 7), (EnumC5316pt) c3479h01.O, c5396qG, 0, 0);
                }
                c5396qG2.r(z2);
                c5396qG2.Z(-1817332622, c5396qG2.H(Long.valueOf(((Number) browserActivity.j0.getValue()).longValue()), Integer.valueOf(((Number) browserActivity.k0.getValue()).intValue())));
                c1372Rp2 = c1372Rp;
                if (c1372Rp2 != null) {
                    obj4 = c1372Rp2.e;
                } else {
                    obj4 = t40;
                }
                if (obj4 != null) {
                    i5 = new I(obj4, c);
                    interfaceC6866xN0D = d.d(c6245uN1, 1.0f);
                    if (1.0f > 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                    }
                    androidx.compose.ui.viewinterop.a.a(i5, interfaceC6866xN0D.j(new LayoutWeightElement(AbstractC6383v22.d(1.0f, Float.MAX_VALUE), z)), t40, c5396qG2, z2);
                }
                c5396qG2.r(z2);
                c5396qG2.r(z2);
                c5396qG3 = c5396qG2;
                z3 = z2;
            }
            c5396qG3.r(z);
            c5396qG3.b0(1569603884);
            if (((Boolean) interfaceC7079yP0.getValue()).booleanValue()) {
                long j2 = Ig2.c().h;
                c5396qG3.b0(1569605267);
                objQ10 = c5396qG.Q();
                if (objQ10 == obj3) {
                    interfaceC7079yP5 = interfaceC7079yP0;
                    objQ10 = new r(interfaceC7079yP5, 13);
                    c5396qG3.l0(objQ10);
                } else {
                    interfaceC7079yP5 = interfaceC7079yP0;
                }
                c5396qG3.r(z3);
                int i9 = 4;
                Ca2.a((S40) objQ10, B81.i(933831401, c5396qG3, new C5143p3(interfaceC7079yP5, i9)), null, null, null, AbstractC6838xE.c, B81.i(-140314364, c5396qG3, new C6193u7(browserActivity, interfaceC7079yP5, interfaceC7079yP3, i9)), null, j2, 0L, 0L, 0L, 0.0f, null, c5396qG, 1769526, 0, 16028);
            }
            c5396qG3.r(z3);
            if (((Boolean) interfaceC7079yP3.getValue()).booleanValue()) {
                long j3 = Ig2.c().h;
                c5396qG3.b0(1569644053);
                objQ9 = c5396qG.Q();
                if (objQ9 == obj3) {
                    objQ9 = new r(interfaceC7079yP3, 15);
                    c5396qG3.l0(objQ9);
                }
                c5396qG3.r(z3);
                int i10 = 5;
                Ca2.a((S40) objQ9, B81.i(1459532768, c5396qG3, new C5783s8(i10, browserActivity, interfaceC7079yP3)), null, B81.i(874761118, c5396qG3, new C5143p3(interfaceC7079yP3, i10)), null, null, AbstractC6838xE.f, null, j3, 0L, 0L, 0L, 0.0f, null, c5396qG, 1575990, 0, 16052);
            }
            y81V = c5396qG.v();
            if (y81V != null) {
                y81V.d = new Z4(browserActivity, i, 1);
            }
        }
        v20 = v22;
        AbstractC7119yc.m(i6, c5396qG, i6, bf6);
        bf = C3328gG.d;
        Ph2.d(c5396qG, bf, interfaceC6866xN0E4);
        if (((Boolean) interfaceC7079yP6.getValue()).booleanValue()) {
            c5396qG.b0(-509146178);
            c5396qG.b0(-1817538194);
            zG6 = c5396qG.g(interfaceC7079yP6);
            objQ11 = c5396qG.Q();
            if (zG6) {
                objQ11 = new r(interfaceC7079yP6, 9);
                c5396qG.l0(objQ11);
            } else {
                objQ11 = new r(interfaceC7079yP6, 9);
                c5396qG.l0(objQ11);
            }
            c5396qG.r(false);
            browserActivity.m((S40) objQ11, c5396qG, 64);
            c5396qG.r(false);
            obj3 = obj6;
            c5396qG3 = c5396qG;
            interfaceC7079yP0 = interfaceC7079yP11;
            interfaceC7079yP3 = interfaceC7079yP12;
            z = true;
            z3 = 0;
        } else {
            c5396qG.b0(-508857568);
            InterfaceC6866xN0 interfaceC6866xN0D3 = d.d(c6245uN2, 1.0f);
            f = AbstractC5199pJ0.b;
            InterfaceC6866xN0 interfaceC6866xN0M4 = androidx.compose.foundation.layout.a.m(interfaceC6866xN0D3, f, f);
            c3410gf1B = AbstractC3203ff1.b(AbstractC1966Zf.a, C4797nN0.Y, c5396qG, 48);
            i2 = c5396qG.P;
            j11N = c5396qG.n();
            interfaceC6866xN0E = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0M4);
            if (z4) {
                AbstractC2803di2.c();
                throw null;
            }
            c5396qG.f0();
            if (c5396qG.O) {
                c5396qG.m(s42);
            } else {
                c5396qG.o0();
            }
            Ph2.d(c5396qG, bf4, c3410gf1B);
            Ph2.d(c5396qG, bf5, j11N);
            if (c5396qG.O) {
                AbstractC7119yc.m(i2, c5396qG, i2, bf6);
            } else {
                AbstractC7119yc.m(i2, c5396qG, i2, bf6);
            }
            Ph2.d(c5396qG, bf, interfaceC6866xN0E);
            if (((Boolean) interfaceC7079yP7.getValue()).booleanValue()) {
                c5396qG.b0(995905942);
                String str3 = (String) interfaceC7079yP8.getValue();
                boolean zBooleanValue4 = ((Boolean) interfaceC7079yP9.getValue()).booleanValue();
                C0663Im0 c0663Im1 = new C0663Im0(0, Boolean.FALSE, 5, 2, 113);
                C0507Gm0 c0507Gm1 = new C0507Gm0(new M2(browserActivity, obj7, interfaceC7079yP8, interfaceC7079yP7, interfaceC7079yP9, 5), null, 61);
                v21 = v20;
                InterfaceC6866xN0 interfaceC6866xN0A3 = androidx.compose.ui.focus.a.a(androidx.compose.foundation.layout.a.p(InterfaceC3617hf1.a(), f, 0.0f, 0.0f, 0.0f, 14), v21);
                c5396qG.b0(2110338842);
                zG4 = c5396qG.g(interfaceC7079yP8);
                objQ6 = c5396qG.Q();
                if (zG4) {
                    objQ6 = new C3901j3(interfaceC7079yP8, interfaceC7079yP9, 2);
                    c5396qG.l0(objQ6);
                } else {
                    objQ6 = new C3901j3(interfaceC7079yP8, interfaceC7079yP9, 2);
                    c5396qG.l0(objQ6);
                }
                c5396qG.r(false);
                interfaceC7079yP0 = interfaceC7079yP11;
                c1372Rp = c1372RpU;
                AbstractC7193yy.h(str3, (T40) objQ6, interfaceC6866xN0A3, false, false, null, null, AbstractC6838xE.a, null, null, null, null, null, zBooleanValue4, null, c0663Im1, c0507Gm1, true, 0, 0, null, null, c5396qG, 12582912, 12582912, 0, 3956600);
                GL1 gl2 = GL1.a;
                c5396qG.b0(2110366769);
                objQ7 = c5396qG.Q();
                if (objQ7 == obj6) {
                    obj5 = null;
                    objQ7 = new C0905Lp(v21, null);
                    c5396qG.l0(objQ7);
                } else {
                    obj5 = null;
                }
                c5396qG.r(false);
                AbstractC2454c22.c(c5396qG, (X40) objQ7, gl2);
                C2177ah0 c2177ah0O2 = Ng2.o();
                String strD5 = Kc2.d(R.string.toolsui_browser_edit_cancel, c5396qG);
                c5396qG.b0(2110371545);
                zG5 = c5396qG.g(interfaceC7079yP7) | c5396qG.g(obj7);
                objQ8 = c5396qG.Q();
                if (zG5) {
                    objQ8 = new C2662d3(obj7, interfaceC7079yP7, interfaceC7079yP9, 7);
                    c5396qG.l0(objQ8);
                } else {
                    objQ8 = new C2662d3(obj7, interfaceC7079yP7, interfaceC7079yP9, 7);
                    c5396qG.l0(objQ8);
                }
                c5396qG.r(false);
                AbstractC4968oB0.b(0, 0L, c5396qG, (S40) objQ8, c2177ah0O2, null, strD5, false);
                c5396qG.r(false);
                z2 = 0;
                f2 = f;
                interfaceC7079yP4 = interfaceC7079yP0B;
                c6245uN0 = c6245uN2;
                z = true;
                c5396qG2 = c5396qG;
                interfaceC7079yP3 = interfaceC7079yP12;
                obj3 = obj6;
                c = '\f';
            } else {
                interfaceC7079yP0 = interfaceC7079yP11;
                c1372Rp = c1372RpU;
                c5396qG.b0(997300973);
                AbstractC4968oB0.b(0, 0L, c5396qG, new C0982Mp(browserActivity, 0), R82.f(), null, Kc2.d(R.string.toolsui_browser_home, c5396qG), false);
                InterfaceC6866xN0 interfaceC6866xN0A4 = InterfaceC3617hf1.a();
                c5396qG.b0(2110389997);
                zG = c5396qG.g(interfaceC7079yP8) | c5396qG.g(c5306pp1B) | c5396qG.g(interfaceC7079yP0B) | c5396qG.g(interfaceC7079yP7);
                objQ = c5396qG.Q();
                if (zG) {
                    obj = obj6;
                    if (objQ == obj) {
                    }
                    c5396qG.r(false);
                    InterfaceC6866xN0 interfaceC6866xN0M5 = androidx.compose.foundation.layout.a.m(a.e(interfaceC6866xN0A4, false, null, (S40) objQ, 7), f, AbstractC5199pJ0.a);
                    c5180pDA = AbstractC4766nD.a(c3836ii2, c6122tm, c5396qG, 0);
                    i3 = c5396qG.P;
                    j11N2 = c5396qG.n();
                    interfaceC6866xN0E2 = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0M5);
                    if (z4) {
                        AbstractC2803di2.c();
                        throw null;
                    }
                    c5396qG.f0();
                    if (c5396qG.O) {
                        s40 = s42;
                        c5396qG.m(s40);
                    } else {
                        s40 = s42;
                        c5396qG.o0();
                    }
                    Ph2.d(c5396qG, bf4, c5180pDA);
                    Ph2.d(c5396qG, bf5, j11N2);
                    if (c5396qG.O) {
                        bf2 = bf6;
                        AbstractC7119yc.m(i3, c5396qG, i3, bf2);
                    } else {
                        bf2 = bf6;
                        AbstractC7119yc.m(i3, c5396qG, i3, bf2);
                    }
                    Ph2.d(c5396qG, bf, interfaceC6866xN0E2);
                    c5396qG.b0(1908025);
                    if (AbstractC1947Yy1.n(str)) {
                        strD = Kc2.d(R.string.toolsui_browser_address_hint, c5396qG);
                    } else {
                        strD = str;
                    }
                    c5396qG.r(false);
                    KG1 kg1K3 = C5987t70.K();
                    if (AbstractC1947Yy1.n(str)) {
                        j = Ig2.c().q;
                    } else {
                        j = Ig2.c().p;
                    }
                    s41 = s40;
                    bf3 = bf2;
                    obj2 = obj;
                    AbstractC6225uG1.b(strD, null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, kg1K3, c5396qG, 0, 3120, 55290);
                    c5396qG.b0(1921507);
                    if (!AbstractC1947Yy1.n(((XA0) interfaceC7079yP0B.getValue()).b)) {
                        AbstractC6225uG1.b(((XA0) interfaceC7079yP0B.getValue()).b, null, Ig2.c().q, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, C5987t70.e0(13.0f, 18.0f, N30.S, 0.0f), c5396qG, 0, 3120, 55290);
                    }
                    c5396qG.r(false);
                    c5396qG.r(true);
                    int size3 = browserActivity.i0.size();
                    c5396qG.b0(2110434124);
                    zG2 = c5396qG.g(interfaceC7079yP6);
                    objQ2 = c5396qG.Q();
                    if (zG2) {
                        objQ2 = new r(interfaceC7079yP6, 10);
                        c5396qG.l0(objQ2);
                    } else {
                        objQ2 = new r(interfaceC7079yP6, 10);
                        c5396qG.l0(objQ2);
                    }
                    c5396qG.r(false);
                    browserActivity.l(size3, (S40) objQ2, c5396qG, 512);
                    zj0E = AbstractC0200Co.e(C4797nN0.O, false);
                    i4 = c5396qG.P;
                    j11N3 = c5396qG.n();
                    interfaceC6866xN0E3 = AbstractC3009ei2.e(c5396qG, c6245uN2);
                    if (z4) {
                        AbstractC2803di2.c();
                        throw null;
                    }
                    c5396qG.f0();
                    if (c5396qG.O) {
                        c5396qG.m(s41);
                    } else {
                        c5396qG.o0();
                    }
                    Ph2.d(c5396qG, bf4, zj0E);
                    Ph2.d(c5396qG, bf5, j11N3);
                    if (c5396qG.O) {
                        AbstractC7119yc.m(i4, c5396qG, i4, bf3);
                    } else {
                        AbstractC7119yc.m(i4, c5396qG, i4, bf3);
                    }
                    Ph2.d(c5396qG, bf, interfaceC6866xN0E3);
                    c2177ah0B = Qh2.a;
                    if (c2177ah0B == null) {
                        C1970Zg0 c1970Zg2 = new C1970Zg0("Rounded.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = AbstractC4387lO1.a;
                        C3670hv1 c3670hv3 = new C3670hv1(UC.b);
                        C3721i90 c3721i90D3 = AbstractC1228Pt.d(12.0f, 8.0f);
                        c3721i90D3.f(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        c3721i90D3.o(-0.9f, -2.0f, -2.0f, -2.0f);
                        c3721i90D3.o(-2.0f, 0.9f, -2.0f, 2.0f);
                        c3721i90D3.o(0.9f, 2.0f, 2.0f, 2.0f);
                        c3721i90D3.c();
                        c3721i90D3.m(12.0f, 10.0f);
                        c3721i90D3.f(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c3721i90D3.o(0.9f, 2.0f, 2.0f, 2.0f);
                        c3721i90D3.o(2.0f, -0.9f, 2.0f, -2.0f);
                        c3721i90D3.o(-0.9f, -2.0f, -2.0f, -2.0f);
                        c3721i90D3.c();
                        c3721i90D3.m(12.0f, 16.0f);
                        c3721i90D3.f(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c3721i90D3.o(0.9f, 2.0f, 2.0f, 2.0f);
                        c3721i90D3.o(2.0f, -0.9f, 2.0f, -2.0f);
                        c3721i90D3.o(-0.9f, -2.0f, -2.0f, -2.0f);
                        c3721i90D3.c();
                        C1970Zg0.a(c1970Zg2, c3721i90D3.N, c3670hv3);
                        c2177ah0B = c1970Zg2.b();
                        Qh2.a = c2177ah0B;
                    }
                    String strD6 = Kc2.d(R.string.toolsui_browser_menu_more, c5396qG);
                    c5396qG.b0(1942859);
                    objQ3 = c5396qG.Q();
                    if (objQ3 == obj2) {
                        interfaceC7079yP1 = interfaceC7079yP10;
                        objQ3 = new r(interfaceC7079yP1, 11);
                        c5396qG.l0(objQ3);
                    } else {
                        interfaceC7079yP1 = interfaceC7079yP10;
                    }
                    c5396qG.r(false);
                    c6245uN0 = c6245uN2;
                    C2177ah0 c2177ah2 = c2177ah0B;
                    interfaceC7079yP2 = interfaceC7079yP1;
                    AbstractC4968oB0.b(384, 0L, c5396qG, (S40) objQ3, c2177ah2, null, strD6, false);
                    boolean zBooleanValue5 = ((Boolean) interfaceC7079yP2.getValue()).booleanValue();
                    c5396qG.b0(1946124);
                    objQ4 = c5396qG.Q();
                    if (objQ4 == obj2) {
                        objQ4 = new r(interfaceC7079yP2, 12);
                        c5396qG.l0(objQ4);
                    }
                    c5396qG.r(false);
                    f2 = f;
                    C3529hE c3529hEI3 = B81.i(-689598429, c5396qG, new C1138Op(browserActivity, c1372Rp, c5306pp1B, interfaceC7079yP2, interfaceC7079yP0, 0));
                    interfaceC7079yP3 = interfaceC7079yP12;
                    obj3 = obj2;
                    interfaceC7079yP4 = interfaceC7079yP0B;
                    C5396qG c5396qG7 = c5396qG;
                    c = '\f';
                    AbstractC2359bb.a(zBooleanValue5, (S40) objQ4, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, c3529hEI3, c5396qG, 48, 48);
                    z = true;
                    c5396qG7.r(true);
                    z2 = 0;
                    c5396qG7.r(false);
                    c5396qG2 = c5396qG7;
                } else {
                    obj = obj6;
                }
                objQ = new Z7(5, c5306pp1B, interfaceC7079yP0B, interfaceC7079yP8, interfaceC7079yP7, false);
                c5396qG.l0(objQ);
                c5396qG.r(false);
                InterfaceC6866xN0 interfaceC6866xN0M6 = androidx.compose.foundation.layout.a.m(a.e(interfaceC6866xN0A4, false, null, (S40) objQ, 7), f, AbstractC5199pJ0.a);
                c5180pDA = AbstractC4766nD.a(c3836ii2, c6122tm, c5396qG, 0);
                i3 = c5396qG.P;
                j11N2 = c5396qG.n();
                interfaceC6866xN0E2 = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0M6);
                if (z4) {
                    AbstractC2803di2.c();
                    throw null;
                }
                c5396qG.f0();
                if (c5396qG.O) {
                    s40 = s42;
                    c5396qG.m(s40);
                } else {
                    s40 = s42;
                    c5396qG.o0();
                }
                Ph2.d(c5396qG, bf4, c5180pDA);
                Ph2.d(c5396qG, bf5, j11N2);
                if (c5396qG.O) {
                    bf2 = bf6;
                    AbstractC7119yc.m(i3, c5396qG, i3, bf2);
                } else {
                    bf2 = bf6;
                    AbstractC7119yc.m(i3, c5396qG, i3, bf2);
                }
                Ph2.d(c5396qG, bf, interfaceC6866xN0E2);
                c5396qG.b0(1908025);
                if (AbstractC1947Yy1.n(str)) {
                    strD = Kc2.d(R.string.toolsui_browser_address_hint, c5396qG);
                } else {
                    strD = str;
                }
                c5396qG.r(false);
                KG1 kg1K4 = C5987t70.K();
                if (AbstractC1947Yy1.n(str)) {
                    j = Ig2.c().q;
                } else {
                    j = Ig2.c().p;
                }
                s41 = s40;
                bf3 = bf2;
                obj2 = obj;
                AbstractC6225uG1.b(strD, null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, kg1K4, c5396qG, 0, 3120, 55290);
                c5396qG.b0(1921507);
                if (!AbstractC1947Yy1.n(((XA0) interfaceC7079yP0B.getValue()).b)) {
                    AbstractC6225uG1.b(((XA0) interfaceC7079yP0B.getValue()).b, null, Ig2.c().q, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, C5987t70.e0(13.0f, 18.0f, N30.S, 0.0f), c5396qG, 0, 3120, 55290);
                }
                c5396qG.r(false);
                c5396qG.r(true);
                int size4 = browserActivity.i0.size();
                c5396qG.b0(2110434124);
                zG2 = c5396qG.g(interfaceC7079yP6);
                objQ2 = c5396qG.Q();
                if (zG2) {
                    objQ2 = new r(interfaceC7079yP6, 10);
                    c5396qG.l0(objQ2);
                } else {
                    objQ2 = new r(interfaceC7079yP6, 10);
                    c5396qG.l0(objQ2);
                }
                c5396qG.r(false);
                browserActivity.l(size4, (S40) objQ2, c5396qG, 512);
                zj0E = AbstractC0200Co.e(C4797nN0.O, false);
                i4 = c5396qG.P;
                j11N3 = c5396qG.n();
                interfaceC6866xN0E3 = AbstractC3009ei2.e(c5396qG, c6245uN2);
                if (z4) {
                    AbstractC2803di2.c();
                    throw null;
                }
                c5396qG.f0();
                if (c5396qG.O) {
                    c5396qG.m(s41);
                } else {
                    c5396qG.o0();
                }
                Ph2.d(c5396qG, bf4, zj0E);
                Ph2.d(c5396qG, bf5, j11N3);
                if (c5396qG.O) {
                    AbstractC7119yc.m(i4, c5396qG, i4, bf3);
                } else {
                    AbstractC7119yc.m(i4, c5396qG, i4, bf3);
                }
                Ph2.d(c5396qG, bf, interfaceC6866xN0E3);
                c2177ah0B = Qh2.a;
                if (c2177ah0B == null) {
                    C1970Zg0 c1970Zg3 = new C1970Zg0("Rounded.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = AbstractC4387lO1.a;
                    C3670hv1 c3670hv4 = new C3670hv1(UC.b);
                    C3721i90 c3721i90D4 = AbstractC1228Pt.d(12.0f, 8.0f);
                    c3721i90D4.f(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    c3721i90D4.o(-0.9f, -2.0f, -2.0f, -2.0f);
                    c3721i90D4.o(-2.0f, 0.9f, -2.0f, 2.0f);
                    c3721i90D4.o(0.9f, 2.0f, 2.0f, 2.0f);
                    c3721i90D4.c();
                    c3721i90D4.m(12.0f, 10.0f);
                    c3721i90D4.f(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    c3721i90D4.o(0.9f, 2.0f, 2.0f, 2.0f);
                    c3721i90D4.o(2.0f, -0.9f, 2.0f, -2.0f);
                    c3721i90D4.o(-0.9f, -2.0f, -2.0f, -2.0f);
                    c3721i90D4.c();
                    c3721i90D4.m(12.0f, 16.0f);
                    c3721i90D4.f(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    c3721i90D4.o(0.9f, 2.0f, 2.0f, 2.0f);
                    c3721i90D4.o(2.0f, -0.9f, 2.0f, -2.0f);
                    c3721i90D4.o(-0.9f, -2.0f, -2.0f, -2.0f);
                    c3721i90D4.c();
                    C1970Zg0.a(c1970Zg3, c3721i90D4.N, c3670hv4);
                    c2177ah0B = c1970Zg3.b();
                    Qh2.a = c2177ah0B;
                }
                String strD7 = Kc2.d(R.string.toolsui_browser_menu_more, c5396qG);
                c5396qG.b0(1942859);
                objQ3 = c5396qG.Q();
                if (objQ3 == obj2) {
                    interfaceC7079yP1 = interfaceC7079yP10;
                    objQ3 = new r(interfaceC7079yP1, 11);
                    c5396qG.l0(objQ3);
                } else {
                    interfaceC7079yP1 = interfaceC7079yP10;
                }
                c5396qG.r(false);
                c6245uN0 = c6245uN2;
                C2177ah0 c2177ah3 = c2177ah0B;
                interfaceC7079yP2 = interfaceC7079yP1;
                AbstractC4968oB0.b(384, 0L, c5396qG, (S40) objQ3, c2177ah3, null, strD7, false);
                boolean zBooleanValue6 = ((Boolean) interfaceC7079yP2.getValue()).booleanValue();
                c5396qG.b0(1946124);
                objQ4 = c5396qG.Q();
                if (objQ4 == obj2) {
                    objQ4 = new r(interfaceC7079yP2, 12);
                    c5396qG.l0(objQ4);
                }
                c5396qG.r(false);
                f2 = f;
                C3529hE c3529hEI4 = B81.i(-689598429, c5396qG, new C1138Op(browserActivity, c1372Rp, c5306pp1B, interfaceC7079yP2, interfaceC7079yP0, 0));
                interfaceC7079yP3 = interfaceC7079yP12;
                obj3 = obj2;
                interfaceC7079yP4 = interfaceC7079yP0B;
                C5396qG c5396qG8 = c5396qG;
                c = '\f';
                AbstractC2359bb.a(zBooleanValue6, (S40) objQ4, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, c3529hEI4, c5396qG, 48, 48);
                z = true;
                c5396qG8.r(true);
                z2 = 0;
                c5396qG8.r(false);
                c5396qG2 = c5396qG8;
            }
            if (((XA0) AbstractC7119yc.c(c5396qG2, z, -1817369580, interfaceC7079yP4)).c) {
                c5396qG2.b0(-1817366751);
                zG3 = c5396qG2.g(interfaceC7079yP4);
                objQ5 = c5396qG.Q();
                if (zG3) {
                    objQ5 = new C1216Pp(interfaceC7079yP4, z2);
                    c5396qG2.l0(objQ5);
                } else {
                    objQ5 = new C1216Pp(interfaceC7079yP4, z2);
                    c5396qG2.l0(objQ5);
                }
                c5396qG2.r(z2);
                c6245uN1 = c6245uN0;
                AbstractC7230z71.b((S40) objQ5, d.d(c6245uN1, 1.0f), Ig2.c().k, Ig2.c().j, 0, 0.0f, null, c5396qG, 48, 112);
            } else {
                c6245uN1 = c6245uN0;
            }
            c5396qG2.r(z2);
            ra0 = (RA0) interfaceC7079yP0B2.getValue();
            c5396qG2.b0(-1817357290);
            if (ra0 == null) {
                t40 = null;
            } else {
                if (ra0 instanceof QA0) {
                    c5396qG2.b0(2110508876);
                    c3479h01 = new C3479h01(Kc2.e(R.string.toolsui_browser_fill_yourself, new Object[]{((QA0) ra0).a}, c5396qG2), EnumC5316pt.O);
                    c5396qG2.r(z2);
                } else {
                    if (ra0 instanceof PA0) {
                        C5396qG c5396qG9 = c5396qG2;
                        c5396qG9.b0(2109549561);
                        c5396qG9.r(z2);
                        throw new OD();
                    }
                    c5396qG2.b0(2110514279);
                    c3479h01 = new C3479h01(Kc2.e(R.string.toolsui_browser_confirm, new Object[]{((PA0) ra0).a}, c5396qG2), EnumC5316pt.N);
                    c5396qG2.r(z2);
                }
                t40 = null;
                AbstractC7239z92.a((String) c3479h01.N, a.e(androidx.compose.foundation.layout.a.m(c6245uN1, AbstractC5199pJ0.d, f2), z2, null, C6164u.r0, 7), (EnumC5316pt) c3479h01.O, c5396qG, 0, 0);
            }
            c5396qG2.r(z2);
            c5396qG2.Z(-1817332622, c5396qG2.H(Long.valueOf(((Number) browserActivity.j0.getValue()).longValue()), Integer.valueOf(((Number) browserActivity.k0.getValue()).intValue())));
            c1372Rp2 = c1372Rp;
            if (c1372Rp2 != null) {
                obj4 = c1372Rp2.e;
            } else {
                obj4 = t40;
            }
            if (obj4 != null) {
                i5 = new I(obj4, c);
                interfaceC6866xN0D = d.d(c6245uN1, 1.0f);
                if (1.0f > 0.0d) {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
                androidx.compose.ui.viewinterop.a.a(i5, interfaceC6866xN0D.j(new LayoutWeightElement(AbstractC6383v22.d(1.0f, Float.MAX_VALUE), z)), t40, c5396qG2, z2);
            }
            c5396qG2.r(z2);
            c5396qG2.r(z2);
            c5396qG3 = c5396qG2;
            z3 = z2;
        }
        c5396qG3.r(z);
        c5396qG3.b0(1569603884);
        if (((Boolean) interfaceC7079yP0.getValue()).booleanValue()) {
            long j4 = Ig2.c().h;
            c5396qG3.b0(1569605267);
            objQ10 = c5396qG.Q();
            if (objQ10 == obj3) {
                interfaceC7079yP5 = interfaceC7079yP0;
                objQ10 = new r(interfaceC7079yP5, 13);
                c5396qG3.l0(objQ10);
            } else {
                interfaceC7079yP5 = interfaceC7079yP0;
            }
            c5396qG3.r(z3);
            int i13 = 4;
            Ca2.a((S40) objQ10, B81.i(933831401, c5396qG3, new C5143p3(interfaceC7079yP5, i13)), null, null, null, AbstractC6838xE.c, B81.i(-140314364, c5396qG3, new C6193u7(browserActivity, interfaceC7079yP5, interfaceC7079yP3, i13)), null, j4, 0L, 0L, 0L, 0.0f, null, c5396qG, 1769526, 0, 16028);
        }
        c5396qG3.r(z3);
        if (((Boolean) interfaceC7079yP3.getValue()).booleanValue()) {
            long j5 = Ig2.c().h;
            c5396qG3.b0(1569644053);
            objQ9 = c5396qG.Q();
            if (objQ9 == obj3) {
                objQ9 = new r(interfaceC7079yP3, 15);
                c5396qG3.l0(objQ9);
            }
            c5396qG3.r(z3);
            int i14 = 5;
            Ca2.a((S40) objQ9, B81.i(1459532768, c5396qG3, new C5783s8(i14, browserActivity, interfaceC7079yP3)), null, B81.i(874761118, c5396qG3, new C5143p3(interfaceC7079yP3, i14)), null, null, AbstractC6838xE.f, null, j5, 0L, 0L, 0L, 0.0f, null, c5396qG, 1575990, 0, 16052);
        }
        y81V = c5396qG.v();
        if (y81V != null) {
            y81V.d = new Z4(browserActivity, i, 1);
        }
    }

    public static final void p(InterfaceC7079yP0 interfaceC7079yP0, boolean z) {
        interfaceC7079yP0.setValue(Boolean.valueOf(z));
    }

    public static void s(C1372Rp c1372Rp) {
        WebView webView = c1372Rp.e;
        if (webView == null) {
            return;
        }
        c1372Rp.e = null;
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        try {
            webView.stopLoading();
            webView.destroy();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(C6447vL1.h(context));
    }

    public final void l(int i, S40 s40, C5396qG c5396qG, int i2) {
        int i3;
        c5396qG.d0(1656866147);
        if ((i2 & 14) == 0) {
            i3 = i2 | (c5396qG.e(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= c5396qG.i(s40) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && c5396qG.F()) {
            c5396qG.V();
        } else {
            String strE = Kc2.e(R.string.toolsui_browser_tabs, new Object[]{String.valueOf(i)}, c5396qG);
            C6245uN0 c6245uN0 = C6245uN0.b;
            InterfaceC6866xN0 interfaceC6866xN0E = a.e(d.l(c6245uN0, 48), false, null, s40, 7);
            c5396qG.b0(1389009927);
            boolean zG = c5396qG.g(strE);
            Object objQ = c5396qG.Q();
            if (zG || objQ == C4361lG.a) {
                objQ = new C5576r8(strE, 2);
                c5396qG.l0(objQ);
            }
            c5396qG.r(false);
            InterfaceC6866xN0 interfaceC6866xN0A = AbstractC6532vk1.a(interfaceC6866xN0E, false, (T40) objQ);
            C6536vm c6536vm = C4797nN0.S;
            ZJ0 zj0E = AbstractC0200Co.e(c6536vm, false);
            int i4 = c5396qG.P;
            J11 j11N = c5396qG.n();
            InterfaceC6866xN0 interfaceC6866xN0E2 = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0A);
            InterfaceC3535hG.f.getClass();
            S40 s41 = C3328gG.b;
            boolean z = c5396qG.a instanceof InterfaceC1186Pf;
            if (!z) {
                AbstractC2803di2.c();
                throw null;
            }
            c5396qG.f0();
            if (c5396qG.O) {
                c5396qG.m(s41);
            } else {
                c5396qG.o0();
            }
            BF bf = C3328gG.f;
            Ph2.d(c5396qG, bf, zj0E);
            BF bf2 = C3328gG.e;
            Ph2.d(c5396qG, bf2, j11N);
            BF bf3 = C3328gG.g;
            if (c5396qG.O || !AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i4))) {
                AbstractC7119yc.m(i4, c5396qG, i4, bf3);
            }
            BF bf4 = C3328gG.d;
            Ph2.d(c5396qG, bf4, interfaceC6866xN0E2);
            C1108Of c1108Of = C1108Of.a;
            c1108Of.a();
            InterfaceC6866xN0 interfaceC6866xN0B = Gd2.b(d.l(c6245uN0, 24), 2, C1108Of.c().p, AbstractC1731We1.b(6));
            ZJ0 zj0E2 = AbstractC0200Co.e(c6536vm, false);
            int i5 = c5396qG.P;
            J11 j11N2 = c5396qG.n();
            InterfaceC6866xN0 interfaceC6866xN0E3 = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0B);
            if (!z) {
                AbstractC2803di2.c();
                throw null;
            }
            c5396qG.f0();
            if (c5396qG.O) {
                c5396qG.m(s41);
            } else {
                c5396qG.o0();
            }
            Ph2.d(c5396qG, bf, zj0E2);
            Ph2.d(c5396qG, bf2, j11N2);
            if (c5396qG.O || !AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i5))) {
                AbstractC7119yc.m(i5, c5396qG, i5, bf3);
            }
            Ph2.d(c5396qG, bf4, interfaceC6866xN0E3);
            String strValueOf = String.valueOf(i);
            KG1 kg1E0 = C5987t70.e0(13.0f, 18.0f, N30.S, 0.0f);
            c1108Of.a();
            AbstractC6225uG1.b(strValueOf, null, C1108Of.c().p, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, kg1E0, c5396qG, 0, 0, 65530);
            c5396qG.r(true);
            c5396qG.r(true);
        }
        Y81 y81V = c5396qG.v();
        if (y81V != null) {
            y81V.d = new C0659Il(this, i, s40, i2, 1);
        }
    }

    public final void m(S40 s40, C5396qG c5396qG, int i) {
        c5396qG.d0(-1182230976);
        C6245uN0 c6245uN0 = C6245uN0.b;
        FillElement fillElement = d.c;
        C5180pD c5180pDA = AbstractC4766nD.a(AbstractC1966Zf.c, C4797nN0.a0, c5396qG, 0);
        int i2 = c5396qG.P;
        J11 j11N = c5396qG.n();
        InterfaceC6866xN0 interfaceC6866xN0E = AbstractC3009ei2.e(c5396qG, fillElement);
        InterfaceC3535hG.f.getClass();
        C5882sd0 c5882sd0 = C3328gG.b;
        boolean z = c5396qG.a instanceof InterfaceC1186Pf;
        if (!z) {
            AbstractC2803di2.c();
            throw null;
        }
        c5396qG.f0();
        if (c5396qG.O) {
            c5396qG.m(c5882sd0);
        } else {
            c5396qG.o0();
        }
        BF bf = C3328gG.f;
        Ph2.d(c5396qG, bf, c5180pDA);
        BF bf2 = C3328gG.e;
        Ph2.d(c5396qG, bf2, j11N);
        BF bf3 = C3328gG.g;
        if (c5396qG.O || !AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i2))) {
            AbstractC7119yc.m(i2, c5396qG, i2, bf3);
        }
        BF bf4 = C3328gG.d;
        Ph2.d(c5396qG, bf4, interfaceC6866xN0E);
        InterfaceC6866xN0 interfaceC6866xN0D = d.d(c6245uN0, 1.0f);
        float f = AbstractC5199pJ0.b;
        InterfaceC6866xN0 interfaceC6866xN0M = androidx.compose.foundation.layout.a.m(interfaceC6866xN0D, f, f);
        C3410gf1 c3410gf1B = AbstractC3203ff1.b(AbstractC1966Zf.a, C4797nN0.Y, c5396qG, 48);
        int i3 = c5396qG.P;
        J11 j11N2 = c5396qG.n();
        InterfaceC6866xN0 interfaceC6866xN0E2 = AbstractC3009ei2.e(c5396qG, interfaceC6866xN0M);
        if (!z) {
            AbstractC2803di2.c();
            throw null;
        }
        c5396qG.f0();
        if (c5396qG.O) {
            c5396qG.m(c5882sd0);
        } else {
            c5396qG.o0();
        }
        Ph2.d(c5396qG, bf, c3410gf1B);
        Ph2.d(c5396qG, bf2, j11N2);
        if (c5396qG.O || !AbstractC5669rb2.d(c5396qG.Q(), Integer.valueOf(i3))) {
            AbstractC7119yc.m(i3, c5396qG, i3, bf3);
        }
        Ph2.d(c5396qG, bf4, interfaceC6866xN0E2);
        AbstractC4968oB0.b((i << 6) & 896, 0L, c5396qG, s40, Ng2.h(), null, Kc2.d(R.string.toolsui_browser_edit_cancel, c5396qG), false);
        String strE = Kc2.e(R.string.toolsui_browser_tabs, new Object[]{String.valueOf(size())}, c5396qG);
        KG1 kg1K = C5987t70.K();
        C1108Of.a.a();
        AbstractC6225uG1.b(strE, androidx.compose.foundation.layout.a.n(InterfaceC3617hf1.a(), f, 0.0f, 2), C1108Of.c().p, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, kg1K, c5396qG, 0, 0, 65528);
        AbstractC4968oB0.b(0, 0L, c5396qG, new C1450Sp(this, s40, 0), Ng2.t(), null, Kc2.d(R.string.toolsui_browser_close_all, c5396qG), false);
        AbstractC4968oB0.b(0, 0L, c5396qG, new C1450Sp(this, s40, 1), Ng2.e(), null, Kc2.d(R.string.toolsui_browser_new_tab, c5396qG), false);
        c5396qG.r(true);
        float f2 = AbstractC5199pJ0.d;
        AbstractC6708wc2.a(fillElement, null, new RZ0(f2, f, f2, f), false, null, null, null, false, new B1(18, this, s40), c5396qG, 6, 250);
        c5396qG.r(true);
        Y81 y81V = c5396qG.v();
        if (y81V != null) {
            y81V.d = new C2860e1((Object) this, (V40) s40, i, 5);
        }
    }

    @Override // defpackage.ZD, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Object c1572Ud1;
        C3032eq c3032eq;
        C1372Rp c1372Rp;
        int i = 1;
        super.onCreate(bundle);
        C4347lB0 c4347lB0 = C4347lB0.a;
        String stringExtra = C4347lB0.f;
        C4347lB0.f = null;
        if (stringExtra != null) {
            str = stringExtra;
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                stringExtra = intent.getStringExtra("com.getmaya.android.browser.URL");
                str = stringExtra;
            } else {
                str = null;
            }
        }
        C0939Ma1 c0939Ma1 = AbstractC3239fq.a;
        String string = ((SharedPreferences) getValue()).getString("tabs", null);
        C4610mU c4610mU = C4610mU.N;
        try {
            if (string == null) {
                c3032eq = new C3032eq(0, c4610mU);
            } else {
                c1572Ud1 = new JSONObject(string);
                if (c1572Ud1 instanceof C1572Ud1) {
                    c1572Ud1 = null;
                }
                JSONObject jSONObject = (JSONObject) c1572Ud1;
                if (jSONObject == null) {
                    c3032eq = new C3032eq(0, c4610mU);
                } else {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tabs");
                    if (jSONArrayOptJSONArray == null) {
                        jSONArrayOptJSONArray = new JSONArray();
                    }
                    int iOptInt = jSONObject.optInt("active", 0);
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    int size = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("url");
                            if (AbstractC3239fq.a(strOptString) && arrayList.size() < 10) {
                                if (i2 == iOptInt) {
                                    size = arrayList.size();
                                }
                                arrayList.add(new C2825dq(strOptString, jSONObjectOptJSONObject.optString("title"), jSONObjectOptJSONObject.optBoolean("desktop", false)));
                            }
                        }
                    }
                    c3032eq = new C3032eq(arrayList.isEmpty() ? 0 : AbstractC6383v22.h(size, 0, OC.f(arrayList)), arrayList);
                }
            }
        } catch (Throwable th) {
            c1572Ud1 = new C1572Ud1(th);
        }
        for (C2825dq c2825dq : c3032eq.a) {
            add(new C1372Rp(this, c2825dq.a, c2825dq.b, c2825dq.c));
        }
        if (str != null) {
            while (size() >= 10) {
                remove(0);
            }
            c1372Rp = new C1372Rp(this, str, "", false);
            add(c1372Rp);
        } else {
            c1372Rp = (C1372Rp) NC.I(c3032eq.b, this.i0);
            if (c1372Rp == null) {
                c1372Rp = new C1372Rp(this, "https://www.google.com/", "", false);
                add(c1372Rp);
            }
        }
        try {
            x(c1372Rp);
            C4347lB0 c4347lB1 = C4347lB0.a;
            C4347lB0.e = new WeakReference(this);
            C4347lB0.g = null;
            Ci2.a(a(), this, new I(this, 13));
            AbstractC2082aE.a(this, new C3529hE(-1842303602, new C1684Vp(this, i), true));
        } catch (Exception e) {
            C4347lB0 c4347lB2 = C4347lB0.a;
            String simpleName = e.getClass().getSimpleName();
            C4347lB0.g = simpleName;
            File file = L5.a;
            L5.c("WEB screen failed: ".concat(simpleName));
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        this.l0 = false;
        C4347lB0 c4347lB0 = C4347lB0.a;
        WeakReference weakReference = C4347lB0.e;
        if ((weakReference != null ? (TA0) weakReference.get() : null) == this) {
            C4347lB0.e = null;
            C4347lB0.h = null;
            C4347lB0.d.i(null);
            C1320Qx1 c1320Qx1 = C4347lB0.b;
            XA0 xa0 = new XA0(0, 31, (String) null, (String) null, false);
            c1320Qx1.getClass();
            c1320Qx1.j(null, xa0);
        }
        ValueCallback valueCallback = this.m0;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.m0 = null;
        CookieManager.getInstance().flush();
        ListIterator listIterator = listIterator();
        while (true) {
            D90 d90 = (D90) listIterator;
            if (!d90.hasNext()) {
                super.onDestroy();
                return;
            }
            s((C1372Rp) d90.next());
        }
    }

    @Override // defpackage.ZD, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        C4347lB0 c4347lB0 = C4347lB0.a;
        String stringExtra = C4347lB0.f;
        C4347lB0.f = null;
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("com.getmaya.android.browser.URL");
        }
        if (stringExtra != null) {
            w(stringExtra);
        }
    }

    @Override // android.app.Activity
    public final void onPause() throws JSONException {
        int size = 0;
        this.l0 = false;
        CookieManager.getInstance().flush();
        ArrayList<C2825dq> arrayList = new ArrayList();
        ListIterator listIterator = listIterator();
        while (true) {
            D90 d90 = (D90) listIterator;
            if (!d90.hasNext()) {
                break;
            }
            C1372Rp c1372Rp = (C1372Rp) d90.next();
            C0939Ma1 c0939Ma1 = AbstractC3239fq.a;
            if (AbstractC3239fq.a(c1372Rp.b())) {
                if (v(c1372Rp)) {
                    size = arrayList.size();
                }
                arrayList.add(new C2825dq(c1372Rp.b(), (String) c1372Rp.c.getValue(), c1372Rp.a()));
            }
        }
        SharedPreferences.Editor editorEdit = ((SharedPreferences) getValue()).edit();
        C0939Ma1 c0939Ma2 = AbstractC3239fq.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("active", size);
        JSONArray jSONArray = new JSONArray();
        for (C2825dq c2825dq : arrayList) {
            jSONArray.put(new JSONObject().put("url", c2825dq.a).put("title", c2825dq.b).put("desktop", c2825dq.c));
        }
        jSONObject.put("tabs", jSONArray);
        editorEdit.putString("tabs", jSONObject.toString()).apply();
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        WebView webView;
        super.onResume();
        this.l0 = true;
        C1372Rp c1372RpU = u();
        if (c1372RpU == null || (webView = c1372RpU.e) == null) {
            return;
        }
        webView.onResume();
    }

    public final void q(String str, boolean z) {
        Object next;
        C1074Nt1 c1074Nt1 = this.i0;
        if (c1074Nt1.size() >= 10) {
            if (!z) {
                Toast.makeText(this, Fh2.d(this, R.string.toolsui_browser_tabs_full, new Object[0]), 1).show();
                return;
            }
            ListIterator listIterator = c1074Nt1.listIterator();
            do {
                D90 d90 = (D90) listIterator;
                if (!d90.hasNext()) {
                    next = null;
                    break;
                }
                next = d90.next();
            } while (!(!v((C1372Rp) next)));
            C1372Rp c1372Rp = (C1372Rp) next;
            if (c1372Rp != null) {
                c1074Nt1.remove(c1372Rp);
                s(c1372Rp);
            }
        }
        C1372Rp c1372Rp2 = new C1372Rp(this, str, "", false);
        c1074Nt1.add(c1372Rp2);
        x(c1372Rp2);
    }

    public final WebView t(C1372Rp c1372Rp) {
        final WebView webView = c1372Rp.e;
        if (webView == null) {
            webView = new WebView(this);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setMediaPlaybackRequiresUserGesture(true);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setMixedContentMode(1);
            webView.setImportantForAutofill(1);
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(webView, true);
            webView.setWebViewClient(new C0671Ip(this, c1372Rp));
            webView.setWebChromeClient(new C0593Hp(this, c1372Rp));
            webView.addJavascriptInterface(new C2206aq(getApplicationContext()), "MayaDownloads");
            webView.setDownloadListener(new DownloadListener() { // from class: Gp
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:16:0x004b  */
                /* JADX WARN: Code restructure failed: missing block: B:100:0x01b5, code lost:
                
                    if (r5 == false) goto L102;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:101:0x01b7, code lost:
                
                    r2.setDestinationInExternalPublicDir(android.os.Environment.DIRECTORY_DOWNLOADS, r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:102:0x01bd, code lost:
                
                    r2.setDestinationInExternalFilesDir(r10, android.os.Environment.DIRECTORY_DOWNLOADS, r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:103:0x01c2, code lost:
                
                    r5 = ((android.app.DownloadManager) r10.getSystemService("download")).enqueue(r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:105:0x01cd, code lost:
                
                    r2 = defpackage.L5.a;
                    defpackage.L5.c("WEB download refused: ".concat(r0.getClass().getSimpleName()));
                    r5 = -1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x0148, code lost:
                
                    if (r5.equals("https") != false) goto L124;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
                
                    if (r5.equals("http") == false) goto L65;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0152, code lost:
                
                    r5 = true;
                    r2 = new android.app.DownloadManager.Request(android.net.Uri.parse(r17)).setTitle(r12).setNotificationVisibility(1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x0164, code lost:
                
                    if (r13 == null) goto L77;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x0166, code lost:
                
                    r2.setMimeType(r13);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:75:0x016a, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:77:0x016c, code lost:
                
                    r7 = android.webkit.CookieManager.getInstance().getCookie(r17);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:0x0176, code lost:
                
                    if (r7 == null) goto L80;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:79:0x0178, code lost:
                
                    r2.addRequestHeader("Cookie", r7);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:0x017d, code lost:
                
                    if (r18 == null) goto L85;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:82:0x0183, code lost:
                
                    if (defpackage.AbstractC1947Yy1.n(r18) == false) goto L84;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:84:0x0186, code lost:
                
                    r2.addRequestHeader("User-Agent", r18);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:85:0x018b, code lost:
                
                    r0 = r6.getUrl();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:86:0x018f, code lost:
                
                    if (r0 == null) goto L95;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:87:0x0191, code lost:
                
                    r7 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:88:0x0198, code lost:
                
                    if (defpackage.AbstractC1947Yy1.r(r0, "https://", false) != false) goto L93;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x01a0, code lost:
                
                    if (defpackage.AbstractC1947Yy1.r(r0, "http://", false) == false) goto L92;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x01a3, code lost:
                
                    r0 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x01a4, code lost:
                
                    if (r0 == null) goto L96;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x01a6, code lost:
                
                    r2.addRequestHeader("Referer", r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:95:0x01ac, code lost:
                
                    r7 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:97:0x01b1, code lost:
                
                    if (android.os.Build.VERSION.SDK_INT < 29) goto L99;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:99:0x01b4, code lost:
                
                    r5 = r7;
                 */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // android.webkit.DownloadListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onDownloadStart(final java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, long r21) {
                    /*
                        Method dump skipped, instruction units count: 674
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C0515Gp.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
                }
            });
            c1372Rp.e = webView;
            C5960t01 c5960t01 = this.k0;
            c5960t01.setValue(Integer.valueOf(((Number) c5960t01.getValue()).intValue() + 1));
            if (c1372Rp.a()) {
                WebSettings settings2 = webView.getSettings();
                C0939Ma1 c0939Ma1 = AbstractC3239fq.a;
                settings2.setUserAgentString(AbstractC1947Yy1.q(AbstractC3239fq.a.g(webView.getSettings().getUserAgentString(), "(X11; Linux x86_64)"), " Mobile", "", false));
            }
            webView.loadUrl(c1372Rp.b());
        }
        return webView;
    }

    public final C1372Rp u() {
        Object next;
        ListIterator listIterator = listIterator();
        do {
            D90 d90 = (D90) listIterator;
            if (!d90.hasNext()) {
                next = null;
                break;
            }
            next = d90.next();
        } while (((C1372Rp) next).a != ((Number) getValue()).longValue());
        return (C1372Rp) next;
    }

    public final boolean v(C1372Rp c1372Rp) {
        return c1372Rp.a == ((Number) getValue()).longValue();
    }

    public final void w(String str) {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        C1372Rp c1372RpU = u();
        boolean z = false;
        if (c1372RpU != null) {
            WebView webView = c1372RpU.e;
            if (((webView == null || (webBackForwardListCopyBackForwardList = webView.copyBackForwardList()) == null) ? 0 : webBackForwardListCopyBackForwardList.getSize()) <= 1) {
                Set set = HU1.a;
                if (AbstractC1947Yy1.r(HU1.a(c1372RpU.b()), "google.", false)) {
                    z = true;
                }
            }
        }
        if (c1372RpU == null || !z) {
            q(str, true);
        } else {
            t(c1372RpU).loadUrl(str);
            c1372RpU.b.setValue(str);
        }
    }

    public final void x(C1372Rp c1372Rp) {
        WebView webView;
        WebView webViewT = t(c1372Rp);
        C1372Rp c1372RpU = u();
        if (c1372RpU != null) {
            if (c1372RpU == c1372Rp) {
                c1372RpU = null;
            }
            if (c1372RpU != null && (webView = c1372RpU.e) != null) {
                webView.onPause();
            }
        }
        setValue(Long.valueOf(c1372Rp.a));
        webViewT.onResume();
        C4347lB0 c4347lB0 = C4347lB0.a;
        String strB = c1372Rp.b();
        String str = (String) c1372Rp.c.getValue();
        boolean z = c1372Rp.f;
        int i = c1372Rp.g;
        C4347lB0.h = null;
        C4347lB0.d.i(null);
        C1320Qx1 c1320Qx1 = C4347lB0.b;
        XA0 xa0 = new XA0(i, 16, strB, str, z);
        c1320Qx1.getClass();
        c1320Qx1.j(null, xa0);
    }
}
