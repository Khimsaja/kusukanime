package H1;

import B1.AbstractC0015b;
import M0.C0468a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* renamed from: H1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232m {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final C0468a f3540b;

    public C0232m(Context context) {
        this.a = context;
        this.f3540b = new C0468a(context, 1);
    }

    public final AbstractC0225f[] a(Handler handler, D d4, D d6, D d7, D d8) {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        T1.g gVar = new T1.g(context);
        C0468a c0468a = this.f3540b;
        gVar.f8872c = c0468a;
        gVar.f8873d = 5000L;
        gVar.f8874e = handler;
        gVar.f8875f = d4;
        gVar.f8876g = 50;
        AbstractC0015b.h(!gVar.f8871b);
        Handler handler2 = gVar.f8874e;
        AbstractC0015b.h((handler2 == null && gVar.f8875f == null) || !(handler2 == null || gVar.f8875f == null));
        gVar.f8871b = true;
        arrayList.add(new T1.i(gVar));
        J1.t tVar = new J1.t(context);
        AbstractC0015b.h(!tVar.f4267d);
        tVar.f4267d = true;
        if (tVar.f4266c == null) {
            tVar.f4266c = new B2.l(new z1.g[0]);
        }
        if (tVar.f4270g == null) {
            tVar.f4270g = new F.w(22, context);
        }
        arrayList.add(new J1.C(this.a, c0468a, handler, d6, new J1.A(tVar)));
        arrayList.add(new P1.d(d7, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new N1.b(d8, looper));
        arrayList.add(new N1.b(d8, looper));
        arrayList.add(new U1.b());
        arrayList.add(new L1.h(L1.c.f6019c));
        return (AbstractC0225f[]) arrayList.toArray(new AbstractC0225f[0]);
    }
}
