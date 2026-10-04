package b6;

import e6.AbstractC0838b;
import e6.C0837a;
import f1.AbstractC0870c;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class H extends AbstractC0870c implements a6.k {
    public final a6.d a;

    /* renamed from: b, reason: collision with root package name */
    public final M f10985b;

    /* renamed from: c, reason: collision with root package name */
    public final V1.i f10986c;

    /* renamed from: d, reason: collision with root package name */
    public final C0837a f10987d;

    /* renamed from: e, reason: collision with root package name */
    public int f10988e;

    /* renamed from: f, reason: collision with root package name */
    public F2.G f10989f;

    /* renamed from: g, reason: collision with root package name */
    public final a6.j f10990g;

    /* renamed from: h, reason: collision with root package name */
    public final s f10991h;

    public H(a6.d dVar, M m7, V1.i iVar, SerialDescriptor serialDescriptor, F2.G g4) {
        kotlin.jvm.internal.l.f("json", dVar);
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        this.a = dVar;
        this.f10985b = m7;
        this.f10986c = iVar;
        this.f10987d = dVar.f10460b;
        this.f10988e = -1;
        this.f10989f = g4;
        a6.j jVar = dVar.a;
        this.f10990g = jVar;
        this.f10991h = jVar.f10478e ? null : new s(serialDescriptor);
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final String A() {
        a6.j jVar = this.f10990g;
        V1.i iVar = this.f10986c;
        return jVar.f10476c ? iVar.m() : iVar.j();
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final float B() throws NumberFormatException {
        V1.i iVar = this.f10986c;
        String strL = iVar.l();
        try {
            float f5 = Float.parseFloat(strL);
            if (this.a.a.f10481h || Math.abs(f5) <= Float.MAX_VALUE) {
                return f5;
            }
            v.t(iVar, Float.valueOf(f5));
            throw null;
        } catch (IllegalArgumentException unused) {
            V1.i.r(iVar, A6.b.d('\'', "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final double D() throws NumberFormatException {
        V1.i iVar = this.f10986c;
        String strL = iVar.l();
        try {
            double d4 = Double.parseDouble(strL);
            if (this.a.a.f10481h || Math.abs(d4) <= Double.MAX_VALUE) {
                return d4;
            }
            v.t(iVar, Double.valueOf(d4));
            throw null;
        } catch (IllegalArgumentException unused) {
            V1.i.r(iVar, A6.b.d('\'', "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final Y5.a a(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        a6.d dVar = this.a;
        M mS = v.s(dVar, serialDescriptor);
        V1.i iVar = this.f10986c;
        C2.H h7 = (C2.H) iVar.f9381c;
        int i7 = h7.f666l + 1;
        h7.f666l = i7;
        if (i7 == ((Object[]) h7.f667m).length) {
            h7.n();
        }
        ((Object[]) h7.f667m)[i7] = serialDescriptor;
        iVar.h(mS.f11008k);
        if (iVar.x() == 4) {
            V1.i.r(iVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = mS.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new H(this.a, mS, iVar, serialDescriptor, this.f10989f);
        }
        if (this.f10985b == mS && dVar.a.f10478e) {
            return this;
        }
        return new H(this.a, mS, iVar, serialDescriptor, this.f10989f);
    }

    @Override // f1.AbstractC0870c, Y5.a
    public final void b(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        int iF = serialDescriptor.f();
        a6.d dVar = this.a;
        if (iF == 0 && v.n(dVar, serialDescriptor)) {
            while (m(serialDescriptor) != -1) {
            }
        }
        V1.i iVar = this.f10986c;
        if (iVar.E()) {
            a6.j jVar = dVar.a;
            v.o(iVar, "");
            throw null;
        }
        iVar.h(this.f10985b.f11009l);
        C2.H h7 = (C2.H) iVar.f9381c;
        int i7 = h7.f666l;
        int[] iArr = (int[]) h7.f668n;
        if (iArr[i7] == -2) {
            iArr[i7] = -1;
            h7.f666l = i7 - 1;
        }
        int i8 = h7.f666l;
        if (i8 != -1) {
            h7.f666l = i8 - 1;
        }
    }

    @Override // Y5.a
    public final AbstractC0838b c() {
        return this.f10987d;
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final long d() {
        return this.f10986c.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlinx.serialization.KSerializer r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.H.f(kotlinx.serialization.KSerializer):java.lang.Object");
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final boolean g() {
        boolean z7;
        boolean z8;
        V1.i iVar = this.f10986c;
        int iC = iVar.C();
        if (iC == iVar.t().length()) {
            V1.i.r(iVar, "EOF", 0, null, 6);
            throw null;
        }
        if (iVar.t().charAt(iC) == '\"') {
            iC++;
            z7 = true;
        } else {
            z7 = false;
        }
        int iZ = iVar.z(iC);
        if (iZ >= iVar.t().length() || iZ == -1) {
            V1.i.r(iVar, "EOF", 0, null, 6);
            throw null;
        }
        int i7 = iZ + 1;
        int iCharAt = iVar.t().charAt(iZ) | ' ';
        if (iCharAt == 102) {
            iVar.d(i7, "alse");
            z8 = false;
        } else {
            if (iCharAt != 116) {
                V1.i.r(iVar, "Expected valid boolean literal prefix, but had '" + iVar.l() + '\'', 0, null, 6);
                throw null;
            }
            iVar.d(i7, "rue");
            z8 = true;
        }
        if (!z7) {
            return z8;
        }
        if (iVar.f9380b == iVar.t().length()) {
            V1.i.r(iVar, "EOF", 0, null, 6);
            throw null;
        }
        if (iVar.t().charAt(iVar.f9380b) == '\"') {
            iVar.f9380b++;
            return z8;
        }
        V1.i.r(iVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final boolean i() {
        s sVar = this.f10991h;
        if (!(sVar != null ? sVar.f11031b : false)) {
            V1.i iVar = this.f10986c;
            int iZ = iVar.z(iVar.C());
            int length = iVar.t().length() - iZ;
            boolean z7 = false;
            if (length >= 4 && iZ != -1) {
                int i7 = 0;
                while (true) {
                    if (i7 < 4) {
                        if ("null".charAt(i7) != iVar.t().charAt(iZ + i7)) {
                            break;
                        }
                        i7++;
                    } else if (length <= 4 || v.h(iVar.t().charAt(iZ + 4)) != 0) {
                        iVar.f9380b = iZ + 4;
                        z7 = true;
                    }
                }
            }
            if (!z7) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final char k() {
        V1.i iVar = this.f10986c;
        String strL = iVar.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        V1.i.r(iVar, A6.b.d('\'', "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final int l(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("enumDescriptor", serialDescriptor);
        return v.m(serialDescriptor, this.a, A(), " at path " + ((C2.H) this.f10986c.f9381c).j());
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f9, code lost:
    
        r1 = r13.f666l;
        r2 = (int[]) r13.f668n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0102, code lost:
    
        if (r2[r1] != (-2)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        r2[r1] = -1;
        r13.f666l = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0109, code lost:
    
        r1 = r13.f666l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010b, code lost:
    
        if (r1 == (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010d, code lost:
    
        r13.f666l = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0110, code lost:
    
        r1 = z5.AbstractC2510o.i0(0, 6, r4.D(0, r4.f9380b), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0153, code lost:
    
        throw new b6.q("Encountered an unknown key '" + r3 + "' at offset " + r1 + " at path: " + r13.j() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((java.lang.Object) b6.v.p(r4.t(), r1)), 0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(kotlinx.serialization.descriptors.SerialDescriptor r22) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.H.m(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final Decoder q(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return J.a(serialDescriptor) ? new p(this.f10986c, this.a) : this;
    }

    @Override // a6.k
    public final kotlinx.serialization.json.b r() {
        a6.j jVar = this.a.a;
        V1.i iVar = this.f10986c;
        O4.c cVar = new O4.c();
        cVar.f7553c = iVar;
        cVar.a = jVar.f10476c;
        return cVar.b();
    }

    @Override // f1.AbstractC0870c, Y5.a
    public final Object s(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        kotlin.jvm.internal.l.f("deserializer", kSerializer);
        boolean z7 = this.f10985b == M.f11004o && (i7 & 1) == 0;
        C2.H h7 = (C2.H) this.f10986c.f9381c;
        if (z7) {
            int[] iArr = (int[]) h7.f668n;
            int i8 = h7.f666l;
            if (iArr[i8] == -2) {
                ((Object[]) h7.f667m)[i8] = w.a;
            }
        }
        Object objS = super.s(serialDescriptor, i7, kSerializer, obj);
        if (z7) {
            int[] iArr2 = (int[]) h7.f668n;
            int i9 = h7.f666l;
            if (iArr2[i9] != -2) {
                int i10 = i9 + 1;
                h7.f666l = i10;
                if (i10 == ((Object[]) h7.f667m).length) {
                    h7.n();
                }
            }
            Object[] objArr = (Object[]) h7.f667m;
            int i11 = h7.f666l;
            objArr[i11] = objS;
            ((int[]) h7.f668n)[i11] = -2;
        }
        return objS;
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final int t() {
        V1.i iVar = this.f10986c;
        long jI = iVar.i();
        int i7 = (int) jI;
        if (jI == i7) {
            return i7;
        }
        V1.i.r(iVar, "Failed to parse int for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final byte w() {
        V1.i iVar = this.f10986c;
        long jI = iVar.i();
        byte b4 = (byte) jI;
        if (jI == b4) {
            return b4;
        }
        V1.i.r(iVar, "Failed to parse byte for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // f1.AbstractC0870c, kotlinx.serialization.encoding.Decoder
    public final short z() {
        V1.i iVar = this.f10986c;
        long jI = iVar.i();
        short s7 = (short) jI;
        if (jI == s7) {
            return s7;
        }
        V1.i.r(iVar, "Failed to parse short for input '" + jI + '\'', 0, null, 6);
        throw null;
    }
}
