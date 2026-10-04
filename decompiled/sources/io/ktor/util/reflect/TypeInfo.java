package io.ktor.util.reflect;

import O3.InterfaceC0554c;
import io.ktor.http.LinkHeader;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0017\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/ktor/util/reflect/TypeInfo;", "", "Ll4/d;", LinkHeader.Parameters.Type, "Ll4/w;", "kotlinType", "<init>", "(Ll4/d;Ll4/w;)V", "Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "(Ll4/d;Ljava/lang/reflect/Type;Ll4/w;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ll4/d;", "getType", "()Ll4/d;", "Ll4/w;", "getKotlinType", "()Ll4/w;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypeInfo {
    private final InterfaceC1444w kotlinType;
    private final InterfaceC1425d type;

    public TypeInfo(InterfaceC1425d interfaceC1425d, InterfaceC1444w interfaceC1444w) {
        l.f(LinkHeader.Parameters.Type, interfaceC1425d);
        this.type = interfaceC1425d;
        this.kotlinType = interfaceC1444w;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypeInfo)) {
            return false;
        }
        InterfaceC1444w interfaceC1444w = this.kotlinType;
        if (interfaceC1444w == null) {
            TypeInfo typeInfo = (TypeInfo) other;
            if (typeInfo.kotlinType == null) {
                return l.a(this.type, typeInfo.type);
            }
        }
        return l.a(interfaceC1444w, ((TypeInfo) other).kotlinType);
    }

    public final InterfaceC1444w getKotlinType() {
        return this.kotlinType;
    }

    public final InterfaceC1425d getType() {
        return this.type;
    }

    public int hashCode() {
        InterfaceC1444w interfaceC1444w = this.kotlinType;
        return interfaceC1444w != null ? interfaceC1444w.hashCode() : this.type.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.kotlinType;
        if (obj == null) {
            obj = this.type;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TypeInfo(InterfaceC1425d interfaceC1425d, InterfaceC1444w interfaceC1444w, int i7, f fVar) {
        this(interfaceC1425d, (i7 & 2) != 0 ? null : interfaceC1444w);
    }

    public /* synthetic */ TypeInfo(InterfaceC1425d interfaceC1425d, Type type, InterfaceC1444w interfaceC1444w, int i7, f fVar) {
        this(interfaceC1425d, type, (i7 & 4) != 0 ? null : interfaceC1444w);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0554c
    public TypeInfo(InterfaceC1425d interfaceC1425d, Type type, InterfaceC1444w interfaceC1444w) {
        this(interfaceC1425d, interfaceC1444w);
        l.f(LinkHeader.Parameters.Type, interfaceC1425d);
        l.f("reifiedType", type);
    }
}
