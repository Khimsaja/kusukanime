package io.ktor.util.converters;

import D6.r;
import P3.q;
import P3.v;
import b1.AbstractC0703b;
import io.ktor.http.LinkHeader;
import io.ktor.util.reflect.TypeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.C1447z;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u0004\u0018\u00010\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/util/converters/DefaultConversionService;", "Lio/ktor/util/converters/ConversionService;", "<init>", "()V", "Ll4/d;", "klass", "", "value", "", "convertPrimitives", "(Ll4/d;Ljava/lang/String;)Ljava/lang/Object;", "typeName", "", "throwConversionException", "(Ljava/lang/String;)Ljava/lang/Void;", "", "toValues", "(Ljava/lang/Object;)Ljava/util/List;", "values", "Lio/ktor/util/reflect/TypeInfo;", LinkHeader.Parameters.Type, "fromValues", "(Ljava/util/List;Lio/ktor/util/reflect/TypeInfo;)Ljava/lang/Object;", "fromValue", "(Ljava/lang/String;Ll4/d;)Ljava/lang/Object;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultConversionService implements ConversionService {
    public static final DefaultConversionService INSTANCE = new DefaultConversionService();

    private DefaultConversionService() {
    }

    private final Object convertPrimitives(InterfaceC1425d klass, String value) {
        z zVar = y.a;
        if (l.a(klass, zVar.b(Integer.TYPE))) {
            return Integer.valueOf(Integer.parseInt(value));
        }
        if (l.a(klass, zVar.b(Float.TYPE))) {
            return Float.valueOf(Float.parseFloat(value));
        }
        if (l.a(klass, zVar.b(Double.TYPE))) {
            return Double.valueOf(Double.parseDouble(value));
        }
        if (l.a(klass, zVar.b(Long.TYPE))) {
            return Long.valueOf(Long.parseLong(value));
        }
        if (l.a(klass, zVar.b(Short.TYPE))) {
            return Short.valueOf(Short.parseShort(value));
        }
        if (l.a(klass, zVar.b(Character.TYPE))) {
            return Character.valueOf(AbstractC2510o.s0(value));
        }
        if (l.a(klass, zVar.b(Boolean.TYPE))) {
            return Boolean.valueOf(Boolean.parseBoolean(value));
        }
        if (l.a(klass, zVar.b(String.class))) {
            return value;
        }
        return null;
    }

    private final Void throwConversionException(String typeName) throws DataConversionException {
        throw new DataConversionException(AbstractC0703b.j("Type ", typeName, " is not supported in default data conversion service"));
    }

    public final Object fromValue(String value, InterfaceC1425d klass) throws DataConversionException {
        l.f("value", value);
        l.f("klass", klass);
        Object objConvertPrimitives = convertPrimitives(klass, value);
        if (objConvertPrimitives != null) {
            return objConvertPrimitives;
        }
        Object objPlatformDefaultFromValues = ConversionServiceJvmKt.platformDefaultFromValues(value, klass);
        if (objPlatformDefaultFromValues != null) {
            return objPlatformDefaultFromValues;
        }
        throwConversionException(klass.toString());
        throw new r();
    }

    @Override // io.ktor.util.converters.ConversionService
    public Object fromValues(List<String> values, TypeInfo type) throws DataConversionException {
        List listA;
        C1447z c1447z;
        InterfaceC1444w interfaceC1444w;
        l.f("values", values);
        l.f(LinkHeader.Parameters.Type, type);
        if (values.isEmpty()) {
            return null;
        }
        InterfaceC1425d type2 = type.getType();
        z zVar = y.a;
        if (l.a(type2, zVar.b(List.class)) || l.a(type.getType(), zVar.b(List.class))) {
            InterfaceC1444w kotlinType = type.getKotlinType();
            Object objC = (kotlinType == null || (listA = kotlinType.a()) == null || (c1447z = (C1447z) q.K0(listA)) == null || (interfaceC1444w = c1447z.f12759b) == null) ? null : interfaceC1444w.c();
            InterfaceC1425d interfaceC1425d = objC instanceof InterfaceC1425d ? (InterfaceC1425d) objC : null;
            if (interfaceC1425d != null) {
                ArrayList arrayList = new ArrayList(P3.r.p(values, 10));
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    arrayList.add(INSTANCE.fromValue((String) it.next(), interfaceC1425d));
                }
                return arrayList;
            }
        }
        if (values.isEmpty()) {
            throw new DataConversionException("There are no values when trying to construct single value " + type);
        }
        if (values.size() <= 1) {
            return fromValue((String) q.K0(values), type.getType());
        }
        throw new DataConversionException("There are multiple values when trying to construct single value " + type);
    }

    @Override // io.ktor.util.converters.ConversionService
    public List<String> toValues(Object value) throws DataConversionException {
        if (value == null) {
            return P3.y.f7779k;
        }
        List<String> listPlatformDefaultToValues = ConversionServiceJvmKt.platformDefaultToValues(value);
        if (listPlatformDefaultToValues != null) {
            return listPlatformDefaultToValues;
        }
        if (value instanceof Iterable) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) value).iterator();
            while (it.hasNext()) {
                v.e0(arrayList, INSTANCE.toValues(it.next()));
            }
            return arrayList;
        }
        Class<?> cls = value.getClass();
        z zVar = y.a;
        InterfaceC1425d interfaceC1425dB = zVar.b(cls);
        if (interfaceC1425dB.equals(zVar.b(Integer.TYPE)) || interfaceC1425dB.equals(zVar.b(Float.TYPE)) || interfaceC1425dB.equals(zVar.b(Double.TYPE)) || interfaceC1425dB.equals(zVar.b(Long.TYPE)) || interfaceC1425dB.equals(zVar.b(Short.TYPE)) || interfaceC1425dB.equals(zVar.b(Character.TYPE)) || interfaceC1425dB.equals(zVar.b(Boolean.TYPE)) || interfaceC1425dB.equals(zVar.b(String.class))) {
            return P3.r.H(value.toString());
        }
        throw new DataConversionException("Class " + interfaceC1425dB + " is not supported in default data conversion service");
    }
}
