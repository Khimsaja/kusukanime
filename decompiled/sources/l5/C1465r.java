package l5;

import R4.J;
import X4.AbstractC0605b;
import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import u4.EnumC2117x;
import u4.InterfaceC2105k;
import u4.K;
import u4.M;
import x4.C2263I;

/* renamed from: l5.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1465r extends C2263I implements InterfaceC1449b {

    /* renamed from: K, reason: collision with root package name */
    public final J f12822K;

    /* renamed from: L, reason: collision with root package name */
    public final T4.g f12823L;

    /* renamed from: M, reason: collision with root package name */
    public final T4.i f12824M;

    /* renamed from: N, reason: collision with root package name */
    public final T4.k f12825N;

    /* renamed from: O, reason: collision with root package name */
    public final P4.g f12826O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1465r(InterfaceC2105k interfaceC2105k, K k7, v4.h hVar, EnumC2117x enumC2117x, H4.o oVar, boolean z7, W4.e eVar, int i7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, J j7, T4.g gVar, T4.i iVar, T4.k kVar, P4.g gVar2) {
        super(interfaceC2105k, k7, hVar, enumC2117x, oVar, z7, eVar, i7, M.f16295i, z8, z9, z12, z10, z11);
        kotlin.jvm.internal.l.f("containingDeclaration", interfaceC2105k);
        kotlin.jvm.internal.l.f("annotations", hVar);
        kotlin.jvm.internal.l.f("modality", enumC2117x);
        kotlin.jvm.internal.l.f("visibility", oVar);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        AbstractC0703b.w(i7, "kind");
        kotlin.jvm.internal.l.f("proto", j7);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        kotlin.jvm.internal.l.f("typeTable", iVar);
        kotlin.jvm.internal.l.f("versionRequirementTable", kVar);
        this.f12822K = j7;
        this.f12823L = gVar;
        this.f12824M = iVar;
        this.f12825N = kVar;
        this.f12826O = gVar2;
    }

    @Override // l5.InterfaceC1459l
    public final AbstractC0605b H() {
        return this.f12822K;
    }

    @Override // x4.C2263I
    public final C2263I P0(InterfaceC2105k interfaceC2105k, EnumC2117x enumC2117x, H4.o oVar, K k7, int i7, W4.e eVar) {
        kotlin.jvm.internal.l.f("newOwner", interfaceC2105k);
        kotlin.jvm.internal.l.f("newModality", enumC2117x);
        kotlin.jvm.internal.l.f("newVisibility", oVar);
        AbstractC0703b.w(i7, "kind");
        kotlin.jvm.internal.l.f("newName", eVar);
        return new C1465r(interfaceC2105k, k7, getAnnotations(), enumC2117x, oVar, this.f17384p, eVar, i7, this.f17392x, this.f17393y, isExternal(), this.f17377B, this.f17394z, this.f12822K, this.f12823L, this.f12824M, this.f12825N, this.f12826O);
    }

    @Override // l5.InterfaceC1459l
    public final T4.i d0() {
        return this.f12824M;
    }

    @Override // x4.C2263I, u4.InterfaceC2116w
    public final boolean isExternal() {
        return T4.e.f9072E.c(this.f12822K.f8213n).booleanValue();
    }

    @Override // l5.InterfaceC1459l
    public final T4.g n0() {
        return this.f12823L;
    }

    @Override // l5.InterfaceC1459l
    public final InterfaceC1458k p() {
        return this.f12826O;
    }
}
