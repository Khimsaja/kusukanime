package I1;

import B1.InterfaceC0021h;
import B1.n;
import B1.o;
import F.w;
import O1.B;
import O1.C0549x;
import O1.H;
import y1.C2393o;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements n, o, InterfaceC0021h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3947k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3948l;

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f3947k = obj;
        this.f3948l = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:327:0x05ba A[PHI: r7
      0x05ba: PHI (r7v24 int) = (r7v21 int), (r7v23 int), (r7v22 int), (r7v22 int), (r7v22 int) binds: [B:326:0x05b8, B:351:0x05f9, B:334:0x05c9, B:335:0x05cb, B:336:0x05cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0687 A[ORIG_RETURN, RETURN] */
    @Override // B1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.Object r24, y1.C2391m r25) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.c.b(java.lang.Object, y1.m):void");
    }

    @Override // B1.InterfaceC0021h
    public void c(Object obj) {
        K1.e eVar = (K1.e) this.f3947k;
        ((H) obj).C(eVar.a, eVar.f4459b, (C0549x) this.f3948l);
    }

    @Override // B1.n
    public void invoke(Object obj) {
        k kVar = (k) obj;
        kVar.getClass();
        a aVar = (a) this.f3947k;
        B b4 = aVar.f3939d;
        if (b4 == null) {
            return;
        }
        C0549x c0549x = (C0549x) this.f3948l;
        C2393o c2393o = c0549x.f7506b;
        c2393o.getClass();
        b4.getClass();
        w wVar = new w(20, c2393o, kVar.f3978c.c(aVar.f3937b, b4));
        int i7 = c0549x.a;
        if (i7 != 0) {
            if (i7 == 1) {
                kVar.f3992q = wVar;
                return;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                kVar.f3993r = wVar;
                return;
            }
        }
        kVar.f3991p = wVar;
    }
}
