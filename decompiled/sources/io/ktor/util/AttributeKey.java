package io.ktor.util;

import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/ktor/util/AttributeKey;", "", "T", "", ContentDisposition.Parameters.Name, "Lio/ktor/util/reflect/TypeInfo;", LinkHeader.Parameters.Type, "<init>", "(Ljava/lang/String;Lio/ktor/util/reflect/TypeInfo;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "()Lio/ktor/util/reflect/TypeInfo;", "copy", "(Ljava/lang/String;Lio/ktor/util/reflect/TypeInfo;)Lio/ktor/util/AttributeKey;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getName", "Lio/ktor/util/reflect/TypeInfo;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AttributeKey<T> {
    private final String name;
    private final TypeInfo type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttributeKey(String str) {
        this(str, null, 2, null);
        l.f(ContentDisposition.Parameters.Name, str);
    }

    /* renamed from: component2, reason: from getter */
    private final TypeInfo getType() {
        return this.type;
    }

    public static /* synthetic */ AttributeKey copy$default(AttributeKey attributeKey, String str, TypeInfo typeInfo, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = attributeKey.name;
        }
        if ((i7 & 2) != 0) {
            typeInfo = attributeKey.type;
        }
        return attributeKey.copy(str, typeInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final AttributeKey<T> copy(String name, TypeInfo type) {
        l.f(ContentDisposition.Parameters.Name, name);
        l.f(LinkHeader.Parameters.Type, type);
        return new AttributeKey<>(name, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributeKey)) {
            return false;
        }
        AttributeKey attributeKey = (AttributeKey) other;
        return l.a(this.name, attributeKey.name) && l.a(this.type, attributeKey.type);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return "AttributeKey: " + this.name;
    }

    public AttributeKey(String str, TypeInfo typeInfo) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f(LinkHeader.Parameters.Type, typeInfo);
        this.name = str;
        this.type = typeInfo;
        if (AbstractC2510o.g0(str)) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public AttributeKey(String str, TypeInfo typeInfo, int i7, f fVar) {
        InterfaceC1444w interfaceC1444wA;
        if ((i7 & 2) != 0) {
            InterfaceC1425d interfaceC1425dB = y.a.b(Object.class);
            try {
                interfaceC1444wA = y.a(Object.class);
            } catch (Throwable unused) {
                interfaceC1444wA = null;
            }
            typeInfo = new TypeInfo(interfaceC1425dB, interfaceC1444wA);
        }
        this(str, typeInfo);
    }
}
