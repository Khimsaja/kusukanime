package L4;

import H5.C0270k;
import f6.C0895I;
import f6.InterfaceC0908f;
import f6.InterfaceC0909g;
import java.io.IOException;
import x4.C2266L;

/* loaded from: classes.dex */
public final class l implements e4.k, InterfaceC0909g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6100k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f6101l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f6102m;

    public /* synthetic */ l(int i7, Object obj, Object obj2) {
        this.f6100k = i7;
        this.f6101l = obj;
        this.f6102m = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    @Override // e4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.l.invoke(java.lang.Object):java.lang.Object");
    }

    @Override // f6.InterfaceC0909g
    public void onFailure(InterfaceC0908f interfaceC0908f, IOException iOException) {
        if (((j6.i) interfaceC0908f).f12523y) {
            return;
        }
        ((C0270k) this.f6102m).resumeWith(P3.r.r(iOException));
    }

    @Override // f6.InterfaceC0909g
    public void onResponse(InterfaceC0908f interfaceC0908f, C0895I c0895i) {
        ((C0270k) this.f6102m).resumeWith(c0895i);
    }

    public l(C2266L c2266l, o oVar) {
        this.f6100k = 1;
        this.f6102m = c2266l;
        this.f6101l = oVar;
    }
}
