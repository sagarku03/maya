package com.getmaya.android.telemetry;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.AbstractC5487qh2;
import defpackage.AbstractC6250uP;
import defpackage.AbstractC6403v72;
import defpackage.C4002jY0;
import defpackage.C4209kY0;
import defpackage.C4416lY0;
import defpackage.C7271zK0;
import defpackage.OK;
import defpackage.SM;
import defpackage.Wd2;
import defpackage.ZJ;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/getmaya/android/telemetry/OpsUploader;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "jY0", "app_release"}, k = 1, mv = {1, 9, 0})
public final class OpsUploader extends CoroutineWorker {
    public static final C4002jY0 U = new C4002jY0(0);
    public static volatile String V = "";
    public static final C7271zK0 W;

    static {
        Pattern pattern = C7271zK0.d;
        W = AbstractC5487qh2.e("application/json");
    }

    public OpsUploader(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object f(ZJ zj) throws Throwable {
        C4209kY0 c4209kY0;
        if (zj instanceof C4209kY0) {
            c4209kY0 = (C4209kY0) zj;
            int i = c4209kY0.S;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4209kY0.S = i - Integer.MIN_VALUE;
            } else {
                c4209kY0 = new C4209kY0(this, zj);
            }
        } else {
            c4209kY0 = new C4209kY0(this, zj);
        }
        Object objF = c4209kY0.Q;
        OK ok = OK.N;
        int i2 = c4209kY0.S;
        if (i2 == 0) {
            AbstractC6403v72.e(objF);
            SM sm = AbstractC6250uP.b;
            C4416lY0 c4416lY0 = new C4416lY0(this, null);
            c4209kY0.S = 1;
            objF = Wd2.f(sm, c4416lY0, c4209kY0);
            if (objF == ok) {
                return ok;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6403v72.e(objF);
        }
        return objF;
    }
}
