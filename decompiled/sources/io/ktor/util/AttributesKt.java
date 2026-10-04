package io.ktor.util;

import O3.InterfaceC0554c;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b*V\b\u0007\u0010\u0016\u001a\u0004\b\u0000\u0010\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0004B6\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u001c\b\u000f\u0012\u0018\b\u000bB\u0014\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005\u0012\u0006\b\u0012\u0012\u0002\b\f\u0012\n\b\u0013\u0012\u0006\b\n0\u00148\u0015¨\u0006\u0017"}, d2 = {"", "T", "", ContentDisposition.Parameters.Name, "Lio/ktor/util/AttributeKey;", "AttributeKey", "(Ljava/lang/String;)Lio/ktor/util/AttributeKey;", "Lio/ktor/util/Attributes;", "other", "LO3/C;", "putAll", "(Lio/ktor/util/Attributes;Lio/ktor/util/Attributes;)V", "LO3/c;", ContentType.Message.TYPE, "Please use `AttributeKey` class instead", "replaceWith", "LO3/m;", "expression", "imports", "level", "LO3/d;", "ERROR", "EquatableAttributeKey", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AttributesKt {
    public static final <T> AttributeKey<T> AttributeKey(String str) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.k();
        throw null;
    }

    @InterfaceC0554c
    public static /* synthetic */ void EquatableAttributeKey$annotations() {
    }

    public static final void putAll(Attributes attributes, Attributes attributes2) {
        l.f("<this>", attributes);
        l.f("other", attributes2);
        Iterator<T> it = attributes2.getAllKeys().iterator();
        while (it.hasNext()) {
            AttributeKey attributeKey = (AttributeKey) it.next();
            l.d("null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>", attributeKey);
            attributes.put(attributeKey, attributes2.get(attributeKey));
        }
    }
}
