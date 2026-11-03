package com.getmaya.android.marketing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC0916Lt;
import defpackage.AbstractC2437by0;
import defpackage.AbstractC5669rb2;
import defpackage.C0072Ax0;
import defpackage.C0142Bu1;
import defpackage.C6777wx0;
import defpackage.C6984xx0;
import defpackage.C7398zx0;
import defpackage.Cg2;
import defpackage.NC;
import defpackage.Wd2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/getmaya/android/marketing/MarketingAlarmReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Bg2", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MarketingAlarmReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iA;
        Context applicationContext = context.getApplicationContext();
        if (AbstractC5669rb2.d(intent.getAction(), "com.getmaya.android.marketing.DAILY_TRENDS")) {
            AbstractC2437by0.a(applicationContext);
            if (applicationContext.getApplicationContext().getSharedPreferences("maya_marketing", 0).getBoolean("trends_daily", false) && applicationContext.getApplicationContext().getSharedPreferences("maya_marketing", 0).getInt("trends_last_day", -1) != (iA = C0142Bu1.a())) {
                Wd2.d(AbstractC2437by0.a, null, 0, new C7398zx0(applicationContext, iA, null), 3);
                return;
            }
            return;
        }
        if (AbstractC5669rb2.d(intent.getAction(), "com.getmaya.android.marketing.FOLLOWUPS_DUE")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            AbstractC0916Lt.g(0, applicationContext, "maya_marketing").putLong("followups_announced_at", jCurrentTimeMillis).apply();
            AbstractC2437by0.a(applicationContext);
            Wd2.d(AbstractC2437by0.a, null, 0, new C6777wx0(applicationContext, jCurrentTimeMillis, null), 3);
            return;
        }
        if (AbstractC5669rb2.d(intent.getAction(), "com.getmaya.android.marketing.WEEKLY_NUMBERS")) {
            AbstractC2437by0.a(applicationContext);
            if (applicationContext.getApplicationContext().getSharedPreferences("maya_marketing", 0).getBoolean("weekly_summary", false)) {
                Wd2.d(AbstractC2437by0.a, null, 0, new C0072Ax0(applicationContext, null), 3);
                return;
            }
            return;
        }
        if (AbstractC5669rb2.d(intent.getAction(), "com.getmaya.android.marketing.CALENDAR_DUE")) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            List listC = Cg2.c(applicationContext);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                if (((Number) obj).longValue() > jCurrentTimeMillis2) {
                    arrayList.add(obj);
                }
            }
            AbstractC0916Lt.g(0, applicationContext, "maya_marketing").putString("calendar_upcoming", NC.M(NC.d0(NC.b0(arrayList), 40), ",", null, null, null, 62)).apply();
            AbstractC2437by0.a(applicationContext);
            Wd2.d(AbstractC2437by0.a, null, 0, new C6984xx0(applicationContext, null), 3);
        }
    }
}
