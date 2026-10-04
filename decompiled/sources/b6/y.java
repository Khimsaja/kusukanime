package b6;

import Z5.C0640i0;
import e6.AbstractC0838b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes.dex */
public class y implements a6.o, Encoder, Y5.b {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final a6.d f11041b;

    /* renamed from: c, reason: collision with root package name */
    public final e4.k f11042c;

    /* renamed from: d, reason: collision with root package name */
    public final a6.j f11043d;

    /* renamed from: e, reason: collision with root package name */
    public String f11044e;

    /* renamed from: f, reason: collision with root package name */
    public String f11045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11046g;

    /* renamed from: h, reason: collision with root package name */
    public Object f11047h;

    public y(a6.d dVar, e4.k kVar, char c2) {
        this.a = new ArrayList();
        this.f11041b = dVar;
        this.f11042c = kVar;
        this.f11043d = dVar.a;
    }

    @Override // Y5.b
    public final void A(SerialDescriptor serialDescriptor, int i7, boolean z7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        String strL = L(serialDescriptor, i7);
        Boolean boolValueOf = Boolean.valueOf(z7);
        Z5.I i8 = a6.l.a;
        N(strL, new a6.r(boolValueOf, false, null));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void C(String str) {
        kotlin.jvm.internal.l.f("value", str);
        String str2 = (String) M();
        kotlin.jvm.internal.l.f("tag", str2);
        N(str2, a6.l.b(str));
    }

    @Override // Y5.b
    public final void D(C0640i0 c0640i0, int i7, short s7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        N(L(c0640i0, i7), a6.l.a(Short.valueOf(s7)));
    }

    @Override // Y5.b
    public final void E(SerialDescriptor serialDescriptor, int i7, String str) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        kotlin.jvm.internal.l.f("value", str);
        N(L(serialDescriptor, i7), a6.l.b(str));
    }

    @Override // Y5.b
    public void F(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        switch (this.f11046g) {
            case 1:
                kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
                kotlin.jvm.internal.l.f("serializer", kSerializer);
                if (obj != null || this.f11043d.f10478e) {
                    G(serialDescriptor, i7, kSerializer, obj);
                    break;
                }
                break;
            default:
                G(serialDescriptor, i7, kSerializer, obj);
                break;
        }
    }

    public final void G(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        kotlin.jvm.internal.l.f("serializer", kSerializer);
        this.a.add(L(serialDescriptor, i7));
        super.B(kSerializer, obj);
    }

