package com.getmaya.android.notify;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.AbstractC0372Et0;
import defpackage.AbstractC6403v72;
import defpackage.C0216Ct0;
import defpackage.C1572Ud1;
import defpackage.C1650Vd1;
import defpackage.GL1;
import defpackage.NS0;
import defpackage.OK;
import defpackage.OS0;
import defpackage.ZJ;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/getmaya/android/notify/NoticeWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NoticeWorker extends CoroutineWorker {
    public NoticeWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object f(ZJ zj) throws Throwable {
        OS0 os0;
        Object c1572Ud1;
        if (zj instanceof OS0) {
            os0 = (OS0) zj;
            int i = os0.S;
            if ((i & Integer.MIN_VALUE) != 0) {
                os0.S = i - Integer.MIN_VALUE;
            } else {
                os0 = new OS0(this, zj);
            }
        } else {
            os0 = new OS0(this, zj);
        }
        Object obj = os0.Q;
        OK ok = OK.N;
        int i2 = os0.S;
        try {
            if (i2 == 0) {
                AbstractC6403v72.e(obj);
                NS0 ns0E = NS0.k.e(this.N);
                os0.S = 1;
                if (ns0E.b(true, os0) == ok) {
                    return ok;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6403v72.e(obj);
            }
            c1572Ud1 = GL1.a;
        } catch (Throwable th) {
            c1572Ud1 = new C1572Ud1(th);
        }
        return C1650Vd1.a(c1572Ud1) != null ? new C0216Ct0() : AbstractC0372Et0.a();
    }
}
