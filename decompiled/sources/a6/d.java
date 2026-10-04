package a6;

import b6.C0720A;
import b6.C0721B;
import b6.C0731f;
import b6.H;
import b6.K;
import b6.M;
import e6.AbstractC0839c;
import e6.C0837a;
import io.ktor.http.LinkHeader;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes.dex */
public abstract class d implements V5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final C0673c f10459d = new C0673c(new j(false, false, false, false, true, "    ", LinkHeader.Parameters.Type, false, true, EnumC0671a.f10454l), AbstractC0839c.a);
    public final j a;

    /* renamed from: b, reason: collision with root package name */
    public final C0837a f10460b;

    /* renamed from: c, reason: collision with root package name */
    public final X4.y f10461c = new X4.y(4);

    public d(j jVar, C0837a c0837a) {
        this.a = jVar;
        this.f10460b = c0837a;
    }

    public final Object a(KSerializer kSerializer, kotlinx.serialization.json.b bVar) {
        Decoder xVar;
        kotlin.jvm.internal.l.f("deserializer", kSerializer);
        kotlin.jvm.internal.l.f("element", bVar);
        String str = null;
        if (bVar instanceof kotlinx.serialization.json.c) {
            xVar = new C0720A(this, (kotlinx.serialization.json.c) bVar, str, 12);
        } else if (bVar instanceof kotlinx.serialization.json.a) {
            xVar = new C0721B(this, (kotlinx.serialization.json.a) bVar);
        } else {
            if (!(bVar instanceof r) && !bVar.equals(JsonNull.INSTANCE)) {
                throw new D6.r();
            }
            xVar = new b6.x(this, (kotlinx.serialization.json.d) bVar, null);
        }
        return xVar.f(kSerializer);
    }

    public final Object b(String str, KSerializer kSerializer) {
        kotlin.jvm.internal.l.f("deserializer", kSerializer);
        kotlin.jvm.internal.l.f("string", str);
        K k7 = new K(str);
        Object objF = new H(this, M.f11002m, k7, kSerializer.getDescriptor(), null).f(kSerializer);
        k7.p();
        return objF;
    }

    public final kotlinx.serialization.json.b c(KSerializer kSerializer, Object obj) {
        kotlin.jvm.internal.l.f("serializer", kSerializer);
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        new b6.y(this, new A3.d(7, xVar), 1).r(kSerializer, obj);
        Object obj2 = xVar.f12720k;
        if (obj2 != null) {
            return (kotlinx.serialization.json.b) obj2;
        }
        kotlin.jvm.internal.l.l("result");
        throw null;
    }

    public final String d(KSerializer kSerializer, Object obj) {
        kotlin.jvm.internal.l.f("serializer", kSerializer);
        F5.o oVar = new F5.o((char) 0, 5);
        C0731f c0731f = C0731f.f11019c;
        oVar.f2542m = c0731f.b(128);
        try {
            b6.v.k(this, oVar, kSerializer, obj);
            String string = oVar.toString();
            char[] cArr = (char[]) oVar.f2542m;
            c0731f.getClass();
            kotlin.jvm.internal.l.f("array", cArr);
            c0731f.a(cArr);
            return string;
        } catch (Throwable th) {
            C0731f c0731f2 = C0731f.f11019c;
            char[] cArr2 = (char[]) oVar.f2542m;
            c0731f2.getClass();
            kotlin.jvm.internal.l.f("array", cArr2);
            c0731f2.a(cArr2);
            throw th;
        }
    }
}
