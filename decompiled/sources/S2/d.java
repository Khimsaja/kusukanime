package S2;

import android.content.Context;
import android.graphics.Bitmap;
import b3.C0709a;
import e4.InterfaceC0821a;
import g3.AbstractC0946e;
import g3.C0950i;
import java.io.File;
import p.I0;
import w6.y;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8732l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B0.b f8733m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(B0.b bVar, int i7) {
        super(0);
        this.f8732l = i7;
        this.f8733m = bVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        V2.j jVarA;
        switch (this.f8732l) {
            case 0:
                return new C0709a((Context) this.f8733m.f275k).a();
            default:
                C0950i c0950i = C0950i.a;
                Context context = (Context) this.f8733m.f275k;
                synchronized (c0950i) {
                    try {
                        jVarA = C0950i.f11715b;
                        if (jVarA == null) {
                            V2.a aVar = new V2.a();
                            Bitmap.Config config = AbstractC0946e.a;
                            File cacheDir = context.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            File fileP = Z3.j.P(cacheDir, "image_cache");
                            String str = y.f17190l;
                            aVar.a = I0.u(fileP);
                            jVarA = aVar.a();
                            C0950i.f11715b = jVarA;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return jVarA;
        }
    }
}
