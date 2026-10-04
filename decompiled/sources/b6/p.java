package b6;

import e6.AbstractC0838b;
import e6.C0837a;
import f.AbstractC0841b;
import f1.AbstractC0870c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class p extends AbstractC0870c {
    public final V1.i a;

    /* renamed from: b, reason: collision with root package name */
    public final C0837a f11029b;

    public p(V1.i iVar, a6.d dVar) {
        kotlin.jvm.internal.l.f("json", dVar);
        this.a = iVar;
        this.f11029b = dVar.f10460b;
    }

    @Override // Y5.a
    public final AbstractC0838b c() {
        return this.f11029b;
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final long d() {
        V1.i iVar = this.a;
        String strL = iVar.l();
        try {
            kotlin.jvm.internal.l.f("<this>", strL);
            O3.x xVarS = AbstractC0841b.s(strL);
            if (xVarS != null) {
                return xVarS.f7548k;
            }
            AbstractC2517v.N(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            V1.i.r(iVar, A6.b.d('\'', "Failed to parse type 'ULong' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // Y5.a
    public final int m(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        throw new IllegalStateException("unsupported");
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final int t() {
        V1.i iVar = this.a;
        String strL = iVar.l();
        try {
            kotlin.jvm.internal.l.f("<this>", strL);
            O3.v vVarR = AbstractC0841b.r(strL);
            if (vVarR != null) {
                return vVarR.f7546k;
            }
            AbstractC2517v.N(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            V1.i.r(iVar, A6.b.d('\'', "Failed to parse type 'UInt' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final byte w() {
        O3.s sVar;
        V1.i iVar = this.a;
        String strL = iVar.l();
        try {
            kotlin.jvm.internal.l.f("<this>", strL);
            O3.v vVarR = AbstractC0841b.r(strL);
            if (vVarR != null) {
                int i7 = vVarR.f7546k;
                sVar = Integer.compare(Integer.MIN_VALUE ^ i7, -2147483393) > 0 ? null : new O3.s((byte) i7);
            }
            if (sVar != null) {
                return sVar.f7541k;
            }
            AbstractC2517v.N(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            V1.i.r(iVar, A6.b.d('\'', "Failed to parse type 'UByte' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final short z() {
        O3.A a;
        V1.i iVar = this.a;
        String strL = iVar.l();
        try {
            kotlin.jvm.internal.l.f("<this>", strL);
            O3.v vVarR = AbstractC0841b.r(strL);
            if (vVarR != null) {
                int i7 = vVarR.f7546k;
                a = Integer.compare(Integer.MIN_VALUE ^ i7, -2147418113) > 0 ? null : new O3.A((short) i7);
            }
            if (a != null) {
                return a.f7509k;
            }
            AbstractC2517v.N(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            V1.i.r(iVar, A6.b.d('\'', "Failed to parse type 'UShort' for input '", strL), 0, null, 6);
            throw null;
        }
    }
}
