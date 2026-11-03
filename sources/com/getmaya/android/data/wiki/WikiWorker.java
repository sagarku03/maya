package com.getmaya.android.data.wiki;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.AbstractC0372Et0;
import defpackage.AbstractC1715Vz0;
import defpackage.AbstractC2862e11;
import defpackage.AbstractC6403v72;
import defpackage.C1572Ud1;
import defpackage.C1650Vd1;
import defpackage.L5;
import defpackage.OK;
import defpackage.OW1;
import defpackage.RW1;
import defpackage.ZJ;
import defpackage.ZW1;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/getmaya/android/data/wiki/WikiWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class WikiWorker extends CoroutineWorker {
    public WikiWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object f(ZJ zj) throws Throwable {
        ZW1 zw1;
        Object c1572Ud1;
        if (zj instanceof ZW1) {
            zw1 = (ZW1) zj;
            int i = zw1.S;
            if ((i & Integer.MIN_VALUE) != 0) {
                zw1.S = i - Integer.MIN_VALUE;
            } else {
                zw1 = new ZW1(this, zj);
            }
        } else {
            zw1 = new ZW1(this, zj);
        }
        Object objC = zw1.Q;
        OK ok = OK.N;
        int i2 = zw1.S;
        try {
            if (i2 == 0) {
                AbstractC6403v72.e(objC);
                RW1 rw1 = new RW1(this.N);
                zw1.S = 1;
                objC = rw1.c(zw1);
                if (objC == ok) {
                    return ok;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6403v72.e(objC);
            }
            c1572Ud1 = (OW1) objC;
        } catch (Throwable th) {
            c1572Ud1 = new C1572Ud1(th);
        }
        if (!(c1572Ud1 instanceof C1572Ud1)) {
            OW1 ow1 = (OW1) c1572Ud1;
            File file = L5.a;
            int i3 = ow1.a;
            String str = ow1.d;
            String strG = str != null ? AbstractC1715Vz0.g(" (", str, ")") : null;
            if (strG == null) {
                strG = "";
            }
            StringBuilder sbJ = AbstractC1715Vz0.j("WIKI worker — attempted=", i3, " written=");
            sbJ.append(ow1.b);
            sbJ.append(" consumed=");
            sbJ.append(ow1.c);
            sbJ.append(strG);
            L5.c(sbJ.toString());
        }
        Throwable thA = C1650Vd1.a(c1572Ud1);
        if (thA != null) {
            File file2 = L5.a;
            AbstractC2862e11.j("WIKI worker failed: ", thA.getMessage());
        }
        return AbstractC0372Et0.a();
    }
}
