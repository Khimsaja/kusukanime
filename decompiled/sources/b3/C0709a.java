package b3;

import F5.o;
import X4.y;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import g3.AbstractC0946e;
import io.ktor.utils.io.ByteChannelKt;
import kotlin.jvm.internal.l;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709a {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public double f10933b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10934c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10935d;

    public C0709a(Context context) {
        this.a = context;
        Bitmap.Config config = AbstractC0946e.a;
        double d4 = 0.2d;
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            l.c(systemService);
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d4 = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.f10933b = d4;
        this.f10934c = true;
        this.f10935d = true;
    }

    public final C0713e a() {
        y yVar;
        InterfaceC0717i eVar;
        int largeMemoryClass;
        int i7 = 2;
        int i8 = 0;
        InterfaceC0718j oVar = this.f10935d ? new o(4, (byte) 0) : new R1.i(15);
        if (this.f10934c) {
            double d4 = this.f10933b;
            if (d4 > 0.0d) {
                Context context = this.a;
                Bitmap.Config config = AbstractC0946e.a;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    l.c(systemService);
                    ActivityManager activityManager = (ActivityManager) systemService;
                    largeMemoryClass = (context.getApplicationInfo().flags & ByteChannelKt.CHANNEL_MAX_SIZE) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused) {
                    largeMemoryClass = 256;
                }
                double d6 = 1024;
                i8 = (int) (d4 * largeMemoryClass * d6 * d6);
            }
            if (i8 > 0) {
                eVar = new L2.e(i8, oVar);
                return new C0713e(eVar, oVar);
            }
            yVar = new y(i7, oVar);
        } else {
            yVar = new y(i7, oVar);
        }
        eVar = yVar;
        return new C0713e(eVar, oVar);
    }
}
