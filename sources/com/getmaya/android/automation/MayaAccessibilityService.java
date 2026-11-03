package com.getmaya.android.automation;

import android.R;
import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import defpackage.AbstractC1323Qy1;
import defpackage.AbstractC1947Yy1;
import defpackage.AbstractC2100aK;
import defpackage.AbstractC2183ai2;
import defpackage.AbstractC4046jj2;
import defpackage.AbstractC4238kg;
import defpackage.AbstractC4862ng2;
import defpackage.AbstractC5669rb2;
import defpackage.AbstractC6083tb2;
import defpackage.AbstractC6403v72;
import defpackage.AbstractC7004y22;
import defpackage.AbstractC7119yc;
import defpackage.AbstractC7338zf;
import defpackage.BD1;
import defpackage.C0729Ji0;
import defpackage.C0927Lw1;
import defpackage.C1572Ud1;
import defpackage.C1815Xg1;
import defpackage.C1868Xy0;
import defpackage.C1885Ye;
import defpackage.C1890Yf1;
import defpackage.C1946Yy0;
import defpackage.C2024Zy0;
import defpackage.C2234az0;
import defpackage.C2595ci1;
import defpackage.C2853dz0;
import defpackage.C3050ew;
import defpackage.C3267fz0;
import defpackage.C3464gw;
import defpackage.C3474gz0;
import defpackage.C3479h01;
import defpackage.C3837ij;
import defpackage.C3886iz0;
import defpackage.C4093jz0;
import defpackage.C4213kZ1;
import defpackage.C4266ko;
import defpackage.C4420lZ1;
import defpackage.C4507lz0;
import defpackage.C4610mU;
import defpackage.C4714mz0;
import defpackage.C5044oa1;
import defpackage.C5128oz0;
import defpackage.C5882sd0;
import defpackage.C6078ta1;
import defpackage.C6570vx0;
import defpackage.C6699wa1;
import defpackage.C7113ya1;
import defpackage.FD;
import defpackage.L5;
import defpackage.Md2;
import defpackage.NC;
import defpackage.OC;
import defpackage.OK;
import defpackage.PC;
import defpackage.RunnableC6837xD1;
import defpackage.RunnableC7044yD1;
import defpackage.S40;
import defpackage.T40;
import defpackage.Wd2;
import defpackage.YB1;
import defpackage.ZJ;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/getmaya/android/automation/MayaAccessibilityService;", "Landroid/accessibilityservice/AccessibilityService;", "<init>", "()V", "Xy0", "Yy0", "Zy0", "az0", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MayaAccessibilityService extends AccessibilityService {
    public static volatile MayaAccessibilityService R;
    public static volatile String S;
    public static final CopyOnWriteArrayList T = new CopyOnWriteArrayList();
    public final YB1 N = new YB1(C5882sd0.s0);
    public final YB1 O = new YB1(new C1885Ye(this, 2));
    public final C3267fz0 P = new C3267fz0(0);
    public volatile boolean Q;

    public static String A(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean zRefresh;
        String string;
        String string2;
        if (accessibilityNodeInfo == null) {
            return null;
        }
        try {
            zRefresh = accessibilityNodeInfo.refresh();
        } catch (Exception unused) {
            zRefresh = false;
        }
        if (!zRefresh) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append('|');
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append('|');
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append('|');
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append('|');
        CharSequence text = accessibilityNodeInfo.getText();
        if (text == null || (string2 = text.toString()) == null || (string = AbstractC1323Qy1.l0(string2).toString()) == null) {
            string = "-";
        }
        sb.append(string);
        return sb.toString();
    }

    public static final void E(C7113ya1 c7113ya1, StringBuilder sb, CharSequence charSequence) {
        String string;
        String string2 = (charSequence == null || (string = charSequence.toString()) == null) ? null : AbstractC1323Qy1.l0(string).toString();
        if (string2 == null) {
            string2 = "";
        }
        if (string2.length() == 0 || string2.equals(c7113ya1.N)) {
            return;
        }
        c7113ya1.N = string2;
        sb.append(string2);
        sb.append('\n');
    }

    public static final void F(C6699wa1 c6699wa1, MayaAccessibilityService mayaAccessibilityService, C6699wa1 c6699wa2, C7113ya1 c7113ya1, StringBuilder sb, AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return;
        }
        c6699wa1.N++;
        if (mayaAccessibilityService.w(accessibilityNodeInfo)) {
            c6699wa2.N++;
            CharSequence text = accessibilityNodeInfo.getText();
            E(c7113ya1, sb, (text == null || text.length() == 0) ? accessibilityNodeInfo.getContentDescription() : accessibilityNodeInfo.getText());
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            F(c6699wa1, mayaAccessibilityService, c6699wa2, c7113ya1, sb, accessibilityNodeInfo.getChild(i));
        }
    }

    public static final void K(C6699wa1 c6699wa1, MayaAccessibilityService mayaAccessibilityService, StringBuilder sb, AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        String string2;
        if (accessibilityNodeInfo != null && c6699wa1.N <= 400) {
            CharSequence text = accessibilityNodeInfo.getText();
            String string3 = null;
            String string4 = (text == null || (string2 = text.toString()) == null) ? null : AbstractC1323Qy1.l0(string2).toString();
            if (string4 == null) {
                string4 = "";
            }
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            if (contentDescription != null && (string = contentDescription.toString()) != null) {
                string3 = AbstractC1323Qy1.l0(string).toString();
            }
            String str = string3 != null ? string3 : "";
            if ((string4.length() > 0 || str.length() > 0) && mayaAccessibilityService.w(accessibilityNodeInfo)) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                sb.append(string4);
                sb.append('|');
                sb.append(str);
                sb.append('|');
                sb.append(rect.left);
                sb.append(',');
                sb.append(rect.top);
                sb.append(';');
                c6699wa1.N++;
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i = 0; i < childCount; i++) {
                K(c6699wa1, mayaAccessibilityService, sb, accessibilityNodeInfo.getChild(i));
            }
        }
    }

    public static Object L(MayaAccessibilityService mayaAccessibilityService, AbstractC2100aK abstractC2100aK) {
        mayaAccessibilityService.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        C3050ew c3050ew = new C3050ew(1, AbstractC6083tb2.g(abstractC2100aK));
        c3050ew.x();
        try {
            mayaAccessibilityService.takeScreenshot(0, (ExecutorService) mayaAccessibilityService.N.getValue(), new C3474gz0(c3050ew, 70));
        } catch (Exception unused) {
            if (c3050ew.c()) {
                c3050ew.k(null);
            }
        }
        return c3050ew.w();
    }

    public static boolean O(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        if (accessibilityNodeInfo == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", str);
        accessibilityNodeInfo.performAction(1);
        return accessibilityNodeInfo.performAction(2097152, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:20:0x0065). Please report as a decompilation issue!!! */
    public static final Object T(long j, MayaAccessibilityService mayaAccessibilityService, String str, AccessibilityNodeInfo accessibilityNodeInfo, String str2, ZJ zj) throws Throwable {
        C4714mz0 c4714mz0;
        long jCurrentTimeMillis;
        if (zj instanceof C4714mz0) {
            c4714mz0 = (C4714mz0) zj;
            int i = c4714mz0.W;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4714mz0.W = i - Integer.MIN_VALUE;
            } else {
                c4714mz0 = new C4714mz0(zj);
            }
        } else {
            c4714mz0 = new C4714mz0(zj);
        }
        Object obj = c4714mz0.V;
        OK ok = OK.N;
        int i2 = c4714mz0.W;
        if (i2 == 0) {
            AbstractC6403v72.e(obj);
            jCurrentTimeMillis = System.currentTimeMillis() + j;
            if (System.currentTimeMillis() < jCurrentTimeMillis) {
                return Boolean.FALSE;
            }
            c4714mz0.Q = mayaAccessibilityService;
            c4714mz0.R = str;
            c4714mz0.S = accessibilityNodeInfo;
            c4714mz0.T = str2;
            c4714mz0.U = jCurrentTimeMillis;
            c4714mz0.W = 1;
            if (AbstractC4046jj2.c(120L, c4714mz0) == ok) {
                return ok;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = c4714mz0.U;
            String str3 = c4714mz0.T;
            AccessibilityNodeInfo accessibilityNodeInfo2 = c4714mz0.S;
            String str4 = c4714mz0.R;
            MayaAccessibilityService mayaAccessibilityService2 = c4714mz0.Q;
            AbstractC6403v72.e(obj);
            str2 = str3;
            mayaAccessibilityService = mayaAccessibilityService2;
            accessibilityNodeInfo = accessibilityNodeInfo2;
            str = str4;
        }
        if (mayaAccessibilityService.J().equals(str)) {
            return Boolean.TRUE;
        }
        String strA = A(accessibilityNodeInfo);
        if (strA != null || !strA.equals(str2)) {
            return Boolean.TRUE;
        }
        if (System.currentTimeMillis() < jCurrentTimeMillis) {
            return Boolean.FALSE;
        }
        c4714mz0.Q = mayaAccessibilityService;
        c4714mz0.R = str;
        c4714mz0.S = accessibilityNodeInfo;
        c4714mz0.T = str2;
        c4714mz0.U = jCurrentTimeMillis;
        c4714mz0.W = 1;
        if (AbstractC4046jj2.c(120L, c4714mz0) == ok) {
            return ok;
        }
        if (mayaAccessibilityService.J().equals(str)) {
            return Boolean.TRUE;
        }
        String strA2 = A(accessibilityNodeInfo);
        if (strA2 != null) {
        }
        return Boolean.TRUE;
    }

    public static boolean V(String str, String str2, boolean z) {
        int i;
        int length;
        String strD = AbstractC4862ng2.d(str2);
        if (strD.length() == 0) {
            return true;
        }
        String strD2 = AbstractC4862ng2.d(str);
        if (z) {
            if (strD2.equals(strD)) {
                return true;
            }
            if (str.length() > 0 && str.codePointCount(0, str.length()) == str2.codePointCount(0, str2.length())) {
                return true;
            }
        } else if (strD2.length() != 0) {
            if (strD2.equals(strD) || AbstractC1323Qy1.u(strD2, strD, false)) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < strD2.length(); i2++) {
                char cCharAt = strD2.charAt(i2);
                if (cCharAt != ' ') {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < strD.length(); i3++) {
                char cCharAt2 = strD.charAt(i3);
                if (cCharAt2 != ' ') {
                    sb2.append(cCharAt2);
                }
            }
            String string2 = sb2.toString();
            if (string2.length() > 0 && AbstractC1323Qy1.u(string, string2, false)) {
                return true;
            }
            int length2 = str2.length();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= length2) {
                    if (i5 < 4) {
                        break;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    int length3 = strD2.length();
                    for (int i6 = 0; i6 < length3; i6++) {
                        char cCharAt3 = strD2.charAt(i6);
                        if (Character.isDigit(cCharAt3)) {
                            sb3.append(cCharAt3);
                        }
                    }
                    String string3 = sb3.toString();
                    StringBuilder sb4 = new StringBuilder();
                    int length4 = strD.length();
                    for (int i7 = 0; i7 < length4; i7++) {
                        char cCharAt4 = strD.charAt(i7);
                        if (Character.isDigit(cCharAt4)) {
                            sb4.append(cCharAt4);
                        }
                    }
                    String string4 = sb4.toString();
                    if (string4.length() <= 0 || !AbstractC1323Qy1.u(string3, string4, false)) {
                        break;
                        break;
                    }
                    return true;
                }
                char cCharAt5 = str2.charAt(i4);
                if (!Character.isDigit(cCharAt5)) {
                    if (cCharAt5 != ' ' && cCharAt5 != '+' && cCharAt5 != '-' && cCharAt5 != '(' && cCharAt5 != ')' && cCharAt5 != '.') {
                        break;
                    }
                } else {
                    i5++;
                }
                i4++;
            }
            if (strD2.length() >= ((double) strD.length()) * 0.9d) {
                if (strD2.length() > 2000 || strD.length() > 2000) {
                    int iMin = Math.min(strD2.length(), strD.length());
                    ArrayList<C3479h01> arrayList = new ArrayList(iMin);
                    for (int i8 = 0; i8 < iMin; i8++) {
                        arrayList.add(new C3479h01(Character.valueOf(strD2.charAt(i8)), Character.valueOf(strD.charAt(i8))));
                    }
                    if (arrayList.isEmpty()) {
                        i = 0;
                    } else {
                        i = 0;
                        for (C3479h01 c3479h01 : arrayList) {
                            if (((Character) c3479h01.N).charValue() == ((Character) c3479h01.O).charValue() && (i = i + 1) < 0) {
                                OC.n();
                                throw null;
                            }
                        }
                    }
                    if (i >= ((double) strD.length()) * 0.9d) {
                        return true;
                    }
                } else {
                    int iMax = Math.max(strD2.length(), strD.length());
                    if (strD2.length() == 0) {
                        length = strD.length();
                    } else if (strD.length() == 0) {
                        length = strD2.length();
                    } else {
                        int length5 = strD.length() + 1;
                        int[] iArr = new int[length5];
                        for (int i9 = 0; i9 < length5; i9++) {
                            iArr[i9] = i9;
                        }
                        int[] iArr2 = new int[strD.length() + 1];
                        int length6 = strD2.length();
                        if (1 <= length6) {
                            int i10 = 1;
                            while (true) {
                                iArr2[0] = i10;
                                int length7 = strD.length();
                                if (1 <= length7) {
                                    int i11 = 1;
                                    while (true) {
                                        int i12 = i11 - 1;
                                        iArr2[i11] = Math.min(iArr2[i12] + 1, Math.min(iArr[i11] + 1, iArr[i12] + (strD2.charAt(i10 + (-1)) == strD.charAt(i12) ? 0 : 1)));
                                        if (i11 == length7) {
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                                AbstractC4238kg.l(0, 0, 14, iArr2, iArr);
                                if (i10 == length6) {
                                    break;
                                }
                                i10++;
                            }
                        }
                        length = iArr[strD.length()];
                    }
                    if (1.0d - (((double) length) / ((double) iMax)) >= 0.9d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean a(MayaAccessibilityService mayaAccessibilityService, AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence contentDescription;
        mayaAccessibilityService.getClass();
        CharSequence text = accessibilityNodeInfo.getText();
        return ((text == null || AbstractC1947Yy1.n(text)) && ((contentDescription = accessibilityNodeInfo.getContentDescription()) == null || AbstractC1947Yy1.n(contentDescription))) ? false : true;
    }

    public static Rect d(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        return rect;
    }

    public static C4266ko e(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return null;
        }
        return new C4266ko(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final void j(T40 t40, ArrayList arrayList, AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return;
        }
        if (((Boolean) t40.l(accessibilityNodeInfo)).booleanValue()) {
            arrayList.add(accessibilityNodeInfo);
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            j(t40, arrayList, accessibilityNodeInfo.getChild(i));
        }
    }

    public static final void p(C7113ya1 c7113ya1, String str, MayaAccessibilityService mayaAccessibilityService, C7113ya1 c7113ya2, C7113ya1 c7113ya3, C7113ya1 c7113ya4, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean zEqualsIgnoreCase;
        String string;
        if (accessibilityNodeInfo != null && c7113ya1.N == null) {
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            String string2 = (contentDescription == null || (string = contentDescription.toString()) == null) ? null : AbstractC1323Qy1.l0(string).toString();
            if (string2 != null && ((zEqualsIgnoreCase = string2.equalsIgnoreCase(str)) || AbstractC1323Qy1.u(string2, str, true))) {
                boolean zW = mayaAccessibilityService.w(accessibilityNodeInfo);
                if (zEqualsIgnoreCase && zW) {
                    c7113ya1.N = accessibilityNodeInfo;
                    return;
                }
                if (zEqualsIgnoreCase) {
                    if (c7113ya2.N == null) {
                        c7113ya2.N = accessibilityNodeInfo;
                    }
                } else if (zW) {
                    if (c7113ya3.N == null) {
                        c7113ya3.N = accessibilityNodeInfo;
                    }
                } else if (c7113ya4.N == null) {
                    c7113ya4.N = accessibilityNodeInfo;
                }
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i = 0; i < childCount; i++) {
                p(c7113ya1, str, mayaAccessibilityService, c7113ya2, c7113ya3, c7113ya4, accessibilityNodeInfo.getChild(i));
            }
        }
    }

    public static String t(AccessibilityNodeInfo accessibilityNodeInfo) {
        String viewIdResourceName;
        String string;
        if (accessibilityNodeInfo == null || (viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName()) == null || (string = AbstractC1323Qy1.l0(AbstractC1323Qy1.d0(viewIdResourceName, '/', viewIdResourceName)).toString()) == null || string.length() <= 0 || string.equals("0")) {
            return null;
        }
        return string;
    }

    public static boolean u(AccessibilityNodeInfo accessibilityNodeInfo) {
        Object c1572Ud1;
        if (accessibilityNodeInfo == null || Build.VERSION.SDK_INT < 30) {
            return false;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        if (!v(accessibilityNodeInfo, accessibilityAction)) {
            try {
                accessibilityNodeInfo.performAction(1);
            } catch (Throwable unused) {
            }
            if (!v(accessibilityNodeInfo, accessibilityAction)) {
                return false;
            }
        }
        try {
            c1572Ud1 = Boolean.valueOf(accessibilityNodeInfo.performAction(accessibilityAction.getId()));
        } catch (Throwable th) {
            c1572Ud1 = new C1572Ud1(th);
        }
        Object obj = Boolean.FALSE;
        if (c1572Ud1 instanceof C1572Ud1) {
            c1572Ud1 = obj;
        }
        return ((Boolean) c1572Ud1).booleanValue();
    }

    public static final boolean v(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo.AccessibilityAction accessibilityAction) {
        Object c1572Ud1;
        try {
            accessibilityNodeInfo.refresh();
            List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
            boolean z = false;
            if (!actionList.isEmpty()) {
                Iterator<T> it = actionList.iterator();
                while (it.hasNext()) {
                    if (((AccessibilityNodeInfo.AccessibilityAction) it.next()).getId() == accessibilityAction.getId()) {
                        z = true;
                        break;
                    }
                }
            }
            c1572Ud1 = Boolean.valueOf(z);
        } catch (Throwable th) {
            c1572Ud1 = new C1572Ud1(th);
        }
        Object obj = Boolean.FALSE;
        if (c1572Ud1 instanceof C1572Ud1) {
            c1572Ud1 = obj;
        }
        return ((Boolean) c1572Ud1).booleanValue();
    }

    public static String y(AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        String string2;
        String string3;
        String string4;
        if (accessibilityNodeInfo == null) {
            return "(no label)";
        }
        CharSequence text = accessibilityNodeInfo.getText();
        String str = null;
        if (text != null && (string3 = text.toString()) != null && (string4 = AbstractC1323Qy1.l0(string3).toString()) != null) {
            if (string4.length() == 0) {
                string4 = null;
            }
            if (string4 != null) {
                return string4;
            }
        }
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription != null && (string = contentDescription.toString()) != null && (string2 = AbstractC1323Qy1.l0(string).toString()) != null && string2.length() != 0) {
            str = string2;
        }
        return str == null ? "(no label)" : str;
    }

    public final List B(List list) {
        if (list == null) {
            return C4610mU.N;
        }
        if (list.size() <= 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (w((AccessibilityNodeInfo) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.isEmpty() ? list : arrayList;
    }

    public final ArrayList C(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (AccessibilityNodeInfo accessibilityNodeInfo : i(new C0729Ji0(this, 1))) {
            if (!z || w(accessibilityNodeInfo)) {
                C3464gw c3464gwF = f(accessibilityNodeInfo, arrayList.size());
                if (c3464gwF != null) {
                    arrayList.add(new C1868Xy0(accessibilityNodeInfo, c3464gwF));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(PC.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C1868Xy0) it.next()).b);
        }
        List listH = Md2.h(str, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listH.iterator();
        while (it2.hasNext()) {
            C1868Xy0 c1868Xy0 = (C1868Xy0) NC.I(((C1815Xg1) it2.next()).a.a, arrayList);
            if (c1868Xy0 != null) {
                arrayList3.add(c1868Xy0);
            }
        }
        return arrayList3;
    }

    public final C1946Yy0 D() {
        StringBuilder sb = new StringBuilder();
        C6699wa1 c6699wa1 = new C6699wa1();
        C6699wa1 c6699wa2 = new C6699wa1();
        C7113ya1 c7113ya1 = new C7113ya1();
        c7113ya1.N = "";
        F(c6699wa2, this, c6699wa1, c7113ya1, sb, getRootInActiveWindow());
        return new C1946Yy0(AbstractC7119yc.h(sb), c6699wa1.N, c6699wa2.N);
    }

    public final boolean G(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        boolean zRefresh;
        AccessibilityNodeInfo accessibilityNodeInfoR;
        if (accessibilityNodeInfo != null) {
            try {
                zRefresh = accessibilityNodeInfo.refresh();
            } catch (Exception unused) {
                zRefresh = false;
            }
            if (zRefresh) {
                CharSequence text = accessibilityNodeInfo.getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                if (V(string, str, accessibilityNodeInfo.isPassword())) {
                    return true;
                }
            }
        }
        try {
            AccessibilityNodeInfo rootInActiveWindow = getRootInActiveWindow();
            if (rootInActiveWindow == null || (accessibilityNodeInfoR = rootInActiveWindow.findFocus(1)) == null || !accessibilityNodeInfoR.isEditable()) {
                accessibilityNodeInfoR = null;
            }
        } catch (Exception unused2) {
        }
        if (accessibilityNodeInfoR == null) {
            accessibilityNodeInfoR = r();
        }
        if (accessibilityNodeInfoR == null) {
            return false;
        }
        CharSequence text2 = accessibilityNodeInfoR.getText();
        String string2 = text2 != null ? text2.toString() : null;
        return V(string2 != null ? string2 : "", str, accessibilityNodeInfoR.isPassword());
    }

    public final String H() {
        CharSequence packageName;
        try {
            AccessibilityNodeInfo rootInActiveWindow = getRootInActiveWindow();
            if (rootInActiveWindow == null || (packageName = rootInActiveWindow.getPackageName()) == null) {
                return null;
            }
            return packageName.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public final C4266ko I() {
        Point pointB = AbstractC7004y22.b(this);
        return new C4266ko(0, 0, pointB.x, pointB.y);
    }

    public final String J() {
        StringBuilder sb = new StringBuilder();
        K(new C6699wa1(), this, sb, getRootInActiveWindow());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:186:0x032e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0360  */
    /* JADX WARN: Code duplicated, block: B:232:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:240:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:241:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:244:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:246:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:248:0x03fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:250:0x040d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x040f  */
    /* JADX WARN: Code duplicated, block: B:252:0x041e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0420  */
    /* JADX WARN: Code duplicated, block: B:254:0x042f  */
    /* JADX WARN: Code duplicated, block: B:256:0x043f  */
    /* JADX WARN: Code duplicated, block: B:258:0x0455 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:259:0x0456  */
    /* JADX WARN: Code duplicated, block: B:262:0x045f  */
    /* JADX WARN: Code duplicated, block: B:263:0x0461  */
    /* JADX WARN: Code duplicated, block: B:264:0x0462 A[PHI: r5 r7 r10
      0x0462: PHI (r5v30 java.lang.String) = (r5v28 java.lang.String), (r5v33 java.lang.String) binds: [B:255:0x043d, B:263:0x0461] A[DONT_GENERATE, DONT_INLINE]
      0x0462: PHI (r7v21 int) = (r7v19 int), (r7v23 int) binds: [B:255:0x043d, B:263:0x0461] A[DONT_GENERATE, DONT_INLINE]
      0x0462: PHI (r10v20 int) = (r10v18 int), (r10v21 int) binds: [B:255:0x043d, B:263:0x0461] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:267:0x0468  */
    /* JADX WARN: Code duplicated, block: B:268:0x046a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v8, types: [Ud1] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public final Object M(boolean z, boolean z2, Float f, ZJ zj) throws Throwable {
        C3886iz0 c3886iz0;
        C4266ko c4266koI;
        int i;
        Object next;
        C2595ci1 c2595ci1;
        C2234az0 c2234az0;
        String strT;
        String strJ;
        int i2;
        int i3;
        MayaAccessibilityService mayaAccessibilityService;
        Float f2;
        Object c1572Ud1;
        String str;
        AccessibilityNodeInfo accessibilityNodeInfo;
        String string;
        Object next2;
        C4266ko c4266koE;
        ?? c1572Ud2;
        Object c1572Ud3;
        int i4;
        float fD;
        float fE;
        float fFloatValue;
        float fG;
        float f3;
        long j;
        long j2;
        boolean zQ;
        String str2;
        C2595ci1 c2595ci2;
        C4266ko c4266ko;
        int i5;
        int i6;
        boolean z3 = z;
        boolean z4 = z2;
        int i7 = 1;
        if (zj instanceof C3886iz0) {
            c3886iz0 = (C3886iz0) zj;
            int i8 = c3886iz0.a0;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3886iz0.a0 = i8 - Integer.MIN_VALUE;
            } else {
                c3886iz0 = new C3886iz0(this, zj);
            }
        } else {
            c3886iz0 = new C3886iz0(this, zj);
        }
        Object objC = c3886iz0.Y;
        OK ok = OK.N;
        int i9 = c3886iz0.a0;
        if (i9 != 0) {
            if (i9 == 1) {
                boolean z5 = c3886iz0.X;
                boolean z6 = c3886iz0.W;
                str = c3886iz0.V;
                String str3 = c3886iz0.U;
                c2234az0 = c3886iz0.T;
                c4266koI = c3886iz0.S;
                f2 = c3886iz0.R;
                mayaAccessibilityService = (MayaAccessibilityService) c3886iz0.Q;
                AbstractC6403v72.e(objC);
                i3 = 1;
                strT = str3;
                i = 0;
                z4 = z5;
                z3 = z6;
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) c3886iz0.Q;
                AbstractC6403v72.e(objC);
                i3 = 1;
                i = 0;
            }
            if (((Boolean) objC).booleanValue()) {
                i5 = i3;
            } else {
                strT = str2;
                str2 = strT;
                i5 = i;
            }
            if (i5 != 0) {
                i6 = i3;
            } else {
                i6 = 3;
            }
            return new C2024Zy0("swipe", i6, str2);
        }
        AbstractC6403v72.e(objC);
        c4266koI = I();
        C4266ko c4266koI2 = I();
        ArrayList arrayList = new ArrayList();
        Iterator it = i(C6570vx0.a0).iterator();
        while (it.hasNext()) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = (AccessibilityNodeInfo) it.next();
            if (w(accessibilityNodeInfo2) && (c4266koE = e(accessibilityNodeInfo2)) != null) {
                C4266ko c4266koA = c4266koE.a(c4266koI2);
                try {
                    List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo2.getActionList();
                    c1572Ud2 = new ArrayList(PC.p(actionList, 10));
                    Iterator it2 = actionList.iterator();
                    while (it2.hasNext()) {
                        c1572Ud2.add(Integer.valueOf(((AccessibilityNodeInfo.AccessibilityAction) it2.next()).getId()));
                    }
                } catch (Throwable th) {
                    c1572Ud2 = new C1572Ud1(th);
                }
                C4610mU c4610mU = C4610mU.N;
                boolean z7 = c1572Ud2 instanceof C1572Ud1;
                ?? r15 = c1572Ud2;
                if (z7) {
                    r15 = c4610mU;
                }
                List list = (List) r15;
                try {
                    c1572Ud3 = accessibilityNodeInfo2.getCollectionInfo();
                } catch (Throwable th2) {
                    c1572Ud3 = new C1572Ud1(th2);
                }
                if (c1572Ud3 instanceof C1572Ud1) {
                    c1572Ud3 = null;
                }
                AccessibilityNodeInfo.CollectionInfo collectionInfo = (AccessibilityNodeInfo.CollectionInfo) c1572Ud3;
                int i10 = (list.contains(Integer.valueOf(R.id.accessibilityActionScrollUp)) || list.contains(Integer.valueOf(R.id.accessibilityActionScrollDown))) ? i7 : 0;
                int i11 = (list.contains(Integer.valueOf(R.id.accessibilityActionScrollLeft)) || list.contains(Integer.valueOf(R.id.accessibilityActionScrollRight))) ? i7 : 0;
                int rowCount = collectionInfo != null ? collectionInfo.getRowCount() : 0;
                int columnCount = collectionInfo != null ? collectionInfo.getColumnCount() : 0;
                CharSequence className = accessibilityNodeInfo2.getClassName();
                String string2 = className != null ? className.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                String str4 = string2;
                if (i10 != 0 && i11 == 0) {
                    i4 = i7;
                } else if (i11 != 0 && i10 == 0) {
                    i4 = 2;
                } else if (rowCount > i7 && columnCount <= i7) {
                    i4 = i7;
                } else if (columnCount > i7 && rowCount <= i7) {
                    i4 = 2;
                } else if (rowCount <= i7 || columnCount <= i7) {
                    if (AbstractC1947Yy1.l(str4, "HorizontalScrollView", false) || AbstractC1947Yy1.l(str4, "ViewPager", false)) {
                        i4 = 2;
                    } else if (AbstractC1947Yy1.l(str4, "ScrollView", false) || AbstractC1947Yy1.l(str4, "ListView", false)) {
                        i4 = i7;
                    } else {
                        i4 = 3;
                    }
                } else if (rowCount >= columnCount) {
                    i4 = i7;
                } else {
                    i4 = 2;
                }
                arrayList.add(new C2234az0(accessibilityNodeInfo2, new C2595ci1(arrayList.size(), c4266koA, i4, list.contains(4096) || list.contains(Integer.valueOf(R.id.accessibilityActionScrollDown)) || list.contains(Integer.valueOf(R.id.accessibilityActionScrollRight)), list.contains(8192) || list.contains(Integer.valueOf(R.id.accessibilityActionScrollUp)) || list.contains(Integer.valueOf(R.id.accessibilityActionScrollLeft)))));
                c4266koI2 = c4266koI2;
                it = it;
                i7 = 1;
            }
        }
        ArrayList arrayList2 = new ArrayList(PC.p(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C2234az0) it3.next()).b);
        }
        int i12 = z4 ? 2 : 1;
        int i13 = z4 ? 1 : 2;
        long jC = (long) (c4266koI.c() * 0.08d);
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            C2595ci1 c2595ci3 = (C2595ci1) next3;
            Iterator it5 = it4;
            if (c2595ci3.c != i13) {
                C4266ko c4266ko2 = c2595ci3.b;
                if (!c4266ko2.i() && c4266ko2.c() >= jC) {
                    arrayList3.add(next3);
                }
            }
            it4 = it5;
        }
        if (arrayList3.isEmpty()) {
            c2595ci1 = null;
            i = 0;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                if (((C2595ci1) obj).c == i12) {
                    arrayList4.add(obj);
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList3 = arrayList4;
            }
            if (z4) {
                i = 0;
                c2595ci1 = (C2595ci1) NC.S(arrayList3, AbstractC2183ai2.b(C1890Yf1.o0, C1890Yf1.p0));
            } else {
                i = 0;
                FD fdB = AbstractC2183ai2.b(C1890Yf1.q0, C1890Yf1.r0);
                Iterator it6 = arrayList3.iterator();
                if (it6.hasNext()) {
                    next = it6.next();
                    while (it6.hasNext()) {
                        Object next4 = it6.next();
                        if (fdB.compare(next, next4) > 0) {
                            next = next4;
                        }
                    }
                } else {
                    next = null;
                }
                c2595ci1 = (C2595ci1) next;
            }
        }
        if (c2595ci1 != null) {
            Iterator it7 = arrayList.iterator();
            do {
                if (!it7.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it7.next();
            } while (((C2234az0) next2).b != c2595ci1);
            c2234az0 = (C2234az0) next2;
        } else {
            c2234az0 = null;
        }
        if (c2234az0 == null || (accessibilityNodeInfo = c2234az0.a) == null) {
            strT = "screen";
        } else {
            strT = t(accessibilityNodeInfo);
            if (strT == null) {
                CharSequence className2 = accessibilityNodeInfo.getClassName();
                strT = (className2 == null || (string = className2.toString()) == null) ? null : AbstractC1323Qy1.d0(string, '.', string);
            }
            if (strT == null) {
                strT = "screen";
            }
        }
        if (c2234az0 != null) {
            C2595ci1 c2595ci4 = c2234az0.b;
            boolean z8 = c2595ci4.e;
            boolean z9 = c2595ci4.d;
            if (!z3 ? !(z8 || !z9) : !(z9 || !z8)) {
                return new C2024Zy0("none", 2, strT);
            }
        }
        strJ = J();
        if (c2234az0 == null) {
            i2 = i;
        } else if (c2234az0.b.c == (z4 ? 2 : 1)) {
            i2 = 1;
        } else {
            i2 = i;
        }
        if (c2234az0 != null && i2 != 0 && f == null) {
            try {
                c1572Ud1 = Boolean.valueOf(c2234az0.a.performAction(z3 ? 4096 : 8192));
            } catch (Throwable th3) {
                c1572Ud1 = new C1572Ud1(th3);
            }
            Object obj2 = Boolean.FALSE;
            if (c1572Ud1 instanceof C1572Ud1) {
                c1572Ud1 = obj2;
            }
            if (((Boolean) c1572Ud1).booleanValue()) {
                c3886iz0.Q = this;
                c3886iz0.R = f;
                c3886iz0.S = c4266koI;
                c3886iz0.T = c2234az0;
                c3886iz0.U = strT;
                c3886iz0.V = strJ;
                c3886iz0.W = z3;
                c3886iz0.X = z4;
                i3 = 1;
                c3886iz0.a0 = 1;
                objC = c(strJ, c3886iz0);
                if (objC == ok) {
                    return ok;
                }
                mayaAccessibilityService = this;
                f2 = f;
                str = strJ;
            }
            if (c2234az0 != null && (c2595ci2 = c2234az0.b) != null && (c4266ko = c2595ci2.b) != null) {
                c4266koI = c4266ko;
            }
            fD = c4266koI.d();
            fE = c4266koI.e();
            if (f2 != null) {
                fFloatValue = f2.floatValue() / 2.0f;
            } else {
                fFloatValue = 0.22f;
            }
            fG = c4266koI.g() * fFloatValue;
            f3 = c4266koI.f() * fFloatValue;
            if (f2 != null) {
                j = 600;
            } else {
                j = 300;
            }
            j2 = j;
            if (z4 && z3) {
                zQ = mayaAccessibilityService.Q(fD, fE + f3, fD, fE - f3, j2);
            } else if (!z4) {
                zQ = mayaAccessibilityService.Q(fD, fE - f3, fD, fE + f3, j2);
            } else if (z3) {
                zQ = mayaAccessibilityService.Q(fD + fG, fE, fD - fG, fE, j2);
            } else {
                zQ = mayaAccessibilityService.Q(fD - fG, fE, fD + fG, fE, j2);
            }
            if (zQ) {
                c3886iz0.Q = strT;
                c3886iz0.R = null;
                c3886iz0.S = null;
                c3886iz0.T = null;
                c3886iz0.U = null;
                c3886iz0.V = null;
                c3886iz0.a0 = 2;
                objC = mayaAccessibilityService.c(strJ, c3886iz0);
                if (objC == ok) {
                    return ok;
                }
                str2 = strT;
                if (((Boolean) objC).booleanValue()) {
                    i5 = i3;
                } else {
                    strT = str2;
                    str2 = strT;
                    i5 = i;
                }
            } else {
                str2 = strT;
                i5 = i;
            }
            if (i5 != 0) {
                i6 = i3;
            } else {
                i6 = 3;
            }
            return new C2024Zy0("swipe", i6, str2);
        }
        i3 = 1;
        mayaAccessibilityService = this;
        f2 = f;
        if (c2234az0 != null) {
            c4266koI = c4266ko;
        }
        fD = c4266koI.d();
        fE = c4266koI.e();
        if (f2 != null) {
            fFloatValue = f2.floatValue() / 2.0f;
        } else {
            fFloatValue = 0.22f;
        }
        fG = c4266koI.g() * fFloatValue;
        f3 = c4266koI.f() * fFloatValue;
        if (f2 != null) {
            j = 600;
        } else {
            j = 300;
        }
        j2 = j;
        if (z4) {
            if (!z4) {
                zQ = mayaAccessibilityService.Q(fD, fE - f3, fD, fE + f3, j2);
            } else if (z3) {
                zQ = mayaAccessibilityService.Q(fD + fG, fE, fD - fG, fE, j2);
            } else {
                zQ = mayaAccessibilityService.Q(fD - fG, fE, fD + fG, fE, j2);
            }
        } else if (!z4) {
            zQ = mayaAccessibilityService.Q(fD, fE - f3, fD, fE + f3, j2);
        } else if (z3) {
            zQ = mayaAccessibilityService.Q(fD + fG, fE, fD - fG, fE, j2);
        } else {
            zQ = mayaAccessibilityService.Q(fD - fG, fE, fD + fG, fE, j2);
        }
        if (zQ) {
            c3886iz0.Q = strT;
            c3886iz0.R = null;
            c3886iz0.S = null;
            c3886iz0.T = null;
            c3886iz0.U = null;
            c3886iz0.V = null;
            c3886iz0.a0 = 2;
            objC = mayaAccessibilityService.c(strJ, c3886iz0);
            if (objC == ok) {
                return ok;
            }
            str2 = strT;
            if (((Boolean) objC).booleanValue()) {
                i5 = i3;
            } else {
                strT = str2;
                str2 = strT;
                i5 = i;
            }
        } else {
            str2 = strT;
            i5 = i;
        }
        if (i5 != 0) {
            i6 = i3;
        } else {
            i6 = 3;
        }
        return new C2024Zy0("swipe", i6, str2);
        if (((Boolean) objC).booleanValue()) {
            return new C2024Zy0("action", i3, strT);
        }
        strJ = str;
        if (c2234az0 != null) {
            c4266koI = c4266ko;
        }
        fD = c4266koI.d();
        fE = c4266koI.e();
        if (f2 != null) {
            fFloatValue = f2.floatValue() / 2.0f;
        } else {
            fFloatValue = 0.22f;
        }
        fG = c4266koI.g() * fFloatValue;
        f3 = c4266koI.f() * fFloatValue;
        if (f2 != null) {
            j = 600;
        } else {
            j = 300;
        }
        j2 = j;
        if (z4) {
            if (!z4) {
                zQ = mayaAccessibilityService.Q(fD, fE - f3, fD, fE + f3, j2);
            } else if (z3) {
                zQ = mayaAccessibilityService.Q(fD + fG, fE, fD - fG, fE, j2);
            } else {
                zQ = mayaAccessibilityService.Q(fD - fG, fE, fD + fG, fE, j2);
            }
        } else if (!z4) {
            zQ = mayaAccessibilityService.Q(fD, fE - f3, fD, fE + f3, j2);
        } else if (z3) {
            zQ = mayaAccessibilityService.Q(fD + fG, fE, fD - fG, fE, j2);
        } else {
            zQ = mayaAccessibilityService.Q(fD - fG, fE, fD + fG, fE, j2);
        }
        if (zQ) {
            c3886iz0.Q = strT;
            c3886iz0.R = null;
            c3886iz0.S = null;
            c3886iz0.T = null;
            c3886iz0.U = null;
            c3886iz0.V = null;
            c3886iz0.a0 = 2;
            objC = mayaAccessibilityService.c(strJ, c3886iz0);
            if (objC == ok) {
                return ok;
            }
            str2 = strT;
            if (((Boolean) objC).booleanValue()) {
                i5 = i3;
            } else {
                strT = str2;
                str2 = strT;
                i5 = i;
            }
        } else {
            str2 = strT;
            i5 = i;
        }
        if (i5 != 0) {
            i6 = i3;
        } else {
            i6 = 3;
        }
        return new C2024Zy0("swipe", i6, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(boolean z, ZJ zj) throws Throwable {
        C4093jz0 c4093jz0;
        if (zj instanceof C4093jz0) {
            c4093jz0 = (C4093jz0) zj;
            int i = c4093jz0.S;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4093jz0.S = i - Integer.MIN_VALUE;
            } else {
                c4093jz0 = new C4093jz0(this, zj);
            }
        } else {
            c4093jz0 = new C4093jz0(this, zj);
        }
        Object objM = c4093jz0.Q;
        Object obj = OK.N;
        int i2 = c4093jz0.S;
        if (i2 == 0) {
            AbstractC6403v72.e(objM);
            c4093jz0.S = 1;
            objM = M(z, false, null, c4093jz0);
            if (objM == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6403v72.e(objM);
        }
        return Boolean.valueOf(((C2024Zy0) objM).a == 1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005c -> B:32:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0073 -> B:31:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object P(android.view.accessibility.AccessibilityNodeInfo r11, java.lang.String r12, defpackage.ZJ r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.C4300kz0
            if (r0 == 0) goto L13
            r0 = r13
            kz0 r0 = (defpackage.C4300kz0) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            kz0 r0 = new kz0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.V
            OK r1 = defpackage.OK.N
            int r2 = r0.X
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.AbstractC6403v72.e(r13)
            goto Lad
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            int r11 = r0.U
            int r12 = r0.T
            java.lang.String r2 = r0.S
            android.view.accessibility.AccessibilityNodeInfo r5 = r0.R
            com.getmaya.android.automation.MayaAccessibilityService r6 = r0.Q
            defpackage.AbstractC6403v72.e(r13)
            goto L78
        L41:
            defpackage.AbstractC6403v72.e(r13)
            if (r11 != 0) goto L49
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L49:
            boolean r13 = O(r11, r12)
            if (r13 != 0) goto L52
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L52:
            r13 = 4
            r2 = 0
            r6 = r10
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r9
        L5a:
            if (r11 >= r13) goto Lb0
            if (r11 <= 0) goto L7d
            r2.Q = r6
            r2.R = r12
            r2.S = r0
            r2.T = r13
            r2.U = r11
            r2.X = r4
            r7 = 150(0x96, double:7.4E-322)
            java.lang.Object r5 = defpackage.AbstractC4046jj2.c(r7, r2)
            if (r5 != r1) goto L73
            return r1
        L73:
            r5 = r12
            r12 = r13
            r9 = r2
            r2 = r0
            r0 = r9
        L78:
            r13 = r12
            r12 = r5
            r9 = r2
            r2 = r0
            r0 = r9
        L7d:
            r12.refresh()
            java.lang.CharSequence r5 = r12.getText()
            r7 = 0
            if (r5 == 0) goto L8c
            java.lang.String r5 = r5.toString()
            goto L8d
        L8c:
            r5 = r7
        L8d:
            if (r5 != 0) goto L91
            java.lang.String r5 = ""
        L91:
            boolean r8 = r12.isPassword()
            r6.getClass()
            boolean r5 = V(r5, r0, r8)
            if (r5 == 0) goto Lae
            r2.Q = r7
            r2.R = r7
            r2.S = r7
            r2.X = r3
            java.lang.Object r13 = r6.s(r12, r0, r2)
            if (r13 != r1) goto Lad
            return r1
        Lad:
            return r13
        Lae:
            int r11 = r11 + r4
            goto L5a
        Lb0:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getmaya.android.automation.MayaAccessibilityService.P(android.view.accessibility.AccessibilityNodeInfo, java.lang.String, ZJ):java.lang.Object");
    }

    public final boolean Q(float f, float f2, float f3, float f4, long j) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, j)).build(), null, null);
    }

    public final boolean R(float f, float f2) {
        Path path = new Path();
        path.moveTo(f, f2);
        boolean zDispatchGesture = dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, 60L)).build(), null, null);
        if (zDispatchGesture) {
            BD1 bd1 = (BD1) getValue();
            if (C3837ij.W) {
                bd1.b.post(new RunnableC7044yD1(bd1, f, f2));
            } else {
                bd1.getClass();
            }
        }
        return zDispatchGesture;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object S(AccessibilityNodeInfo accessibilityNodeInfo, long j, ZJ zj) throws Throwable {
        C4507lz0 c4507lz0;
        String strJ;
        long j2;
        MayaAccessibilityService mayaAccessibilityService;
        boolean z;
        String str;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        if (zj instanceof C4507lz0) {
            c4507lz0 = (C4507lz0) zj;
            int i = c4507lz0.Y;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4507lz0.Y = i - Integer.MIN_VALUE;
            } else {
                c4507lz0 = new C4507lz0(this, zj);
            }
        } else {
            c4507lz0 = new C4507lz0(this, zj);
        }
        C4507lz0 c4507lz1 = c4507lz0;
        Object objT = c4507lz1.W;
        OK ok = OK.N;
        int i2 = c4507lz1.Y;
        if (i2 != 0) {
            if (i2 == 1) {
                z = c4507lz1.V;
                j2 = c4507lz1.U;
                String str2 = c4507lz1.T;
                String str3 = c4507lz1.S;
                AccessibilityNodeInfo accessibilityNodeInfo3 = c4507lz1.R;
                MayaAccessibilityService mayaAccessibilityService2 = c4507lz1.Q;
                AbstractC6403v72.e(objT);
                str = str2;
                strJ = str3;
                accessibilityNodeInfo2 = accessibilityNodeInfo3;
                mayaAccessibilityService = mayaAccessibilityService2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6403v72.e(objT);
            }
        }
        AbstractC6403v72.e(objT);
        if (accessibilityNodeInfo == null) {
            return Boolean.FALSE;
        }
        strJ = J();
        String strA = A(accessibilityNodeInfo);
        boolean zG = g(accessibilityNodeInfo);
        if (!zG && !U(accessibilityNodeInfo)) {
            return Boolean.FALSE;
        }
        c4507lz1.Q = this;
        c4507lz1.R = accessibilityNodeInfo;
        c4507lz1.S = strJ;
        c4507lz1.T = strA;
        c4507lz1.U = j;
        c4507lz1.V = zG;
        c4507lz1.Y = 1;
        objT = T(j, this, strJ, accessibilityNodeInfo, strA, c4507lz1);
        if (objT == ok) {
            return ok;
        }
        j2 = j;
        mayaAccessibilityService = this;
        z = zG;
        str = strA;
        accessibilityNodeInfo2 = accessibilityNodeInfo;
        if (((Boolean) objT).booleanValue()) {
            return Boolean.TRUE;
        }
        if (z) {
            mayaAccessibilityService.getClass();
            if ((accessibilityNodeInfo2 == null || !accessibilityNodeInfo2.isCheckable()) && mayaAccessibilityService.U(accessibilityNodeInfo2)) {
                c4507lz1.Q = null;
                c4507lz1.R = null;
                c4507lz1.S = null;
                c4507lz1.T = null;
                c4507lz1.Y = 2;
                objT = T(j2, mayaAccessibilityService, strJ, accessibilityNodeInfo2, str, c4507lz1);
                return objT == ok ? ok : objT;
            }
        }
        return Boolean.FALSE;
    }

    public final boolean U(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean zRefresh;
        C4266ko c4266koE;
        if (accessibilityNodeInfo == null) {
            return false;
        }
        try {
            zRefresh = accessibilityNodeInfo.refresh();
        } catch (Exception unused) {
            zRefresh = false;
        }
        if (!zRefresh || (c4266koE = e(accessibilityNodeInfo)) == null) {
            return false;
        }
        C4266ko c4266koA = c4266koE.a(I());
        if (c4266koA.i()) {
            return false;
        }
        return R(c4266koA.d(), c4266koA.e());
    }

    /* JADX WARN: Code duplicated, block: B:57:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x014d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0168  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x018b  */
    /* JADX WARN: Code duplicated, block: B:73:0x019f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.view.accessibility.AccessibilityNodeInfo, com.getmaya.android.automation.MayaAccessibilityService, java.lang.String, java.lang.StringBuilder, kL1] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x013a -> B:54:0x013d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0165 -> B:63:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0168 -> B:62:0x0169). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object W(android.view.accessibility.AccessibilityNodeInfo r17, java.lang.String r18, defpackage.EnumC4171kL1 r19, defpackage.ZJ r20) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getmaya.android.automation.MayaAccessibilityService.W(android.view.accessibility.AccessibilityNodeInfo, java.lang.String, kL1, ZJ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X(long j, long j2, S40 s40, ZJ zj) throws Throwable {
        C5128oz0 c5128oz0;
        long jCurrentTimeMillis;
        if (zj instanceof C5128oz0) {
            c5128oz0 = (C5128oz0) zj;
            int i = c5128oz0.V;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5128oz0.V = i - Integer.MIN_VALUE;
            } else {
                c5128oz0 = new C5128oz0(this, zj);
            }
        } else {
            c5128oz0 = new C5128oz0(this, zj);
        }
        Object obj = c5128oz0.T;
        OK ok = OK.N;
        int i2 = c5128oz0.V;
        if (i2 == 0) {
            AbstractC6403v72.e(obj);
            jCurrentTimeMillis = System.currentTimeMillis() + j;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = c5128oz0.R;
            j2 = c5128oz0.Q;
            s40 = c5128oz0.S;
            AbstractC6403v72.e(obj);
        }
        while (System.currentTimeMillis() < jCurrentTimeMillis) {
            Object objA = s40.a();
            if (objA != null) {
                return objA;
            }
            c5128oz0.S = s40;
            c5128oz0.Q = j2;
            c5128oz0.R = jCurrentTimeMillis;
            c5128oz0.V = 1;
            if (AbstractC4046jj2.c(j2, c5128oz0) == ok) {
                return ok;
            }
        }
        return null;
    }

    public final ArrayList b() {
        C3464gw c3464gwF;
        ArrayList<AccessibilityNodeInfo> arrayListI = i(C6570vx0.Y);
        ArrayList arrayList = new ArrayList();
        for (AccessibilityNodeInfo accessibilityNodeInfo : arrayListI) {
            C1868Xy0 c1868Xy0 = null;
            if (w(accessibilityNodeInfo) && (c3464gwF = f(accessibilityNodeInfo, 0)) != null) {
                c1868Xy0 = new C1868Xy0(accessibilityNodeInfo, c3464gwF);
            }
            if (c1868Xy0 != null) {
                arrayList.add(c1868Xy0);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0056 -> B:20:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.lang.String r9, defpackage.ZJ r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C2440bz0
            if (r0 == 0) goto L13
            r0 = r10
            bz0 r0 = (defpackage.C2440bz0) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V = r1
            goto L18
        L13:
            bz0 r0 = new bz0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.T
            OK r1 = defpackage.OK.N
            int r2 = r0.V
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r4 = r0.S
            java.lang.String r9 = r0.R
            com.getmaya.android.automation.MayaAccessibilityService r2 = r0.Q
            defpackage.AbstractC6403v72.e(r10)
            goto L59
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.AbstractC6403v72.e(r10)
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 900(0x384, double:4.447E-321)
            long r4 = r4 + r6
            r2 = r8
        L40:
            long r6 = java.lang.System.currentTimeMillis()
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 >= 0) goto L66
            r0.Q = r2
            r0.R = r9
            r0.S = r4
            r0.V = r3
            r6 = 120(0x78, double:5.93E-322)
            java.lang.Object r10 = defpackage.AbstractC4046jj2.c(r6, r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            java.lang.String r10 = r2.J()
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L40
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L66:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getmaya.android.automation.MayaAccessibilityService.c(java.lang.String, ZJ):java.lang.Object");
    }

    public final C3464gw f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        C4266ko c4266koE = e(accessibilityNodeInfo);
        if (c4266koE == null) {
            return null;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        String string = text != null ? text.toString() : null;
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        return new C3464gw(i, string, contentDescription != null ? contentDescription.toString() : null, t(accessibilityNodeInfo), c4266koE.a(I()), accessibilityNodeInfo.isClickable(), accessibilityNodeInfo.isEditable(), accessibilityNodeInfo.isEnabled(), accessibilityNodeInfo.isCheckable(), accessibilityNodeInfo.isChecked());
    }

    public final boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return false;
        }
        if (accessibilityNodeInfo.isClickable() && accessibilityNodeInfo.isEnabled()) {
            boolean zPerformAction = accessibilityNodeInfo.performAction(16);
            if (zPerformAction) {
                z(accessibilityNodeInfo);
            }
            return zPerformAction;
        }
        C4266ko c4266koE = e(accessibilityNodeInfo);
        C4266ko c4266koI = I();
        int i = 0;
        for (AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(); parent != null && i < 5; parent = parent.getParent()) {
            i++;
            if (parent.isClickable() && parent.isEnabled()) {
                C4266ko c4266koE2 = e(parent);
                if (c4266koE != null && c4266koE2 != null && (c4266koE2.i() || !c4266koE2.b(c4266koE.d(), c4266koE.e()) || (c4266koI.c() > 0 && (c4266koE2.c() > c4266koI.c() * 0.5d || (c4266koI.f() > 0 && c4266koE2.f() > ((double) c4266koI.f()) * 0.6d))))) {
                    return false;
                }
                boolean zPerformAction2 = parent.performAction(16);
                if (zPerformAction2) {
                    z(parent);
                }
                return zPerformAction2;
            }
        }
        return false;
    }

    public final boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (g(accessibilityNodeInfo)) {
            return true;
        }
        return U(accessibilityNodeInfo);
    }

    public final ArrayList i(T40 t40) {
        ArrayList arrayList = new ArrayList();
        j(t40, arrayList, getRootInActiveWindow());
        return arrayList;
    }

    public final String k() {
        String string;
        Object next;
        CharSequence packageName;
        Object next2;
        try {
            List<AccessibilityWindowInfo> windows = getWindows();
            ArrayList arrayList = new ArrayList();
            for (Object obj : windows) {
                if (((AccessibilityWindowInfo) obj).getType() == 1) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                string = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((AccessibilityWindowInfo) next).isFocused());
            AccessibilityWindowInfo accessibilityWindowInfo = (AccessibilityWindowInfo) next;
            if (accessibilityWindowInfo == null) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!((AccessibilityWindowInfo) next2).isActive());
                accessibilityWindowInfo = (AccessibilityWindowInfo) next2;
            }
            if (accessibilityWindowInfo != null) {
                try {
                    AccessibilityNodeInfo root = accessibilityWindowInfo.getRoot();
                    if (root != null && (packageName = root.getPackageName()) != null) {
                        string = packageName.toString();
                    }
                } catch (Exception unused) {
                }
            }
            if (string != null && !AbstractC1947Yy1.n(string) && !AbstractC1323Qy1.u(string, "inputmethod", true)) {
                return string;
            }
            return S;
        } catch (Exception unused2) {
            return S;
        }
    }

    public final boolean l(List list, long j, T40 t40) {
        Object c1572Ud1;
        if (list.size() < 2) {
            return false;
        }
        Path path = new Path();
        path.moveTo(((Number) ((C3479h01) NC.F(list)).N).floatValue(), ((Number) ((C3479h01) NC.F(list)).O).floatValue());
        for (C3479h01 c3479h01 : NC.A(list, 1)) {
            path.lineTo(((Number) c3479h01.N).floatValue(), ((Number) c3479h01.O).floatValue());
        }
        try {
            c1572Ud1 = Boolean.valueOf(dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, j)).build(), new C2853dz0(t40), null));
        } catch (Throwable th) {
            c1572Ud1 = new C1572Ud1(th);
        }
        Object obj = Boolean.FALSE;
        if (c1572Ud1 instanceof C1572Ud1) {
            c1572Ud1 = obj;
        }
        return ((Boolean) c1572Ud1).booleanValue();
    }

    public final List m(String str) {
        AccessibilityNodeInfo rootInActiveWindow = getRootInActiveWindow();
        return B(rootInActiveWindow != null ? rootInActiveWindow.findAccessibilityNodeInfosByText(str) : null);
    }

    public final List n(String str) {
        AccessibilityNodeInfo rootInActiveWindow = getRootInActiveWindow();
        return B(rootInActiveWindow != null ? rootInActiveWindow.findAccessibilityNodeInfosByViewId(str) : null);
    }

    public final AccessibilityNodeInfo o(String str) {
        C7113ya1 c7113ya1 = new C7113ya1();
        C7113ya1 c7113ya2 = new C7113ya1();
        C7113ya1 c7113ya3 = new C7113ya1();
        C7113ya1 c7113ya4 = new C7113ya1();
        p(c7113ya1, str, this, c7113ya3, c7113ya2, c7113ya4, getRootInActiveWindow());
        AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo) c7113ya1.N;
        if (accessibilityNodeInfo != null) {
            return accessibilityNodeInfo;
        }
        AccessibilityNodeInfo accessibilityNodeInfo2 = (AccessibilityNodeInfo) c7113ya2.N;
        if (accessibilityNodeInfo2 != null) {
            return accessibilityNodeInfo2;
        }
        AccessibilityNodeInfo accessibilityNodeInfo3 = (AccessibilityNodeInfo) c7113ya3.N;
        return accessibilityNodeInfo3 == null ? (AccessibilityNodeInfo) c7113ya4.N : accessibilityNodeInfo3;
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence packageName;
        String string;
        if (accessibilityEvent == null || accessibilityEvent.getEventType() != 32 || (packageName = accessibilityEvent.getPackageName()) == null || (string = packageName.toString()) == null) {
            return;
        }
        if (!(!AbstractC1947Yy1.n(string))) {
            string = null;
        }
        if (string != null) {
            boolean z = string.equals(getPackageName()) || string.equals("com.android.systemui") || AbstractC1323Qy1.u(string, "inputmethod", true) || AbstractC1947Yy1.l(string, ".ime", false) || AbstractC1323Qy1.u(string, ".ime.", false);
            if (!z) {
                boolean z2 = !AbstractC5669rb2.d(S, string);
                S = string;
                if (z2) {
                    Iterator it = T.iterator();
                    while (it.hasNext()) {
                        ((T40) it.next()).l(string);
                    }
                }
            }
            try {
                String str = AbstractC7338zf.a;
                AbstractC7338zf.a(this, string, z && !string.equals(getPackageName()));
            } catch (Throwable unused) {
            }
            if (string.equals("com.instagram.android")) {
                C6078ta1 c6078ta1 = C6078ta1.a;
                C0927Lw1 c0927Lw1 = C6078ta1.c;
                if (c0927Lw1 == null || !c0927Lw1.c()) {
                    Context applicationContext = getApplicationContext();
                    c6078ta1.j(applicationContext);
                    if (C6078ta1.f()) {
                        Wd2.d(C6078ta1.b, null, 0, new C5044oa1(applicationContext, null), 3);
                    }
                }
            }
            C4420lZ1 c4420lZ1 = C4420lZ1.a;
            if (C4420lZ1.b.contains(string)) {
                C0927Lw1 c0927Lw2 = C4420lZ1.d;
                if (c0927Lw2 == null || !c0927Lw2.c()) {
                    getApplicationContext();
                    synchronized (c4420lZ1) {
                        C0927Lw1 c0927Lw3 = C4420lZ1.e;
                        if (c0927Lw3 == null || !c0927Lw3.c()) {
                            C4420lZ1.e = Wd2.d(C4420lZ1.c, null, 0, new C4213kZ1(2, null), 3);
                        }
                    }
                    c4420lZ1.b();
                }
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        try {
            BD1 bd1 = (BD1) getValue();
            bd1.b.post(new RunnableC6837xD1(bd1, 0));
        } catch (Throwable unused) {
        }
        if (R == this) {
            R = null;
        }
        try {
            ((ExecutorService) getValue()).shutdown();
        } catch (Throwable unused2) {
        }
        super.onDestroy();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onServiceConnected() {
        super.onServiceConnected();
        R = this;
        try {
            File file = L5.a;
            L5.b(getApplicationContext());
            L5.c("A11Y connected");
        } catch (Throwable unused) {
        }
        try {
            getApplicationContext().getSharedPreferences("maya_a11y", 0).edit().putLong("connected_at", System.currentTimeMillis()).apply();
        } catch (Throwable unused2) {
        }
        if (!this.Q) {
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                if (Build.VERSION.SDK_INT >= 33) {
                    registerReceiver(this.P, intentFilter, 4);
                } else {
                    registerReceiver(this.P, intentFilter);
                }
                this.Q = true;
            } catch (Throwable unused3) {
            }
        }
        C6078ta1.a.j(this);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        int i = 0;
        try {
            File file = L5.a;
            L5.b(getApplicationContext());
            L5.c("A11Y unbound");
        } catch (Throwable unused) {
        }
        if (this.Q) {
            try {
                unregisterReceiver(this.P);
            } catch (Throwable unused2) {
            }
        }
        this.Q = false;
        try {
            BD1 bd1 = (BD1) getValue();
            bd1.b.post(new RunnableC6837xD1(bd1, i));
        } catch (Throwable unused3) {
        }
        if (R == this) {
            R = null;
        }
        return super.onUnbind(intent);
    }

    public final AccessibilityNodeInfo q(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId;
        AccessibilityNodeInfo rootInActiveWindow = getRootInActiveWindow();
        Object obj = null;
        if (rootInActiveWindow == null || (listFindAccessibilityNodeInfosByViewId = rootInActiveWindow.findAccessibilityNodeInfosByViewId(str)) == null) {
            return null;
        }
        for (Object obj2 : listFindAccessibilityNodeInfosByViewId) {
            if (w((AccessibilityNodeInfo) obj2)) {
                obj = obj2;
                break;
            }
        }
        AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo) obj;
        return accessibilityNodeInfo == null ? (AccessibilityNodeInfo) NC.H(listFindAccessibilityNodeInfosByViewId) : accessibilityNodeInfo;
    }

    public final AccessibilityNodeInfo r() {
        Object next;
        AccessibilityNodeInfo rootInActiveWindow = getRootInActiveWindow();
        Object next2 = null;
        if (rootInActiveWindow == null) {
            return null;
        }
        try {
            AccessibilityNodeInfo accessibilityNodeInfoFindFocus = rootInActiveWindow.findFocus(1);
            if (accessibilityNodeInfoFindFocus != null) {
                if (!accessibilityNodeInfoFindFocus.isEditable() || !w(accessibilityNodeInfoFindFocus)) {
                    accessibilityNodeInfoFindFocus = null;
                }
                if (accessibilityNodeInfoFindFocus != null) {
                    return accessibilityNodeInfoFindFocus;
                }
            }
        } catch (Exception unused) {
        }
        ArrayList arrayListI = i(C6570vx0.Z);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListI) {
            if (w((AccessibilityNodeInfo) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((AccessibilityNodeInfo) next).isFocused());
        AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo) next;
        if (accessibilityNodeInfo != null) {
            return accessibilityNodeInfo;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                C4266ko c4266koE = e((AccessibilityNodeInfo) next2);
                int iE = c4266koE != null ? c4266koE.e() : 0;
                do {
                    Object next3 = it2.next();
                    C4266ko c4266koE2 = e((AccessibilityNodeInfo) next3);
                    int iE2 = c4266koE2 != null ? c4266koE2.e() : 0;
                    if (iE < iE2) {
                        next2 = next3;
                        iE = iE2;
                    }
                } while (it2.hasNext());
            }
        }
        AccessibilityNodeInfo accessibilityNodeInfo2 = (AccessibilityNodeInfo) next2;
        return accessibilityNodeInfo2 != null ? accessibilityNodeInfo2 : (AccessibilityNodeInfo) NC.H(arrayListI);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x009f -> B:40:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b3 -> B:40:0x00b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object s(android.view.accessibility.AccessibilityNodeInfo r13, java.lang.String r14, defpackage.ZJ r15) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getmaya.android.automation.MayaAccessibilityService.s(android.view.accessibility.AccessibilityNodeInfo, java.lang.String, ZJ):java.lang.Object");
    }

    public final boolean w(AccessibilityNodeInfo accessibilityNodeInfo) {
        C4266ko c4266koE;
        if (accessibilityNodeInfo == null || !accessibilityNodeInfo.isVisibleToUser() || (c4266koE = e(accessibilityNodeInfo)) == null) {
            return false;
        }
        return c4266koE.h(I());
    }

    public final ArrayList x(String str) {
        ArrayList arrayListC = C(str, true);
        return true ^ arrayListC.isEmpty() ? arrayListC : C(str, false);
    }

    public final void z(AccessibilityNodeInfo accessibilityNodeInfo) {
        C4266ko c4266koE;
        if (C3837ij.W && (c4266koE = e(accessibilityNodeInfo)) != null) {
            C4266ko c4266koA = c4266koE.a(I());
            if (c4266koA.i()) {
                return;
            }
            BD1 bd1 = (BD1) getValue();
            float fD = c4266koA.d();
            float fE = c4266koA.e();
            if (C3837ij.W) {
                bd1.b.post(new RunnableC7044yD1(bd1, fD, fE));
            } else {
                bd1.getClass();
            }
        }
    }
}
