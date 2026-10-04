package H1;

import O1.C0542p;
import android.content.Context;
import java.util.HashMap;

/* renamed from: H1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0223d implements i3.h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3423k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f3424l;

    public /* synthetic */ C0223d(Context context, int i7) {
        this.f3423k = i7;
        this.f3424l = context;
    }

    @Override // i3.h
    public final Object get() {
        R1.h hVar;
        switch (this.f3423k) {
            case 0:
                return z1.c.s(this.f3424l);
            case 1:
                return new C0232m(this.f3424l);
            case 2:
                return new C0542p(new F.w(this.f3424l), new V1.l());
            case 3:
                return new Q1.q(this.f3424l);
            default:
                Context context = this.f3424l;
                j3.X x7 = R1.h.f8043p;
                synchronized (R1.h.class) {
                    try {
                        if (R1.h.f8049v == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            R1.h.f8049v = new R1.h(applicationContext, map);
                        }
                        hVar = R1.h.f8049v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return hVar;
        }
    }
}
