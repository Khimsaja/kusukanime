package y;

import D.C0042b;
import l4.InterfaceC1440s;
import l4.InterfaceC1443v;
import s.EnumC1903a0;
import y0.l0;

/* renamed from: y.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2312L extends a0.p implements l0 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f17586A;

    /* renamed from: B, reason: collision with root package name */
    public F0.g f17587B;

    /* renamed from: C, reason: collision with root package name */
    public final C2310J f17588C = new C2310J(this, 0);

    /* renamed from: D, reason: collision with root package name */
    public C2310J f17589D;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1440s f17590x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC2308H f17591y;

    /* renamed from: z, reason: collision with root package name */
    public EnumC1903a0 f17592z;

    public C2312L(InterfaceC1440s interfaceC1440s, InterfaceC2308H interfaceC2308H, EnumC1903a0 enumC1903a0, boolean z7) {
        this.f17590x = interfaceC1440s;
        this.f17591y = interfaceC2308H;
        this.f17592z = enumC1903a0;
        this.f17586A = z7;
        G0();
    }

    public final void G0() {
        this.f17587B = new F0.g(new C2309I(this, 1), new C2309I(this, 2));
        this.f17589D = this.f17586A ? new C2310J(this, 1) : null;
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }

    @Override // y0.l0
    public final void y(F0.i iVar) {
        F0.s.f(iVar);
        iVar.j(F0.q.f2126E, this.f17588C);
        if (this.f17592z == EnumC1903a0.f15259k) {
            F0.g gVar = this.f17587B;
            if (gVar == null) {
                kotlin.jvm.internal.l.l("scrollAxisRange");
                throw null;
            }
            F0.t tVar = F0.q.f2143p;
            InterfaceC1443v interfaceC1443v = F0.s.a[11];
            tVar.a(iVar, gVar);
        } else {
            F0.g gVar2 = this.f17587B;
            if (gVar2 == null) {
                kotlin.jvm.internal.l.l("scrollAxisRange");
                throw null;
            }
            F0.t tVar2 = F0.q.f2142o;
            InterfaceC1443v interfaceC1443v2 = F0.s.a[10];
            tVar2.a(iVar, gVar2);
        }
        C2310J c2310j = this.f17589D;
        if (c2310j != null) {
            iVar.j(F0.h.f2075f, new F0.a(null, c2310j));
        }
        iVar.j(F0.h.f2070A, new F0.a(null, new C0042b(6, new C2309I(this, 0))));
        F0.b bVarC = this.f17591y.c();
        F0.t tVar3 = F0.q.f2133f;
        InterfaceC1443v interfaceC1443v3 = F0.s.a[20];
        tVar3.a(iVar, bVarC);
    }
}
