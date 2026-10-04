package j5;

import R4.C0580k;
import R4.EnumC0579j;
import f1.AbstractC0870c;
import u4.M;

/* renamed from: j5.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1366u extends AbstractC1368w {

    /* renamed from: d, reason: collision with root package name */
    public final C0580k f12472d;

    /* renamed from: e, reason: collision with root package name */
    public final C1366u f12473e;

    /* renamed from: f, reason: collision with root package name */
    public final W4.b f12474f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC0579j f12475g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12476h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1366u(C0580k c0580k, T4.g gVar, T4.i iVar, M m7, C1366u c1366u) {
        super(gVar, iVar, m7);
        kotlin.jvm.internal.l.f("classProto", c0580k);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        this.f12472d = c0580k;
        this.f12473e = c1366u;
        this.f12474f = AbstractC0870c.R(gVar, c0580k.f8546o);
        EnumC0579j enumC0579j = (EnumC0579j) T4.e.f9086f.c(c0580k.f8545n);
        this.f12475g = enumC0579j == null ? EnumC0579j.CLASS : enumC0579j;
        this.f12476h = T4.e.f9087g.c(c0580k.f8545n).booleanValue();
        T4.e.f9088h.getClass();
    }

    @Override // j5.AbstractC1368w
    public final W4.c a() {
        return this.f12474f.a();
    }
}