    public final void H(Object obj, double d4) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        N(str, a6.l.a(Double.valueOf(d4)));
        if (this.f11043d.f10481h || Math.abs(d4) <= Double.MAX_VALUE) {
            return;
        }
        Double dValueOf = Double.valueOf(d4);
        String string = K().toString();
        kotlin.jvm.internal.l.f("output", string);
        throw new q(v.v(dValueOf, str, string), 1);
    }

    public final void I(Object obj, float f5) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        N(str, a6.l.a(Float.valueOf(f5)));
        if (this.f11043d.f10481h || Math.abs(f5) <= Float.MAX_VALUE) {
            return;
        }
        Float fValueOf = Float.valueOf(f5);
        String string = K().toString();
        kotlin.jvm.internal.l.f("output", string);
        throw new q(v.v(fValueOf, str, string), 1);
    }

    public final Encoder J(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        kotlin.jvm.internal.l.f("inlineDescriptor", serialDescriptor);
        if (J.a(serialDescriptor)) {
            return new C0727b(this, str);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(a6.l.a)) {
            return new C0727b(this, str, serialDescriptor);
        }
        this.a.add(str);
        return this;
    }

    public kotlinx.serialization.json.b K() {
        switch (this.f11046g) {
            case 0:
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) this.f11047h;
                if (bVar != null) {
                    return bVar;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
            case 1:
                return new kotlinx.serialization.json.c((LinkedHashMap) this.f11047h);
            default:
                return new kotlinx.serialization.json.a((ArrayList) this.f11047h);
        }
    }

    public final String L(SerialDescriptor serialDescriptor, int i7) {
        String strValueOf;
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        switch (this.f11046g) {
            case 2:
                kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
                strValueOf = String.valueOf(i7);
                break;
            default:
                kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
                a6.d dVar = this.f11041b;
                kotlin.jvm.internal.l.f("json", dVar);
                v.q(dVar, serialDescriptor);
                strValueOf = serialDescriptor.g(i7);
                break;
        }
        kotlin.jvm.internal.l.f("nestedName", strValueOf);
        return strValueOf;
    }

    public final Object M() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            throw new V5.j("No tag in stack for requested element");
        }
        return arrayList.remove(P3.r.y(arrayList));
    }

    public void N(String str, kotlinx.serialization.json.b bVar) {
        switch (this.f11046g) {
            case 0:
                kotlin.jvm.internal.l.f("key", str);
                kotlin.jvm.internal.l.f("element", bVar);
                if (str != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
                }
                if (((kotlinx.serialization.json.b) this.f11047h) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                }
                this.f11047h = bVar;
                this.f11042c.invoke(bVar);
                return;
            case 1:
                kotlin.jvm.internal.l.f("key", str);
                kotlin.jvm.internal.l.f("element", bVar);
                ((LinkedHashMap) this.f11047h).put(str, bVar);
                return;
            default:
                kotlin.jvm.internal.l.f("key", str);
                kotlin.jvm.internal.l.f("element", bVar);
                ((ArrayList) this.f11047h).add(Integer.parseInt(str), bVar);
                return;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Y5.b a(SerialDescriptor serialDescriptor) {
        y yVar;
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        e4.k dVar = P3.q.B0(this.a) == null ? this.f11042c : new A3.d(6, this);
        n6.d dVarC = serialDescriptor.c();
        boolean zA = kotlin.jvm.internal.l.a(dVarC, X5.j.f9952i);
        a6.d dVar2 = this.f11041b;
        if (zA || (dVarC instanceof X5.d)) {
            yVar = new y(dVar2, dVar, 2);
        } else if (kotlin.jvm.internal.l.a(dVarC, X5.j.f9953j)) {
            SerialDescriptor serialDescriptorG = v.g(serialDescriptor.j(0), dVar2.f10460b);
            n6.d dVarC2 = serialDescriptorG.c();
            if ((dVarC2 instanceof X5.f) || kotlin.jvm.internal.l.a(dVarC2, X5.i.f9950h)) {
                kotlin.jvm.internal.l.f("nodeConsumer", dVar);
                C0723D c0723d = new C0723D(dVar2, dVar, 1);
                c0723d.f10969j = true;
                yVar = c0723d;
            } else {
                if (!dVar2.a.f10477d) {
                    throw v.b(serialDescriptorG);
                }
                yVar = new y(dVar2, dVar, 2);
            }
        } else {
            yVar = new y(dVar2, dVar, 1);
        }
        String str = this.f11044e;
        if (str != null) {
            if (yVar instanceof C0723D) {
                C0723D c0723d2 = (C0723D) yVar;
                c0723d2.N("key", a6.l.b(str));
                String strE = this.f11045f;
                if (strE == null) {
                    strE = serialDescriptor.e();
                }
                c0723d2.N("value", a6.l.b(strE));
            } else {
                String strE2 = this.f11045f;
                if (strE2 == null) {
                    strE2 = serialDescriptor.e();
                }
                yVar.N(str, a6.l.b(strE2));
            }
            this.f11044e = null;
            this.f11045f = null;
        }
        return yVar;
    }

    @Override // Y5.b
    public final void b(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        if (!this.a.isEmpty()) {
            M();
        }
        this.f11042c.invoke(K());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final AbstractC0838b c() {
        return this.f11041b.f10460b;
    }

    @Override // Y5.b
    public final void d(C0640i0 c0640i0, int i7, byte b4) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        N(L(c0640i0, i7), a6.l.a(Byte.valueOf(b4)));
    }

    @Override // Y5.b
    public final void e(C0640i0 c0640i0, int i7, char c2) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        N(L(c0640i0, i7), a6.l.b(String.valueOf(c2)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void f() {
        String str = (String) P3.q.B0(this.a);
        if (str == null) {
            this.f11042c.invoke(JsonNull.INSTANCE);
        } else {
            N(str, JsonNull.INSTANCE);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void g(double d4) {
        H(M(), d4);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void h(short s7) {
        String str = (String) M();
        kotlin.jvm.internal.l.f("tag", str);
        N(str, a6.l.a(Short.valueOf(s7)));
    }

    @Override // Y5.b
    public final void j(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        kotlin.jvm.internal.l.f("serializer", kSerializer);
        this.a.add(L(serialDescriptor, i7));
        r(kSerializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void k(byte b4) {
        String str = (String) M();
        kotlin.jvm.internal.l.f("tag", str);
        N(str, a6.l.a(Byte.valueOf(b4)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void l(boolean z7) {
        String str = (String) M();
        kotlin.jvm.internal.l.f("tag", str);
        Boolean boolValueOf = Boolean.valueOf(z7);
        Z5.I i7 = a6.l.a;
        N(str, new a6.r(boolValueOf, false, null));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void m(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("enumDescriptor", serialDescriptor);
        String str = (String) M();
        kotlin.jvm.internal.l.f("tag", str);
        N(str, a6.l.b(serialDescriptor.g(i7)));
    }

    @Override // Y5.b
    public final void n(C0640i0 c0640i0, int i7, double d4) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        H(L(c0640i0, i7), d4);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void o(int i7) {
        String str = (String) M();
        kotlin.jvm.internal.l.f("tag", str);
        N(str, a6.l.a(Integer.valueOf(i7)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder p(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        if (P3.q.B0(this.a) == null) {
            return new y(this.f11041b, this.f11042c, 0).p(serialDescriptor);
        }
        if (this.f11044e != null) {
            this.f11045f = serialDescriptor.e();
        }
        return J(M(), serialDescriptor);
    }

    @Override // Y5.b
    public final void q(int i7, int i8, SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        N(L(serialDescriptor, i7), a6.l.a(Integer.valueOf(i8)));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
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
            java.util.ArrayList r0 = r4.a
            java.lang.Object r0 = P3.q.B0(r0)
            a6.d r1 = r4.f11041b
            if (r0 != 0) goto L35
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getDescriptor()
            e6.a r2 = r1.f10460b
            kotlinx.serialization.descriptors.SerialDescriptor r0 = b6.v.g(r0, r2)
            n6.d r2 = r0.c()
            boolean r2 = r2 instanceof X5.f
            if (r2 != 0) goto L29
            n6.d r0 = r0.c()
            X5.i r2 = X5.i.f9950h
            if (r0 != r2) goto L35
        L29:
            b6.y r0 = new b6.y
            e4.k r2 = r4.f11042c
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.r(r5, r6)
            return
        L35:
            a6.j r0 = r1.a
            boolean r2 = r5 instanceof Z5.AbstractC0625b
            if (r2 == 0) goto L42
            a6.a r0 = r0.f10483j
            a6.a r3 = a6.EnumC0671a.f10453k
            if (r0 == r3) goto L78
            goto L6f
        L42:
            a6.a r0 = r0.f10483j
            int r0 = r0.ordinal()
            if (r0 == 0) goto L78
            r3 = 1
            if (r0 == r3) goto L57
            r1 = 2
            if (r0 != r1) goto L51
            goto L78
        L51:
            D6.r r5 = new D6.r
            r5.<init>()
            throw r5
        L57:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getDescriptor()
            n6.d r0 = r0.c()
            X5.j r3 = X5.j.f9951h
            boolean r3 = kotlin.jvm.internal.l.a(r0, r3)
            if (r3 != 0) goto L6f
            X5.j r3 = X5.j.f9954k
            boolean r0 = kotlin.jvm.internal.l.a(r0, r3)
            if (r0 == 0) goto L78
        L6f:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getDescriptor()
            java.lang.String r0 = b6.v.j(r1, r0)
            goto L79
        L78:
            r0 = 0
        L79:
            if (r2 == 0) goto Lb7
            r1 = r5
            Z5.b r1 = (Z5.AbstractC0625b) r1
            if (r6 == 0) goto L96
            kotlinx.serialization.KSerializer r1 = n6.m.z(r1, r4, r6)
            if (r0 == 0) goto L94
            b6.v.f(r5, r1, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r1.getDescriptor()
            n6.d r5 = r5.c()
            b6.v.i(r5)
        L94:
            r5 = r1
            goto Lb7
        L96:
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
        Lb7:
            if (r0 == 0) goto Lc5
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getDescriptor()
            java.lang.String r1 = r1.e()
            r4.f11044e = r0
            r4.f11045f = r1
        Lc5:
            r5.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.y.r(kotlinx.serialization.KSerializer, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void s(float f5) {
        I(M(), f5);
    }

    @Override // Y5.b
    public final Encoder t(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return J(L(c0640i0, i7), c0640i0.j(i7));
    }

    @Override // Y5.b
    public final void u(C0640i0 c0640i0, int i7, float f5) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        I(L(c0640i0, i7), f5);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void v(long j7) {
        String str = (String) M();
        kotlin.jvm.internal.l.f("tag", str);
        N(str, a6.l.a(Long.valueOf(j7)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void w(char c2) {
        String str = (String) M();
        kotlin.jvm.internal.l.f("tag", str);
        N(str, a6.l.b(String.valueOf(c2)));
    }

    @Override // Y5.b
    public final void x(SerialDescriptor serialDescriptor, int i7, long j7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        N(L(serialDescriptor, i7), a6.l.a(Long.valueOf(j7)));
    }

    @Override // a6.o
    public final void y(kotlinx.serialization.json.c cVar) {
        r(a6.m.a, cVar);
    }

    @Override // Y5.b
    public final boolean z(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return this.f11043d.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(a6.d dVar, e4.k kVar, int i7) {
        this(dVar, kVar, (char) 0);
        this.f11046g = i7;
        switch (i7) {
            case 1:
                kotlin.jvm.internal.l.f("json", dVar);
                kotlin.jvm.internal.l.f("nodeConsumer", kVar);
                this(dVar, kVar, (char) 0);
                this.f11047h = new LinkedHashMap();
                break;
            case 2:
                kotlin.jvm.internal.l.f("json", dVar);
                kotlin.jvm.internal.l.f("nodeConsumer", kVar);
                this(dVar, kVar, (char) 0);
                this.f11047h = new ArrayList();
                break;
            default:
                kotlin.jvm.internal.l.f("json", dVar);
                kotlin.jvm.internal.l.f("nodeConsumer", kVar);
                this.a.add("primitive");
                break;
        }
    }
}
