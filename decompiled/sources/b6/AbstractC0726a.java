package b6;

import Z5.AbstractC0625b;
import Z5.C0640i0;
import b1.AbstractC0703b;
import e6.AbstractC0838b;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0726a implements a6.k, Decoder, Y5.a {
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f11010b;

    /* renamed from: c, reason: collision with root package name */
    public final a6.d f11011c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11012d;

    /* renamed from: e, reason: collision with root package name */
    public final a6.j f11013e;

    public AbstractC0726a(a6.d dVar, String str) {
        this.f11011c = dVar;
        this.f11012d = str;
        this.f11013e = dVar.a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String A() {
        return P(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float B() {
        return K(T());
    }

    @Override // Y5.a
    public final char C(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return I(R(c0640i0, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double D() {
        return J(T());
    }

    public abstract kotlinx.serialization.json.b E(String str);

    public final kotlinx.serialization.json.b F() {
        kotlinx.serialization.json.b bVarE;
        String str = (String) P3.q.B0(this.a);
        return (str == null || (bVarE = E(str)) == null) ? S() : bVarE;
    }

    public final boolean G(Object obj) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        kotlinx.serialization.json.b bVarE = E(str);
        if (!(bVarE instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
            sb.append(zVar.b(kotlinx.serialization.json.d.class).n());
            sb.append(", but had ");
            sb.append(zVar.b(bVarE.getClass()).n());
            sb.append(" as the serialized body of boolean at element: ");
            sb.append(V(str));
            throw v.c(-1, bVarE.toString(), sb.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarE;
        try {
            Z5.I i7 = a6.l.a;
            kotlin.jvm.internal.l.f("<this>", dVar);
            String strA = dVar.a();
            String[] strArr = L.a;
            kotlin.jvm.internal.l.f("<this>", strA);
            Boolean bool = strA.equalsIgnoreCase("true") ? Boolean.TRUE : strA.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            W(dVar, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(dVar, "boolean", str);
            throw null;
        }
    }

    public final byte H(Object obj) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        kotlinx.serialization.json.b bVarE = E(str);
        if (!(bVarE instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
            sb.append(zVar.b(kotlinx.serialization.json.d.class).n());
            sb.append(", but had ");
            sb.append(zVar.b(bVarE.getClass()).n());
            sb.append(" as the serialized body of byte at element: ");
            sb.append(V(str));
            throw v.c(-1, bVarE.toString(), sb.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarE;
        try {
            long jG = a6.l.g(dVar);
            Byte bValueOf = (-128 > jG || jG > 127) ? null : Byte.valueOf((byte) jG);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            W(dVar, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(dVar, "byte", str);
            throw null;
        }
    }

    public final char I(Object obj) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        kotlinx.serialization.json.b bVarE = E(str);
        if (bVarE instanceof kotlinx.serialization.json.d) {
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarE;
            try {
                return AbstractC2510o.s0(dVar.a());
            } catch (IllegalArgumentException unused) {
                W(dVar, "char", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        sb.append(zVar.b(kotlinx.serialization.json.d.class).n());
        sb.append(", but had ");
        sb.append(zVar.b(bVarE.getClass()).n());
        sb.append(" as the serialized body of char at element: ");
        sb.append(V(str));
        throw v.c(-1, bVarE.toString(), sb.toString());
    }

    public final double J(Object obj) throws NumberFormatException {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        kotlinx.serialization.json.b bVarE = E(str);
        if (!(bVarE instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
            sb.append(zVar.b(kotlinx.serialization.json.d.class).n());
            sb.append(", but had ");
            sb.append(zVar.b(bVarE.getClass()).n());
            sb.append(" as the serialized body of double at element: ");
            sb.append(V(str));
            throw v.c(-1, bVarE.toString(), sb.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarE;
        try {
            Z5.I i7 = a6.l.a;
            kotlin.jvm.internal.l.f("<this>", dVar);
            double d4 = Double.parseDouble(dVar.a());
            if (this.f11011c.a.f10481h || Math.abs(d4) <= Double.MAX_VALUE) {
                return d4;
            }
            Double dValueOf = Double.valueOf(d4);
            String string = F().toString();
            kotlin.jvm.internal.l.f("output", string);
            throw v.d(-1, v.v(dValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            W(dVar, "double", str);
            throw null;
        }
    }

    public final float K(Object obj) throws NumberFormatException {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        kotlinx.serialization.json.b bVarE = E(str);
        if (!(bVarE instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
            sb.append(zVar.b(kotlinx.serialization.json.d.class).n());
            sb.append(", but had ");
            sb.append(zVar.b(bVarE.getClass()).n());
            sb.append(" as the serialized body of float at element: ");
            sb.append(V(str));
            throw v.c(-1, bVarE.toString(), sb.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarE;
        try {
            Z5.I i7 = a6.l.a;
            kotlin.jvm.internal.l.f("<this>", dVar);
            float f5 = Float.parseFloat(dVar.a());
            if (this.f11011c.a.f10481h || Math.abs(f5) <= Float.MAX_VALUE) {
                return f5;
            }
            Float fValueOf = Float.valueOf(f5);
            String string = F().toString();
            kotlin.jvm.internal.l.f("output", string);
            throw v.d(-1, v.v(fValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            W(dVar, "float", str);
            throw null;
        }
    }

    public final Decoder L(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        kotlin.jvm.internal.l.f("inlineDescriptor", serialDescriptor);
        if (!J.a(serialDescriptor)) {
            this.a.add(str);
            return this;
        }
        kotlinx.serialization.json.b bVarE = E(str);
        String strE = serialDescriptor.e();
        if (bVarE instanceof kotlinx.serialization.json.d) {
            String strA = ((kotlinx.serialization.json.d) bVarE).a();
            a6.d dVar = this.f11011c;
            kotlin.jvm.internal.l.f("json", dVar);
            kotlin.jvm.internal.l.f("source", strA);
            return new p(new K(strA), dVar);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        sb.append(zVar.b(kotlinx.serialization.json.d.class).n());
        sb.append(", but had ");
        sb.append(zVar.b(bVarE.getClass()).n());
        sb.append(" as the serialized body of ");
        sb.append(strE);
        sb.append(" at element: ");
        sb.append(V(str));
        throw v.c(-1, bVarE.toString(), sb.toString());
    }

    public final int M(Object obj) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        kotlinx.serialization.json.b bVarE = E(str);
        if (!(bVarE instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
            sb.append(zVar.b(kotlinx.serialization.json.d.class).n());
            sb.append(", but had ");
            sb.append(zVar.b(bVarE.getClass()).n());
            sb.append(" as the serialized body of int at element: ");
            sb.append(V(str));
            throw v.c(-1, bVarE.toString(), sb.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarE;
        try {
            long jG = a6.l.g(dVar);
            Integer numValueOf = (-2147483648L > jG || jG > 2147483647L) ? null : Integer.valueOf((int) jG);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            W(dVar, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(dVar, "int", str);
            throw null;
        }
    }

    public final long N(Object obj) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        kotlinx.serialization.json.b bVarE = E(str);
        if (bVarE instanceof kotlinx.serialization.json.d) {
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarE;
            try {
                return a6.l.g(dVar);
            } catch (IllegalArgumentException unused) {
                W(dVar, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        sb.append(zVar.b(kotlinx.serialization.json.d.class).n());
        sb.append(", but had ");
        sb.append(zVar.b(bVarE.getClass()).n());
        sb.append(" as the serialized body of long at element: ");
        sb.append(V(str));
        throw v.c(-1, bVarE.toString(), sb.toString());
    }

    public final short O(Object obj) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        kotlinx.serialization.json.b bVarE = E(str);
        if (!(bVarE instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
            sb.append(zVar.b(kotlinx.serialization.json.d.class).n());
            sb.append(", but had ");
            sb.append(zVar.b(bVarE.getClass()).n());
            sb.append(" as the serialized body of short at element: ");
            sb.append(V(str));
            throw v.c(-1, bVarE.toString(), sb.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarE;
        try {
            long jG = a6.l.g(dVar);
            Short shValueOf = (-32768 > jG || jG > 32767) ? null : Short.valueOf((short) jG);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            W(dVar, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(dVar, "short", str);
            throw null;
        }
    }

    public final String P(Object obj) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("tag", str);
        kotlinx.serialization.json.b bVarE = E(str);
        if (!(bVarE instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
            sb.append(zVar.b(kotlinx.serialization.json.d.class).n());
            sb.append(", but had ");
            sb.append(zVar.b(bVarE.getClass()).n());
            sb.append(" as the serialized body of string at element: ");
            sb.append(V(str));
            throw v.c(-1, bVarE.toString(), sb.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarE;
        if (!(dVar instanceof a6.r)) {
            StringBuilder sbQ = AbstractC0703b.q("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            sbQ.append(V(str));
            throw v.c(-1, F().toString(), sbQ.toString());
        }
        a6.r rVar = (a6.r) dVar;
        if (rVar.f10485k || this.f11011c.a.f10476c) {
            return rVar.f10487m;
        }
        StringBuilder sbQ2 = AbstractC0703b.q("String literal for key '", str, "' should be quoted at element: ");
        sbQ2.append(V(str));
        sbQ2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw v.c(-1, F().toString(), sbQ2.toString());
    }

    public String Q(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return serialDescriptor.g(i7);
    }

    public final String R(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        String strQ = Q(serialDescriptor, i7);
        kotlin.jvm.internal.l.f("nestedName", strQ);
        return strQ;
    }

    public abstract kotlinx.serialization.json.b S();

    public final Object T() {
        ArrayList arrayList = this.a;
        Object objRemove = arrayList.remove(P3.r.y(arrayList));
        this.f11010b = true;
        return objRemove;
    }

    public final String U() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : P3.q.y0(arrayList, ".", "$.", null, null, 60);
    }

    public final String V(String str) {
        kotlin.jvm.internal.l.f("currentTag", str);
        return U() + '.' + str;
    }

    public final void W(kotlinx.serialization.json.d dVar, String str, String str2) {
        throw v.c(-1, F().toString(), "Failed to parse literal '" + dVar + "' as " + (AbstractC2517v.T(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + V(str2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Y5.a a(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        kotlinx.serialization.json.b bVarF = F();
        n6.d dVarC = serialDescriptor.c();
        boolean zA = kotlin.jvm.internal.l.a(dVarC, X5.j.f9952i);
        a6.d dVar = this.f11011c;
        if (zA || (dVarC instanceof X5.d)) {
            String strE = serialDescriptor.e();
            if (bVarF instanceof kotlinx.serialization.json.a) {
                return new C0721B(dVar, (kotlinx.serialization.json.a) bVarF);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
            sb.append(zVar.b(kotlinx.serialization.json.a.class).n());
            sb.append(", but had ");
            sb.append(zVar.b(bVarF.getClass()).n());
            sb.append(" as the serialized body of ");
            sb.append(strE);
            sb.append(" at element: ");
            sb.append(U());
            throw v.c(-1, bVarF.toString(), sb.toString());
        }
        if (!kotlin.jvm.internal.l.a(dVarC, X5.j.f9953j)) {
            String strE2 = serialDescriptor.e();
            if (bVarF instanceof kotlinx.serialization.json.c) {
                return new C0720A(dVar, (kotlinx.serialization.json.c) bVarF, this.f11012d, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.z zVar2 = kotlin.jvm.internal.y.a;
            sb2.append(zVar2.b(kotlinx.serialization.json.c.class).n());
            sb2.append(", but had ");
            sb2.append(zVar2.b(bVarF.getClass()).n());
            sb2.append(" as the serialized body of ");
            sb2.append(strE2);
            sb2.append(" at element: ");
            sb2.append(U());
            throw v.c(-1, bVarF.toString(), sb2.toString());
        }
        SerialDescriptor serialDescriptorG = v.g(serialDescriptor.j(0), dVar.f10460b);
        n6.d dVarC2 = serialDescriptorG.c();
        if ((dVarC2 instanceof X5.f) || kotlin.jvm.internal.l.a(dVarC2, X5.i.f9950h)) {
            String strE3 = serialDescriptor.e();
            if (bVarF instanceof kotlinx.serialization.json.c) {
                return new C0722C(dVar, (kotlinx.serialization.json.c) bVarF);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            kotlin.jvm.internal.z zVar3 = kotlin.jvm.internal.y.a;
            sb3.append(zVar3.b(kotlinx.serialization.json.c.class).n());
            sb3.append(", but had ");
            sb3.append(zVar3.b(bVarF.getClass()).n());
            sb3.append(" as the serialized body of ");
            sb3.append(strE3);
            sb3.append(" at element: ");
            sb3.append(U());
            throw v.c(-1, bVarF.toString(), sb3.toString());
        }
        if (!dVar.a.f10477d) {
            throw v.b(serialDescriptorG);
        }
        String strE4 = serialDescriptor.e();
        if (bVarF instanceof kotlinx.serialization.json.a) {
            return new C0721B(dVar, (kotlinx.serialization.json.a) bVarF);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        kotlin.jvm.internal.z zVar4 = kotlin.jvm.internal.y.a;
        sb4.append(zVar4.b(kotlinx.serialization.json.a.class).n());
        sb4.append(", but had ");
        sb4.append(zVar4.b(bVarF.getClass()).n());
        sb4.append(" as the serialized body of ");
        sb4.append(strE4);
        sb4.append(" at element: ");
        sb4.append(U());
        throw v.c(-1, bVarF.toString(), sb4.toString());
    }

    public void b(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
    }

    @Override // Y5.a
    public final AbstractC0838b c() {
        return this.f11011c.f10460b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long d() {
        return N(T());
    }

    @Override // Y5.a
    public final boolean e(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return G(R(serialDescriptor, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object f(KSerializer kSerializer) {
        kotlin.jvm.internal.l.f("deserializer", kSerializer);
        if (!(kSerializer instanceof AbstractC0625b)) {
            return kSerializer.deserialize(this);
        }
        a6.d dVar = this.f11011c;
        a6.j jVar = dVar.a;
        AbstractC0625b abstractC0625b = (AbstractC0625b) kSerializer;
        String strJ = v.j(dVar, abstractC0625b.getDescriptor());
        kotlinx.serialization.json.b bVarF = F();
        String strE = abstractC0625b.getDescriptor().e();
        if (!(bVarF instanceof kotlinx.serialization.json.c)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
            sb.append(zVar.b(kotlinx.serialization.json.c.class).n());
            sb.append(", but had ");
            sb.append(zVar.b(bVarF.getClass()).n());
            sb.append(" as the serialized body of ");
            sb.append(strE);
            sb.append(" at element: ");
            sb.append(U());
            throw v.c(-1, bVarF.toString(), sb.toString());
        }
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) bVarF;
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get(strJ);
        String strA = null;
        if (bVar != null) {
            kotlinx.serialization.json.d dVarF = a6.l.f(bVar);
            if (!(dVarF instanceof JsonNull)) {
                strA = dVarF.a();
            }
        }
        try {
            return v.r(dVar, strJ, cVar, n6.m.y((AbstractC0625b) kSerializer, this, strA));
        } catch (V5.j e7) {
            String message = e7.getMessage();
            kotlin.jvm.internal.l.c(message);
            throw v.c(-1, cVar.toString(), message);
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean g() {
        return G(T());
    }

    @Override // Y5.a
    public final String h(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return P(R(serialDescriptor, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean i() {
        return !(F() instanceof JsonNull);
    }

    @Override // Y5.a
    public final short j(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return O(R(c0640i0, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char k() {
        return I(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int l(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("enumDescriptor", serialDescriptor);
        String str = (String) T();
        kotlin.jvm.internal.l.f("tag", str);
        kotlinx.serialization.json.b bVarE = E(str);
        String strE = serialDescriptor.e();
        if (bVarE instanceof kotlinx.serialization.json.d) {
            return v.m(serialDescriptor, this.f11011c, ((kotlinx.serialization.json.d) bVarE).a(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        sb.append(zVar.b(kotlinx.serialization.json.d.class).n());
        sb.append(", but had ");
        sb.append(zVar.b(bVarE.getClass()).n());
        sb.append(" as the serialized body of ");
        sb.append(strE);
        sb.append(" at element: ");
        sb.append(V(str));
        throw v.c(-1, bVarE.toString(), sb.toString());
    }

    @Override // Y5.a
    public final long n(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return N(R(serialDescriptor, i7));
    }

    @Override // Y5.a
    public final float o(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return K(R(c0640i0, i7));
    }

    @Override // Y5.a
    public final Object p(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        kotlin.jvm.internal.l.f("deserializer", kSerializer);
        this.a.add(R(serialDescriptor, i7));
        Object objF = (kSerializer.getDescriptor().h() || i()) ? f(kSerializer) : null;
        if (!this.f11010b) {
            T();
        }
        this.f11010b = false;
        return objF;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder q(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        if (P3.q.B0(this.a) != null) {
            return L(T(), serialDescriptor);
        }
        return new x(this.f11011c, S(), this.f11012d).q(serialDescriptor);
    }

    @Override // a6.k
    public final kotlinx.serialization.json.b r() {
        return F();
    }

    @Override // Y5.a
    public final Object s(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        kotlin.jvm.internal.l.f("deserializer", kSerializer);
        this.a.add(R(serialDescriptor, i7));
        kotlin.jvm.internal.l.f("deserializer", kSerializer);
        Object objF = f(kSerializer);
        if (!this.f11010b) {
            T();
        }
        this.f11010b = false;
        return objF;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int t() {
        return M(T());
    }

    @Override // Y5.a
    public final int u(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return M(R(serialDescriptor, i7));
    }

    @Override // Y5.a
    public final Decoder v(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return L(R(c0640i0, i7), c0640i0.j(i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte w() {
        return H(T());
    }

    @Override // Y5.a
    public final byte x(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return H(R(c0640i0, i7));
    }

    @Override // Y5.a
    public final double y(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return J(R(c0640i0, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short z() {
        return O(T());
    }
}
