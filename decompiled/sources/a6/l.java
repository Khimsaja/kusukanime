package a6;

import Z5.AbstractC0632e0;
import Z5.I;
import Z5.t0;
import b1.AbstractC0703b;
import b6.K;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes.dex */
public abstract class l {
    public static final I a = AbstractC0632e0.a("kotlinx.serialization.json.JsonUnquotedLiteral", t0.a);

    public static final kotlinx.serialization.json.d a(Number number) {
        return number == null ? JsonNull.INSTANCE : new r(number, false, null);
    }

    public static final kotlinx.serialization.json.d b(String str) {
        return str == null ? JsonNull.INSTANCE : new r(str, true, null);
    }

    public static final void c(String str, kotlinx.serialization.json.b bVar) {
        throw new IllegalArgumentException("Element " + kotlin.jvm.internal.y.a.b(bVar.getClass()) + " is not a " + str);
    }

    public static final kotlinx.serialization.json.a d(kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.l.f("<this>", bVar);
        kotlinx.serialization.json.a aVar = bVar instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) bVar : null;
        if (aVar != null) {
            return aVar;
        }
        c("JsonArray", bVar);
        throw null;
    }

    public static final kotlinx.serialization.json.c e(kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.l.f("<this>", bVar);
        kotlinx.serialization.json.c cVar = bVar instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar : null;
        if (cVar != null) {
            return cVar;
        }
        c("JsonObject", bVar);
        throw null;
    }

    public static final kotlinx.serialization.json.d f(kotlinx.serialization.json.b bVar) {
        kotlinx.serialization.json.d dVar = bVar instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar : null;
        if (dVar != null) {
            return dVar;
        }
        c("JsonPrimitive", bVar);
        throw null;
    }

    public static final long g(kotlinx.serialization.json.d dVar) {
        kotlin.jvm.internal.l.f("<this>", dVar);
        K k7 = new K(dVar.a());
        long jI = k7.i();
        if (k7.f() == 10) {
            return jI;
        }
        int i7 = k7.f9380b;
        int i8 = i7 - 1;
        String str = k7.f11000f;
        V1.i.r(k7, AbstractC0703b.j("Expected input to contain a single valid number, but got '", (i7 == str.length() || i8 < 0) ? "EOF" : String.valueOf(str.charAt(i8)), "' after it"), i8, null, 4);
        throw null;
    }
}
