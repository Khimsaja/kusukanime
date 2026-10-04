package g3;

import android.os.SystemClock;
import e3.C0819a;

/* renamed from: g3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950i implements InterfaceC0948g {
    public static final C0950i a = new C0950i();

    /* renamed from: b, reason: collision with root package name */
    public static V2.j f11715b;

    @Override // g3.InterfaceC0948g
    public boolean a(e3.h hVar) {
        e3.c cVar = hVar.a;
        if ((cVar instanceof C0819a ? ((C0819a) cVar).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        e3.c cVar2 = hVar.f11356b;
        return (cVar2 instanceof C0819a ? ((C0819a) cVar2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // g3.InterfaceC0948g
    public boolean b() {
        boolean z7;
        synchronized (C0947f.a) {
            try {
                int i7 = C0947f.f11708c;
                C0947f.f11708c = i7 + 1;
                if (i7 >= 30 || SystemClock.uptimeMillis() > C0947f.f11709d + 30000) {
                    C0947f.f11708c = 0;
                    C0947f.f11709d = SystemClock.uptimeMillis();
                    String[] list = C0947f.f11707b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    C0947f.f11710e = list.length < 800;
                }
                z7 = C0947f.f11710e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }
}
