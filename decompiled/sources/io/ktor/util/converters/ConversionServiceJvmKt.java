package io.ktor.util.converters;

import P3.r;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.InterfaceC1425d;
import n6.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "value", "Ll4/d;", "klass", "", "platformDefaultFromValues", "(Ljava/lang/String;Ll4/d;)Ljava/lang/Object;", "convertSimpleTypes", "", "platformDefaultToValues", "(Ljava/lang/Object;)Ljava/util/List;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConversionServiceJvmKt {
    private static final Object convertSimpleTypes(String str, InterfaceC1425d interfaceC1425d) {
        z zVar = y.a;
        if (l.a(interfaceC1425d, zVar.b(Integer.class))) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (l.a(interfaceC1425d, zVar.b(Float.class))) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (l.a(interfaceC1425d, zVar.b(Double.class))) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (l.a(interfaceC1425d, zVar.b(Long.class))) {
            return Long.valueOf(Long.parseLong(str));
        }
        if (l.a(interfaceC1425d, zVar.b(Short.class))) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (l.a(interfaceC1425d, zVar.b(Boolean.class))) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (l.a(interfaceC1425d, zVar.b(String.class))) {
            return str;
        }
        if (l.a(interfaceC1425d, zVar.b(Character.class))) {
            return Character.valueOf(str.charAt(0));
        }
        if (l.a(interfaceC1425d, zVar.b(BigDecimal.class))) {
            return new BigDecimal(str);
        }
        if (l.a(interfaceC1425d, zVar.b(BigInteger.class))) {
            return new BigInteger(str);
        }
        if (l.a(interfaceC1425d, zVar.b(UUID.class))) {
            return UUID.fromString(str);
        }
        return null;
    }

    public static final Object platformDefaultFromValues(String str, InterfaceC1425d interfaceC1425d) throws DataConversionException {
        l.f("value", str);
        l.f("klass", interfaceC1425d);
        Object objConvertSimpleTypes = convertSimpleTypes(str, interfaceC1425d);
        if (objConvertSimpleTypes != null) {
            return objConvertSimpleTypes;
        }
        Object obj = null;
        if (!m.F(interfaceC1425d).isEnum()) {
            return null;
        }
        Object[] enumConstants = m.F(interfaceC1425d).getEnumConstants();
        if (enumConstants != null) {
            int length = enumConstants.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                Object obj2 = enumConstants[i7];
                l.d("null cannot be cast to non-null type kotlin.Enum<*>", obj2);
                if (l.a(((Enum) obj2).name(), str)) {
                    obj = obj2;
                    break;
                }
                i7++;
            }
            if (obj != null) {
                return obj;
            }
        }
        throw new DataConversionException("Value " + str + " is not a enum member name of " + interfaceC1425d);
    }

    public static final List<String> platformDefaultToValues(Object obj) {
        l.f("value", obj);
        if (obj instanceof Enum) {
            return r.H(((Enum) obj).name());
        }
        if (obj instanceof Integer) {
            return r.H(((Integer) obj).toString());
        }
        if (obj instanceof Float) {
            return r.H(((Float) obj).toString());
        }
        if (obj instanceof Double) {
            return r.H(((Double) obj).toString());
        }
        if (obj instanceof Long) {
            return r.H(((Long) obj).toString());
        }
        if (obj instanceof Boolean) {
            return r.H(((Boolean) obj).toString());
        }
        if (obj instanceof Short) {
            return r.H(((Short) obj).toString());
        }
        if (obj instanceof String) {
            return r.H(((String) obj).toString());
        }
        if (obj instanceof Character) {
            return r.H(((Character) obj).toString());
        }
        if (obj instanceof BigDecimal) {
            return r.H(((BigDecimal) obj).toString());
        }
        if (obj instanceof BigInteger) {
            return r.H(((BigInteger) obj).toString());
        }
        if (obj instanceof UUID) {
            return r.H(((UUID) obj).toString());
        }
        return null;
    }
}
