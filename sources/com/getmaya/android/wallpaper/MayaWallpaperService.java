package com.getmaya.android.wallpaper;

import android.service.wallpaper.WallpaperService;
import defpackage.C1320Qx1;
import defpackage.C4254kk;
import defpackage.L5;
import defpackage.VJ0;
import defpackage.Z72;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/getmaya/android/wallpaper/MayaWallpaperService;", "Landroid/service/wallpaper/WallpaperService;", "<init>", "()V", "VJ0", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MayaWallpaperService extends WallpaperService {
    public static volatile C4254kk N;
    public static final C1320Qx1 O;
    public static final C1320Qx1 P;

    static {
        C1320Qx1 c1320Qx1A = Z72.a(0);
        O = c1320Qx1A;
        P = c1320Qx1A;
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        File file = L5.a;
        L5.b(getApplicationContext());
    }

    @Override // android.service.wallpaper.WallpaperService
    public final WallpaperService.Engine onCreateEngine() {
        return new VJ0(this);
    }
}
