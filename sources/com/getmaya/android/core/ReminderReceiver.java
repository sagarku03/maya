package com.getmaya.android.core;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.getmaya.android.MainActivity;
import com.getmaya.android.R;
import com.google.crypto.tink.shaded.protobuf.Reader;
import defpackage.AbstractC1947Yy1;
import defpackage.C6623wB0;
import defpackage.FO0;
import defpackage.Fh2;
import defpackage.G62;
import defpackage.H51;
import defpackage.RS0;
import defpackage.Wd2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/core/ReminderReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ReminderReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("reminder_text");
        if (stringExtra != null) {
            boolean zB = true;
            if (!(!AbstractC1947Yy1.n(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra == null) {
                return;
            }
            long longExtra = intent.getLongExtra("reminder_id", System.currentTimeMillis());
            try {
                zB = G62.b(longExtra, context);
            } catch (Exception unused) {
            }
            if (zB) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                notificationManager.createNotificationChannel(new NotificationChannel("maya_reminders", Fh2.d(context, R.string.system_channel_reminders, new Object[0]), 4));
                PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) MainActivity.class), 67108864);
                RS0 rs0 = new RS0(context, "maya_reminders");
                rs0.r.icon = android.R.drawable.ic_popup_reminder;
                rs0.e = RS0.c(Fh2.d(context, R.string.system_reminder_title, new Object[0]));
                rs0.f = RS0.c(stringExtra);
                H51 h51 = new H51(10);
                h51.P = RS0.c(stringExtra);
                rs0.e(h51);
                rs0.d(16);
                rs0.g = activity;
                notificationManager.notify((int) (longExtra % ((long) Reader.READ_DONE)), rs0.b());
                try {
                    FO0 fo0 = MayaForegroundService.x4;
                    MayaForegroundService mayaForegroundService = MayaForegroundService.W4;
                    if (mayaForegroundService == null) {
                        return;
                    }
                    Wd2.d(mayaForegroundService.N, null, 0, new C6623wB0(null, mayaForegroundService, stringExtra), 3);
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
