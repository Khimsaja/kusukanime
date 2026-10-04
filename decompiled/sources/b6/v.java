package b6;

import Z5.AbstractC0632e0;
import e6.AbstractC0838b;
import e6.C0837a;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1425d;
import v.c0;

/* loaded from: classes.dex */
public abstract class v {
    public static final w a = new w();

    public static final q a(Number number, String str) {
        kotlin.jvm.internal.l.f("output", str);
        return new q("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) p(str, -1)), 1);
    }

    public static final q b(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("keyDescriptor", serialDescriptor);
        return new q("Value of type '" + serialDescriptor.e() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", 1);
    }

    public static final q c(int i7, CharSequence charSequence, String str) {
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        kotlin.jvm.internal.l.f("input", charSequence);
        return d(i7, str + "\nJSON input: " + ((Object) p(charSequence, i7)));
    }

    public static final q d(int i7, String str) {
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        if (i7 >= 0) {
            str = "Unexpected JSON token at offset " + i7 + ": " + str;
        }
        return new q(str, 0);
    }

    public static final G e(a6.d dVar, InterfaceC0738m interfaceC0738m, char[] cArr) {
        kotlin.jvm.internal.l.f("json", dVar);
        return new G(interfaceC0738m, cArr);
    }

    public static final void f(KSerializer kSerializer, KSerializer kSerializer2, String str) {
        if (kSerializer instanceof V5.f) {
            SerialDescriptor descriptor = kSerializer2.getDescriptor();
            kotlin.jvm.internal.l.f("<this>", descriptor);
            if (AbstractC0632e0.b(descriptor).contains(str)) {
                StringBuilder sbC = c0.c("Sealed class '", kSerializer2.getDescriptor().e(), "' cannot be serialized as base class '", ((V5.f) kSerializer).getDescriptor().e(), "' because it has property name that conflicts with JSON class discriminator '");
                sbC.append(str);
                sbC.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                throw new IllegalStateException(sbC.toString().toString());
            }
        }
    }

    public static final SerialDescriptor g(SerialDescriptor serialDescriptor, C0837a c0837a) {
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        kotlin.jvm.internal.l.f("module", c0837a);
        if (!kotlin.jvm.internal.l.a(serialDescriptor.c(), X5.h.f9949h)) {
            return serialDescriptor.isInline() ? g(serialDescriptor.j(0), c0837a) : serialDescriptor;
        }
        InterfaceC1425d interfaceC1425dV = P3.F.v(serialDescriptor);
        if (interfaceC1425dV == null) {
            return serialDescriptor;
        }
        AbstractC0838b.a(c0837a, interfaceC1425dV);
        return serialDescriptor;
    }

    public static final byte h(char c2) {
        if (c2 < '~') {
            return C0734i.f11022b[c2];
        }
        return (byte) 0;
    }

    public static final void i(n6.d dVar) {
        kotlin.jvm.internal.l.f("kind", dVar);
        if (dVar instanceof X5.i) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (dVar instanceof X5.f) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (dVar instanceof X5.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String j(a6.d dVar, SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        kotlin.jvm.internal.l.f("json", dVar);
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof a6.i) {
                return ((a6.i) annotation).discriminator();
            }
        }
        return dVar.a.f10480g;
    }

    public static final void k(a6.d dVar, o oVar, KSerializer kSerializer, Object obj) {
        kotlin.jvm.internal.l.f("json", dVar);
        kotlin.jvm.internal.l.f("serializer", kSerializer);
        new I(new E3.b(oVar), dVar, M.f11002m, new a6.o[M.f11007r.a()]).r(kSerializer, obj);
    }

    public static final int l(SerialDescriptor serialDescriptor, a6.d dVar, String str) {
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        kotlin.jvm.internal.l.f("json", dVar);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        q(dVar, serialDescriptor);
        int iD = serialDescriptor.d(str);
        if (iD != -3 || !dVar.a.f10482i) {
            return iD;
        }
        w wVar = a;
        Z5.A a7 = new Z5.A(1, serialDescriptor, dVar);
        X4.y yVar = dVar.f10461c;
        yVar.getClass();
        Object objW = yVar.w(serialDescriptor, wVar);
        if (objW == null) {
            objW = a7.invoke();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) yVar.f9916l;
            Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(wVar, objW);
        }
        Integer num = (Integer) ((Map) objW).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int m(SerialDescriptor serialDescriptor, a6.d dVar, String str, String str2) {
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        kotlin.jvm.internal.l.f("json", dVar);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("suffix", str2);
        int iL = l(serialDescriptor, dVar, str);
        if (iL != -3) {
            return iL;
        }
        throw new V5.j(serialDescriptor.e() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean n(a6.d dVar, SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        kotlin.jvm.internal.l.f("json", dVar);
        if (dVar.a.f10475b) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof a6.p) {
                return true;
            }
        }
        return false;
    }

    public static final void o(V1.i iVar, String str) {
        iVar.q(iVar.f9380b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence p(CharSequence charSequence, int i7) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        if (charSequence.length() >= 200) {
            if (i7 != -1) {
                int i8 = i7 - 30;
                int i9 = i7 + 30;
                String str = i8 <= 0 ? "" : ".....";
                String str2 = i9 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i8 < 0) {
                    i8 = 0;
                }
                int length = charSequence.length();
                if (i9 > length) {
                    i9 = length;
                }
                sb.append(charSequence.subSequence(i8, i9).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void q(a6.d dVar, SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        kotlin.jvm.internal.l.f("json", dVar);
        kotlin.jvm.internal.l.a(serialDescriptor.c(), X5.j.f9951h);
    }

    public static final Object r(a6.d dVar, String str, kotlinx.serialization.json.c cVar, KSerializer kSerializer) {
        kotlin.jvm.internal.l.f("<this>", dVar);
        kotlin.jvm.internal.l.f("discriminator", str);
        return new C0720A(dVar, cVar, str, kSerializer.getDescriptor()).f(kSerializer);
    }

    public static final M s(a6.d dVar, SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("<this>", dVar);
        kotlin.jvm.internal.l.f("desc", serialDescriptor);
        n6.d dVarC = serialDescriptor.c();
        if (dVarC instanceof X5.d) {
            return M.f11005p;
        }
        if (kotlin.jvm.internal.l.a(dVarC, X5.j.f9952i)) {
            return M.f11003n;
        }
        if (!kotlin.jvm.internal.l.a(dVarC, X5.j.f9953j)) {
            return M.f11002m;
        }
        SerialDescriptor serialDescriptorG = g(serialDescriptor.j(0), dVar.f10460b);
        n6.d dVarC2 = serialDescriptorG.c();
        if ((dVarC2 instanceof X5.f) || kotlin.jvm.internal.l.a(dVarC2, X5.i.f9950h)) {
            return M.f11004o;
        }
        if (dVar.a.f10477d) {
            return M.f11003n;
        }
        throw b(serialDescriptorG);
    }

    public static final void t(V1.i iVar, Number number) {
        V1.i.r(iVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String u(byte b4) {
        return b4 == 1 ? "quotation mark '\"'" : b4 == 2 ? "string escape sequence '\\'" : b4 == 4 ? "comma ','" : b4 == 5 ? "colon ':'" : b4 == 6 ? "start of the object '{'" : b4 == 7 ? "end of the object '}'" : b4 == 8 ? "start of the array '['" : b4 == 9 ? "end of the array ']'" : b4 == 10 ? "end of the input" : b4 == 127 ? "invalid token" : "valid token";
    }

    public static final String v(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) p(str2, -1));
    }
}
