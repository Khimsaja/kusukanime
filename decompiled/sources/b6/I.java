package b6;

import e6.AbstractC0838b;
import e6.C0837a;
import f1.AbstractC0871d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class I extends AbstractC0871d implements a6.o {
    public final E3.b a;

    /* renamed from: b, reason: collision with root package name */
    public final a6.d f10992b;

    /* renamed from: c, reason: collision with root package name */
    public final M f10993c;

    /* renamed from: d, reason: collision with root package name */
    public final a6.o[] f10994d;

    /* renamed from: e, reason: collision with root package name */
    public final C0837a f10995e;

    /* renamed from: f, reason: collision with root package name */
    public final a6.j f10996f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10997g;

    /* renamed from: h, reason: collision with root package name */
    public String f10998h;

    /* renamed from: i, reason: collision with root package name */
    public String f10999i;

    public I(E3.b bVar, a6.d dVar, M m7, a6.o[] oVarArr) {
        kotlin.jvm.internal.l.f("composer", bVar);
        kotlin.jvm.internal.l.f("json", dVar);
        this.a = bVar;
        this.f10992b = dVar;
        this.f10993c = m7;
        this.f10994d = oVarArr;
        this.f10995e = dVar.f10460b;
        this.f10996f = dVar.a;
        int iOrdinal = m7.ordinal();
        if (oVarArr != null) {
            a6.o oVar = oVarArr[iOrdinal];
            if (oVar == null && oVar == this) {
                return;
            }
            oVarArr[iOrdinal] = this;
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final void C(String str) {
        kotlin.jvm.internal.l.f("value", str);
        this.a.k(str);
    }

    @Override // f1.AbstractC0871d, Y5.b
    public final void F(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        kotlin.jvm.internal.l.f("serializer", kSerializer);
        if (obj != null || this.f10996f.f10478e) {
            super.F(serialDescriptor, i7, kSerializer, obj);
        }
    }

    @Override // f1.AbstractC0871d
    public final void Q(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        int iOrdinal = this.f10993c.ordinal();
        boolean z7 = true;
        E3.b bVar = this.a;
        if (iOrdinal == 1) {
            if (!bVar.f1931b) {
                bVar.f(',');
            }
            bVar.d();
            return;
        }
        if (iOrdinal == 2) {
            if (bVar.f1931b) {
                this.f10997g = true;
                bVar.d();
                return;
            }
            if (i7 % 2 == 0) {
                bVar.f(',');
                bVar.d();
            } else {
                bVar.f(':');
                bVar.n();
                z7 = false;
            }
            this.f10997g = z7;
            return;
        }
        if (iOrdinal == 3) {
            if (i7 == 0) {
                this.f10997g = true;
            }
            if (i7 == 1) {
                bVar.f(',');
                bVar.n();
                this.f10997g = false;
                return;
            }
            return;
        }
        if (!bVar.f1931b) {
            bVar.f(',');
        }
        bVar.d();
        a6.d dVar = this.f10992b;
        kotlin.jvm.internal.l.f("json", dVar);
        v.q(dVar, serialDescriptor);
        C(serialDescriptor.g(i7));
        bVar.f(':');
        bVar.n();
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final Y5.b a(SerialDescriptor serialDescriptor) {
        a6.o oVar;
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        a6.d dVar = this.f10992b;
        M mS = v.s(dVar, serialDescriptor);
        char c2 = mS.f11008k;
        E3.b bVar = this.a;
        bVar.f(c2);
        bVar.f1931b = true;
        String str = this.f10998h;
        if (str != null) {
            String strE = this.f10999i;
            if (strE == null) {
                strE = serialDescriptor.e();
            }
            bVar.d();
            C(str);
            bVar.f(':');
            C(strE);
            this.f10998h = null;
            this.f10999i = null;
        }
        if (this.f10993c == mS) {
            return this;
        }
        a6.o[] oVarArr = this.f10994d;
        return (oVarArr == null || (oVar = oVarArr[mS.ordinal()]) == null) ? new I(bVar, dVar, mS, oVarArr) : oVar;
    }

    @Override // f1.AbstractC0871d, Y5.b
    public final void b(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        M m7 = this.f10993c;
        E3.b bVar = this.a;
        bVar.getClass();
        bVar.f1931b = false;
        bVar.f(m7.f11009l);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final AbstractC0838b c() {
        return this.f10995e;
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final void f() {
        this.a.i("null");
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final void g(double d4) {
        boolean z7 = this.f10997g;
        E3.b bVar = this.a;
        if (z7) {
            C(String.valueOf(d4));
        } else {
            ((o) bVar.f1932c).p(String.valueOf(d4));
        }
        if (!this.f10996f.f10481h && Math.abs(d4) > Double.MAX_VALUE) {
            throw v.a(Double.valueOf(d4), ((o) bVar.f1932c).toString());
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final void h(short s7) {
        if (this.f10997g) {
            C(String.valueOf((int) s7));
        } else {
            this.a.j(s7);
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final void k(byte b4) {
        if (this.f10997g) {
            C(String.valueOf((int) b4));
        } else {
            this.a.e(b4);
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final void l(boolean z7) {
        if (this.f10997g) {
            C(String.valueOf(z7));
        } else {
            ((o) this.a.f1932c).p(String.valueOf(z7));
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final void m(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("enumDescriptor", serialDescriptor);
        C(serialDescriptor.g(i7));
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final void o(int i7) {
        if (this.f10997g) {
            C(String.valueOf(i7));
        } else {
            this.a.g(i7);
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final Encoder p(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        boolean zA = J.a(serialDescriptor);
        M m7 = this.f10993c;
        a6.d dVar = this.f10992b;
        E3.b c0736k = this.a;
        if (zA) {
            if (!(c0736k instanceof C0737l)) {
                c0736k = new C0737l((o) c0736k.f1932c, this.f10997g);
            }
            return new I(c0736k, dVar, m7, null);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(a6.l.a)) {
            if (!(c0736k instanceof C0736k)) {
                c0736k = new C0736k((o) c0736k.f1932c, this.f10997g);
            }
            return new I(c0736k, dVar, m7, null);
        }
        if (this.f10998h != null) {
            this.f10999i = serialDescriptor.e();
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(kotlinx.serialization.KSerializer r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.l.f(r0, r5)
            a6.d r0 = r4.f10992b
            a6.j r1 = r0.a
            boolean r2 = r5 instanceof Z5.AbstractC0625b
            if (r2 == 0) goto L14
            a6.a r1 = r1.f10483j
            a6.a r3 = a6.EnumC0671a.f10453k
            if (r1 == r3) goto L4a
            goto L41
        L14:
            a6.a r1 = r1.f10483j
            int r1 = r1.ordinal()
            if (r1 == 0) goto L4a
            r3 = 1
            if (r1 == r3) goto L29
            r0 = 2
            if (r1 != r0) goto L23
            goto L4a
        L23:
            D6.r r5 = new D6.r
            r5.<init>()
            throw r5
        L29:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getDescriptor()
            n6.d r1 = r1.c()
            X5.j r3 = X5.j.f9951h
            boolean r3 = kotlin.jvm.internal.l.a(r1, r3)
            if (r3 != 0) goto L41
            X5.j r3 = X5.j.f9954k
            boolean r1 = kotlin.jvm.internal.l.a(r1, r3)
            if (r1 == 0) goto L4a
        L41:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getDescriptor()
            java.lang.String r0 = b6.v.j(r0, r1)
            goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r2 == 0) goto L89
            r1 = r5
            Z5.b r1 = (Z5.AbstractC0625b) r1
            if (r6 == 0) goto L68
            kotlinx.serialization.KSerializer r1 = n6.m.z(r1, r4, r6)
            if (r0 == 0) goto L66
            b6.v.f(r5, r1, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r1.getDescriptor()
            n6.d r5 = r5.c()
            b6.v.i(r5)
        L66:
            r5 = r1
            goto L89
        L68:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Value for serializer "
            r5.<init>(r6)
            kotlinx.serialization.descriptors.SerialDescriptor r6 = r1.getDescriptor()
            r5.append(r6)
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L89:
            if (r0 == 0) goto L97
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getDescriptor()
            java.lang.String r1 = r1.e()
            r4.f10998h = r0
            r4.f10999i = r1
        L97:
            r5.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.I.r(kotlinx.serialization.KSerializer, java.lang.Object):void");
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final void s(float f5) {
        boolean z7 = this.f10997g;
        E3.b bVar = this.a;
        if (z7) {
            C(String.valueOf(f5));
        } else {
            ((o) bVar.f1932c).p(String.valueOf(f5));
        }
        if (!this.f10996f.f10481h && Math.abs(f5) > Float.MAX_VALUE) {
            throw v.a(Float.valueOf(f5), ((o) bVar.f1932c).toString());
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final void v(long j7) {
        if (this.f10997g) {
            C(String.valueOf(j7));
        } else {
            this.a.h(j7);
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public final void w(char c2) {
        C(String.valueOf(c2));
    }

    @Override // a6.o
    public final void y(kotlinx.serialization.json.c cVar) {
        r(a6.m.a, cVar);
    }

    @Override // f1.AbstractC0871d, Y5.b
    public final boolean z(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return this.f10996f.a;
    }
}
