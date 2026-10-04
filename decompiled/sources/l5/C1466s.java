package l5;

import R4.B;
import X4.AbstractC0605b;
import b1.AbstractC0703b;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import u4.M;
import x4.AbstractC2294u;
import x4.C2266L;

/* renamed from: l5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1466s extends C2266L implements InterfaceC1449b {

    /* renamed from: N, reason: collision with root package name */
    public final B f12827N;

    /* renamed from: O, reason: collision with root package name */
    public final T4.g f12828O;

    /* renamed from: P, reason: collision with root package name */
    public final T4.i f12829P;

    /* renamed from: Q, reason: collision with root package name */
    public final T4.k f12830Q;

    /* renamed from: R, reason: collision with root package name */
    public final P4.g f12831R;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public C1466s(u4.InterfaceC2105k r12, x4.C2266L r13, v4.h r14, W4.e r15, int r16, R4.B r17, T4.g r18, T4.i r19, T4.k r20, P4.g r21, u4.M r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.l.f(r0, r12)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.l.f(r0, r14)
            java.lang.String r0 = "kind"
            r5 = r16
            b1.AbstractC0703b.w(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.l.f(r0, r7)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.l.f(r0, r8)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.l.f(r0, r9)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.l.f(r0, r10)
            if (r22 != 0) goto L38
            u4.N r0 = u4.M.f16295i
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f12827N = r7
            r11.f12828O = r8
            r11.f12829P = r9
            r11.f12830Q = r10
            r1 = r21
            r11.f12831R = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C1466s.<init>(u4.k, x4.L, v4.h, W4.e, int, R4.B, T4.g, T4.i, T4.k, P4.g, u4.M):void");
    }

    @Override // l5.InterfaceC1459l
    public final AbstractC0605b H() {
        return this.f12827N;
    }

    @Override // x4.C2266L, x4.AbstractC2294u
    public final AbstractC2294u P0(int i7, W4.e eVar, InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, M m7, v4.h hVar) {
        kotlin.jvm.internal.l.f("newOwner", interfaceC2105k);
        AbstractC0703b.w(i7, "kind");
        kotlin.jvm.internal.l.f("annotations", hVar);
        C2266L c2266l = (C2266L) interfaceC2112s;
        if (eVar == null) {
            eVar = getName();
            kotlin.jvm.internal.l.e("getName(...)", eVar);
        }
        C1466s c1466s = new C1466s(interfaceC2105k, c2266l, hVar, eVar, i7, this.f12827N, this.f12828O, this.f12829P, this.f12830Q, this.f12831R, m7);
        c1466s.f17486F = this.f17486F;
        return c1466s;
    }

    @Override // l5.InterfaceC1459l
    public final T4.i d0() {
        return this.f12829P;
    }

    @Override // l5.InterfaceC1459l
    public final T4.g n0() {
        return this.f12828O;
    }

    @Override // l5.InterfaceC1459l
    public final InterfaceC1458k p() {
        return this.f12831R;
    }
}
