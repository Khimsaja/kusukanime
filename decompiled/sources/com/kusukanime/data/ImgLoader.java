package com.kusukanime.data;

import P3.r;
import S2.f;
import Z3.j;
import android.content.Context;
import b3.C0709a;
import b3.InterfaceC0712d;
import d3.C0791c;
import f3.C0875a;
import f6.C0887A;
import f6.C0889C;
import f6.C0890D;
import f6.C0895I;
import f6.InterfaceC0923u;
import f6.InterfaceC0924v;
import f6.z;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import p.I0;
import w6.y;
import z1.c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/kusukanime/data/ImgLoader;", "", "<init>", "()V", "loader", "Lcoil/ImageLoader;", "get", "ctx", "Landroid/content/Context;", "build", "app", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImgLoader {
    private static volatile f loader;
    public static final ImgLoader INSTANCE = new ImgLoader();
    public static final int $stable = 8;

    private ImgLoader() {
    }

    private final f build(Context context) {
        z zVar = new z();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zVar.a(15L, timeUnit);
        zVar.f11651x = g6.b.b(25L, timeUnit);
        zVar.f11633f = true;
        zVar.f11630c.add(new InterfaceC0924v() { // from class: com.kusukanime.data.ImgLoader$build$$inlined$-addInterceptor$1
            @Override // f6.InterfaceC0924v
            public final C0895I intercept(InterfaceC0923u interfaceC0923u) throws InterruptedException {
                int i7;
                l.f("chain", interfaceC0923u);
                k6.f fVar = (k6.f) interfaceC0923u;
                C0889C c0889cB = fVar.f12701e.b();
                c0889cB.c("User-Agent", "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 Chrome/126 Mobile Safari/537.36");
                c0889cB.c("Referer", "https://anisail.com/");
                c0889cB.c("Accept", "image/avif,image/webp,image/apng,image/*,*/*;q=0.8");
                C0890D c0890dA = c0889cB.a();
                C0895I c0895iB = fVar.b(c0890dA);
                int i8 = 0;
                while (!c0895iB.e() && (((i7 = c0895iB.f11498n) == 403 || i7 == 429 || i7 >= 500) && i8 < 3)) {
                    c0895iB.close();
                    Thread.sleep(((Number) r.I(250L, 600L, 1200L).get(i8)).longValue());
                    i8++;
                    c0895iB = fVar.b(c0890dA);
                }
                return c0895iB;
            }
        });
        C0887A c0887a = new C0887A(zVar);
        B0.b bVar = new B0.b(context);
        bVar.f279o = new O3.f(c0887a);
        bVar.f277m = c.C(new a(context, 0));
        bVar.f278n = c.C(new a(context, 1));
        C0875a c0875a = new C0875a(100);
        C0791c c0791c = (C0791c) bVar.f276l;
        bVar.f276l = new C0791c(c0791c.a, c0791c.f11242b, c0791c.f11243c, c0791c.f11244d, c0875a, c0791c.f11246f, c0791c.f11247g, c0791c.f11248h, c0791c.f11249i, c0791c.f11250j, c0791c.f11251k, c0791c.f11252l, c0791c.f11253m, c0791c.f11254n, c0791c.f11255o);
        return bVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0712d build$lambda$1(Context context) {
        C0709a c0709a = new C0709a(context);
        c0709a.f10933b = 0.2d;
        return c0709a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V2.b build$lambda$2(Context context) {
        V2.a aVar = new V2.a();
        File cacheDir = context.getCacheDir();
        l.e("getCacheDir(...)", cacheDir);
        File fileP = j.P(cacheDir, "img_cache");
        String str = y.f17190l;
        aVar.a = I0.u(fileP);
        aVar.f9441c = 0.0d;
        aVar.f9444f = 33554432L;
        return aVar.a();
    }

    public final f get(Context context) {
        f fVarBuild;
        l.f("ctx", context);
        f fVar = loader;
        if (fVar != null) {
            return fVar;
        }
        synchronized (this) {
            fVarBuild = loader;
            if (fVarBuild == null) {
                ImgLoader imgLoader = INSTANCE;
                Context applicationContext = context.getApplicationContext();
                l.e("getApplicationContext(...)", applicationContext);
                fVarBuild = imgLoader.build(applicationContext);
                loader = fVarBuild;
            }
        }
        return fVarBuild;
    }
}
