package com.getmaya.android.connectors;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.getmaya.android.R;
import defpackage.AbstractC0612Hv0;
import defpackage.AbstractC1947Yy1;
import defpackage.AbstractC6250uP;
import defpackage.C1235Pv0;
import defpackage.C6447vL1;
import defpackage.C7091yT0;
import defpackage.Fh2;
import defpackage.L5;
import defpackage.NC;
import defpackage.Wd2;
import defpackage.Xi2;
import defpackage.YM;
import java.io.File;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/getmaya/android/connectors/OAuthRedirectActivity;", "Landroid/app/Activity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class OAuthRedirectActivity extends Activity {
    public static final /* synthetic */ int N = 0;

    public final void a(Intent intent) {
        try {
            try {
                b(intent);
            } catch (Exception e) {
                File file = L5.a;
                L5.c("CONNECTOR oauth redirect unreadable: " + e.getMessage());
            }
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(C6447vL1.h(context));
    }

    public final void b(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        if (!data.isHierarchical()) {
            L5.c("CONNECTOR oauth redirect ignored — not a hierarchical URI");
            return;
        }
        String queryParameter = data.getQueryParameter("error");
        if (queryParameter != null && !AbstractC1947Yy1.n(queryParameter)) {
            File file = L5.a;
            L5.c("CONNECTOR oauth redirect declined: ".concat(queryParameter));
            c(Fh2.d(this, R.string.system_oauth_cancelled, new Object[0]));
            return;
        }
        String queryParameter2 = data.getQueryParameter("code");
        String queryParameter3 = data.getQueryParameter("state");
        String str = queryParameter3 == null ? "" : queryParameter3;
        if (queryParameter2 == null || AbstractC1947Yy1.n(queryParameter2)) {
            c(Fh2.d(this, R.string.system_oauth_incomplete, new Object[0]));
            return;
        }
        List<String> pathSegments = data.getPathSegments();
        String str2 = pathSegments != null ? (String) NC.O(pathSegments) : null;
        String str3 = str2 == null ? "" : str2;
        C1235Pv0 c1235Pv0 = new C1235Pv0();
        String queryParameter4 = data.getQueryParameter("picked_file_ids");
        if (queryParameter4 != null) {
            if (!(!AbstractC1947Yy1.n(queryParameter4))) {
                queryParameter4 = null;
            }
            if (queryParameter4 != null) {
                c1235Pv0.put("picked_file_ids", queryParameter4);
            }
        }
        C1235Pv0 c1235Pv0B = c1235Pv0.b();
        YM ym = AbstractC6250uP.a;
        Wd2.d(Xi2.a(AbstractC0612Hv0.a), null, 0, new C7091yT0(this, str3, queryParameter2, str, c1235Pv0B, null), 3);
    }

    public final void c(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(getIntent());
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }
}
